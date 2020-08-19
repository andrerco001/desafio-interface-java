package br.com.dh.model;

import br.com.dh.interfaces.Voador;

public class Pato implements Voador {
	
	private int energia = 100;
	
	public Pato() {
		
	}
	
	public Pato(int energia) {
		this.energia = energia;
	}
	
	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	@Override
	public String toString() {
		return "Pato [energia=" + energia + "]";
	}

	@Override
	public void voar() {
		
		energia -= 5;
		
		if(energia > 0) {
			System.out.println("Estou voando como um pato");
			System.out.println("Energia: " + energia);
		} else {
			
			System.out.println("Não tenho energia suficiente para voar");
		}
	}
}
