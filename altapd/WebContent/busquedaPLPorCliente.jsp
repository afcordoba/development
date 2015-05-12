<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String context = request.getContextPath();
	HttpSession sesion = request.getSession();
	String clienteNameBusq = (String) sesion.getAttribute("LAST_CLIENTE_BUSCADO" + sesion.getId());
	if(clienteNameBusq==null) clienteNameBusq = "";
%>  
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busqueda por Cliente </title>
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


<% session.removeAttribute("PLANIFICACION" + session.getId());%>

</head>
<body onload="javascript:document.busqueda.nombreCliente.focus()">
<table style="border-collapse:collapse" bordercolor="#C0C0C0"  border="1" width="100%">
    <tr>
<td width="100%">
<form method="POST" name="busqueda" action="ServiceSap">
<table border="0" width="100%">  
<tr>
   <td colspan="1" bgcolor="#006699"><span class="Estilo2">Busqueda de Planificacion por Cliente </span></td>
 </tr>
       
     <tr><td><hr></td></tr>
    
        
         <tr><td width="100%" colspan="1"><font face=verdana size=2>Nombre de Cliente</font></td></tr>
         <tr><td width="100%" colspan="1"><input type="hidden" name="accion" value="busquedaCliente">
         <input type="text" name="nombreCliente" value="<%=clienteNameBusq%>"></td></tr>
        
        <tr><td><hr></td></tr>
        <tr><td width="100%" colspan="1"><input class="boton" type="submit" value="Ingresar Cliente"><br></td></tr>
		<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="javascript:window.location.href='<%=context%>/menu.jsp'" value="Volver"/><br></td></tr>        
        <tr><td width="100%" colspan="1"><font color="red"></font></td></tr>
        </table> 
        </form>
        </td>
</tr>
      </table>   

</body>
</html>