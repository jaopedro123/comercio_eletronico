package com.explaintech.comercio_eletronico.model;

public class Produto {
	
	private long id;
	private String nome;
	private String codigoDeBarras;
	private double preco;
	
	// public: Acesso liberado para todas as classes
	
	//Private: Acesso liberado apenas os membros da propia classe

	// Metodos Setter's -> Ultilizados para "atribuir" valor ao atributo
	// Metodos Getter's -> Ultilizado para "recuperar" o valor do atributo

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	}
