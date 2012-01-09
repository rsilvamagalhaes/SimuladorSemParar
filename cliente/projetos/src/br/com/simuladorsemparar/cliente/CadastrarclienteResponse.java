/**
 * CadastrarclienteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public class CadastrarclienteResponse  implements java.io.Serializable {
    private br.com.simuladorsemparar.domain.Resultadocadastro resultadocadastro;

    public CadastrarclienteResponse() {
    }

    public CadastrarclienteResponse(
           br.com.simuladorsemparar.domain.Resultadocadastro resultadocadastro) {
           this.resultadocadastro = resultadocadastro;
    }


    /**
     * Gets the resultadocadastro value for this CadastrarclienteResponse.
     * 
     * @return resultadocadastro
     */
    public br.com.simuladorsemparar.domain.Resultadocadastro getResultadocadastro() {
        return resultadocadastro;
    }


    /**
     * Sets the resultadocadastro value for this CadastrarclienteResponse.
     * 
     * @param resultadocadastro
     */
    public void setResultadocadastro(br.com.simuladorsemparar.domain.Resultadocadastro resultadocadastro) {
        this.resultadocadastro = resultadocadastro;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CadastrarclienteResponse)) return false;
        CadastrarclienteResponse other = (CadastrarclienteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadocadastro==null && other.getResultadocadastro()==null) || 
             (this.resultadocadastro!=null &&
              this.resultadocadastro.equals(other.getResultadocadastro())));
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
        if (getResultadocadastro() != null) {
            _hashCode += getResultadocadastro().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CadastrarclienteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">cadastrarclienteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadocadastro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadocadastro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "resultadocadastro"));
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
