<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion"%>

<%
	String context = request.getContextPath();
 	String nombre = (String) session.getAttribute("USUARIO_NOMBRE");
	ArrayList<ZscaDatosPlanificacion> planificaciones = (ArrayList<ZscaDatosPlanificacion>)session.getAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE"+session.getId());
	Iterator ite = planificaciones.iterator();
	int row = 0;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu</title>
<style type="text/css">
<!--
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

-->
</style>
</head>
<body>


<table style="border-collapse: collapse" bordercolor="#C0C0C0"
	border="1" width="100%">
	<tr>
		<td width="100%">
		
		<table border="0" width="100%">
			<tr>
				<td colspan="1" bgcolor="#006699"><span class="Estilo2">Planificaciones x Cliente</span></td>
			</tr>
			<tr>
				<td>
				<hr>
				</td>
			</tr>
			<% while(ite.hasNext()){ ZscaDatosPlanificacion pl = (ZscaDatosPlanificacion) ite.next();
				if( row % 2 == 0) {
			%>
					<tr bgcolor="#e5e5e5">
						<td width="100%">
						<font face=verdana size=2>
						<a href="ServiceSap?accion=AccionPlan&amp;asig=<%=pl.getIdAsignacion()%>&amp;asigPos=<%=pl.getIdAsignPos()%>&amp;plaPos=<%=pl.getIdPlanificPos()%>">
							Lote: <%= pl.getDescLote()+","+pl.getHectareasSembra()+" has. <br>"
							+pl.getDescCodMatTerm()%>
						</a>
						</font>
						</td>
					</tr>
			<% }else {%>
					<tr bgcolor="#ffffff">
						<td width="100%">
						<font face=verdana size=2>
						<a href="ServiceSap?accion=AccionPlan&amp;asig=<%=pl.getIdAsignacion()%>&amp;asigPos=<%=pl.getIdAsignPos()%>&amp;plaPos=<%=pl.getIdPlanificPos()%>">
							Lote: <%=pl.getDescLote()+","+pl.getHectareasSembra()+" has. <br>"
							+pl.getDescCodMatTerm()%>
						</a>
						</font>
						</td>
					</tr>
			
			<% }%>
			<% row++;}%>
			
				<tr>
		<td>
			<hr>
		</td>
	</tr>
	<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=busquedaCliente'" value="Volver"/><br></td></tr>
		</table>
		
		</td>
	</tr>
</table>


</body>