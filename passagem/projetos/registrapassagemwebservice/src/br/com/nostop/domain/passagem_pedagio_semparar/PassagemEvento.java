/**
 * PassagemEvento.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.nostop.domain.passagem_pedagio_semparar;

public class PassagemEvento  implements java.io.Serializable {
    private java.lang.String codigoPedagio;

    private java.lang.String codigoCancela;

    private java.lang.String codigoAparelho;

    private java.util.Calendar dataPassagem;

    private java.lang.String status;

    public PassagemEvento() {
    }

    public PassagemEvento(
           java.lang.String codigoPedagio,
           java.lang.String codigoCancela,
           java.lang.String codigoAparelho,
           java.util.Calendar dataPassagem,
           java.lang.String status) {
           this.codigoPedagio = codigoPedagio;
           this.codigoCancela = codigoCancela;
           this.codigoAparelho = codigoAparelho;
           this.dataPassagem = dataPassagem;
           this.status = status;
    }


    /**
     * Gets the codigoPedagio value for this PassagemEvento.
     * 
     * @return codigoPedagio
     */
    public java.lang.String getCodigoPedagio() {
        return codigoPedagio;
    }


    /**
     * Sets the codigoPedagio value for this PassagemEvento.
     * 
     * @param codigoPedagio
     */
    public void setCodigoPedagio(java.lang.String codigoPedagio) {
        this.codigoPedagio = codigoPedagio;
    }


    /**
     * Gets the codigoCancela value for this PassagemEvento.
     * 
     * @return codigoCancela
     */
    public java.lang.String getCodigoCancela() {
        return codigoCancela;
    }


    /**
     * Sets the codigoCancela value for this PassagemEvento.
     * 
     * @param codigoCancela
     */
    public void setCodigoCancela(java.lang.String codigoCancela) {
        this.codigoCancela = codigoCancela;
    }


    /**
     * Gets the codigoAparelho value for this PassagemEvento.
     * 
     * @return codigoAparelho
     */
    public java.lang.String getCodigoAparelho() {
        return codigoAparelho;
    }


    /**
     * Sets the codigoAparelho value for this PassagemEvento.
     * 
     * @param codigoAparelho
     */
    public void setCodigoAparelho(java.lang.String codigoAparelho) {
        this.codigoAparelho = codigoAparelho;
    }


    /**
     * Gets the dataPassagem value for this PassagemEvento.
     * 
     * @return dataPassagem
     */
    public java.util.Calendar getDataPassagem() {
        return dataPassagem;
    }


    /**
     * Sets the dataPassagem value for this PassagemEvento.
     * 
     * @param dataPassagem
     */
    public void setDataPassagem(java.util.Calendar dataPassagem) {
        this.dataPassagem = dataPassagem;
    }


    /**
     * Gets the status value for this PassagemEvento.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PassagemEvento.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassagemEvento)) return false;
        PassagemEvento other = (PassagemEvento) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoPedagio==null && other.getCodigoPedagio()==null) || 
             (this.codigoPedagio!=null &&
              this.codigoPedagio.equals(other.getCodigoPedagio()))) &&
            ((this.codigoCancela==null && other.getCodigoCancela()==null) || 
             (this.codigoCancela!=null &&
              this.codigoCancela.equals(other.getCodigoCancela()))) &&
            ((this.codigoAparelho==null && other.getCodigoAparelho()==null) || 
             (this.codigoAparelho!=null &&
              this.codigoAparelho.equals(other.getCodigoAparelho()))) &&
            ((this.dataPassagem==null && other.getDataPassagem()==null) || 
             (this.dataPassagem!=null &&
              this.dataPassagem.equals(other.getDataPassagem()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getCodigoPedagio() != null) {
            _hashCode += getCodigoPedagio().hashCode();
        }
        if (getCodigoCancela() != null) {
            _hashCode += getCodigoCancela().hashCode();
        }
        if (getCodigoAparelho() != null) {
            _hashCode += getCodigoAparelho().hashCode();
        }
        if (getDataPassagem() != null) {
            _hashCode += getDataPassagem().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PassagemEvento.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://nostop.com.br/domain/passagem_pedagio_semparar", "PassagemEvento"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoPedagio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://nostop.com.br/domain/passagem_pedagio_semparar", "codigoPedagio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoCancela");
        elemField.setXmlName(new javax.xml.namespace.QName("http://nostop.com.br/domain/passagem_pedagio_semparar", "codigoCancela"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoAparelho");
        elemField.setXmlName(new javax.xml.namespace.QName("http://nostop.com.br/domain/passagem_pedagio_semparar", "codigoAparelho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPassagem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://nostop.com.br/domain/passagem_pedagio_semparar", "dataPassagem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://nostop.com.br/domain/passagem_pedagio_semparar", "status"));
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
