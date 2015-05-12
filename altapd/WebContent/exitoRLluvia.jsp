<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Exitoso </title>
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
<% String context = request.getContextPath(); %>
</head>
<body onload="document.busqueda.fechaPL.focus();">
<table style="border-collapse:collapse" bordercolor="#C0C0C0"  border="1" width="200">
    <tr>
<td width="200">

<table border="0" width="200">  
<tr>
   <td colspan="1" bgcolor="#006699"><span class="Estilo2">Registro Exitoso </span></td>
 </tr>
       
     <tr><td><hr></td></tr>
         <tr><td width="200" colspan="1"><font face=verdana size=2>Detalle mm. por ciudad</font></td></tr>
    
        <tr><td><hr></td></tr>
        <tr><td width="200" colspan="1"><div align="center"><input type="button" value="Seguir Registrando lluvia" onclick="window.location.href='<%=context%>/mostrarLocalidadesEncargado.jsp'"/></div><br></td></tr>
        <tr><td width="200" colspan="1"><div align="center"><input type="button" value="Volver al Menu" onclick="window.location.href='<%=context%>/menu.jsp'"/></div><br></td></tr>
        <tr><td width="200" colspan="1"><font color="red"></font></td></tr>
        </table> 

        </td>
</tr>
      </table>   

</body>
</html>