package com.algaworks.festa.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.algaworks.festa.model.Convidado;

@Repository
public class Convidados {

	private static final List<Convidado> LISTA_CONVIDADOS = new ArrayList<Convidado>();
	
	static {
		LISTA_CONVIDADOS.add(new Convidado("João", 2));
		LISTA_CONVIDADOS.add(new Convidado("Maria", 1));
		LISTA_CONVIDADOS.add(new Convidado("Pedro", 5));
	}

	public List<Convidado> todos() {
		return Convidados.LISTA_CONVIDADOS;
	}
	
	public void adicionaConvidado(Convidado convidado) {
		Convidados.LISTA_CONVIDADOS.add(convidado);
	}
}
