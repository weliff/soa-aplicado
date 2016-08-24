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
		Livro livro1 = new Livro("Guia do Programador", Arrays.asList("Paulo Silveira", "Adriano Almeida"), "Casa do C�digo", 2012, "V� do \"nunca programei\" ...");
		Livro livro2 = new Livro("Ruby on Rails", Arrays.asList("Vin�cius Baggio Fuentes"), "Casa do C�digo", 2012, "Crie rapidamente aplica��es web");
		return Arrays.asList(livro1, livro2);
	}

	public void criarLivro(Livro livro) {
		// TODO Auto-generated method stub
		
	}
		
}
