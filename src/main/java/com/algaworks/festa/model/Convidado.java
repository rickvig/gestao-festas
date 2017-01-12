package com.algaworks.festa.model;

public class Convidado {
	
	private String nome;
	private Integer acompanhantes;
	
	public Convidado(String nome, Integer acompanhantes) {
		this.nome = nome;
		this.acompanhantes = acompanhantes;
	}

	public Convidado() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAcompanhantes() {
		return acompanhantes;
	}

	public void setAcompanhantes(Integer acompanhantes) {
		this.acompanhantes = acompanhantes;
	}

}
