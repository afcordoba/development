package dm.planesdiarios.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.holders.StringHolder;

import mc_style.functions.soap.sap.document.sap_com.Bapiret2;
import mc_style.functions.soap.sap.document.sap_com.ZMM_EXTRACTOR_LOCALIDADESProxy;
import mc_style.functions.soap.sap.document.sap_com.Z_CA_001_1_LISTA_PLANIFICACIONProxy;
import mc_style.functions.soap.sap.document.sap_com.Z_CA_005_1_PLANES_DIARIOSProxy;
import mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIOProxy;
import mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCIONProxy;
import mc_style.functions.soap.sap.document.sap_com.Z_CA_058B_EDITAR_INSPECICONProxy;
import mc_style.functions.soap.sap.document.sap_com.Z_CA_915_MD_AVANCE_COSECHAProxy;
import mc_style.functions.soap.sap.document.sap_com.ZmmLocalidades;
import mc_style.functions.soap.sap.document.sap_com.ZscaDatosPlanificacion;
import mc_style.functions.soap.sap.document.sap_com.ZscaPlanesDiarios;
import mc_style.functions.soap.sap.document.sap_com.ZsmmHeadInspeccion;
import mc_style.functions.soap.sap.document.sap_com.Ztmminspeccion;
import mc_style.functions.soap.sap.document.sap_com.ZtmminspeccionI;
import mc_style.functions.soap.sap.document.sap_com.holders.Bapiret2THolder;
import mc_style.functions.soap.sap.document.sap_com.holders.ZmmtLocalidadesHolder;
import mc_style.functions.soap.sap.document.sap_com.holders.ZsmmHeadInspeccionHolder;
import mc_style.functions.soap.sap.document.sap_com.holders.ZtymmInspeccionHolder;
import mc_style.functions.soap.sap.document.sap_com.holders.ZtymmInspeccionItemHolder;
import dm.planesdiarios.dao.DataWarehouseDAO;
import dm.planesdiarios.dao.PlantaPorEncargado;
import dm.planesdiarios.dao.RegistroLluvia;
import dm.planesdiarios.dao.Usuario;

/**
 * Servlet implementation class ServiceSap
 */
public class ServiceSap extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ICodLoteTerc = "";
	private static final String ICodMatSembrado = "";
//	private static final String ICodLoteProp = "";
	private static String IEncargado = "";
	private static final String ICultivo = "";
	private static final String ICodCampoProp = "";
	private static String IIdPlanificacion = "";
	private static String IPropTercero = "T";
	private static String ISociedad = "";
	private static String INombreCliente = "";
	private static String ICampana = "";
	private static final String IProveedor = "";
	private static final String ICodCampoTerc = "";
	private static final String IContratistaCose = "";
	private static final String IAtributo = "";
	private static final BigDecimal IHaPlanificadasHoy = null;
	private static final String IPlanDiario = "";
	private static final String IEstPlanDiaro = "";
	private static final String ICodLoteProp = "";
	private static String IAvanceCosecha = "";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServiceSap() {
		super();
		// TODO Auto-generated constructor stub

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(true);
		Usuario user = (Usuario) sesion.getAttribute("USUARIO_LOGUEADO" + sesion.getId());
		List<PlantaPorEncargado> plantasXEncargado = DataWarehouseDAO.getInstance().getPlantasUsuario(user.getId_encargado(), user.getCampaña());
		sesion.setAttribute("PLANTASxUSUARIO" + sesion.getId(), plantasXEncargado);
		if ("mostrarUIbusquedaCodigo".equalsIgnoreCase((String) request.getParameter("accion"))) {
			sesion.removeAttribute("ACCION_PLAN_PREV_PAGE" + sesion.getId());
			sesion.removeAttribute("LAST_CODIGO_BUSCADO" + sesion.getId());
			response.sendRedirect("busquedaPLPorCodigo.jsp");
		} else if ("mostrarUIbusquedaCliente".equalsIgnoreCase((String) request.getParameter("accion"))) {
			sesion.removeAttribute("ACCION_PLAN_PREV_PAGE" + sesion.getId());
			sesion.removeAttribute("LAST_CLIENTE_BUSCADO" + sesion.getId());
			response.sendRedirect("busquedaPLPorCliente.jsp");
		} else if ("mostrarUIbusquedaFecha".equalsIgnoreCase((String) request.getParameter("accion"))){
			response.sendRedirect("busquedaPLPorFecha.jsp");
		}else if ("mostrarUIRegistroLLuvia".equalsIgnoreCase((String) request.getParameter("accion"))) {
			response.sendRedirect("menuPrincipalLluvias.jsp");
		}

		if ("buscarPlanificacion".equalsIgnoreCase((String) request.getParameter("accion"))) {
			String clave = (String) request.getParameter("cliente");
			sesion.setAttribute("LAST_CLIENTE_CAMPO_SELECTED" + sesion.getId(), clave);
			sesion.setAttribute("ACCION_PLAN_PREV_PAGE" + sesion.getId(), "buscarPlanificacionCliente");
			ZscaDatosPlanificacion[] planificaciones = (ZscaDatosPlanificacion[]) sesion.getAttribute("PLANIFICACIONES_NOMBRE_CLIENTE" + sesion.getId());
			List<ZscaDatosPlanificacion> planifxcampo = new ArrayList<ZscaDatosPlanificacion>();
			int x = 0;

			for (x = 0; x < planificaciones.length; x++) {
				ZscaDatosPlanificacion pl = planificaciones[x];
				if (clave.trim().equalsIgnoreCase(pl.getCodCampoTerc().trim())) {
					// planifxcampo.add(pl.getNombreCliente()+","+pl.getDescCampo()+","+pl.getDescLote()+","+pl.getHectareasSembra()+","+pl.getDescCodMatTerm());
					planifxcampo.add(pl);

				}
				sesion.setAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE" + sesion.getId(), planifxcampo);
			}
			IIdPlanificacion = "";

			response.sendRedirect("mostrarPlanifXCliente.jsp");

		}

		
		if ("buscarPlanDiario".equalsIgnoreCase((String) request.getParameter("accion"))) {
			String idPlanDiario = (String) request.getParameter("idpl");
			int idPD = new Integer(idPlanDiario).intValue();

			ZscaPlanesDiarios[] planes = (ZscaPlanesDiarios[]) sesion.getAttribute("PLANES_DIARIOS" + sesion.getId());

			for (int x = 0; x < planes.length; x++) {
				ZscaPlanesDiarios pl = planes[x];
				if (idPD == new Integer(pl.getIdPlanDiario()).intValue()) {
					pl.setVarCamionesEnviados(pl.getVarCamionesPlanificados());
					sesion.setAttribute("PLAN_DIARIO_POR_FECHA" + sesion.getId(), pl);
					// Buscar la Planificacion

				}
			}
			response.sendRedirect("modificarPlanDiario.jsp");
		}

		if ("busquedaCliente".equalsIgnoreCase((String) request.getParameter("accion"))) {
			request.setAttribute("nombreCliente", sesion.getAttribute("LAST_CLIENTE_BUSCADO" + sesion.getId()));
			this.doPost(request, response);
		}
		
		if ("busquedaCodigo".equalsIgnoreCase((String) request.getParameter("accion"))) {
			//request.setAttribute("codigoPL", sesion.getAttribute("LAST_CODIGO_BUSCADO" + sesion.getId()));
			request.getRequestDispatcher("busquedaPLPorCodigo.jsp").forward(request, response);
		}
		
		if ("AltaPlanDiarioCliente".equals((String) request.getParameter("accion"))) {
			String idasig = (String) request.getParameter("asig");
			String asigPos = (String) request.getParameter("asigPos");
			String plaPos = (String) request.getParameter("plaPos");

			List<ZscaDatosPlanificacion> planifxcampo = (List<ZscaDatosPlanificacion>) sesion.getAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE" + sesion.getId());
			Iterator it = planifxcampo.iterator();
			boolean encontre = false;
			while (it.hasNext() && !encontre) {
				ZscaDatosPlanificacion pla = (ZscaDatosPlanificacion) it.next();
				if (idasig.equalsIgnoreCase(pla.getIdAsignacion()) && asigPos.equalsIgnoreCase(pla.getIdAsignPos().trim()) && plaPos.equalsIgnoreCase(pla.getIdPlanificPos())) {
					sesion.setAttribute("PLANIFICACION" + sesion.getId(), pla);
					encontre = false;
				}
			}
			response.sendRedirect("altaPlanDiario.jsp");
		}
		
		if ("AccionPlan".equals((String) request.getParameter("accion"))) {
			String idasig = (String) request.getParameter("asig");
			String asigPos = (String) request.getParameter("asigPos");
			String plaPos = (String) request.getParameter("plaPos");
	
			
			List<ZscaDatosPlanificacion> planifxcampo = (List<ZscaDatosPlanificacion>) sesion.getAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE" + sesion.getId());
			Iterator it = planifxcampo.iterator();
			boolean encontre = false;
			while (it.hasNext() && !encontre) {
				ZscaDatosPlanificacion pla = (ZscaDatosPlanificacion) it.next();
				if (idasig.equalsIgnoreCase(pla.getIdAsignacion()) && asigPos.equalsIgnoreCase(pla.getIdAsignPos().trim()) && plaPos.equalsIgnoreCase(pla.getIdPlanificPos())) {
					sesion.setAttribute("PLANIFICACION" + sesion.getId(), pla);
					encontre = false;
				}
			}
			response.sendRedirect("accionPlan.jsp");
		}
		
		if ("RegistroDeVisitasCliente".equals((String) request.getParameter("accion"))) {
			String idasig = (String) request.getParameter("asig");
			String asigPos = (String) request.getParameter("asigPos");
			String plaPos = (String) request.getParameter("plaPos");
	
			
			List<ZscaDatosPlanificacion> planifxcampo = (List<ZscaDatosPlanificacion>) sesion.getAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE" + sesion.getId());
			ZscaDatosPlanificacion pla = null;
			List<Ztmminspeccion> regVisitas = new ArrayList<Ztmminspeccion>();
			Iterator it = planifxcampo.iterator();
			boolean encontre = false;
			while (it.hasNext() && !encontre) {
				pla = (ZscaDatosPlanificacion) it.next();
				if (idasig.equalsIgnoreCase(pla.getIdAsignacion()) && asigPos.equalsIgnoreCase(pla.getIdAsignPos().trim()) && plaPos.equalsIgnoreCase(pla.getIdPlanificPos())) {
					sesion.setAttribute("PLANIFICACION" + sesion.getId(), pla);
					encontre = true;
				}
			}
			if(encontre){
				Z_CA_057B_LISTA_REG_INSPECCIONProxy soap = new Z_CA_057B_LISTA_REG_INSPECCIONProxy();
				
				ZtymmInspeccionHolder EInspeccion = new ZtymmInspeccionHolder();
				ZtymmInspeccionItemHolder EInspeccionItem = new ZtymmInspeccionItemHolder();
				ZsmmHeadInspeccionHolder ESHeadInspeccion = new ZsmmHeadInspeccionHolder();
				Bapiret2THolder bapiretResponse = new Bapiret2THolder();
				
				soap.ZCa057BListaRegInspeccion(pla.getCodMatSembrado(), pla.getIdAsignPos(), pla.getIdAsignacion(), null , pla.getIdPlanificPos(), EInspeccion, EInspeccionItem, ESHeadInspeccion, bapiretResponse);
				if(bapiretResponse.value!=null){
					for(int iter=0; iter < bapiretResponse.value.length; iter++){
						System.out.println("Estado de consulta: " + bapiretResponse.value[iter].getType());
						System.out.println("Mensaje de consulta: " + bapiretResponse.value[iter].getMessage());
					}
				}
				sesion.removeAttribute("EXISTE_VISITA_Floracion");
				sesion.removeAttribute("EXISTE_VISITA_Periodica");
				sesion.removeAttribute("EXISTE_VISITA_Precosecha");
				if(EInspeccion.value!=null && EInspeccion.value.length>0){
					for(int iter=0;iter < EInspeccion.value.length; iter++){
						sesion.setAttribute("EXISTE_VISITA_" + EInspeccion.value[iter].getTipoDeInsp(), EInspeccion.value[iter].getTipoDeInsp());  
					}
				}
			}

			response.sendRedirect("registroDeVisitas.jsp");
		}
		
		if ("AltaUIregVisitaPer".equals((String) request.getParameter("accion")) || ("AltaUIregVisitaFlor".equals((String) request.getParameter("accion"))) || ("AltaUIregVisitaPrec".equals((String) request.getParameter("accion")))) {
			String idasig = (String) request.getParameter("asig");
			String asigPos = (String) request.getParameter("asigPos");
			String plaPos = (String) request.getParameter("plaPos");
	
			
			List<ZscaDatosPlanificacion> planifxcampo = (List<ZscaDatosPlanificacion>) sesion.getAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE" + sesion.getId());
			Iterator it = planifxcampo.iterator();
			boolean encontre = false;
			while (it.hasNext() && !encontre) {
				ZscaDatosPlanificacion pla = (ZscaDatosPlanificacion) it.next();
				if (idasig.equalsIgnoreCase(pla.getIdAsignacion()) && asigPos.equalsIgnoreCase(pla.getIdAsignPos().trim()) && plaPos.equalsIgnoreCase(pla.getIdPlanificPos())) {
					sesion.setAttribute("PLANIFICACION" + sesion.getId(), pla);
					encontre = false;
				}
				
				
			}
			
			if ("AltaUIregVisitaPer".equals((String) request.getParameter("accion"))){
				sesion.setAttribute("REGISTRO_TIPO_DE_VISITA", "Periodica");				
			}
			else if ("AltaUIregVisitaFlor".equals((String) request.getParameter("accion"))){
				sesion.setAttribute("REGISTRO_TIPO_DE_VISITA", "Floracion");				
			}
			else if ("AltaUIregVisitaPrec".equals((String) request.getParameter("accion"))){
				sesion.setAttribute("REGISTRO_TIPO_DE_VISITA", "Precosecha");
			}
			
			response.sendRedirect("registroVisitasGenerico.jsp");
		}

		if ("ModificacionUIregVisitaPeriodica".equals((String) request.getParameter("accion")) || ("ModificacionUIregVisitaFloracion".equals((String) request.getParameter("accion"))) || ("ModificacionUIregVisitaPrecosecha".equals((String) request.getParameter("accion")))) {
			ArrayList<Ztmminspeccion> inspeccionList = (ArrayList<Ztmminspeccion>) request.getSession().getAttribute("LISTADO_DE_VISITAS" + request.getSession().getId());
			Integer inspeccionPos = Integer.parseInt(request.getParameter("pos"));
			
			Ztmminspeccion inspeccionSelected = inspeccionList.get(inspeccionPos);
			sesion.setAttribute("INSPECCION" + sesion.getId(), inspeccionSelected);
			
			if ("ModificacionUIregVisitaPeriodica".equals((String) request.getParameter("accion"))){
				sesion.setAttribute("REGISTRO_TIPO_DE_VISITA", "Periodica");				
			}
			else if ("ModificacionUIregVisitaFloracion".equals((String) request.getParameter("accion"))){
				sesion.setAttribute("REGISTRO_TIPO_DE_VISITA", "Floracion");				
			}
			else if ("ModificacionUIregVisitaPrecosecha".equals((String) request.getParameter("accion"))){
				sesion.setAttribute("REGISTRO_TIPO_DE_VISITA", "Precosecha");
			}
			
			response.sendRedirect("editarVerRegistroVisitasGenerico.jsp");
		}
		
		if ("MostrarUIverModifRegVisita".equalsIgnoreCase((String) request.getParameter("accion"))){
			
			String idasig = (String) request.getParameter("asig");
			String asigPos = (String) request.getParameter("asigPos");
			String plaPos = (String) request.getParameter("plaPos");
	
			
			List<ZscaDatosPlanificacion> planifxcampo = (List<ZscaDatosPlanificacion>) sesion.getAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE" + sesion.getId());
			List<Ztmminspeccion> listadoDeVisitas;
			
			Iterator it = planifxcampo.iterator();
			boolean encontre = false;
			ZscaDatosPlanificacion pla = null;
			while (it.hasNext() && !encontre) {
				pla = (ZscaDatosPlanificacion) it.next();
				if (idasig.equalsIgnoreCase(pla.getIdAsignacion()) && asigPos.equalsIgnoreCase(pla.getIdAsignPos().trim()) && plaPos.equalsIgnoreCase(pla.getIdPlanificPos())) {
					sesion.setAttribute("PLANIFICACION" + sesion.getId(), pla);
					encontre = true;
				}
			}
			if(encontre){
				String ICodMatSembrado = pla.getCodMatSembrado();
				String IIdAsignPos = asigPos;
				String IIdAsignacion = idasig;
				String IIdInspeccion = "0";
				String IIdPlanificPos = plaPos;
				ZtymmInspeccionHolder EInspeccion = new ZtymmInspeccionHolder();
				ZtymmInspeccionItemHolder EInspeccionItem = new ZtymmInspeccionItemHolder();
				ZsmmHeadInspeccionHolder ESHeadInspeccion = new ZsmmHeadInspeccionHolder();
				Bapiret2THolder bapiretResponse = new Bapiret2THolder();
	
				
				Z_CA_057B_LISTA_REG_INSPECCIONProxy soap = new Z_CA_057B_LISTA_REG_INSPECCIONProxy();

				soap.ZCa057BListaRegInspeccion(ICodMatSembrado, IIdAsignPos, IIdAsignacion, IIdInspeccion, IIdPlanificPos, EInspeccion, EInspeccionItem, ESHeadInspeccion, bapiretResponse);
				if(bapiretResponse!=null){
					for(int iter=0; iter < bapiretResponse.value.length; iter++){
						System.out.println("Estado de consulta: " + bapiretResponse.value[iter].getType());
						System.out.println("Mensaje de consulta: " + bapiretResponse.value[iter].getMessage());
					}
				}
				if(EInspeccion.value!=null && EInspeccion.value.length>0){
					listadoDeVisitas = new ArrayList<Ztmminspeccion>();
					Ztmminspeccion inspeccionTmp;
					for(int iter=0;iter < EInspeccion.value.length ; iter++){
						inspeccionTmp = EInspeccion.value[iter];
						listadoDeVisitas.add(inspeccionTmp);
					}
					sesion.setAttribute("LISTADO_DE_VISITAS" + sesion.getId(), listadoDeVisitas);
					response.sendRedirect("mostrarRegistroVisitasGenerico.jsp");
				}
				else{
					response.sendRedirect("nohayvisitas.jsp");
				}
			}
		}
			
			

		
		if ("buscarLocalidades".equalsIgnoreCase((String) request.getParameter("accion"))) { //Localidades por encargado para registro de lluvias
			String clave = Integer.toString(user.getId_encargado()); //para hacer el query y traer el conjunto de localilidades asignadas
			
			clave=agregarCeros(clave);
			
			ZMM_EXTRACTOR_LOCALIDADESProxy soap = new ZMM_EXTRACTOR_LOCALIDADESProxy();
			StringHolder EMensaje = new StringHolder();
			EMensaje.value="";
			ZmmtLocalidadesHolder TLocalidades = new ZmmtLocalidadesHolder();
			TLocalidades.value = new ZmmLocalidades[1];
			soap.zmmExtractorLocalidades(clave, EMensaje, TLocalidades);
			sesion.setAttribute("LOCALIDADES_POR_ENCARGADO" + sesion.getId(), TLocalidades.value);
			int x = 0;
			for (x = 0; x < TLocalidades.value.length; x++) {
			}
			IIdPlanificacion = "";
			if (TLocalidades.value.length > 0) {
				response.sendRedirect("mostrarLocalidadesEncargado.jsp");
			} else {
				response.sendRedirect("mostrarPlanifXCliente.jsp");
			}
		}
		if ("mostrarRegLluvia".equalsIgnoreCase((String) request.getParameter("accion"))) { //Localidades por encargado para registro de lluvias
			String fechaIngresada = (String) request.getParameter("fecha");
			Calendar hoy = java.util.Calendar.getInstance();
			String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
			String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
			String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
			String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
			String fecha = dia + "-" + mes+ "-" + year;
			if("".equals(fechaIngresada)|| fechaIngresada == null){
				fechaIngresada = fecha;
			}
			sesion.setAttribute("REGISTROS_LLUVIA_ENCARGADO_FECHA"+sesion.getId(), fechaIngresada);
			 //para hacer el query y traer el conjunto de localilidades asignadas
			List<RegistroLluvia> registros = DataWarehouseDAO.getInstance().getRegistroLluviaEncargado(user.getId_encargado(), fechaIngresada);
			sesion.setAttribute("REGISTROS_LLUVIA_ENCARGADO"+sesion.getId(), registros);
			
			response.sendRedirect("mostrarRegLluviasEncargado.jsp");
			return;
		}
		if ("mostrarRegLluviaInput".equalsIgnoreCase((String) request.getParameter("accion"))) { //Localidades por encargado para registro de lluvias
			String fechaIngresada = (String) request.getParameter("fecha");
			Calendar hoy = java.util.Calendar.getInstance();
			String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
			String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
			String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
			String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
			String fecha = dia + "-" + mes+ "-" + year;
			if("".equals(fechaIngresada)|| fechaIngresada == null){
				fechaIngresada = fecha;
			
			}
			sesion.setAttribute("REGISTROS_LLUVIA_ENCARGADO_FECHA"+sesion.getId(), fechaIngresada);
			 //para hacer el query y traer el conjunto de localilidades asignadas
			List<RegistroLluvia> registros = DataWarehouseDAO.getInstance().getRegistroLluviaEncargado(user.getId_encargado(), fechaIngresada);
			sesion.setAttribute("REGISTROS_LLUVIA_ENCARGADO"+sesion.getId(), registros);
			
			response.sendRedirect("mostrarRegLluviasEncargado.jsp");
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sesion = request.getSession(true);
		Usuario user = (Usuario) sesion.getAttribute("USUARIO_LOGUEADO" + sesion.getId());
		List<PlantaPorEncargado> plantasXEncargado = DataWarehouseDAO.getInstance().getPlantasUsuario(user.getId_encargado(), user.getCampaña());
		sesion.setAttribute("PLANTASxUSUARIO" + sesion.getId(), plantasXEncargado);
		if ("busquedaCodigo".equalsIgnoreCase((String) request.getParameter("accion"))) {
			
			/* TODO UNCOMENT */
			ICampana = user.getCampaña();
			IAvanceCosecha = "100";
			IPropTercero = "";
			String ICodLoteProp = "";
			ISociedad = user.getSociedad();
			IEncargado =Integer.toString(user.getId_encargado());
			
			
			IEncargado=agregarCeros(IEncargado);
			
			Z_CA_001_1_LISTA_PLANIFICACIONProxy soap = new Z_CA_001_1_LISTA_PLANIFICACIONProxy();
			IIdPlanificacion = request.getParameter("codigoPL");
						
			/*
			//TO REMOVE HARCODE
			ICampana = "11/2012";//user.getCampaña();
			IAvanceCosecha = "100";
			IPropTercero = " ";//user.getSector();
			ISociedad = "BRMX";//user.getSociedad();
			IEncargado = "0000000000";//Integer.toString(user.getId_encargado());

			// TO MODIFICAR HARDCODE
			Z_CA_001_1_LISTA_PLANIFICACIONProxy soap = new Z_CA_001_1_LISTA_PLANIFICACIONProxy();			
			IIdPlanificacion = "0000000000";
			 */

			String IIdSector = user.getSector();
			@SuppressWarnings("unused")
			ZscaDatosPlanificacion[] planificaciones = soap.ZCa0011ListaPlanificacion(IAtributo, IAvanceCosecha, ICampana, ICodCampoProp, ICodCampoTerc, ICodLoteProp, ICodLoteTerc, ICodMatSembrado, IContratistaCose, ICultivo, IEncargado, IIdPlanificacion, IIdSector, INombreCliente, IPropTercero, IProveedor, ISociedad); 
			if (planificaciones.length > 0) {
				ArrayList<ZscaDatosPlanificacion> planiAsArray = new ArrayList<ZscaDatosPlanificacion>();
				for(int i=0; i < planificaciones.length;i++){
					planiAsArray.add(planificaciones[i]);
				}
				sesion.setAttribute("PLANIFICACION" + sesion.getId(), planificaciones[0]);
				sesion.setAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE" + sesion.getId(), planiAsArray);
				sesion.setAttribute("LAST_CODIGO_BUSCADO" + sesion.getId(), IIdPlanificacion);
				sesion.setAttribute("ACCION_PLAN_PREV_PAGE" + sesion.getId(), "buscarPlanificacionCodigo");
				response.sendRedirect("accionPlan.jsp");
			} else {
				response.sendRedirect("nohayplanificaciones.jsp");
			}
			IIdPlanificacion = "";
		}
		if ("busquedaFecha".equalsIgnoreCase((String) request.getParameter("accion"))) {
			ICampana = user.getCampaña();
			IPropTercero = "T";// user.getSector();
			ISociedad = user.getSociedad();
			IEncargado = Integer.toString(user.getId_encargado());
			
			
			IEncargado=agregarCeros(IEncargado);
			
			Z_CA_005_1_PLANES_DIARIOSProxy soap = new Z_CA_005_1_PLANES_DIARIOSProxy();
			IIdPlanificacion = "";
			String IFechaPlanDiarioDesde = (String) request.getParameter("fechaPL");

			StringTokenizer tokens = new StringTokenizer(IFechaPlanDiarioDesde, "-");
			int nDatos = tokens.countTokens();
			double[] datos = new double[nDatos];
			int i = 0;
			String ano = "";
			String mes = "";
			String dia = "";
			while (tokens.hasMoreTokens()) {
				String str = tokens.nextToken();
				if (i == 0)
					dia = str;
				else if (i == 1)
					mes = str;
				else if (i == 2)
					ano = str;
				i++;
			}
			String IEspecie = "";
			String ICentroDescarga = "";
			String IFechaPlanDiarioHasta = ano + "-" + mes + "-" + dia;
			IFechaPlanDiarioDesde = ano + "-" + mes + "-" + dia;
			System.out.println("Fecha : " + IFechaPlanDiarioDesde);
			String ICentroCalidad = "";
			String IContratistaCosecha = "";
			String IdSector = "";
			String IEstPlanDiario = "";
			ZscaPlanesDiarios[] planes = soap.ZCa0051PlanesDiarios(ICampana, ICentroCalidad, ICentroDescarga,ICodCampoProp,ICodCampoTerc,ICodLoteProp,ICodLoteTerc, IContratistaCosecha,IEncargado,IEspecie,IEstPlanDiario, IFechaPlanDiarioDesde, IFechaPlanDiarioHasta, IdSector, IPlanDiario,IPropTercero,IProveedor, ISociedad);

			if (planes.length > 0) {
				sesion.setAttribute("PLANES_DIARIOS" + sesion.getId(), planes);
			//	sesion.setAttribute("PLANIFICACION" + sesion.getId(), planes);
				response.sendRedirect("mostrarPlanesDiarios.jsp");
			} else {
				response.sendRedirect("nohayplanificaciones.jsp");
			}
			IIdPlanificacion = "";
		}
		if ("busquedaCliente".equalsIgnoreCase((String) request.getParameter("accion"))) {

			HashMap tmp = new HashMap();
			int x = 0;
			/*
			//TO MODIFICAR HARCODE
			ICampana = "11/2012";//user.getCampaña();
			IAvanceCosecha = "100";
			IPropTercero = " ";//user.getSector();
			ISociedad = "BRMX";//user.getSociedad();
			IEncargado = "0000000000";//Integer.toString(user.getId_encargado());
			Z_CA_001_1_LISTA_PLANIFICACIONProxy soap = new Z_CA_001_1_LISTA_PLANIFICACIONProxy();
			INombreCliente = " ";//request.getParameter("nombreCliente").toUpperCase();
			String IIdSector="";
			*/

			ICampana = user.getCampaña();
			IAvanceCosecha = "100";
			IPropTercero = "";
			ISociedad = user.getSociedad();
			IEncargado =agregarCeros( Integer.toString(user.getId_encargado()));
			
			
			Z_CA_001_1_LISTA_PLANIFICACIONProxy soap = new Z_CA_001_1_LISTA_PLANIFICACIONProxy();
			
			if(request.getParameter("nombreCliente")!=null){
				sesion.setAttribute("LAST_CLIENTE_BUSCADO" + sesion.getId(), request.getParameter("nombreCliente").toUpperCase());
				INombreCliente = request.getParameter("nombreCliente").toUpperCase();
			}
			else{
				sesion.setAttribute("LAST_CLIENTE_BUSCADO" + sesion.getId(), ((String)request.getAttribute("nombreCliente")).toUpperCase());
				INombreCliente = ((String)request.getAttribute("nombreCliente")).toUpperCase();
			}
			String IIdSector=user.getSector();
			
			@SuppressWarnings("unused")
			ZscaDatosPlanificacion[] planificaciones = soap.ZCa0011ListaPlanificacion(IAtributo, IAvanceCosecha, ICampana, ICodCampoProp, ICodCampoTerc, ICodLoteProp, ICodLoteTerc, ICodMatSembrado, IContratistaCose, ICultivo, IEncargado, IIdPlanificacion, IIdSector, INombreCliente, IPropTercero, IProveedor, ISociedad);
			if (planificaciones.length > 0) {
				for (x = 0; x < planificaciones.length; x++) {
					ZscaDatosPlanificacion pl = planificaciones[x];
					if (!tmp.containsKey(pl.getCodCampoTerc())) {
						tmp.put(pl.getCodCampoTerc(), pl.getNombreCliente() + "<BR>" + pl.getDescCampo());
					}
				}
				Set set = tmp.entrySet();
				set = tmp.entrySet();
				sesion.setAttribute("CAMPOSxUSUARIO" + sesion.getId(), set);
				sesion.setAttribute("PLANIFICACIONES_NOMBRE_CLIENTE" + sesion.getId(), planificaciones);
				response.sendRedirect("mostrarCampos.jsp");
			} else {
				response.sendRedirect("nohayplanificaciones.jsp");
			}
			IIdPlanificacion = "";
			INombreCliente = "";

		}
		if ("buscarPlanificacion".equalsIgnoreCase((String) request.getParameter("accion"))) {

			String clave = (String) request.getParameter("cliente");
			ZscaDatosPlanificacion[] planificaciones = (ZscaDatosPlanificacion[]) sesion.getAttribute("PLANIFICACIONES_NOMBRE_CLIENTE" + sesion.getId());
			List<String> planifxcampo = new ArrayList<String>();
			int x = 0;
			for (x = 0; x < planificaciones.length; x++) {
				ZscaDatosPlanificacion pl = planificaciones[x];
				if (clave.trim().equalsIgnoreCase(pl.getCodCampoTerc().trim())) {
					planifxcampo.add(pl.getNombreCliente() + "," + pl.getDescCampo() + "," + pl.getDescLote() + "," + pl.getHectareasSembra() + "," + pl.getDescCodMatCosech());
				}
				sesion.setAttribute("PLANIFICACIONES_SELECCIONADAS_CLIENTE" + sesion.getId(), planifxcampo);
			}

			response.sendRedirect("mostrarPlanifXCliente.jsp");
		}
		
		if ("altaRegistroVisitasGenerico".equalsIgnoreCase((String) request.getParameter("accion"))) {
			ZscaDatosPlanificacion planificacion = (ZscaDatosPlanificacion) request.getSession().getAttribute("PLANIFICACION" + request.getSession().getId());

			java.lang.String fechaTxt = request.getParameter("fecha");
			java.lang.String fecha = fechaTxt.substring(6) + "-" + fechaTxt.substring(3, 5) + "-" + fechaTxt.substring(0, 2);

			java.lang.String apto = null; //VACIO
			java.lang.String comentarios = null; //VACIO
			java.lang.String estadoPureza = null; //VACIO
			java.lang.String estados = request.getParameter("estados");

			java.lang.String fueraDeTipo = null; //VACIO
			java.lang.String idAsignPos = planificacion.getIdAsignPos();
			java.lang.String idAsignacion = planificacion.getIdAsignacion();
			java.lang.String idInspeccion = "0";
			java.lang.String idPlanificPos = planificacion.getIdPlanificPos();
			//java.lang.String inspector = user.getNombre();
			java.lang.String inspector = Integer.toString(user.getId_encargado());
			
			inspector=agregarCeros(inspector);
			
			mc_style.functions.soap.sap.document.sap_com.ZtmminspeccionI[] items = null;//new ZtmminspeccionI[1];
			java.lang.String motivos = request.getParameter("motivos");
			java.lang.String probabilidad = request.getParameter("probabilidad");
			java.math.BigDecimal promFdt = null; // Se puede poner vacio? o solo cero
			
			java.math.BigDecimal rendEsperado = new BigDecimal(request.getParameter("rendimiento"));
			java.lang.String roguing = null; // VACIO
			java.lang.String tipoDeInsp = request.getParameter("tipoVisita");
			//6/3
			java.lang.String r = request.getParameter("estadoFenValorR");
			java.lang.String v = request.getParameter("estadoFenValorV");
			
/*			items[1].setMandt("0");
			items[1].setIdInspeccion("0");*/
			
			Z_CA_058B_EDITAR_INSPECICONProxy soap = new Z_CA_058B_EDITAR_INSPECICONProxy();

			Bapiret2[] bapiretResponse = soap.ZCa058BEditarInspecicon(apto, comentarios, estadoPureza, estados, fecha, fueraDeTipo, idAsignPos, idAsignacion, idInspeccion, idPlanificPos, inspector, items, motivos, probabilidad, promFdt, r, rendEsperado, roguing, tipoDeInsp, v);
			if(bapiretResponse!=null){
				for(int iter=0; iter < bapiretResponse.length; iter++){
					System.out.println("Mensaje Alta: " + bapiretResponse[iter].getType());
					System.out.println("Mensaje: " + bapiretResponse[iter].getMessage());
				}
			}
			response.sendRedirect(request.getContextPath() + "/ServiceSap?accion=RegistroDeVisitasCliente&asig=" + planificacion.getIdAsignacion() + "&asigPos=" + planificacion.getIdAsignPos() + "&plaPos=" + planificacion.getIdPlanificPos());
		}
		
		if ("modificacionRegistroVisitasGenerico".equalsIgnoreCase((String) request.getParameter("accion"))) {
			Ztmminspeccion inspeccionSelected = (Ztmminspeccion) request.getSession().getAttribute("INSPECCION" + request.getSession().getId());;
			
			java.lang.String fechaTxt = request.getParameter("fecha");
			java.lang.String fecha = fechaTxt.substring(6) + "-" + fechaTxt.substring(3, 5) + "-" + fechaTxt.substring(0, 2);

			java.lang.String apto = null; //VACIO
			java.lang.String comentarios = null; //VACIO
			java.lang.String estadoPureza = null; //VACIO
			java.lang.String estados = request.getParameter("estados");

			java.lang.String fueraDeTipo = null; //VACIO
			java.lang.String idAsignPos = inspeccionSelected.getIdAsignPos();
			java.lang.String idAsignacion = inspeccionSelected.getIdAsignacion();
			java.lang.String idInspeccion = inspeccionSelected.getIdInspeccion();
			java.lang.String idPlanificPos = inspeccionSelected.getIdPlanificPos();
			java.lang.String inspector = user.getNombre();
			mc_style.functions.soap.sap.document.sap_com.ZtmminspeccionI[] items = null;//new ZtmminspeccionI[1];
			java.lang.String motivos = request.getParameter("motivos");
			java.lang.String probabilidad = request.getParameter("probabilidad");
			java.math.BigDecimal promFdt = null; // Se puede poner vacio? o solo cero
			
			java.math.BigDecimal rendEsperado = new BigDecimal(request.getParameter("rendimiento"));
			java.lang.String roguing = null; // VACIO
			java.lang.String tipoDeInsp = request.getParameter("tipoVisita");
			java.lang.String r = request.getParameter("estadoFenValorR");
			java.lang.String v = request.getParameter("estadoFenValorV");
			
/*			items[1].setMandt("0");
			items[1].setIdInspeccion("0");*/
			
			Z_CA_058B_EDITAR_INSPECICONProxy soap = new Z_CA_058B_EDITAR_INSPECICONProxy();

			Bapiret2[] bapiretResponse = soap.ZCa058BEditarInspecicon(apto, comentarios, estadoPureza, estados, fecha, fueraDeTipo, idAsignPos, idAsignacion, idInspeccion, idPlanificPos, inspector, items, motivos, probabilidad, promFdt, r, rendEsperado, roguing, tipoDeInsp, v);
			if(bapiretResponse!=null){
				for(int iter=0; iter < bapiretResponse.length; iter++){
					System.out.println("Estado modificacion: " + bapiretResponse[iter].getType());
					System.out.println("Mensaje de modificacion: " + bapiretResponse[iter].getMessage());
				}
			}
			response.sendRedirect(request.getContextPath() + "/ServiceSap?accion=RegistroDeVisitasCliente&asig=" + inspeccionSelected.getIdAsignacion() + "&asigPos=" + inspeccionSelected.getIdAsignPos() + "&plaPos=" + inspeccionSelected.getIdPlanificPos());
		}
		
		if ("altaPlanDiario".equalsIgnoreCase((String) request.getParameter("accion"))) {
			String IIdAsignacion = "";
			String IProdCodSapTerminado = "";
			String IIdPlanifPos = "";
			float HaPlanificadas = 0;
			String IIdAsignPos = "";
			String IContratistaCosecha = "";
			StringHolder EIdPlanDiario = new StringHolder("");
			
			String IObjCumplido = "";
			String IObservaciones = "";
			String ICamionesUrgentes = "";
			String IProdCodSapCosechado = "";
			String ICentroDescarga = "";

			String IPropTercero = "";
			String IIdPlanDiario = "";
			String ICentroCalidad = (String) request.getParameter("centroElegido");
			EIdPlanDiario = new StringHolder("");
			ZscaPlanesDiarios plan = (ZscaPlanesDiarios) sesion.getAttribute("PLAN_DIARIO_POR_FECHA" + sesion.getId());
			ZscaDatosPlanificacion planificacion = (ZscaDatosPlanificacion) sesion.getAttribute("PLANIFICACION" + sesion.getId());
			// if(planificacion == null )

			if (plan == null) {
				if (planificacion != null) {
					IIdAsignacion = planificacion.getIdAsignacion();
					IProdCodSapTerminado = planificacion.getCodMatTerm();
					IIdPlanifPos = planificacion.getIdPlanificPos();
					IIdAsignPos = planificacion.getIdAsignPos();
					IPropTercero = planificacion.getPropTercero();
					if (planificacion.getRindeEstimado() != null && planificacion.getRindeEstimado().intValue() != 0)
						HaPlanificadas = new Integer((String) request.getParameter("cantcamiones")).intValue() * 30000 / planificacion.getRindeEstimado().intValue();
					else
						HaPlanificadas = 0;
				}
			} else {
				// EDICION
				if (plan.getRindeEstimado().intValue() != 0)
					HaPlanificadas = new Integer((String) request.getParameter("cantcamiones")).intValue() * 30000 / plan.getRindeEstimado().intValue();
				else
					HaPlanificadas = 0;

				IIdPlanDiario = plan.getIdPlanDiario() == null ? "" : plan.getIdPlanDiario();
				IContratistaCosecha = plan.getContratistaCose();
				IObjCumplido = plan.getObjCumplido();
				IObservaciones = plan.getObservaciones();
				ICamionesUrgentes = plan.getCamionesUrg();
				IProdCodSapTerminado = plan.getProdTerminado();
				IProdCodSapCosechado = plan.getProdCosechado();
				ICentroDescarga = plan.getCentroDescarga();
				IIdAsignacion = plan.getIdAsignacion();
				IIdPlanifPos = plan.getIdPlanificPos();
				IIdAsignPos = plan.getIdAsignPos();
				IPropTercero = plan.getPropTercero();

			}
			String fechaIngresada = (String) request.getParameter("fecha");
			StringTokenizer tokens = new StringTokenizer(fechaIngresada, "-");
			int nDatos = tokens.countTokens();
			double[] datos = new double[nDatos];
			int i = 0;
			String ano = "";
			String mes = "";
			String dia = "";
			while (tokens.hasMoreTokens()) {
				String str = tokens.nextToken();
				if (i == 0)
					dia = str;
				else if (i == 1)
					mes = str;
				else if (i == 2)
					ano = str;
				i++;
			}

			Z_CA_006_GRABAR_PLAN_DIARIOProxy soap = new Z_CA_006_GRABAR_PLAN_DIARIOProxy();

			Bapiret2THolder e_0062Return = new Bapiret2THolder();

			String ICamionesPedidos = (String) request.getParameter("cantcamiones");
			String IFechaPlanDiario = ano + "-" + mes + "-" + dia;
			

			String IEstadoPlanDiario = (String) request.getParameter("estados");

			BigDecimal IHaPlanificadasHoy = new BigDecimal(HaPlanificadas);
			
			//TODO Agregar Validacion de eleccion de planta
			if(!"".equals(ICentroCalidad) && ICentroCalidad != null){
				if (planificacion != null) {
					if(planificacion.getCodMatCosech() != null && !"".equalsIgnoreCase(planificacion.getCodMatCosech())){
						IProdCodSapCosechado = planificacion.getCodMatCosech();
					}
				}
				soap.ZCa006GrabarPlanDiario(ICamionesPedidos, ICamionesUrgentes, ICentroCalidad, ICentroDescarga, IContratistaCosecha, IEstadoPlanDiario, IFechaPlanDiario, IHaPlanificadasHoy, IIdAsignPos, IIdAsignacion, IIdPlanDiario, IIdPlanifPos, IObjCumplido, IObservaciones, IProdCodSapCosechado, IProdCodSapTerminado, IPropTercero, EIdPlanDiario, e_0062Return);
				System.out.println("Mensaje:" + e_0062Return.value[0].getMessage());
				System.out.println("Mensaje:" + e_0062Return.value[0].getType());
				System.out.println("Plan Diario:" + EIdPlanDiario.value);
				if ("S".equals(e_0062Return.value[0].getType())) {
					Z_CA_915_MD_AVANCE_COSECHAProxy soapAvance = new Z_CA_915_MD_AVANCE_COSECHAProxy();
					soapAvance.ZCa915MdAvanceCosecha(IEstadoPlanDiario,IHaPlanificadasHoy.toString(),EIdPlanDiario.value);
					response.sendRedirect("mensaje.jsp?msg=" + e_0062Return.value[0].getMessage() + "&type=" + e_0062Return.value[0].getType() + "&IdPl=" + EIdPlanDiario.value);
				}
				sesion.removeAttribute("PLAN_DIARIO_POR_FECHA" + sesion.getId());
			}else{
				response.sendRedirect("altaPlanDiario.jsp");
			}
		}
		if ("altaRegistroLluvia".equalsIgnoreCase((String) request.getParameter("accion"))) {
			String encargado = Integer.toString(user.getId_encargado());
			
			
			encargado=agregarCeros(encargado);
			
			String provincia = request.getParameter("provincia");
			String ciudad = request.getParameter("localidad");
			String mm = request.getParameter("milim");
			String fecha = request.getParameter("fecha");
			BigDecimal mil = new BigDecimal(mm); 
			int exitoso = 0;
			exitoso = DataWarehouseDAO.getInstance().saveRegistroLluvia(encargado, provincia, ciudad, mil, fecha, exitoso);
			if(exitoso == 1)
				response.sendRedirect("exitoRLluvia.jsp");
		}
		if ("mostrarRegLluvia".equalsIgnoreCase((String) request.getParameter("accion"))) { //Localidades por encargado para registro de lluvias
			String fechaIngresada = (String) request.getParameter("fecha");
			Calendar hoy = java.util.Calendar.getInstance();
			String dia = (hoy.get(java.util.Calendar.DAY_OF_MONTH) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString() : new Integer(hoy.get(java.util.Calendar.DAY_OF_MONTH)).toString());
			String mes = ((hoy.get(java.util.Calendar.MONTH) + 1) < 10 ? "0" + new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString() : new Integer(hoy.get(java.util.Calendar.MONTH) + 1).toString());
			String year = new String(new Integer(hoy.get(java.util.Calendar.YEAR)).toString());
			String hora = new Integer(hoy.get(Calendar.HOUR_OF_DAY)).toString() + ":" + new Integer(hoy.get(Calendar.MINUTE)).toString() + ":00";
			String fecha = dia + "-" + mes+ "-" + year;
			if("".equals(fechaIngresada)|| fechaIngresada == null){
				fechaIngresada = fecha;
			}
			 //para hacer el query y traer el conjunto de localilidades asignadas
			List<RegistroLluvia> registros = DataWarehouseDAO.getInstance().getRegistroLluviaEncargado(user.getId_encargado(), fechaIngresada);
			sesion.setAttribute("REGISTROS_LLUVIA_ENCARGADO"+sesion.getId(), registros);
			
			response.sendRedirect("mostrarRegLluviasEncargado.jsp");
			
		}
		if ("modificarRegistroLluvia".equalsIgnoreCase((String) request.getParameter("accion"))) {
			String encargado = Integer.toString(user.getId_encargado());
			
			encargado=agregarCeros(encargado);
			//String provincia = request.getParameter("provincia");
			String ciudad = request.getParameter("localidad").trim();
			String mm = request.getParameter("milim");
			String fecha = (String)sesion.getAttribute("REGISTROS_LLUVIA_ENCARGADO_FECHA"+sesion.getId());
			BigDecimal mil = new BigDecimal(mm); 
			int exitoso = 0;
			exitoso = DataWarehouseDAO.getInstance().updateRegistroLluvia(encargado,ciudad, mil, fecha, exitoso);
			if(exitoso == 1)
				response.sendRedirect("exitoRLluvia.jsp");
		}
		
		
	}
	
	public String agregarCeros(String cadena){
		
		int cant=cadena.length();
		
		while(cant<10){
			cadena="0"+cadena;
			cant++;
		}
		
		return cadena;
	}
}
