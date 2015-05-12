/**
 * ZCa057BListaRegInspeccionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mc_style.functions.soap.sap.document.sap_com;

public class ZCa057BListaRegInspeccionResponse  implements java.io.Serializable {
    private mc_style.functions.soap.sap.document.sap_com.Ztmminspeccion[] EInspeccion;

    private mc_style.functions.soap.sap.document.sap_com.ZtmminspeccionI[] EInspeccionItem;

    private mc_style.functions.soap.sap.document.sap_com.ZsmmHeadInspeccion ESHeadInspeccion;

    private mc_style.functions.soap.sap.document.sap_com.Bapiret2[] e_057Return;

    public ZCa057BListaRegInspeccionResponse() {
    }

    public ZCa057BListaRegInspeccionResponse(
           mc_style.functions.soap.sap.document.sap_com.Ztmminspeccion[] EInspeccion,
           mc_style.functions.soap.sap.document.sap_com.ZtmminspeccionI[] EInspeccionItem,
           mc_style.functions.soap.sap.document.sap_com.ZsmmHeadInspeccion ESHeadInspeccion,
           mc_style.functions.soap.sap.document.sap_com.Bapiret2[] e_057Return) {
           this.EInspeccion = EInspeccion;
           this.EInspeccionItem = EInspeccionItem;
           this.ESHeadInspeccion = ESHeadInspeccion;
           this.e_057Return = e_057Return;
    }


    /**
     * Gets the EInspeccion value for this ZCa057BListaRegInspeccionResponse.
     * 
     * @return EInspeccion
     */
    public mc_style.functions.soap.sap.document.sap_com.Ztmminspeccion[] getEInspeccion() {
        return EInspeccion;
    }


    /**
     * Sets the EInspeccion value for this ZCa057BListaRegInspeccionResponse.
     * 
     * @param EInspeccion
     */
    public void setEInspeccion(mc_style.functions.soap.sap.document.sap_com.Ztmminspeccion[] EInspeccion) {
        this.EInspeccion = EInspeccion;
    }


    /**
     * Gets the EInspeccionItem value for this ZCa057BListaRegInspeccionResponse.
     * 
     * @return EInspeccionItem
     */
    public mc_style.functions.soap.sap.document.sap_com.ZtmminspeccionI[] getEInspeccionItem() {
        return EInspeccionItem;
    }


    /**
     * Sets the EInspeccionItem value for this ZCa057BListaRegInspeccionResponse.
     * 
     * @param EInspeccionItem
     */
    public void setEInspeccionItem(mc_style.functions.soap.sap.document.sap_com.ZtmminspeccionI[] EInspeccionItem) {
        this.EInspeccionItem = EInspeccionItem;
    }


    /**
     * Gets the ESHeadInspeccion value for this ZCa057BListaRegInspeccionResponse.
     * 
     * @return ESHeadInspeccion
     */
    public mc_style.functions.soap.sap.document.sap_com.ZsmmHeadInspeccion getESHeadInspeccion() {
        return ESHeadInspeccion;
    }


    /**
     * Sets the ESHeadInspeccion value for this ZCa057BListaRegInspeccionResponse.
     * 
     * @param ESHeadInspeccion
     */
    public void setESHeadInspeccion(mc_style.functions.soap.sap.document.sap_com.ZsmmHeadInspeccion ESHeadInspeccion) {
        this.ESHeadInspeccion = ESHeadInspeccion;
    }


    /**
     * Gets the e_057Return value for this ZCa057BListaRegInspeccionResponse.
     * 
     * @return e_057Return
     */
    public mc_style.functions.soap.sap.document.sap_com.Bapiret2[] getE_057Return() {
        return e_057Return;
    }


    /**
     * Sets the e_057Return value for this ZCa057BListaRegInspeccionResponse.
     * 
     * @param e_057Return
     */
    public void setE_057Return(mc_style.functions.soap.sap.document.sap_com.Bapiret2[] e_057Return) {
        this.e_057Return = e_057Return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ZCa057BListaRegInspeccionResponse)) return false;
        ZCa057BListaRegInspeccionResponse other = (ZCa057BListaRegInspeccionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EInspeccion==null && other.getEInspeccion()==null) || 
             (this.EInspeccion!=null &&
              java.util.Arrays.equals(this.EInspeccion, other.getEInspeccion()))) &&
            ((this.EInspeccionItem==null && other.getEInspeccionItem()==null) || 
             (this.EInspeccionItem!=null &&
              java.util.Arrays.equals(this.EInspeccionItem, other.getEInspeccionItem()))) &&
            ((this.ESHeadInspeccion==null && other.getESHeadInspeccion()==null) || 
             (this.ESHeadInspeccion!=null &&
              this.ESHeadInspeccion.equals(other.getESHeadInspeccion()))) &&
            ((this.e_057Return==null && other.getE_057Return()==null) || 
             (this.e_057Return!=null &&
              java.util.Arrays.equals(this.e_057Return, other.getE_057Return())));
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
        if (getEInspeccion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEInspeccion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEInspeccion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEInspeccionItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEInspeccionItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEInspeccionItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getESHeadInspeccion() != null) {
            _hashCode += getESHeadInspeccion().hashCode();
        }
        if (getE_057Return() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getE_057Return());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getE_057Return(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ZCa057BListaRegInspeccionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", ">ZCa057bListaRegInspeccionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EInspeccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EInspeccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Ztmminspeccion"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EInspeccionItem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EInspeccionItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZtmminspeccionI"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ESHeadInspeccion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ESHeadInspeccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "ZsmmHeadInspeccion"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("e_057Return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "E_057return"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sap-com:document:sap:soap:functions:mc-style", "Bapiret2"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "item"));
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
