package br.com.dh.model;

import br.com.dh.interfaces.Voador;

public class Aviao implements Voador {
	
	private int horasDeVoo;
	
	public Aviao() {
		
	}
	
	public Aviao(int horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}
	
	public int getHorasDeVoo() {
		return horasDeVoo;
	}

	public void setHorasDeVoo(int horasDeVoo) {
		this.horasDeVoo = horasDeVoo;
	}
	
	@Override
	public String toString() {
		return "Aviao [horasDeVoo=" + horasDeVoo + "]";
	}

	@Override
	public void voar() {
		horasDeVoo += 13;
		
		if(horasDeVoo > 0) {
			System.out.println("Estou voando como um avião e tenho " + horasDeVoo + " horas de voo.");			
		}
	}

}
