/**
 * AtualizarclienteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public class AtualizarclienteRequest  implements java.io.Serializable {
    private br.com.simuladorsemparar.domain.Cliente cliente;

    public AtualizarclienteRequest() {
    }

    public AtualizarclienteRequest(
           br.com.simuladorsemparar.domain.Cliente cliente) {
           this.cliente = cliente;
    }


    /**
     * Gets the cliente value for this AtualizarclienteRequest.
     * 
     * @return cliente
     */
    public br.com.simuladorsemparar.domain.Cliente getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this AtualizarclienteRequest.
     * 
     * @param cliente
     */
    public void setCliente(br.com.simuladorsemparar.domain.Cliente cliente) {
        this.cliente = cliente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AtualizarclienteRequest)) return false;
        AtualizarclienteRequest other = (AtualizarclienteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente())));
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
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AtualizarclienteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">atualizarclienteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "cliente"));
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
