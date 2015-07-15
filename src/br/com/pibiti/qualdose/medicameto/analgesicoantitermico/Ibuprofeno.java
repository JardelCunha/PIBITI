package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Ibuprofeno extends Medicamento implements CalculaDose {
	public Ibuprofeno() {
		this.nome = "Ibuprofeno";
		this.multiplicaMin = 5;
		this.multiplicaMax = 10;
		this.doseMax = 40;
		this.intervalo = 6;
	}

	public int getIntervalo() {
		return this.intervalo;
	}

	public double CalculaDoseMin(int idade, double peso) {
		double resultado = peso * this.multiplicaMax;
		return resultado;
	}

	public double CalculaDoseMax(int idade, double peso) {

		double resultado = peso * this.multiplicaMax;
		return resultado;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
