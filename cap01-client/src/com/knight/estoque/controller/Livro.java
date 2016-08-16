/**
 * Livro.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.knight.estoque.controller;

public class Livro  implements java.io.Serializable {
    private java.lang.String nome;

    private java.lang.String[] autores;

    private java.lang.String editora;

    private java.lang.Integer anoDePublicacao;

    private java.lang.String resumo;

    public Livro() {
    }

    public Livro(
           java.lang.String nome,
           java.lang.String[] autores,
           java.lang.String editora,
           java.lang.Integer anoDePublicacao,
           java.lang.String resumo) {
           this.nome = nome;
           this.autores = autores;
           this.editora = editora;
           this.anoDePublicacao = anoDePublicacao;
           this.resumo = resumo;
    }


    /**
     * Gets the nome value for this Livro.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Livro.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the autores value for this Livro.
     * 
     * @return autores
     */
    public java.lang.String[] getAutores() {
        return autores;
    }


    /**
     * Sets the autores value for this Livro.
     * 
     * @param autores
     */
    public void setAutores(java.lang.String[] autores) {
        this.autores = autores;
    }


    /**
     * Gets the editora value for this Livro.
     * 
     * @return editora
     */
    public java.lang.String getEditora() {
        return editora;
    }


    /**
     * Sets the editora value for this Livro.
     * 
     * @param editora
     */
    public void setEditora(java.lang.String editora) {
        this.editora = editora;
    }


    /**
     * Gets the anoDePublicacao value for this Livro.
     * 
     * @return anoDePublicacao
     */
    public java.lang.Integer getAnoDePublicacao() {
        return anoDePublicacao;
    }


    /**
     * Sets the anoDePublicacao value for this Livro.
     * 
     * @param anoDePublicacao
     */
    public void setAnoDePublicacao(java.lang.Integer anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }


    /**
     * Gets the resumo value for this Livro.
     * 
     * @return resumo
     */
    public java.lang.String getResumo() {
        return resumo;
    }


    /**
     * Sets the resumo value for this Livro.
     * 
     * @param resumo
     */
    public void setResumo(java.lang.String resumo) {
        this.resumo = resumo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Livro)) return false;
        Livro other = (Livro) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.autores==null && other.getAutores()==null) || 
             (this.autores!=null &&
              java.util.Arrays.equals(this.autores, other.getAutores()))) &&
            ((this.editora==null && other.getEditora()==null) || 
             (this.editora!=null &&
              this.editora.equals(other.getEditora()))) &&
            ((this.anoDePublicacao==null && other.getAnoDePublicacao()==null) || 
             (this.anoDePublicacao!=null &&
              this.anoDePublicacao.equals(other.getAnoDePublicacao()))) &&
            ((this.resumo==null && other.getResumo()==null) || 
             (this.resumo!=null &&
              this.resumo.equals(other.getResumo())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getAutores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEditora() != null) {
            _hashCode += getEditora().hashCode();
        }
        if (getAnoDePublicacao() != null) {
            _hashCode += getAnoDePublicacao().hashCode();
        }
        if (getResumo() != null) {
            _hashCode += getResumo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Livro.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://controller.estoque.knight.com/", "livro"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "autor"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anoDePublicacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anoDePublicacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resumo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resumo"));
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
