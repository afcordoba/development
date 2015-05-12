<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>¡Resultado Alta Plan Diario!</title>
<style>
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
<% 
	String type = (String) request.getParameter("type");
	String msg = (String) request.getParameter("msg");
	String id = (String) request.getParameter("IdPl");
	int id2 = new Integer(id).intValue();

%>


</head>
<body>
	<table style="border-collapse: collapse" bordercolor="#C0C0C0"
	border="1" width="100%">
			<tr>
				<td colspan="1" bgcolor="#006699"><span class="Estilo2"><%=msg%></span></td>
			</tr>
					<% if("S".equals(type)){%>
						<tr height="40">
							<td align="center"> <span><font face="verdana">Plan Diario : <%=id2%> </font> </span> </td>
						</tr>
					<% } %>
			<tr height="40">
				<td valign="center" width="100%">
					<div  align="center">
						<input class="boton"  type="button" onclick="javascript:window.location.href='menu.jsp';" value="Volver"><br>
					</div>
					</td>
			
			</tr>
	</table>
</body>
</html>