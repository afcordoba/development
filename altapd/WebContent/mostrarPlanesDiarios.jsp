<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaPlanesDiarios"%>

<%
	ZscaPlanesDiarios[] planes = (ZscaPlanesDiarios[])	session.getAttribute("PLANES_DIARIOS" + session.getId());
	String context = request.getContextPath();
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Listado Planes Diarios</title>
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
</head>
<body>
<table style="border-collapse: collapse" bordercolor="#C0C0C0"
	border="1" width="100%">
	<tr>
		<td width="100%">
		<table border="0" width="100%">
			<tr>
				<td colspan="1" bgcolor="#006699"><span class="Estilo2">Planes Diarios</span></td>
			</tr>
			<tr>
				<td>
				<hr>
				</td>
			</tr>
			<% for( int row = 0;row < planes.length;row++){ 
				ZscaPlanesDiarios plan = planes[row];
				int idPlan =  new Integer(plan.getIdPlanDiario()).intValue();
					if( row % 2 == 0) {
						
			%>
				<tr bgcolor="#e5e5e5">
						<td width="100%" >
							<font face=verdana size=2>
							<a href="<%=context%>/ServiceSap?accion=buscarPlanDiario&idpl=<%=plan.getIdPlanDiario()%>">
								<%=plan.getNombreProveedor()%><BR>
								<%=plan.getDescCampo()%>,<%=plan.getDescLote()%>,<%=plan.getHectareasSembra() %> has.<br>
								<%=plan.getMaktxProdCodSapTerm()%><br>
								<%=plan.getVarCamionesPlanificados()%> cam.,<%=plan.getName1Calidad() %>,<%=plan.getEstPlanDiario()%> [<%=idPlan%>] 
							</a>
							</font>
						<td>
					</tr>
				<% }else {%>	
							<td width="100%" colspan="1">
								<font face=verdana size=2>
									<a href="<%=context%>/ServiceSap?accion=buscarPlanDiario&idpl=<%=plan.getIdPlanDiario()%>">
										<%=plan.getNombreProveedor()%><BR>
								<%=plan.getDescCampo()%>,<%=plan.getDescLote()%>,<%=plan.getHectareasSembra() %> has.<br>
								<%=plan.getMaktxProdCodSapTerm()%><br>
								<%=plan.getVarCamionesPlanificados()%> cam.,<%=plan.getName1Calidad() %>,<%=plan.getEstPlanDiario()%> [<%=idPlan%>]
									</a>
								</font>							
								<td>
						</tr>
					<% }%>
			<% }%>
		</table>
		</td>
	</tr>
</table>


</body>