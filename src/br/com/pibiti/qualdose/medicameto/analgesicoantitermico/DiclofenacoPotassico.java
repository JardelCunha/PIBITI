package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class DiclofenacoPotassico extends Medicamento implements CalculaDose {
	
	public DiclofenacoPotassico() {
		this.nome = "Diclofenaco Potássico";
		this.multiplicaMin = 2;
		this.multiplicaMax = 3;
		this.intervalo = 6;
		int intervaloExtra = 12;
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
