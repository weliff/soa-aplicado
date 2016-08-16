/**
 * ListagemLivros.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.knight.estoque.controller;

public interface ListagemLivros extends java.rmi.Remote {
    public com.knight.estoque.controller.Livro[] listarLivros() throws java.rmi.RemoteException;
    public com.knight.estoque.controller.Livro[] listarLivrosPaginacao(java.lang.Integer arg0, java.lang.Integer arg1) throws java.rmi.RemoteException;
}
