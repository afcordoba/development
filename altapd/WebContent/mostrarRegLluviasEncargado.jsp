<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZmmLocalidades"%>
<%@page import="java.util.Calendar"%>
<%@page import="dm.planesdiarios.dao.RegistroLluvia"%>
<%@page import="java.util.List"%>
<%
	String context = request.getContextPath();
	Calendar hoy = java.util.Calendar.getInstance();
	String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
	String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
	String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
	String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
	String fecha = dia + "-" + mes+ "-" + year;
	List<RegistroLluvia> registros = (List<RegistroLluvia>)session.getAttribute("REGISTROS_LLUVIA_ENCARGADO"+session.getId());
	Iterator ite = registros.iterator();
	
	
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
		
		if(BuscarLluvias.fecha.value == ''){
			alert('Debe ingresar la fecha de los milimetros a registrar');
			BuscarLluvias.fecha.focus();
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
		document.BuscarLluvias.accion.value='mostrarRegLluviaInput';
		document.BuscarLluvias.submit;		
	}
	
</script>
</head>
<body>
<table style="border-collapse: collapse" bordercolor="#C0C0C0" border="1" width="300">
	<tr>
		<td width="300">
		<table border="0" width="300">
			<form name="BuscarLluvias" method="GET" action="ServiceSap" onsubmit="validarFecha();">
				<tr>
					<td colspan="2" bgcolor="#006699"><span class="Estilo2"><b>Registro de Lluvias</b></span></td>
				</tr>
				<tr>
					<td colspan="2">
						<div align="center"><b>Fecha:</b></div>
						<div align="center">
							<input type="text" name="fecha" value="<%=fecha%>">
							<input type="hidden" name="accion" value="mostrarRegLluviaInput">
						</div>
					</td>
				</tr>
				
					<tr>
						<td colspan="2">
							<div align="center"><input type="submit" class="boton" value="Buscar"></div>
						</td>
					</tr>
			</form>
			<tr bgcolor="#e5e5e5">
						<td nowrap="nowrap">
							<div align="center">
								<font face=verdana size=2><b>Localidad</b></font>
							</div>
							<div align="center">
								<font face=verdana size=2><b>mm.</b></font>
							</div>
						</td>
						<td>
							<div align="center">
								<font face=verdana size=2><b>Acción</b></font>
							</div>
						</td>
			</tr>
			<% while (ite.hasNext() ){ 
					RegistroLluvia ll = (RegistroLluvia)ite.next();
			%>
			<form name="RegistrarLluvias" method="POST" action="ServiceSap" onsubmit="return validarMM();">
			<tr bgcolor="#e5e5e5">
						<td nowrap="nowrap">
							<div align="center">
								<%= ll.getLocalidad()%><br>
							</div>
						
								<div align="center">
									<input size="5" type="text" name="milim" value="<%= ll.getMilimetros()%>"/> 
								</div>
								
						</td>
						<td>
							<div align="center">
								<input size="7" type="submit"  value="Modificar"/>
							</div>
						</td>
			</tr>
			
			<tr bgcolor="#e5e5e5">
						<td>
							<input type="hidden" value="" name="provincia"/>
							<input type="hidden" value="<%= ll.getLocalidad()%>" name="localidad"/>
							<input type="hidden" value="modificarRegistroLluvia" name="accion"/>
						</td>
			</tr>
			</form>
			<% }%>
			<tr bgcolor="#e5e5e5">			
						<td colspan="2">	
							<div align="center">
								<input type="button"  value="Menu" onclick="window.location.href='<%=context%>/menu.jsp'"/>
							</div>		
						</td>
			</tr>
			
		</table>
		</td>
	</tr>
</table>


</body>