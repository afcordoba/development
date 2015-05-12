<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Calendar"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion"%>

<%
	Calendar hoy = java.util.Calendar.getInstance();
	String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
	String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
	String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
	String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
	String fecha = dia + "-" + mes+ "-" + year;

	ZscaDatosPlanificacion planificacion = (ZscaDatosPlanificacion) session.getAttribute("PLANIFICACION" + session.getId());
	String nombre = (String) session.getAttribute("USUARIO_NOMBRE");
	ArrayList<PlantaPorEncargado> plantasXUsuario =(ArrayList<PlantaPorEncargado>)session.getAttribute("PLANTASxUSUARIO"+session.getId());
	Iterator ite = plantasXUsuario.iterator();
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
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
	function esNatural(strNumero){
		regexp = /^[0-9]*$/;
		return regexp.test(strNumero);
	}
	function validar(){
		valor = document.getElementById("fechaPL").value;
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
			  var ano = bar[3]
			}   
			
			  valor = new Date(ano, mes, dia);
			    
			  if( !isNaN(valor) ) {
			    return false;
			  }else{
				  if(mes > 12 ){
					 alert("¡formato de mes inválido!")
					  return false;
				  }else 
					  if(dia > 31 ){
						  alert("¡formato de dia inválido!")
						  return false;
					  }else
						  if(mes == 2 && dia > 29 ){
								 alert("¡formato de fecha inválido!")
								  return false;
							  }
			  }
			
		}
		return true;		
	}
	function setear(){
		//alert("Viene");
		var indice = document.altaPlanDiario.centros.selectedIndex;
		//alert(document.altaPlanDiario.centros.options[indice].value);
	
		valor = document.getElementById("fechaPL").value;
		var bar = valor.split("-");
		for(var i = 0;i<bar.length;i++){
		  bar[i] = bar[i].split("@");
		  //salert(bar[i]);
		  var dia = bar[0];
		  var mes = bar[1];
		  var ano = bar[3]
		}   
		document.altaPlanDiario.centroElegido.value = document.altaPlanDiario.centros.options[indice].value ;
		alert("Valor asignado a CentroElegido:" + document.altaPlanDiario.centroElegido.value);
		if(document.altaPlanDiario.centros.selectedIndex == 0){
			alert("Debe seleccionar una planta");
			return false;
		}
		if(document.altaPlanDiario.cantcamiones.value == ''){
			alert("Debe ingresar cantidad de camiones");
			document.altaPlanDiario.cantcamiones.focus();
			return false;
		}else
			if(!esNatural(document.altaPlanDiario.cantcamiones.value)){
				alert("Debe ingresar un numero");
				return false;
			}else
				validar();
		
		//altaPlanDiario.submit();
		//alert(<%=dia%>);
		if(dia == <%=dia%>){
			if(!confirm('¿Estas seguro que vas a cosechar hoy?')){
				document.altaPlanDiario.fechaPL.focus(); 
				return false;
			}
		}
		return true;
	}

</script>
</head>
<body>


<table style="border-collapse: collapse" bordercolor="#C0C0C0"
	border="1" width="100%">
	<tr>
		<td width="100%">
		<form method="POST" name="altaPlanDiario" action="ServiceSap" onsubmit="return setear();">
		<table border="0" width="100%">
			<tr>
				<td colspan="1" bgcolor="#006699"><span class="Estilo2">Alta Plan Diario</span></td>
			</tr>
			<tr>
				<td>
				<hr><input type="hidden" name="centroElegido" id="centroElegido" value="">
				</td>
			</tr>

			<tr>
				<td width="100%"  bgcolor="yellow">
				<font face=verdana size=2>
					<%=planificacion.getNombreCliente()%>
				</font></td>
			</tr>
			<tr>
				<td width="100%"  bgcolor="yellow"><font face=verdana size=2>
				<% if (planificacion.getCodMatInase()!= null && !"".equals(planificacion.getCodMatInase())){ %>
								<%=planificacion.getDescCampo()%>,<%=planificacion.getDescLote()%><br><%=planificacion.getHectareasSembra()%> Has. Inscripto:SI<br><%=planificacion.getDescCodMatTerm() %></font>
							
							<%}else{ %> 
								<%= planificacion.getDescCampo()%>,<%=planificacion.getDescLote()%><br><%=planificacion.getHectareasSembra()%> Has. Inscripto:NO<br><%=planificacion.getDescCodMatTerm() %></font>
				<%}%>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><font face=verdana size=2>&nbsp;</font></td>
			</tr>
			<tr>
				<td width="100%"><font face=verdana size=2>Fecha (dd-mm-yyyy)</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><input type="hidden" name="accion"
					value="altaPlanDiario"><input type="text" id="fechaPL" name="fecha" value="<%=fecha%>"></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><font face=verdana size=2>Cant.Camiones</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><input type="text" name="cantcamiones"></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><font face=verdana size=2>Plantas</font></td>

			</tr>
			<tr>
				<td width="100%" colspan="1">
					
					<select name="centros" size="1">
						<option value="Elegir Planta">Elegir Planta</option>
					<% while(ite.hasNext()){ PlantaPorEncargado planta = ( PlantaPorEncargado) ite.next();%>
						<option value="<%=planta.getCod_planta()%>"> <%=planta.getDesc_planta()%> </option>
					<% }%>
					</select>
				</td>
			</tr>
			
			<tr>
				<td width="100%" colspan="1"><font face=verdana size=2>Estado</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="1">
						<select name="estados" size="1">
          									  <option value="P">Planificado</option>
									          <option value="C">Confirmado</option>
									          <option value="CF" >Confirmado y Finalizado</option>
									          <option value="D">Lote Descartado</option>
									          <option value="PC">P.Diario Cancelado</option>
									          <option value="CC">Confirmado Coop.</option>
									          <option value="CE">Confirmado Elegido</option>
        				</select>
        		</td>
			</tr>
			<tr>
				<td>
				<hr>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><input class="boton" type="submit" value="Cargar"><br>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><input class="boton" type="button" onclick="history.go(-1);" value="Volver"><br>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><font color="red"></font></td>
			</tr>





		</table>
		</form>
		</td>
	</tr>
</table>


</body>