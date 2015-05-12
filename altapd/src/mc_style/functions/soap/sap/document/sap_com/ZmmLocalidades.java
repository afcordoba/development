/**
 * ZmmLocalidades.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZmmLocalidades  implements java.io.Serializable {
    private java.lang.String ELocalidad;

    private java.lang.String EProvincia;

    public ZmmLocalidades() {
    }

    public ZmmLocalidades(
           java.lang.String ELocalidad,
           java.lang.String EProvincia) {
           this.ELocalidad = ELocalidad;
           this.EProvincia = EProvincia;
    }


    /**
     * Gets the ELocalidad value for this ZmmLocalidades.
     * 
     * @return ELocalidad
     */
    public java.lang.String getELocalidad() {
        return ELocalidad;
    }


    /**
     * Sets the ELocalidad value for this ZmmLocalidades.
     * 
     * @param ELocalidad
     */
    public void setELocalidad(java.lang.String ELocalidad) {
        this.ELocalidad = ELocalidad;
    }


    /**
     * Gets the EProvincia value for this ZmmLocalidades.
     * 
     * @return EProvincia
     */
    public java.lang.String getEProvincia() {
        return EProvincia;
    }


    /**
     * Sets the EProvincia value for this ZmmLocalidades.
     * 
     * @param EProvincia
     */
    public void setEProvincia(java.lang.String EProvincia) {
        this.EProvincia = EProvincia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZmmLocalidades)) return false;
        ZmmLocalidades other = (ZmmLocalidades) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ELocalidad==null && other.getELocalidad()==null) || 
             (this.ELocalidad!=null &&
              this.ELocalidad.equals(other.getELocalidad()))) &&
            ((this.EProvincia==null && other.getEProvincia()==null) || 
             (this.EProvincia!=null &&
              this.EProvincia.equals(other.getEProvincia())));
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
        if (getELocalidad() != null) {
            _hashCode += getELocalidad().hashCode();
        }
        if (getEProvincia() != null) {
            _hashCode += getEProvincia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZmmLocalidades.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZmmLocalidades"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ELocalidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ELocalidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EProvincia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EProvincia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
