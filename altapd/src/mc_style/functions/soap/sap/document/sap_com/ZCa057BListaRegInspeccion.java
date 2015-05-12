/**
 * ZCa057BListaRegInspeccion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZCa057BListaRegInspeccion  implements java.io.Serializable {
    private java.lang.String ICodMatSembrado;

    private java.lang.String IIdAsignPos;

    private java.lang.String IIdAsignacion;

    private java.lang.String IIdInspeccion;

    private java.lang.String IIdPlanificPos;

    public ZCa057BListaRegInspeccion() {
    }

    public ZCa057BListaRegInspeccion(
           java.lang.String ICodMatSembrado,
           java.lang.String IIdAsignPos,
           java.lang.String IIdAsignacion,
           java.lang.String IIdInspeccion,
           java.lang.String IIdPlanificPos) {
           this.ICodMatSembrado = ICodMatSembrado;
           this.IIdAsignPos = IIdAsignPos;
           this.IIdAsignacion = IIdAsignacion;
           this.IIdInspeccion = IIdInspeccion;
           this.IIdPlanificPos = IIdPlanificPos;
    }


    /**
     * Gets the ICodMatSembrado value for this ZCa057BListaRegInspeccion.
     * 
     * @return ICodMatSembrado
     */
    public java.lang.String getICodMatSembrado() {
        return ICodMatSembrado;
    }


    /**
     * Sets the ICodMatSembrado value for this ZCa057BListaRegInspeccion.
     * 
     * @param ICodMatSembrado
     */
    public void setICodMatSembrado(java.lang.String ICodMatSembrado) {
        this.ICodMatSembrado = ICodMatSembrado;
    }


    /**
     * Gets the IIdAsignPos value for this ZCa057BListaRegInspeccion.
     * 
     * @return IIdAsignPos
     */
    public java.lang.String getIIdAsignPos() {
        return IIdAsignPos;
    }


    /**
     * Sets the IIdAsignPos value for this ZCa057BListaRegInspeccion.
     * 
     * @param IIdAsignPos
     */
    public void setIIdAsignPos(java.lang.String IIdAsignPos) {
        this.IIdAsignPos = IIdAsignPos;
    }


    /**
     * Gets the IIdAsignacion value for this ZCa057BListaRegInspeccion.
     * 
     * @return IIdAsignacion
     */
    public java.lang.String getIIdAsignacion() {
        return IIdAsignacion;
    }


    /**
     * Sets the IIdAsignacion value for this ZCa057BListaRegInspeccion.
     * 
     * @param IIdAsignacion
     */
    public void setIIdAsignacion(java.lang.String IIdAsignacion) {
        this.IIdAsignacion = IIdAsignacion;
    }


    /**
     * Gets the IIdInspeccion value for this ZCa057BListaRegInspeccion.
     * 
     * @return IIdInspeccion
     */
    public java.lang.String getIIdInspeccion() {
        return IIdInspeccion;
    }


    /**
     * Sets the IIdInspeccion value for this ZCa057BListaRegInspeccion.
     * 
     * @param IIdInspeccion
     */
    public void setIIdInspeccion(java.lang.String IIdInspeccion) {
        this.IIdInspeccion = IIdInspeccion;
    }


    /**
     * Gets the IIdPlanificPos value for this ZCa057BListaRegInspeccion.
     * 
     * @return IIdPlanificPos
     */
    public java.lang.String getIIdPlanificPos() {
        return IIdPlanificPos;
    }


    /**
     * Sets the IIdPlanificPos value for this ZCa057BListaRegInspeccion.
     * 
     * @param IIdPlanificPos
     */
    public void setIIdPlanificPos(java.lang.String IIdPlanificPos) {
        this.IIdPlanificPos = IIdPlanificPos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZCa057BListaRegInspeccion)) return false;
        ZCa057BListaRegInspeccion other = (ZCa057BListaRegInspeccion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ICodMatSembrado==null && other.getICodMatSembrado()==null) || 
             (this.ICodMatSembrado!=null &&
              this.ICodMatSembrado.equals(other.getICodMatSembrado()))) &&
            ((this.IIdAsignPos==null && other.getIIdAsignPos()==null) || 
             (this.IIdAsignPos!=null &&
              this.IIdAsignPos.equals(other.getIIdAsignPos()))) &&
            ((this.IIdAsignacion==null && other.getIIdAsignacion()==null) || 
             (this.IIdAsignacion!=null &&
              this.IIdAsignacion.equals(other.getIIdAsignacion()))) &&
            ((this.IIdInspeccion==null && other.getIIdInspeccion()==null) || 
             (this.IIdInspeccion!=null &&
              this.IIdInspeccion.equals(other.getIIdInspeccion()))) &&
            ((this.IIdPlanificPos==null && other.getIIdPlanificPos()==null) || 
             (this.IIdPlanificPos!=null &&
              this.IIdPlanificPos.equals(other.getIIdPlanificPos())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getICodMatSembrado() != null) {
            _hashCode += getICodMatSembrado().hashCode();
        }
        if (getIIdAsignPos() != null) {
            _hashCode += getIIdAsignPos().hashCode();
        }
        if (getIIdAsignacion() != null) {
            _hashCode += getIIdAsignacion().hashCode();
        }
        if (getIIdInspeccion() != null) {
            _hashCode += getIIdInspeccion().hashCode();
        }
        if (getIIdPlanificPos() != null) {
            _hashCode += getIIdPlanificPos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZCa057BListaRegInspeccion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", ">ZCa057bListaRegInspeccion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICodMatSembrado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ICodMatSembrado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IIdAsignPos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IIdAsignPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IIdAsignacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IIdAsignacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IIdInspeccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IIdInspeccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IIdPlanificPos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IIdPlanificPos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
