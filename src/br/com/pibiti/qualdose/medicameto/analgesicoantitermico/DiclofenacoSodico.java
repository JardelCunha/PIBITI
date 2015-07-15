package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class DiclofenacoSodico extends Medicamento implements CalculaDose{
	
	public DiclofenacoSodico(){
		this.nome = "Diclofenaco Sódico";
		this.multiplicaMin = 2;
		this.multiplicaMax = 3;
		this.intervalo = 12;
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
