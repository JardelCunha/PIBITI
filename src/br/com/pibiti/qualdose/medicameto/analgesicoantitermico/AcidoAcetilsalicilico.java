package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class AcidoAcetilsalicilico extends Medicamento implements CalculaDose{
	
	public AcidoAcetilsalicilico(){
		this.nome = "Ácido Acetilsalicílico";
		this.multiplicaMax = 15;
		this.multiplicaMin = 10;
		this.intervalo = 4;
		int intervaloExtra = 6;
	}

	public String getNome() {
		return this.nome;
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
