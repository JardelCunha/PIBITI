package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Nimesulida extends Medicamento implements CalculaDose{

	public Nimesulida(){
		this.nome = "Nimesulida";
		this.multiplicaMin = 50;
		this.multiplicaMax = 100;
		this.doseMax = 200;
	}
	
	public String getNome() {
		return this.nome;
	}

	public double CalculaDoseMin(int idade, double peso) {
		double resultado = this.multiplicaMin;
		return resultado;
	}

	public double CalculaDoseMax(int idade, double peso) {
		double resultado = this.multiplicaMax;
		return resultado;
	}

}
