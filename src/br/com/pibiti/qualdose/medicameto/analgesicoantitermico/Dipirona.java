package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Dipirona extends Medicamento implements CalculaDose{

	public Dipirona(){
		this.nome = "Dipirona";
		this.multiplicaMin = 20;
		this.multiplicaMax = 25;
		this.doseMax = 500;
	}
	
	public String getNome() {
		return this.nome;
	}


	public double CalculaDoseMin(int idade, double peso){
		double resultado = peso * this.multiplicaMin;
		return resultado;
	}

	public double CalculaDoseMax(int idade, double peso){

		double resultado = peso * multiplicaMax;
		return resultado;
	}

}
