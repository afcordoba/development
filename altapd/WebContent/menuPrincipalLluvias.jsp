<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
<!--
.Estilo2 {
	color: #FFFFFF;
	font-family: Tahoma;
	font-size: 10pt;
	font-weight: bold;
}

.boton {
	font-size: 12px;
	font-family: Verdana, Helvetica;
	font-weight: bold;
	color: white;
	background: #638cb5;
	border: 0px;
	width: 150px;
	height: 19px;
}
-->
</style>

</head>
<body>
<table style="border-collapse: collapse" bordercolor="#C0C0C0"
	border="1" width="300">
	<tr>
		<td width="300">
		<form name ="selector" method="GET" action="ServiceSap">
		<table border="0" width="300">
			<tr>
				<td colspan="1" bgcolor="#006699"><span class="Estilo2">REGISTRO DE LLUVIAS</span></td>
			</tr>
			<tr>
				<td>
				<hr>
				</td>
			</tr>
			<tr>
				<td width="300" colspan="1">
					<div align="center">
						<input type="hidden" name="accion" value="buscarLocalidades">
						<input class="boton" type="submit" value="Cargar mm">
					</div>
				</td>
			</tr>
			<tr>
				<td width="300" colspan="1"></td>
			</tr>
			<tr>
				<td width="300" colspan="1">
					<div align="center">
						<input class="boton" type="button" onclick="document.selector.accion.value='mostrarRegLluvia';document.selector.submit();" value="Visualizar Datos"><br>
					</div>	
				</td>
			</tr>
			<tr>
				<td width="300" colspan="1">
					<div align="center">
						<input class="boton"  type="button" onclick="history.go(-1);" value="Volver"/>
					</div>
				</td>
			</tr>
			<tr>
				
					<td width="300" colspan="1"><font color="red"></font></td>
				
			</tr>
		</table>
		</form>
		</td>
	</tr>
</table>

</body>
</html>