/**
 * Z_CA_057B_LISTA_REG_INSPECCION_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class Z_CA_057B_LISTA_REG_INSPECCION_ServiceLocator extends org.apache.axis.client.Service implements mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_Service {

    public Z_CA_057B_LISTA_REG_INSPECCION_ServiceLocator() {
    }


    public Z_CA_057B_LISTA_REG_INSPECCION_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Z_CA_057B_LISTA_REG_INSPECCION_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Z_CA_057B_LISTA_REG_INSPECCION
    //private java.lang.String Z_CA_057B_LISTA_REG_INSPECCION_address = "http://c2340103.of1.net:8000/sap/bc/srt/rfc/sap/z_ca_057b_lista_reg_inspeccion/110/z_ca_057b_lista_reg_inspeccion/z_ca_057b_lista_reg_inspeccion";
   // private java.lang.String Z_CA_057B_LISTA_REG_INSPECCION_address = "http://c2340103.of1.net:8001/sap/bc/srt/rfc/sap/z_ca_057b_lista_reg_inspeccion/200/z_ca_057b_lista_reg_inspeccion/z_ca_057b_lista_reg_inspeccion";
    private java.lang.String Z_CA_057B_LISTA_REG_INSPECCION_address = "http://200.51.229.243:8000/sap/bc/srt/rfc/sap/z_ca_057b_lista_reg_inspeccion/300/z_ca_057b_lista_reg_inspeccion/z_ca_057b_lista_reg_inspeccion";

    public java.lang.String getZ_CA_057B_LISTA_REG_INSPECCIONAddress() {
        return Z_CA_057B_LISTA_REG_INSPECCION_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Z_CA_057B_LISTA_REG_INSPECCIONWSDDServiceName = "Z_CA_057B_LISTA_REG_INSPECCION";

    public java.lang.String getZ_CA_057B_LISTA_REG_INSPECCIONWSDDServiceName() {
        return Z_CA_057B_LISTA_REG_INSPECCIONWSDDServiceName;
    }

    public void setZ_CA_057B_LISTA_REG_INSPECCIONWSDDServiceName(java.lang.String name) {
        Z_CA_057B_LISTA_REG_INSPECCIONWSDDServiceName = name;
    }

    public mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_PortType getZ_CA_057B_LISTA_REG_INSPECCION() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Z_CA_057B_LISTA_REG_INSPECCION_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getZ_CA_057B_LISTA_REG_INSPECCION(endpoint);
    }

    public mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_PortType getZ_CA_057B_LISTA_REG_INSPECCION(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_BindingStub _stub = new mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_BindingStub(portAddress, this);
            _stub.setPortName(getZ_CA_057B_LISTA_REG_INSPECCIONWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setZ_CA_057B_LISTA_REG_INSPECCIONEndpointAddress(java.lang.String address) {
        Z_CA_057B_LISTA_REG_INSPECCION_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_BindingStub _stub = new mc_style.functions.soap.sap.document.sap_com.Z_CA_057B_LISTA_REG_INSPECCION_BindingStub(new java.net.URL(Z_CA_057B_LISTA_REG_INSPECCION_address), this);
                _stub.setPortName(getZ_CA_057B_LISTA_REG_INSPECCIONWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Z_CA_057B_LISTA_REG_INSPECCION".equals(inputPortName)) {
            return getZ_CA_057B_LISTA_REG_INSPECCION();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Z_CA_057B_LISTA_REG_INSPECCION");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Z_CA_057B_LISTA_REG_INSPECCION"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Z_CA_057B_LISTA_REG_INSPECCION".equals(portName)) {
            setZ_CA_057B_LISTA_REG_INSPECCIONEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
