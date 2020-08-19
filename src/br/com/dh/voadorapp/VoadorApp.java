package br.com.dh.voadorapp;

import java.util.ArrayList;
import java.util.List;

import br.com.dh.interfaces.Voador;
import br.com.dh.model.Aviao;
import br.com.dh.model.Pato;
import br.com.dh.model.SuperHomem;
import br.com.dh.model.TorreDeControle;

public class VoadorApp {

	public static void main(String[] args) {
		
		// Pato
		Voador pato = new Pato();
		// pato.voar();
		
		// Avião
		Voador aviao = new Aviao();
		// aviao.voar();
		
		// SuperHomem
		Voador superHomem = new SuperHomem();
		// superHomem.voar();
		
		List<Voador> voador = new ArrayList<>();
		voador.add(pato);
		voador.add(aviao);
		voador.add(superHomem);
		
		// Torre de constrole
		TorreDeControle torreDeControle = new TorreDeControle(voador);
		torreDeControle.voemTodos();
		torreDeControle.voemTodos();
		torreDeControle.voemTodos();
		
	}

}
