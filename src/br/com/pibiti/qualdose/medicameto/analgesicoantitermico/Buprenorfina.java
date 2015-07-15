package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Buprenorfina extends Medicamento implements CalculaDose{

	public Buprenorfina(){
		this.nome = "Buprenorfina";
		this.multiplicaMin = 0.2;
		this.multiplicaMax = 0.4;
		this.intervalo = 6;
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
