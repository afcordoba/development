<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion"%>

<%@ page session="true"%>
 <% 
	HttpSession sesion = request.getSession(); 
	String context = request.getContextPath();
 	String nombre = (String) session.getAttribute("USUARIO_NOMBRE");
	ZscaDatosPlanificacion planificacion = (ZscaDatosPlanificacion) session.getAttribute("PLANIFICACION" + session.getId());
	request.setAttribute("visitaPeriodicaExist", (boolean) (((String)session.getAttribute("EXISTE_VISITA_Periodica")) !=null ? true : false));
	request.setAttribute("visitaFloracionExist", (boolean) (((String)session.getAttribute("EXISTE_VISITA_Floracion")) != null ? true : false));
	request.setAttribute("visitaPrecosechaExist", (boolean) (((String)session.getAttribute("EXISTE_VISITA_Precosecha")) != null ? true : false));
 %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Visitas</title>

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
        width:250px;
        height:19px;
       }
.botonGrey{
        font-size:12px;
        font-family:Verdana,Helvetica;
        font-weight:bold;
        color:black;
        background:#c8c8c8;
        border:0px;
        width:250px;
        height:19px;
       }       
-->
</style>
             
    </head>
    <body>
		<table style="border-collapse:collapse" bordercolor="#C0C0C0"  border="1" width="300">
			<tr>
				<td width="300">
					<table border="0" width="300">  
						<tr>
							<td colspan="1"  bgcolor="#006699"><span class="Estilo2">Registro de Visitas </span></td>
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
						<tr><td><hr></td></tr>

						<c:if test="${visitaPeriodicaExist}">
							<tr><td width="100%" colspan="1"><input class="botonGrey" type="button" onclick="javascript:window.alert('El registro de visita periodica ya existe, para modificarlo vaya a &quot;Ver / Modificar registro de visita&quot;.')" value="Registro de visita periodica"/><br></td></tr>						
						</c:if>
						<c:if test="${! visitaPeriodicaExist}">
							<tr><td width="100%" colspan="1"><input class="boton" type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=AltaUIregVisitaPer&asig=<%=planificacion.getIdAsignacion()%>&asigPos=<%=planificacion.getIdAsignPos()%>&plaPos=<%=planificacion.getIdPlanificPos()%>';" value="Registro de visita periodica"/><br></td></tr>						
						</c:if>

						<c:if test="${visitaFloracionExist}">
							<tr><td width="100%" colspan="1"><input class="botonGrey" type="button" onclick="javascript:window.alert('El registro de visita floracion ya existe, para modificarlo vaya a &quot;Ver / Modificar registro de visita&quot;.')" value="Registro de visita floracion"/><br></td></tr>
						</c:if>
						<c:if test="${! visitaFloracionExist}">
							<tr><td width="100%" colspan="1"><input class="boton" type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=AltaUIregVisitaFlor&asig=<%=planificacion.getIdAsignacion()%>&asigPos=<%=planificacion.getIdAsignPos()%>&plaPos=<%=planificacion.getIdPlanificPos()%>';" value="Registro de visita floración"/><br></td></tr>
						</c:if>						
						<c:if test="${visitaPrecosechaExist}">
							<tr><td width="100%" colspan="1"><input class="botonGrey" type="button" onclick="javascript:window.alert('El registro de visita precosecha ya existe, para modificarlo vaya a &quot;Ver / Modificar registro de visita&quot;.')" value="Registro de visita precosecha"/><br></td></tr>
						</c:if>
						<c:if test="${! visitaPrecosechaExist}">
						<tr><td width="100%" colspan="1"><input class="boton" type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=AltaUIregVisitaPrec&asig=<%=planificacion.getIdAsignacion()%>&asigPos=<%=planificacion.getIdAsignPos()%>&plaPos=<%=planificacion.getIdPlanificPos()%>';" value="Registro de visita precosecha"/><br></td></tr>
						</c:if>

						<tr><td width="100%" colspan="1"><input class="boton" type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=MostrarUIverModifRegVisita&asig=<%=planificacion.getIdAsignacion()%>&asigPos=<%=planificacion.getIdAsignPos()%>&plaPos=<%=planificacion.getIdPlanificPos()%>';" value="Ver / Modificar registro de visita"/><br></td></tr>
						<tr><td><hr></td></tr>
						<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=AccionPlan&amp;asig=<%=planificacion.getIdAsignacion()%>&amp;asigPos=<%=planificacion.getIdAsignPos()%>&amp;plaPos=<%=planificacion.getIdPlanificPos()%>'" value="Volver"/><br></td></tr>        
						<tr><td width="100%" colspan="1"><font color="red"></font></td></tr>
						
					</table> 
				</td>
			</tr>
		</table> 
    </body>
