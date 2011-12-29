/**
 * ValidarclienteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.cliente;

public class ValidarclienteResponse  implements java.io.Serializable {
    private br.com.simuladorsemparar.domain.Resultadovalidacao resultadovalidacao;

    public ValidarclienteResponse() {
    }

    public ValidarclienteResponse(
           br.com.simuladorsemparar.domain.Resultadovalidacao resultadovalidacao) {
           this.resultadovalidacao = resultadovalidacao;
    }


    /**
     * Gets the resultadovalidacao value for this ValidarclienteResponse.
     * 
     * @return resultadovalidacao
     */
    public br.com.simuladorsemparar.domain.Resultadovalidacao getResultadovalidacao() {
        return resultadovalidacao;
    }


    /**
     * Sets the resultadovalidacao value for this ValidarclienteResponse.
     * 
     * @param resultadovalidacao
     */
    public void setResultadovalidacao(br.com.simuladorsemparar.domain.Resultadovalidacao resultadovalidacao) {
        this.resultadovalidacao = resultadovalidacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarclienteResponse)) return false;
        ValidarclienteResponse other = (ValidarclienteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadovalidacao==null && other.getResultadovalidacao()==null) || 
             (this.resultadovalidacao!=null &&
              this.resultadovalidacao.equals(other.getResultadovalidacao())));
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
        if (getResultadovalidacao() != null) {
            _hashCode += getResultadovalidacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarclienteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/cliente/", ">validarclienteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadovalidacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadovalidacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "resultadovalidacao"));
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
