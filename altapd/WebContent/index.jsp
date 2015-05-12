<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login </title>
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
<script>
	function validar(){
		if(document.login.password.value == '' ){
			alert("¡Debe ingresar su contraseña!");
			document.login.password.focus();
			return false;
			
		}
		return true;
		
	}
</script>
</head>
<body onload="javascript:document.login.password.focus();">
<table style="border-collapse:collapse" bordercolor="#C0C0C0"  border="1" width="300">
    <tr>
<td width="300">
<form method="POST" action="Login" name="login" onsubmit="return validar();">
<table border="0" width="300">  
<tr>
   <td colspan="1" bgcolor="#006699"><span class="Estilo2">Login</span></td>
 </tr>
       <!--<div align="center"><h1> Login</h1></div>-->
     <tr>
     	<td><hr>
     	</td>
     </tr>
 	<tr>
 		<td width="300" colspan="1"><font face=verdana size=2>Clave</font></td></tr>
        <tr>
        	<td width="300" colspan="1"><input type="hidden" name="accion" value="login"><input type="password" name="password">
        	</td>
        </tr>
        
        <tr><td><hr></td></tr>
        <tr><td width="200" colspan="1">
        	<div align="center">
        	<input class="boton" type=submit value=Login><br>
        	</div>
        	</td></tr>
        <tr><td width="300" colspan="1"><font color="red"></font></td></tr>
        </table> 
        </form>
        </td>
	</tr>
      </table>   

</body>
</html>