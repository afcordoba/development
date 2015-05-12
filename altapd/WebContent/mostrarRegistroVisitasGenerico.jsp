<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.Ztmminspeccion"%>

<%
 	String nombre = (String) session.getAttribute("USUARIO_NOMBRE");
	ZscaDatosPlanificacion planificacion = (ZscaDatosPlanificacion) session.getAttribute("PLANIFICACION" + session.getId());
	ArrayList<Ztmminspeccion> inpeccionesDeVisita = (ArrayList<Ztmminspeccion>) session.getAttribute("LISTADO_DE_VISITAS" + session.getId());
	Iterator ite = inpeccionesDeVisita.iterator();
	int row = 0;
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ver / Mostrar registro de visitas existentes</title>
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
				<td colspan="1" bgcolor="#006699"><span class="Estilo2">Ver / Mostrar registro de visitas</span></td>
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
				<td>
				<hr>
				</td>
			</tr>
			<% while(ite.hasNext()){ Ztmminspeccion insp = (Ztmminspeccion) ite.next();
				if( row % 2 == 0) {
			%>
					<tr bgcolor="#e5e5e5">
						<td width="100%">
						<font face=verdana size=2>
			<% } else { %>
					<tr bgcolor="#ffffff">
						<td width="100%">
						<font face=verdana size=2>
			<% } %>
						<% if (insp.getTipoDeInsp().equalsIgnoreCase("precosecha")){ %>
							<a href="ServiceSap?accion=ModificacionUIregVisitaPrecosecha&amp;pos=<%= row%>&amp;asig=<%=planificacion.getIdAsignacion()%>&amp;asigPos=<%=planificacion.getIdAsignPos()%>&amp;plaPos=<%=planificacion.getIdPlanificPos()%>">
								Registro de visita precosecha
							</a>
						<% } else if (insp.getTipoDeInsp().equalsIgnoreCase("floracion")){%>
							<a href="ServiceSap?accion=ModificacionUIregVisitaFloracion&amp;pos=<%= row%>&amp;asig=<%=planificacion.getIdAsignacion()%>&amp;asigPos=<%=planificacion.getIdAsignPos()%>&amp;plaPos=<%=planificacion.getIdPlanificPos()%>">
								Registro de visita floración
							</a>
						<% } else if (insp.getTipoDeInsp().equalsIgnoreCase("periodica")){ %>
							<a href="ServiceSap?accion=ModificacionUIregVisitaPeriodica&amp;pos=<%= row%>&amp;asig=<%=planificacion.getIdAsignacion()%>&amp;asigPos=<%=planificacion.getIdAsignPos()%>&amp;plaPos=<%=planificacion.getIdPlanificPos()%>">
								Registro de visita periodica
							</a>
						<% } %>						
						</font>
						</td>
					</tr>
			
			<% row++;}%>
			
			<tr>
				<td>
				<hr>
				</td>
			</tr>
			</table>
		</td>
	</tr>
	<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="history.go(-1);" value="Volver"/><br></td></tr>
		</table>
		
		</td>
	</tr>
</table>


</body>