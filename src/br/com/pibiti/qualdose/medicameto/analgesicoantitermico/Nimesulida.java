package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Nimesulida extends Medicamento implements CalculaDose{
	
	public Nimesulida(){
		this.nome = "Nimesulida";
		this.multiplicaMin = 50;
		this.multiplicaMax = 100;
		this.doseMax = 200;
		this.intervalo = 12;
	}

	public int getIntervalo() {
		return this.intervalo;
	}

	public double CalculaDoseMin(int idade, double peso) {
		if(idade <= 12){
			return 0;
		}else{
			double resultado = this.multiplicaMin * peso;
			return resultado;
		}
	}

	public double CalculaDoseMax(int idade, double peso) {
		if(idade <= 12){
			return 0;
		}else{
			double resultado = this.multiplicaMax * peso;
			return resultado;
		}
	}
	
	

}
