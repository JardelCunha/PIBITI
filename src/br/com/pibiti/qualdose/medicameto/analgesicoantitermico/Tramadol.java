package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Tramadol extends Medicamento implements CalculaDose{
	
	public Tramadol(){
		this.nome = "Tramadol";
		this.multiplicaMax = 2;
		this.multiplicaMin = 1;
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
