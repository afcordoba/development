package mc_style.functions.soap.sap.document.sap_com;

public class Z_CA_005_1_PLANES_DIARIOSProxy implements mc_style.functions.soap.sap.document.sap_com.Z_CA_005_1_PLANES_DIARIOS_PortType {
  private String _endpoint = null;
  private mc_style.functions.soap.sap.document.sap_com.Z_CA_005_1_PLANES_DIARIOS_PortType z_CA_005_1_PLANES_DIARIOS_PortType = null;
  
  public Z_CA_005_1_PLANES_DIARIOSProxy() {
    _initZ_CA_005_1_PLANES_DIARIOSProxy();
  }
  
  public Z_CA_005_1_PLANES_DIARIOSProxy(String endpoint) {
    _endpoint = endpoint;
    _initZ_CA_005_1_PLANES_DIARIOSProxy();
  }
  
  private void _initZ_CA_005_1_PLANES_DIARIOSProxy() {
    try {
      z_CA_005_1_PLANES_DIARIOS_PortType = (new mc_style.functions.soap.sap.document.sap_com.Z_CA_005_1_PLANES_DIARIOS_ServiceLocator()).getZ_CA_005_1_PLANES_DIARIOS();
      if (z_CA_005_1_PLANES_DIARIOS_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)z_CA_005_1_PLANES_DIARIOS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)z_CA_005_1_PLANES_DIARIOS_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (z_CA_005_1_PLANES_DIARIOS_PortType != null)
      ((javax.xml.rpc.Stub)z_CA_005_1_PLANES_DIARIOS_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mc_style.functions.soap.sap.document.sap_com.Z_CA_005_1_PLANES_DIARIOS_PortType getZ_CA_005_1_PLANES_DIARIOS_PortType() {
    if (z_CA_005_1_PLANES_DIARIOS_PortType == null)
      _initZ_CA_005_1_PLANES_DIARIOSProxy();
    return z_CA_005_1_PLANES_DIARIOS_PortType;
  }
  
  public mc_style.functions.soap.sap.document.sap_com.ZscaPlanesDiarios[] ZCa0051PlanesDiarios(java.lang.String ICampana, java.lang.String ICentroCalidad, java.lang.String ICentroDescarga, java.lang.String ICodCampoProp, java.lang.String ICodCampoTerc, java.lang.String ICodLoteProp, java.lang.String ICodLoteTerc, java.lang.String IContratistaCosecha, java.lang.String IEncargado, java.lang.String IEspecie, java.lang.String IEstPlanDiaro, java.lang.String IFechaPlanDiarioDesde, java.lang.String IFechaPlanDiarioHasta, java.lang.String IIdSector, java.lang.String IPlanDiario, java.lang.String IPropTercero, java.lang.String IProveedor, java.lang.String ISociedad) throws java.rmi.RemoteException{
    if (z_CA_005_1_PLANES_DIARIOS_PortType == null)
      _initZ_CA_005_1_PLANES_DIARIOSProxy();
    return z_CA_005_1_PLANES_DIARIOS_PortType.ZCa0051PlanesDiarios(ICampana, ICentroCalidad, ICentroDescarga, ICodCampoProp, ICodCampoTerc, ICodLoteProp, ICodLoteTerc, IContratistaCosecha, IEncargado, IEspecie, IEstPlanDiaro, IFechaPlanDiarioDesde, IFechaPlanDiarioHasta, IIdSector, IPlanDiario, IPropTercero, IProveedor, ISociedad);
  }
  
  
}