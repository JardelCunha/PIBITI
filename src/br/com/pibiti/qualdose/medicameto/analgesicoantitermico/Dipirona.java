package br.com.pibiti.qualdose.medicameto.analgesicoantitermico;

import br.com.pibiti.qualdose.medicameto.CalculaDose;
import br.com.pibiti.qualdose.medicameto.Medicamento;

public class Dipirona extends Medicamento implements CalculaDose{
	
	public Dipirona(){
		this.nome = "Dipirona";
		this.multiplicaMin = 20;
		this.multiplicaMax = 25;
		this.doseMax = 500;
		this.intervalo = 6;
	}
	
	public int getIntervalo() {
		return this.getIntervalo();
	}
	
	/*
	 * calculando dosagem maxima para paciente
	 * (non-Javadoc)
	 * @see br.com.pibiti.qualdose.medicameto.CalculaDose#CalculaDoseMin(int, double, double, double)
	 */
	public double CalculaDoseMin(int idade, 
			double peso){
		double resultado = peso * this.multiplicaMin;
		if (resultado < (this.doseMax/this.intervalo)){
			return resultado;	
		}else{
			double pacienteDoseMaxima = (this.doseMax/this.intervalo);
			return pacienteDoseMaxima;
		}
	}
	
	/*
	 * calculando dosagem maxima para paciente
	 * (non-Javadoc)
	 * @see br.com.pibiti.qualdose.medicameto.CalculaDose#CalculaDoseMax(int, double, double, double)
	 */
	public double CalculaDoseMax(int idade, 
			double peso){
		double resultado = peso * multiplicaMax;
		
		if (resultado < (this.doseMax/intervalo)){
			return resultado;	
		}else{
			double pacienteDoseMaxima = (this.doseMax/intervalo);
			return pacienteDoseMaxima;
		}
		
	}

}
