<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion"%>
<%@page import="java.util.Set"%>

<%@ page session="true"%>
 <% 
	HttpSession sesion = request.getSession();
 	
 	String codigoPL = (String) sesion.getAttribute("LAST_CODIGO_BUSCADO" + sesion.getId());
	String clienteCampo = (String) sesion.getAttribute("LAST_CLIENTE_CAMPO_SELECTED" + sesion.getId()); 
	String context = request.getContextPath();
 	String nombre = (String) session.getAttribute("USUARIO_NOMBRE");
	ZscaDatosPlanificacion planificacion = (ZscaDatosPlanificacion) session.getAttribute("PLANIFICACION" + session.getId());
 %>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
       <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acción de Planificación</title>

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
-->
</style>
             
    </head>
    <body>
		<table style="border-collapse:collapse" bordercolor="#C0C0C0"  border="1" width="300">
			<tr>
				<td width="300">
					<table border="0" width="300">  
						<tr>
							<td colspan="1"  bgcolor="#006699"><span class="Estilo2">Acción de Planificación</span></td>
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
						<tr><td width="100%" colspan="1"><input class="boton" type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=RegistroDeVisitasCliente&asig=<%=planificacion.getIdAsignacion()%>&asigPos=<%=planificacion.getIdAsignPos()%>&plaPos=<%=planificacion.getIdPlanificPos()%>';" value="Registro de Visitas"/><br></td></tr>
						<tr><td width="100%" colspan="1"><input class="boton" type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=AltaPlanDiarioCliente&asig=<%=planificacion.getIdAsignacion()%>&asigPos=<%=planificacion.getIdAsignPos()%>&plaPos=<%=planificacion.getIdPlanificPos()%>';" value="Alta Plan diario"/><br></td></tr>
						<tr><td><hr></td></tr>
						<% if (session.getAttribute("ACCION_PLAN_PREV_PAGE" +session.getId())!=null && (((String) session.getAttribute("ACCION_PLAN_PREV_PAGE" + session.getId())).equalsIgnoreCase("buscarPlanificacionCliente"))) {%>
							<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=buscarPlanificacion&cliente=<%=clienteCampo%>';" value="Volver"/><br></td></tr>        
						<% } else if (session.getAttribute("ACCION_PLAN_PREV_PAGE"  +session.getId())!=null && ((String) session.getAttribute("ACCION_PLAN_PREV_PAGE" +session.getId())).equalsIgnoreCase("buscarPlanificacionCodigo")) {%>
							<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="javascript:window.location.href='<%=context%>/ServiceSap?accion=busquedaCodigo&codigoPL=<%=codigoPL%>';" value="Volver"/><br></td></tr>
						<% } %>
						<tr><td width="100%" colspan="1"><font color="red"></font></td></tr>
						
					</table> 
				</td>
			</tr>
		</table> 
    </body>
