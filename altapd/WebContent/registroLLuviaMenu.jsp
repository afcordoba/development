<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Calendar"%>
<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
    
<%
	Calendar hoy = java.util.Calendar.getInstance();
	String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
	String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
	String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
	String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
	String fecha = dia + "-" + mes+ "-" + year;
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
<form method="POST" name="registroLL" action="ServiceSap">
<table border="0" width="100%">  
<tr>
   <td colspan="2" bgcolor="#006699"><span class="Estilo2">Registro de LLuvias</span></td>
 </tr>
       
     <tr><td colspan="2"><hr></td></tr>
         <tr><td><font face=verdana size=2>Fecha (dd/mm/aaaa):</font></td>
         </tr>
         <tr><td><input type="text" name="fechamm" value="<%=fecha%>" ></td></tr>
     	<tr><td colspan="2"><div align="left"><font face=verdana size=2>Seleccione Localidad</font></td></tr>
     	<tr><td><font face=verdana size=2>
     			<select name="localidades">
     				<option>SELECCIONAR</option>
     				<option>DAIREAX</option>
     				<option>CHACABUCO</option>
     			</select>	
     			&nbsp;&nbsp;&nbsp;&nbsp;
     			</font>
     		</td>
         </tr>
		<tr><td><font face=verdana size=2>Ingrese mm.</font></div></td></tr>        
        <tr><td><input type="text" name="mm" value=""/></td></tr>
         
       <tr><td width="100%"><input type="hidden" name="accion" value="registrarLLuvia"></td></tr>
        
        <tr><td><hr></td></tr>
        <tr><td><input class="boton" type="submit" value="Guardar y Seguir"></td></tr>
        <tr><td><input class="boton" type="reset" value="Cancelar"></td></tr>
        <tr><td width="100%" colspan="1"><font color="red"></font></td></tr>
        </table> 
        </form>
        </td>
</tr>
      </table>   

</body>
</html>