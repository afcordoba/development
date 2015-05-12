package mc_style.functions.soap.sap.document.sap_com;

public class Z_CA_006_GRABAR_PLAN_DIARIOProxy implements mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_PortType z_CA_006_GRABAR_PLAN_DIARIO_PortType = null;
  
  public Z_CA_006_GRABAR_PLAN_DIARIOProxy() {
    _initZ_CA_006_GRABAR_PLAN_DIARIOProxy();
  }
  
  public Z_CA_006_GRABAR_PLAN_DIARIOProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_CA_006_GRABAR_PLAN_DIARIOProxy();
  }
  
  private void _initZ_CA_006_GRABAR_PLAN_DIARIOProxy() {
    try {
      z_CA_006_GRABAR_PLAN_DIARIO_PortType = (new mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_ServiceLocator()).getZ_CA_006_GRABAR_PLAN_DIARIO();
      if (z_CA_006_GRABAR_PLAN_DIARIO_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_CA_006_GRABAR_PLAN_DIARIO_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_CA_006_GRABAR_PLAN_DIARIO_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_CA_006_GRABAR_PLAN_DIARIO_PortType != null)
      ((javax.xml.rpc.Stub)z_CA_006_GRABAR_PLAN_DIARIO_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Z_CA_006_GRABAR_PLAN_DIARIO_PortType getZ_CA_006_GRABAR_PLAN_DIARIO_PortType() {
    if (z_CA_006_GRABAR_PLAN_DIARIO_PortType == null)
      _initZ_CA_006_GRABAR_PLAN_DIARIOProxy();
    return z_CA_006_GRABAR_PLAN_DIARIO_PortType;
  }
  
  public void ZCa006GrabarPlanDiario(java.lang.String ICamionesPedidos, java.lang.String ICamionesUrgentes, java.lang.String ICentroCalidad, java.lang.String ICentroDescarga, java.lang.String IContratistaCosecha, java.lang.String IEstadoPlanDiario, java.lang.String IFechaPlanDiario, java.math.BigDecimal IHaPlanificadasHoy, java.lang.String IIdAsignPos, java.lang.String IIdAsignacion, java.lang.String IIdPlanDiario, java.lang.String IIdPlanifPos, java.lang.String IObjCumplido, java.lang.String IObservaciones, java.lang.String IProdCodSapCosechado, java.lang.String IProdCodSapTerminado, java.lang.String IPropTercero, javax.xml.rpc.holders.StringHolder EIdPlanDiario, mc_style.functions.soap.sap.document.sap_com.holders.Bapiret2THolder e_0062Return) throws java.rmi.RemoteException{
    if (z_CA_006_GRABAR_PLAN_DIARIO_PortType == null)
      _initZ_CA_006_GRABAR_PLAN_DIARIOProxy();
    z_CA_006_GRABAR_PLAN_DIARIO_PortType.ZCa006GrabarPlanDiario(ICamionesPedidos, ICamionesUrgentes, ICentroCalidad, ICentroDescarga, IContratistaCosecha, IEstadoPlanDiario, IFechaPlanDiario, IHaPlanificadasHoy, IIdAsignPos, IIdAsignacion, IIdPlanDiario, IIdPlanifPos, IObjCumplido, IObservaciones, IProdCodSapCosechado, IProdCodSapTerminado, IPropTercero, EIdPlanDiario, e_0062Return);
  }
  
  
}