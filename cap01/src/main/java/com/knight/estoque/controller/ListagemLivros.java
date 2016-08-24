package com.knight.estoque.controller;

import java.util.List;
import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.soap.SOAPException;
import javax.xml.ws.Endpoint;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import com.knight.estoque.dao.LivroDAO;
import com.knight.estoque.exception.UsuarioNaoAutorizadoException;
import com.knight.estoque.model.Livro;
import com.knight.estoque.model.Usuario;

@WebService()
public class ListagemLivros {

	static Logger logger = Logger.getGlobal();

	@WebResult(name = "livro")
	public List<Livro> listarLivros() {
		LivroDAO livroDAO = obterDAO();
		return livroDAO.listarLivros();
	}
	
	@RequestWrapper(className="com.knight.estoque.servicos.jaxws.ListarLivrosPaginacao", localName = "listarLivrosPaginacao")
	@ResponseWrapper(className="com.knight.estoque.servicos.jaxws.ListarLivrosPaginacaoResponse", localName = "listarLivrosPaginacaoResponse")
	@WebMethod(operationName="listarLivrosPaginacao")
	@WebResult(name = "livro")
	public List<Livro> listarLivros(Integer numeroDaPagina, Integer tamanhoDaPagina) {
		LivroDAO livroDAO = obterDAO();
		return livroDAO.listarLivros(numeroDaPagina, tamanhoDaPagina);
	}
	
	public void criarLivro(@WebParam(name="livro") Livro livro, @WebParam(name="usuario", header=true) Usuario usuario) throws UsuarioNaoAutorizadoException, SOAPException {
		if (usuario.getLogin().equals("soa") &&
	            usuario.getSenha().equals("soa")) {
	      obterDAO().criarLivro(livro);
	   } else {
//		  SOAPFault fault = SOAPFactory.newInstance()
//				  						.createFault("Usuário não autorizado", new QName(SOAPConstants.URI_ENVELOPE, "Client.autorizacao"));
//		  fault.setFaultActor("http://servicos.estoque.knight.com/LivrosService");
//	      throw new SOAPFaultException(fault);
		  throw new UsuarioNaoAutorizadoException("Não Autorizado"); 
		   
	   }
	}

	private LivroDAO obterDAO() {
		return new LivroDAO();
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/livros", new ListagemLivros());
		logger.info("Serviço inicializado...");

	}

}
