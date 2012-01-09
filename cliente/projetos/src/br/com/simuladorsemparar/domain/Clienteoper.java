/**
 * Clienteoper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.domain;

public class Clienteoper  implements java.io.Serializable {
    private br.com.simuladorsemparar.domain.Cliente cliente;

    private br.com.simuladorsemparar.domain.Operacao operacao;

    public Clienteoper() {
    }

    public Clienteoper(
           br.com.simuladorsemparar.domain.Cliente cliente,
           br.com.simuladorsemparar.domain.Operacao operacao) {
           this.cliente = cliente;
           this.operacao = operacao;
    }


    /**
     * Gets the cliente value for this Clienteoper.
     * 
     * @return cliente
     */
    public br.com.simuladorsemparar.domain.Cliente getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this Clienteoper.
     * 
     * @param cliente
     */
    public void setCliente(br.com.simuladorsemparar.domain.Cliente cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the operacao value for this Clienteoper.
     * 
     * @return operacao
     */
    public br.com.simuladorsemparar.domain.Operacao getOperacao() {
        return operacao;
    }


    /**
     * Sets the operacao value for this Clienteoper.
     * 
     * @param operacao
     */
    public void setOperacao(br.com.simuladorsemparar.domain.Operacao operacao) {
        this.operacao = operacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Clienteoper)) return false;
        Clienteoper other = (Clienteoper) obj;
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
              this.cliente.equals(other.getCliente()))) &&
            ((this.operacao==null && other.getOperacao()==null) || 
             (this.operacao!=null &&
              this.operacao.equals(other.getOperacao())));
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
        if (getOperacao() != null) {
            _hashCode += getOperacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Clienteoper.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "clienteoper"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "cliente"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "operacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "operacao"));
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
