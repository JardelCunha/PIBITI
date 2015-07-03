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
		double pesoMaiorQue = 30;
	}
	
	public int getIntervalo() {
		return this.intervalo;
	}

	public double CalculaDoseMin(int idade, double peso) {
		double resultado = peso * this.multiplicaMax;
		if(peso > 30){
			if (resultado/peso >= this.doseMax) {
				return resultado;
			} else {
				double resultadoDoseMax = (this.doseMax / this.intervalo);
				return resultadoDoseMax;
			}
			
		}else{
			return resultado;
		}
	}

	public double CalculaDoseMax(int idade, double peso) {

		double resultado = peso * this.multiplicaMax;
		if (resultado < (this.doseMax / this.intervalo)) {
			return resultado;
		} else {
			double pacienteDoseMaxima = (this.doseMax / this.intervalo);
			return pacienteDoseMaxima;
		}
	}

}
