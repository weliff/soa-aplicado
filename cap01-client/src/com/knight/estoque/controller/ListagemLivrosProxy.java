package com.knight.estoque.controller;

public class ListagemLivrosProxy implements com.knight.estoque.controller.ListagemLivros {
  private String _endpoint = null;
  private com.knight.estoque.controller.ListagemLivros listagemLivros = null;
  
  public ListagemLivrosProxy() {
    _initListagemLivrosProxy();
  }
  
  public ListagemLivrosProxy(String endpoint) {
    _endpoint = endpoint;
    _initListagemLivrosProxy();
  }
  
  private void _initListagemLivrosProxy() {
    try {
      listagemLivros = (new com.knight.estoque.controller.ListagemLivrosServiceLocator()).getListagemLivrosPort();
      if (listagemLivros != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)listagemLivros)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)listagemLivros)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (listagemLivros != null)
      ((javax.xml.rpc.Stub)listagemLivros)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.knight.estoque.controller.ListagemLivros getListagemLivros() {
    if (listagemLivros == null)
      _initListagemLivrosProxy();
    return listagemLivros;
  }
  
  public com.knight.estoque.controller.Livro[] listarLivros() throws java.rmi.RemoteException{
    if (listagemLivros == null)
      _initListagemLivrosProxy();
    return listagemLivros.listarLivros();
  }
  
  public com.knight.estoque.controller.Livro[] listarLivrosPaginacao(java.lang.Integer arg0, java.lang.Integer arg1) throws java.rmi.RemoteException{
    if (listagemLivros == null)
      _initListagemLivrosProxy();
    return listagemLivros.listarLivrosPaginacao(arg0, arg1);
  }
  
  
}