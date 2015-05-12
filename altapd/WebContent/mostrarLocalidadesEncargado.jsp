<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZmmLocalidades"%>
<%@page import="java.util.Calendar"%>

<%
	ZmmLocalidades[] localidades = (ZmmLocalidades[])	session.getAttribute("LOCALIDADES_POR_ENCARGADO" + session.getId());
	String context = request.getContextPath();
	Calendar hoy = java.util.Calendar.getInstance();
	String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
	String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
	String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
	String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
	String fecha = dia + "-" + mes+ "-" + year;
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro de Lluvias</title>
<style type="text/css">
<!--
.Estilo2 {
	color: #FFFFFF;
	font-family: Tahoma;
	font-size: 10pt;
	font-weight: bold;
}
.boton{
        font-size:12px;
        font-family:Verdana,Helvetica;
        font-weight:bold;
        color:white;
        background:#638cb5;
        border:0px;
        width:150px; 
        height:19px;
       }
-->
</style>
<script>
	
	function validar(){
		if(validarMM && validarFecha){
			return true;
		}else
			return false
		
	}
	
	function validarMM(){
		if(RegistrarLluvias.milim.value == ''){
			alert('Debe ingresar los milimetros a registrar');
			RegistrarLluvias.milim.focus();
			return false;
		}
		if(RegistrarLluvias.fecha.value == ''){
			alert('Debe ingresar la fecha de los milimetros a registrar');
			RegistrarLluvias.fecha.focus();
			return false;
		} 
		var cant_es_flotante = isFloat(RegistrarLluvias.milim.value);
		if (isNaN(RegistrarLluvias.milim.value)){
			alert('Valor introducido:       '+cant+' \n\n Introduce solo valores numericos');
			document.getElementById(element.id).value = "";
		}
		else if (RegistrarLluvias.milim.value < 1 ){
			alert('Valor introducido:       '+RegistrarLluvias.milim.value+' \n\n Introduce numeros enteros mayores que 0');
			RegistrarLluvias.milim.value = '';
			
		}
		validarFecha();
		}
		function isFloat(myNum) {
		// es true si es 1, osea si es flotante
		var myMod = myNum % 1;
		 
		if (myMod == 0) { 
			return false; 
		} 
		else { 
			return true;
		}
		
	}
	function validarFecha(){
		if(RegistrarLluvias.fecha.value == ''){
			alert('Debe ingresar la fecha de los milimetros a registrar');
			RegistrarLluvias.fecha.focus();
			return false;
		}
		
		valor = document.getElementById("fecha").value;
		if( !(/^\d{2}-\d{2}-\d{4}$/.test(valor)) ) {
		  alert("formato de fecha invalido"); 	
		  return false;
		}else{
			var bar = valor.split("-");
			for(var i = 0;i<bar.length;i++){
			  bar[i] = bar[i].split("@");
			  //salert(bar[i]);
			  var dia = bar[0];
			  var mes = bar[1];
			  var ano = bar[3];
			}   
			  valor = new Date(ano, mes, dia);
			    
			  if( !isNaN(valor) ) {
			    return false;
			  }else{
				  if(mes > 12 ){
					 alert("¡formato de mes inválido!");
					  return false;
				  }else 
					  if(dia > 31 ){
						  alert("¡formato de dia inválido!");
						  return false;
					  }else
						  if(mes == 2 && dia > 29 ){
								 alert("¡formato de fecha inválido!");
								  return false;
							  }
			  }
			
		}
		return true;		
	}
	function asignarZona(){
		var indice = document.RegistrarLluvias.zona.selectedIndex;
	//	alert(indice);
		document.RegistrarLluvias.provincia.value = document.RegistrarLluvias.zona.options[document.RegistrarLluvias.zona.selectedIndex].value;
		document.RegistrarLluvias.localidad.value = document.RegistrarLluvias.zona.options[document.RegistrarLluvias.zona.selectedIndex].text;
		//alert(document.RegistrarLluvias.provincia.value);
		//alert(document.RegistrarLluvias.localidad.value);
	}
</script>
</head>
<body>
<form name="RegistrarLluvias" method="POST" action="ServiceSap" onsubmit="return validarMM();">
<table style="border-collapse: collapse" bordercolor="#C0C0C0" border="1" width="200">
	<tr>
		<td width="270">
		<table border="0" width="270">
			<tr>
				<td colspan="2" bgcolor="#006699"><span class="Estilo2"><b>Registro de Lluvias</b></span></td>
			</tr>
			<tr>
				<td width="100">
					<div align="right"><b>Fecha:</b></div>
				</td width="100">
				<td>
					<div align="left"><input type="text" size="10" name="fecha" value="<%=fecha%>"></div>
				</td>
			</tr>
			<tr bgcolor="#e5e5e5">
						<td width="100">
							<div align="center">
								<font face=verdana size=2><b>Localidad</b></font>
							</div>
						</td>
						<td width="100">
							<div align="center">
								<font face=verdana size=2><b>mm.</b></font>
							</div>
						</td>
			</tr>
			<tr bgcolor="#e5e5e5">
						<td width="100%">
							<div align="center">
									<select name="zona" onchange="asignarZona();">
										<% for( int row = 0;row < localidades.length;row++){ 
											ZmmLocalidades loc = localidades[row];
										%>
										<option value="<%= loc.getEProvincia() %>"><%= loc.getELocalidad() %></option>
										<% }%>	
									</select>
							</div>
						</td>
						<td>
							<div align="center">
								<input type="text" id="milim" size="5" name="milim" value=""/>
							</div>
						</td>
			</tr>
			<tr bgcolor="#e5e5e5">
						<td width="200" colspan="2">
							<input type="hidden" value="" name="provincia"/>
							<input type="hidden" value="" name="localidad"/>
							<input type="hidden" value="altaRegistroLluvia" name="accion"/>
							<div align="center">
								<input type="submit" value="Guardar"/>
								<input type="button" value="Cancelar" onclick="window.location.href='<%=context%>/menu.jsp'"/>
							</div>			
						</td>
						
			</tr>
		</table>
		</td>
	</tr>
</table>
</form>

</body>
<script type="text/javascript">
document.RegistrarLluvias.localidad.value = document.RegistrarLluvias.zona.options[0].text;
//alert(document.RegistrarLluvias.localidad.value);
</script>
</html>