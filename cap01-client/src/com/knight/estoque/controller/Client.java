
package com.knight.estoque.controller;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Client {

	public static void main(String[] args) throws ServiceException, RemoteException {

		ListagemLivrosService service = new ListagemLivrosServiceLocator();
		
		ListagemLivros listagemLivros = service.getListagemLivrosPort();
		new Livro();
		Livro[] livros = listagemLivros.listarLivros();
		livros = listagemLivros.listarLivrosPaginacao(0, 2);
		for (Livro livro : livros) {
			System.out.println("Nome: " + livro.getNome());
		}
		
	}

}