package br.com.dh.model;

import java.util.ArrayList;
import java.util.List;

import br.com.dh.interfaces.Voador;

public class TorreDeControle {
	
	private List<Voador> voadores = new ArrayList<>();
	
	public TorreDeControle() {
		
	}
		
	public TorreDeControle(List<Voador> voadores) {
		this.voadores = voadores;
	}

	public void voemTodos() {
		
		for(Voador v : voadores) {
			v.voar();
		}
	}
	
}
