<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.StringTokenizer"%>

<%@page import="dm.planesdiarios.dao.PlantaPorEncargado"%>
<%@page import="mc_style.functions.soap.sap.document.sap_com.ZscaPlanesDiarios"%>

<%
	

	ZscaPlanesDiarios plan = (ZscaPlanesDiarios) session.getAttribute("PLAN_DIARIO_POR_FECHA" + session.getId());
	StringTokenizer tokens = new StringTokenizer(plan.getFePlanDiario() , "-");
	int nDatos=tokens.countTokens();
	double[] datos=new double[nDatos];
	int i=0;
	String ano="";String mes ="";String dia="";
	while(tokens.hasMoreTokens()){
	    String str=tokens.nextToken();
	    if(i==2)
	    	   dia = str;
	    else
	    	if(i==1)
	    		mes = str;
	    	else
	    		if(i==0)
	    			ano = str;
	    i++;
	}
	
	String ICentroDescarga = "";
	plan.setFePlanDiario(dia+"-"+mes+"-"+ano) ;
	ArrayList<PlantaPorEncargado> plantasXUsuario =(ArrayList<PlantaPorEncargado>)session.getAttribute("PLANTASxUSUARIO"+session.getId());
	Iterator ite = plantasXUsuario.iterator();
	
	
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Editar Plan Diario</title>
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
	function esNatural(strNumero){
		regexp = /^[0-9]*$/;
		return regexp.test(strNumero);
	}
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
	function setear(){
		altaPlanDiario.centroElegido.value=document.altaPlanDiario.centros.options[document.altaPlanDiario.centros.selectedIndex].value; 
		
		if(document.altaPlanDiario.centros.selectedIndex == -1){
			alert("Debe seleccionar una planta");
			return false;
		}
		if(document.altaPlanDiario.cantcamiones.value == ''){
			alert("Debe ingresar cantidad de camiones");
			document.altaPlanDiario.cantcamiones.focus();
			return false;
		}else
			validar();
		//altaPlanDiario.submit();
		return true;
	}
function ToInteger(){
	valor = document.getElementById("cantcamiones").value;
	var bar = valor.split(".");
	for(var i = 0;i<bar.length;i++){
	  bar[i] = bar[i].split(".");
	  //salert(bar[i]);
	  var camiones = bar[0];
	  document.altaPlanDiario.cantcamiones.value=camiones;
	}   
	
}
	
	
</script>
</head>
<body onLoad="javascript:ToInteger()">


<table style="border-collapse: collapse" bordercolor="#C0C0C0"
	border="1" width="100%">
	<tr>
		<td width="100%">
		<form method="POST" name="altaPlanDiario" action="ServiceSap" onsubmit="return setear();">
		<table border="0" width="100%">
			<tr>
				<td colspan="1" bgcolor="#006699"><span class="Estilo2">Editar Plan Diario</span></td>
			</tr>
			<tr>
				<td>
				<hr>
				</td>
			</tr>

			<tr>
				<td width="100%"  bgcolor="yellow">
				<font face=verdana size=2>
					<%=plan.getNombreProveedor()%>
				</font></td>
			</tr>
			<tr>
				<td width="100%"  bgcolor="yellow"><font face=verdana size=2>
				<%=plan.getDescCampo()%>-<%=plan.getDescLote()%>-<%=plan.getHectareasSembra()%> Has.</font></td>
			</tr>
			<tr>
				<td width="100%"  bgcolor="yellow"><font face=verdana size=2>
				<%=plan.getMaktxProdCodSapTerm()%></font></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><font face=verdana size=2>&nbsp;</font></td>
			</tr>
			<tr>
				<td width="100%"><font face=verdana size=2>Fecha (dd-mm-yyyy)</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><input type="hidden" name="accion"
					value="altaPlanDiario"><input type="text" id="fechaPL" name="fecha" value="<%=plan.getFePlanDiario()%>"></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><font face="verdana" size="2" >Cant.Camiones</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><input type="text" name="cantcamiones" id="cantcamiones" value="<%= plan.getVarCamionesPlanificados()%>"></td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><font face=verdana size=2>Plantas</font></td>

			</tr>
			<tr>
				<td width="100%" colspan="1"><font face=verdana size=2>
					<input type="hidden" name="centroElegido">
					<select name="centros" size="1">
					<% while(ite.hasNext()){ 
						PlantaPorEncargado planta = ( PlantaPorEncargado) ite.next();
					   if( planta.getCod_planta().equals(plan.getCentroCalidad())){	
					%>
						<option selected="selected" value="<%=planta.getCod_planta()%>"><%=planta.getDesc_planta()%></option>	
					<% }else {%>	
						<option value="<%=planta.getCod_planta()%>"><%=planta.getDesc_planta()%></option>
					<% }
					  }%>
					</select>
				</td>
			</tr>
			
			<tr>
				<td width="100%" colspan="1"><font face=verdana size=2>Estado</font></td>
			</tr>
			<tr>
				<td width="100%" colspan="1">
						<select name="estados" size="1">
							<% if("P".equals(plan.getEstPlanDiario())){ %>
      											<option value="P" selected="selected">Planificado</option>
					        <% }else{ %> 
					        			<option value="P">Planificado</option>
					        <% }if("C".equals(plan.getEstPlanDiario())){ %>		
					         		<option value="C" selected="selected">Confirmado</option>
					        <% }else{ %> 
					        		<option value="C">Confirmado</option>
					          
					        <% }if("CF".equals(plan.getEstPlanDiario())){ %>
					          <option selected="selected" value="CF" >Confirmado y Finalizado</option>
					          
							<% }else{ %> 
									<option  value="CF" >Confirmado y Finalizado</option>
							<% }if("D".equals(plan.getEstPlanDiario())){ %>
									<option selected="selected" value="D">Descartado</option>
							<% }else{ %>
									<option  value="D">Descartado</option>
							<% } %>
							<% if("PC".equals(plan.getEstPlanDiario())){ %>
									<option selected="selected" value="D">Cancelado</option>
							<% }else{ %>
									<option  value="PC">P.Diario Cancelado</option>
							<% } %>
							<% if("CC".equals(plan.getEstPlanDiario())){ %>
									<option selected="selected" value="CC">Cancelado</option>
							<% }else{ %>
									<option  value="CC">Confirmado Coop.</option>
							<% } %>
							<% if("CE".equals(plan.getEstPlanDiario())){ %>
									<option selected="selected" value="CE">Cancelado</option>
							<% }else{ %>
									<option  value="CC">Confirmado Elegido</option>
							<% } %>
        				</select>
        		</td>
			</tr>
			<tr>
				<td>
				<hr>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><input class="boton" type="submit" value="Cargar"><br>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="1">&nbsp;<br>
				</td>
			</tr>
			
			<tr>
				<td width="100%"><input class="boton" type="button" onclick="history.go(-1);" value="Volver"><br>
				</td>
			</tr>
			<tr>
				<td width="100%" colspan="1"><font color="red"></font></td>
			</tr>
		</table>
		</form>
		</td>
	</tr>
</table>


</body>