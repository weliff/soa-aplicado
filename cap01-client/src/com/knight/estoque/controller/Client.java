package com.knight.estoque.controller;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

public class Client {

	public static void main(String[] args) throws ServiceException, RemoteException {

		ListagemLivrosService service = new ListagemLivrosServiceLocator();
		ListagemLivros listagemLivros = service.getListagemLivrosPort();

		Livro[] livros = listagemLivros.listarLivros();
		for (Livro livro : livros) {
			System.out.println("Nome: " + livro.getNome());
		}
		
	}

}
