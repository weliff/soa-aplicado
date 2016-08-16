package com.knight.estoque.dao;

import java.util.Arrays;
import java.util.List;

import com.knight.estoque.model.Livro;

public class LivroDAO {
	
	

	public List<Livro> listarLivros() {
		return gerarLivros();
	}

	public List<Livro> listarLivros(Integer numeroDaPagina, Integer tamanhoDaPagina) {

		int indiceInicial = numeroDaPagina * tamanhoDaPagina;
		int indiceFinal = indiceInicial + tamanhoDaPagina;
		
		List<Livro> livros = gerarLivros();
		indiceFinal = indiceFinal > livros.size() ? livros.size() : indiceFinal; 
		indiceInicial = indiceInicial > indiceFinal ? indiceFinal : indiceInicial;
		
		return livros.subList(indiceInicial, indiceFinal);
	}

	private List<Livro> gerarLivros() {
		Livro livro1 = new Livro("Guia do Programador", Arrays.asList("Paulo Silveira", "Adriano Almeida"), "Casa do Código", 2012, "Vá do \"nunca programei\" ...");
		Livro livro2 = new Livro("Ruby on Rails", Arrays.asList("Vinícius Baggio Fuentes"), "Casa do Código", 2012, "Crie rapidamente aplicações web");
		return Arrays.asList(livro1, livro2);
	}
		
}
