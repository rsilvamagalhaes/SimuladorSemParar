/**
 * Cliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.simuladorsemparar.domain;

public class Cliente  implements java.io.Serializable {
    private java.math.BigInteger id;

    private java.lang.String codigocli;

    private java.lang.String nome;

    private java.util.Date datanasc;

    private java.lang.String[] cpf;

    private java.lang.String[] rg;

    private java.math.BigInteger[] telefone;

    private java.math.BigInteger[] celular;

    public Cliente() {
    }

    public Cliente(
           java.math.BigInteger id,
           java.lang.String codigocli,
           java.lang.String nome,
           java.util.Date datanasc,
           java.lang.String[] cpf,
           java.lang.String[] rg,
           java.math.BigInteger[] telefone,
           java.math.BigInteger[] celular) {
           this.id = id;
           this.codigocli = codigocli;
           this.nome = nome;
           this.datanasc = datanasc;
           this.cpf = cpf;
           this.rg = rg;
           this.telefone = telefone;
           this.celular = celular;
    }


    /**
     * Gets the id value for this Cliente.
     * 
     * @return id
     */
    public java.math.BigInteger getId() {
        return id;
    }


    /**
     * Sets the id value for this Cliente.
     * 
     * @param id
     */
    public void setId(java.math.BigInteger id) {
        this.id = id;
    }


    /**
     * Gets the codigocli value for this Cliente.
     * 
     * @return codigocli
     */
    public java.lang.String getCodigocli() {
        return codigocli;
    }


    /**
     * Sets the codigocli value for this Cliente.
     * 
     * @param codigocli
     */
    public void setCodigocli(java.lang.String codigocli) {
        this.codigocli = codigocli;
    }


    /**
     * Gets the nome value for this Cliente.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Cliente.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the datanasc value for this Cliente.
     * 
     * @return datanasc
     */
    public java.util.Date getDatanasc() {
        return datanasc;
    }


    /**
     * Sets the datanasc value for this Cliente.
     * 
     * @param datanasc
     */
    public void setDatanasc(java.util.Date datanasc) {
        this.datanasc = datanasc;
    }


    /**
     * Gets the cpf value for this Cliente.
     * 
     * @return cpf
     */
    public java.lang.String[] getCpf() {
        return cpf;
    }


    /**
     * Sets the cpf value for this Cliente.
     * 
     * @param cpf
     */
    public void setCpf(java.lang.String[] cpf) {
        this.cpf = cpf;
    }

    public java.lang.String getCpf(int i) {
        return this.cpf[i];
    }

    public void setCpf(int i, java.lang.String _value) {
        this.cpf[i] = _value;
    }


    /**
     * Gets the rg value for this Cliente.
     * 
     * @return rg
     */
    public java.lang.String[] getRg() {
        return rg;
    }


    /**
     * Sets the rg value for this Cliente.
     * 
     * @param rg
     */
    public void setRg(java.lang.String[] rg) {
        this.rg = rg;
    }

    public java.lang.String getRg(int i) {
        return this.rg[i];
    }

    public void setRg(int i, java.lang.String _value) {
        this.rg[i] = _value;
    }


    /**
     * Gets the telefone value for this Cliente.
     * 
     * @return telefone
     */
    public java.math.BigInteger[] getTelefone() {
        return telefone;
    }


    /**
     * Sets the telefone value for this Cliente.
     * 
     * @param telefone
     */
    public void setTelefone(java.math.BigInteger[] telefone) {
        this.telefone = telefone;
    }

    public java.math.BigInteger getTelefone(int i) {
        return this.telefone[i];
    }

    public void setTelefone(int i, java.math.BigInteger _value) {
        this.telefone[i] = _value;
    }


    /**
     * Gets the celular value for this Cliente.
     * 
     * @return celular
     */
    public java.math.BigInteger[] getCelular() {
        return celular;
    }


    /**
     * Sets the celular value for this Cliente.
     * 
     * @param celular
     */
    public void setCelular(java.math.BigInteger[] celular) {
        this.celular = celular;
    }

    public java.math.BigInteger getCelular(int i) {
        return this.celular[i];
    }

    public void setCelular(int i, java.math.BigInteger _value) {
        this.celular[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cliente)) return false;
        Cliente other = (Cliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.codigocli==null && other.getCodigocli()==null) || 
             (this.codigocli!=null &&
              this.codigocli.equals(other.getCodigocli()))) &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.datanasc==null && other.getDatanasc()==null) || 
             (this.datanasc!=null &&
              this.datanasc.equals(other.getDatanasc()))) &&
            ((this.cpf==null && other.getCpf()==null) || 
             (this.cpf!=null &&
              java.util.Arrays.equals(this.cpf, other.getCpf()))) &&
            ((this.rg==null && other.getRg()==null) || 
             (this.rg!=null &&
              java.util.Arrays.equals(this.rg, other.getRg()))) &&
            ((this.telefone==null && other.getTelefone()==null) || 
             (this.telefone!=null &&
              java.util.Arrays.equals(this.telefone, other.getTelefone()))) &&
            ((this.celular==null && other.getCelular()==null) || 
             (this.celular!=null &&
              java.util.Arrays.equals(this.celular, other.getCelular())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getCodigocli() != null) {
            _hashCode += getCodigocli().hashCode();
        }
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getDatanasc() != null) {
            _hashCode += getDatanasc().hashCode();
        }
        if (getCpf() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCpf());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCpf(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRg() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRg());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRg(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelefone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelefone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelefone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCelular() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCelular());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCelular(), i);
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
        new org.apache.axis.description.TypeDesc(Cliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "cliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigocli");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "codigocli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datanasc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "datanasc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "cpf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rg");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "rg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "telefone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("celular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://simuladorsemparar.com.br/domain", "celular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
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
