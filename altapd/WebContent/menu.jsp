<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="dm.planesdiarios.dao.Usuario"%>
<%@ page session="true"%>
 <% 
 	
 	HttpSession sesion = request.getSession(); 
 	String context = request.getContextPath();
 	Usuario user;
 	String nombre="";
 	if(sesion.getAttribute("USUARIO_LOGUEADO"+sesion.getId()) != null ){	
	 	user = (Usuario)sesion.getAttribute("USUARIO_LOGUEADO"+sesion.getId());	
	 	nombre = user.getNombre(); 
 	}
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
-->
</style>
    </head>
    <body>
        <table style="border-collapse:collapse" bordercolor="#C0C0C0"  border="1" width="300">
    <tr>
<td width="300">
    <table border="0" width="300">  
     
    <tr>
   <td colspan="1"  bgcolor="#006699"><span class="Estilo2">Menu : &nbsp;&nbsp;&nbsp; <%=nombre%> </span></td>
   
 </tr>
      <tr><td width="300"> <a style="color:#888888;" href="<%=context%>/ServiceSap?accion=mostrarUIbusquedaCodigo">[Busqueda Planificacion x Codigo]</a></td></tr>
     <tr><td width="300"> <a style="color:#888888;" href="<%=context%>/ServiceSap?accion=mostrarUIbusquedaCliente">[Busqueda Planificacion x Cliente]</a></td></tr>
      <tr><td width="300"> <a style="color:#888888;" href="<%=context%>/ServiceSap?accion=mostrarUIbusquedaFecha">[Ver Planes Diarios]</a></td></tr>
      <tr><td width="300"> <a style="color:#888888;" href="<%=context%>/ServiceSap?accion=mostrarUIRegistroLLuvia">[Registro de LLuvias]</a></td></tr>  
        
        
        <tr>
        	<td width="300"><hr></td>
        </tr>
       
        <tr><td colspan="1" bgcolor="#006699"> <a style="color:#ffffff;" href="<%=context%>/Login?accion=logout">[Cerrar Sesion]</a></td></tr>
         </table> 
       
        </td>
</tr>
      </table> 
   
    </body>
