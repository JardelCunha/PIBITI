package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Paracetamol extends Medicamento implements CalculaDose{
	
	public Paracetamol(){
		this.nome = "Paracetamol";
		this.multiplicaMin = 10;
		this.multiplicaMax = 15;
	}
	
	public String getNome() {
		return this.nome;
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
