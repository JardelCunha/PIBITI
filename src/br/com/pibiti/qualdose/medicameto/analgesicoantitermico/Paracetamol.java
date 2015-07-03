package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Paracetamol extends Medicamento implements CalculaDose{
	
	/*
	 * A dose máxima de paracetamol é 5 doses ao dia
	 * ou seja, 5*(peso*multiplicaMax) e 5*(peso*multiplicaMin)
	 */
	
	public Paracetamol(){
		this.nome = "Paracetamol";
		this.multiplicaMin = 10;
		this.multiplicaMax = 15;
		this.intervalo = 4;
	}
	
	public int getIntervalo() {
		return this.intervalo;
	}
	

	public double CalculaDoseMin(int idade, double peso) {
		double resultado = peso * this.multiplicaMin;
		return resultado;
	}

	public double CalculaDoseMax(int idade, double peso) {
		double resultado = peso * this.multiplicaMax;
		return resultado;
	}

}
