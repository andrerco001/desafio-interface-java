package br.com.dh.model;

import br.com.dh.interfaces.Voador;

public class SuperHomem implements Voador {
	
	private int experiencia;
	
	public SuperHomem() {
		
	}
	
	public SuperHomem(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public String toString() {
		return "SuperHomem [experiencia=" + experiencia + "]";
	}

	@Override
	public void voar() {
		experiencia += 3;
		
		if(experiencia > 0) {
			System.out.println("Estou voando como um campeão.");
		}
	}

}
