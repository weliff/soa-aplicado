package com.knight.estoque.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Livro {

	private String nome;
	@XmlElementWrapper(name="autores")
	@XmlElement(name="autor")
	private List<String> autores;
	private String editora;
	private Integer anoDePublicacao;
	private String resumo;
	
	public Livro(String nome, List<String> autores, String editora, Integer anoDePublicacao, String resumo) {
		this.nome = nome;
		this.autores = autores;
		this.editora = editora;
		this.anoDePublicacao = anoDePublicacao;
		this.resumo = resumo;
	}
	
	public Livro() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(Integer anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}

}