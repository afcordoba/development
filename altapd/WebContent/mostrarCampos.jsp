<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.Map"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion"%>

<%
	Set campos = (Set) session.getAttribute("CAMPOSxUSUARIO"+session.getId());
	Iterator ite = campos.iterator();
	String context = request.getContextPath();
	int row = 0; 
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
</head>
<body>
<table style="border-collapse: collapse" bordercolor="#C0C0C0"
	border="1" width="100%">
	<tr>
		<td width="100%">
		<table border="0" width="100%">
			<tr>
				<td colspan="1" bgcolor="#006699"><span class="Estilo2">Campos</span></td>
			</tr>
			<tr>
				<td>
				<hr>
				</td>
			</tr>
			<% while(ite.hasNext() ){ Map.Entry entry = (Map.Entry) ite.next();String clienteCampo= (String) entry.getValue();String campo = (String) entry.getKey(); 
					if( row % 2 == 0) {
			%>
				<tr bgcolor="#e5e5e5">
						<td width="100%" >
							<font face=verdana size=2>
							<a href="<%=context%>/ServiceSap?accion=buscarPlanificacion&cliente=<%=campo%>"> <%=clienteCampo%></a>
							</font>
						<td>
					</tr>
				<% }else {%>	
						<tr bgcolor="#ffffff">
							<td width="100%" colspan="1">
								<font face=verdana size=2>
								<a href="<%=context%>/ServiceSap?accion=buscarPlanificacion&cliente=<%=campo%>"> <%=clienteCampo%></a>
								</font>
							<td>
						</tr>
					<% }%>
			<% row++;}%>
		</table>
		</td>
	</tr>
	<tr>
		<td>
			<hr>
		</td>
	</tr>
	<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="javascript:window.location.href='<%=context%>/busquedaPLPorCliente.jsp'" value="Volver"/><br></td></tr>
</table>


</body>