<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Calendar"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busqueda por Fecha </title>
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
<script>
	function validar(){
		valor = document.getElementById("fechaPL").value;
		if( !(/^\d{2}-\d{2}-\d{4}$/.test(valor)) ) {
		  alert("formato de fecha invalido"); 	
		  return false;
		}else{
			var bar = valor.split("-");
			for(var i = 0;i<bar.length;i++){
			  bar[i] = bar[i].split("@");
			  //salert(bar[i]);
			  var dia = bar[0];
			  var mes = bar[1];
			  var ano = bar[3]
			}   
			  valor = new Date(ano, mes, dia);
			    
			  if( !isNaN(valor) ) {
			    return false;
			  }else{
				  if(mes > 12 ){
					 alert("¡formato de mes inválido!")
					  return false;
				  }else 
					  if(dia > 31 ){
						  alert("¡formato de dia inválido!")
						  return false;
					  }else
						  if(mes == 2 && dia > 29 ){
								 alert("¡formato de fecha inválido!")
								  return false;
							  }
			  }
			
		}
		return true;		
	}
</script>
<%
	Calendar hoy = java.util.Calendar.getInstance();
	String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
	String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
	String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
	String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
	String fecha = dia + "-" + mes+ "-" + year;
%>

</head>
<body onload="document.busqueda.fechaPL.focus();">
<table style="border-collapse:collapse" bordercolor="#C0C0C0"  border="1" width="250">
    <tr>
<td width="250">
<form method="POST" action="ServiceSap" name="busqueda" onsubmit="return validar();">
<table border="0" width="100%">  
<tr>
   <td colspan="1" bgcolor="#006699"><span class="Estilo2">Busqueda de Planificacion por Fecha </span></td>
 </tr>
       
     <tr><td><hr></td></tr>
    
        
         <tr><td width="100%" colspan="1"><font face=verdana size=2>Ingresar Fecha (dd-mm-yyyy)</font></td></tr>
         <tr><td width="100%" colspan="1"><input type="hidden" name="accion" value="busquedaFecha">
         <input type="text" id ="fechaPL" name="fechaPL" value ="<%=fecha%>" ></td></tr>
        
        <tr><td><hr></td></tr>
        <tr><td width="100%" colspan="1"><input class="boton" type="submit" value="Ingresar Fecha"><br></td></tr>
		<tr><td width="100%" colspan="1"><input class="boton"  type="button" onclick="history.go(-1);" value="Volver"/><br></td></tr>        
        <tr><td width="100%" colspan="1"><font color="red"></font></td></tr>
        </table> 
        </form>
        </td>
</tr>
      </table>   

</body>
</html>