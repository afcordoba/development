<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Calendar"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion"%>

<%
	String context = request.getContextPath();
	Calendar hoy = java.util.Calendar.getInstance();
	String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
	String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
	String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
	String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
	String fecha = dia + "-" + mes+ "-" + year;

	ZscaDatosPlanificacion planificacion = (ZscaDatosPlanificacion) session.getAttribute("PLANIFICACION" + session.getId());
	String nombre = (String) session.getAttribute("USUARIO_NOMBRE");
	String tipoDeVisita = (String) session.getAttribute("REGISTRO_TIPO_DE_VISITA");
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registro visita <%=tipoDeVisita %></title>
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

	function fillEstadoFenValor(){
		var indice = document.registroVisitasGenerico.estadoFenTipo.selectedIndex;
		var valueEstadoFenTipo = document.registroVisitasGenerico.estadoFenTipo.options[indice].value;
		var selectBoxEstadoFenValor = document.registroVisitasGenerico.estadoFenValor; 
		if (valueEstadoFenTipo==''){
			selectBoxEstadoFenValor.selectedIndex=0;
			while (selectBoxEstadoFenValor.firstChild) {
				selectBoxEstadoFenValor.removeChild(selectBoxEstadoFenValor.firstChild);
			}
			var option=document.createElement("option");
			option.text = "-- Elegir --";
			option.value = "";
			selectBoxEstadoFenValor.add(option,null);
			selectBoxEstadoFenValor.disabled = 'disabled';
		}
		else if (valueEstadoFenTipo=='V'){
			document.registroVisitasGenerico.estadoFenValor.removeAttribute("disabled");
			var iter = 1;
			while (selectBoxEstadoFenValor.firstChild) {
				selectBoxEstadoFenValor.removeChild(selectBoxEstadoFenValor.firstChild);
			}
			var option = document.createElement("option");
			option.text = "-- Elegir --";
			option.value = "";
			selectBoxEstadoFenValor.add(option,null);
			while(iter <= 20){
				option = document.createElement("option");
				option.text = iter;
				option.value = iter;
				selectBoxEstadoFenValor.add(option,null);
				iter++;
			}
		}
		else if (valueEstadoFenTipo=='R'){
			document.registroVisitasGenerico.estadoFenValor.removeAttribute("disabled");
			var iter = 1;
			while (selectBoxEstadoFenValor.firstChild) {
				selectBoxEstadoFenValor.removeChild(selectBoxEstadoFenValor.firstChild);
			}
			var option = document.createElement("option");
			option.text = "-- Elegir --";
			option.value = "";
			selectBoxEstadoFenValor.add(option,null);			
			while(iter <= 9){
				option = document.createElement("option");
				option.text = iter;
				option.value = iter;
				selectBoxEstadoFenValor.add(option,null);
				iter++;
			}
		}
	
	}
	
	function esNatural(strNumero){
		regexp = /^[0-9]*$/;
		return regexp.test(strNumero);
	}


	function validar()
    {
		valor = document.registroVisitasGenerico.fecha.value;
		if( !(/^\d{2}-\d{2}-\d{4}$/.test(valor)) ) {
		  alert("Formato de fecha invalido: dd-mm-yyyy"); 	
		  return false;
		}else{
	        var iDay, iMonth, iYear;
	        var arrValues;
	        arrValues = valor.split("-");
	        iDay = arrValues[0];
	        iMonth = arrValues[1];
	        iYear = arrValues[2];
			try{
				var testDate = new Date(iYear, iMonth - 1, iDay);
				
				 if ((testDate.getDate() != iDay) ||
				            (testDate.getMonth() != iMonth - 1) ||
				            (testDate.getFullYear() != iYear))
				 {
				 	alert("¡formato de fecha inválido!");
				 	return false;
				 }
				 else{
						if((iDay ==  <%=dia%>) && (iMonth ==  <%=mes%>) && (iYear == <%=year%>)){
							if(!confirm('¿Estas seguro que desear registrar una visita para hoy?')){
								document.registroVisitasGenerico.fecha.focus(); 
								return false;
							}
						}
						/* EN CASO DE QUERER FILTRAR FECHAS PASADAS COMO INVALIDAS!
						else{
							if(testDate.getMilliseconds() < new Date(<%=year%>, <%=mes%> - 1, <%=dia%>).getMilliseconds()){
								alert("La fecha ingresada es anterior a la fecha actual!");
								return false;
							}
						}
						*/
				}
			}
			catch(err){
	        	alert("¡formato de fecha inválido!");
				return false;
			}
	
		}
        return true;
    }
	
	function setear(){
		valor = document.registroVisitasGenerico.fecha.value;
        var iDay, iMonth, iYear;
        var arrValues;
        arrValues = valor.split("-");
        iDay = arrValues[0];
        iMonth = arrValues[1];
        iYear = arrValues[2];

		if(document.registroVisitasGenerico.rendimiento.selectedIndex == 0){
			alert("Debe seleccionar un rendimiento");
			return false;
		}
		if(document.registroVisitasGenerico.probabilidad.selectedIndex == 0){
			alert("Debe seleccionar una probabilidad");
			return false;
		}
		if(document.registroVisitasGenerico.estados.selectedIndex == 0){
			alert("Debe seleccionar un estado");
			return false;
		}	
		if((document.registroVisitasGenerico.motivos.selectedIndex == 0) &&
		        (document.registroVisitasGenerico.estados.options[document.registroVisitasGenerico.estados.selectedIndex].getAttribute("value")!="POTENCIAL")
			){
				alert("Debe seleccionar un motivo");
				return false;
			}
		if(document.registroVisitasGenerico.estadoFenValorV.selectedIndex == 0){
			alert("Debe seleccionar un valor fenólico V");
			return false;
		}
		if(document.registroVisitasGenerico.estadoFenValorR.selectedIndex == 0){
			alert("Debe seleccionar un valor fenólico R");
			return false;
		}
		
		if (!validar()){
			document.registroVisitasGenerico.fecha.focus(); 
			return false;
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
		<form method="POST" name="registroVisitasGenerico" action="ServiceSap" onsubmit="return setear();">
		<table border="0" width="100%">
			<tr>
				<td colspan="3" bgcolor="#006699"><span class="Estilo2">Registro visita <%=tipoDeVisita %></span></td>
			</tr>
			<tr>
				<td>
				<hr>
				</td>
			</tr>
			
			<tr>
				<td width="100%" colspan="3" bgcolor="yellow">
				<font face=verdana size=2>
					<%=planificacion.getNombreCliente()%>
				</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="3" bgcolor="yellow"><font face=verdana size=2>
				<% if (planificacion.getCodMatInase()!= null && !"".equals(planificacion.getCodMatInase())){ %>
								<%=planificacion.getDescCampo()%>,<%=planificacion.getDescLote()%><br><%=planificacion.getHectareasSembra()%> Has. Inscripto:SI<br><%=planificacion.getDescCodMatTerm() %></font>
							
							<%}else{ %> 
								<%= planificacion.getDescCampo()%>,<%=planificacion.getDescLote()%><br><%=planificacion.getHectareasSembra()%> Has. Inscripto:NO<br><%=planificacion.getDescCodMatTerm() %></font>
				<%}%>
				</td>
			</tr>
						<tr>
				<td width="100%" colspan="3"><font face=verdana size=2>&nbsp;</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="3"><font face=verdana size=2>Fecha (dd-mm-yyyy)</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="3">
					<input type="text" id="fechaRV" name="fecha" value="<%=fecha%>">
				</td>
			</tr>
			<tr>
				<td colspan="3">
				<hr>
				</td>
			</tr>			
			<tr>
				<td width="100%" colspan="3"><font face=verdana size=2>Estado Fenológico [V]</font></td>
			</tr>	
			<tr>
				<td width="10%" colspan="3">
				<div>
        				<select name="estadoFenValorV" size="1">
							<option value="">-- Elegir --</option>
							<option value="V1">1</option>
							<option value="V2">2</option>
							<option value="V3">3</option>
							<option value="V4">4</option>
							<option value="V5">5</option>
							<option value="V6">6</option>
							<option value="V7">7</option>
							<option value="V8">8</option>
							<option value="V9">9</option>
							<option value="V10">10</option>
							<option value="V11">11</option>
							<option value="V12">12</option>
							<option value="V13">13</option>
							<option value="V14">14</option>
							<option value="V15">15</option>
							<option value="V16">16</option>
							<option value="V17">17</option>
							<option value="V18">18</option>
							<option value="V19">19</option>
							<option value="V20">20</option>
        				</select>	
        		</div>
				</td>			
			</tr>
			<tr>
				<td colspan="3">
				<hr>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="3"><font face=verdana size=2>Estado Fenológico [R]</font></td>
			</tr>
			<tr>
				<td width="10%" colspan="3">
					<div>
	        				<select name="estadoFenValorR" size="1">
								<option value="">-- Elegir --</option>
								<option value="R1">1</option>
								<option value="R2">2</option>
								<option value="R3">3</option>
								<option value="R4">4</option>
								<option value="R5">5</option>
								<option value="R6">6</option>
								<option value="R7">7</option>
								<option value="R8">8</option>
	        				</select>	
	        		</div>
				</td>
			</tr>	
			<tr>
				<td colspan="3">
				<hr>
				</td>
			</tr>
			<tr>
				<td width="100%"><font face=verdana size=2>Estados</font></td>
			</tr>	
			<tr>
				<td width="100%" colspan="2">
						<select name="estados" size="1">
							<option value="">-- Elegir --</option>
          					<option value="POTENCIAL">POTENCIAL</option>
							<option value="OBSERVADO">OBSERVADO</option>
							<option value="DESCARTADO">DESCARTADO</option>
        				</select>
				</td>
			</tr>
			<tr>
				<td colspan="3">
				<hr>
				</td>
			</tr>
			<tr>
				<td width="100%"><font face=verdana size=2>Motivos</font></td>
			</tr>	
			<tr>
				<td width="100%" colspan="3">
						<select name="motivos" size="1">
          					<option value="">-- Elegir --</option>
							<option value="Fecha de siembra">Fecha de siembra</option>
							<option value="Madurez">Madurez</option>
							<option value="Aislamiento">Aislamiento</option>
							<option value="Soja Guacha">Soja Guacha</option>
							<option value="Fuera de Tipo">Fuera de Tipo</option>
							<option value="Maiz guacho">Maiz guacho</option>
							<option value="Observaciones">Observaciones</option>
        				</select>
				</td>
			</tr>
			<tr>
				<td colspan="3">
				<hr>
				</td>
			</tr>
			<tr>
				<td width="100%"><font face=verdana size=2>Probabilidad</font></td>
			</tr>	
			<tr>
				<td width="100%" colspan="1">
						<select name="probabilidad" size="1">
							<option value="">-- Elegir --</option>
          					<option value="ALTA">ALTA</option>
							<option value="MEDIA">MEDIA</option>
							<option value="NULA">NULA</option>
        				</select>
				</td>
			</tr>	
			<tr>
				<td colspan="3">
				<hr>
				</td>
			</tr>
			<tr>
				<td width="100%"><font face=verdana size=2>Rendimiento</font></td>
			</tr>	
			<tr>
				<td width="100%" colspan="1">
						<select name="rendimiento" size="1">
							<option value="">-- Elegir --</option>
          					<option value="1.0">1,0</option>
							<option value="1.5">1,5</option>
							<option value="2.0">2,0</option>
							<option value="2.5">2,5</option>
							<option value="3.0">3,0</option>
							<option value="3.5">3,5</option>
							<option value="4.0">4,0</option>
							<option value="4.5">4,5</option>
							<option value="5.0">5,0</option>
							<option value="5.5">5,5</option>
        				</select>
				</td>
			</tr>
			<tr><td colspan="3"><hr></td></tr>
			<tr>
				<td width="100%" colspan="1"><input class="boton" type="submit" value="Cargar"><br>
				</td>
			</tr>
			<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=RegistroDeVisitasCliente&asig=<%=planificacion.getIdAsignacion()%>&asigPos=<%=planificacion.getIdAsignPos()%>&plaPos=<%=planificacion.getIdPlanificPos()%>';" value="Volver"/><br></td></tr>        
			<tr><td width="100%" colspan="1"><font color="red"></font></td></tr>
							
		</table>
		<input type="hidden" name="accion" value="altaRegistroVisitasGenerico">
		<input type="hidden" name="tipoVisita" value="<%=tipoDeVisita%>">
		</form>
		</td>
	</tr>
</table>


</body>