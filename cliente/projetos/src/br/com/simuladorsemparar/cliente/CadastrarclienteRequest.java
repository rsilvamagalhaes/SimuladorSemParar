/**
 * CadastrarclienteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public class CadastrarclienteRequest  implements java.io.Serializable {
    private br.com.simuladorsemparar.domain.Clienteoper clienteoper;

    public CadastrarclienteRequest() {
    }

    public CadastrarclienteRequest(
           br.com.simuladorsemparar.domain.Clienteoper clienteoper) {
           this.clienteoper = clienteoper;
    }


    /**
     * Gets the clienteoper value for this CadastrarclienteRequest.
     * 
     * @return clienteoper
     */
    public br.com.simuladorsemparar.domain.Clienteoper getClienteoper() {
        return clienteoper;
    }


    /**
     * Sets the clienteoper value for this CadastrarclienteRequest.
     * 
     * @param clienteoper
     */
    public void setClienteoper(br.com.simuladorsemparar.domain.Clienteoper clienteoper) {
        this.clienteoper = clienteoper;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarclienteRequest)) return false;
        CadastrarclienteRequest other = (CadastrarclienteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clienteoper==null && other.getClienteoper()==null) || 
             (this.clienteoper!=null &&
              this.clienteoper.equals(other.getClienteoper())));
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
        if (getClienteoper() != null) {
            _hashCode += getClienteoper().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarclienteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">cadastrarclienteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clienteoper");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clienteoper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "clienteoper"));
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
