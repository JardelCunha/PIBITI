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
		getIdade();
		getPeso();
	}
	
	/*
	 * calculando dosagem maxima para paciente
	 * (non-Javadoc)
	 * @see br.com.pibiti.qualdose.medicameto.CalculaDose#CalculaDoseMin(int, double, double, double)
	 */
	public double CalculaDoseMin(int idade, 
			double peso, double multiplicaMin){
		double resultado = peso * multiplicaMin;
		if (resultado < (doseMax/intervalo)){
			return resultado;	
		}else{
			double pacienteDoseMaxima = (doseMax/intervalo);
			return pacienteDoseMaxima;
		}
	}
	
	/*
	 * calculando dosagem maxima para paciente
	 * (non-Javadoc)
	 * @see br.com.pibiti.qualdose.medicameto.CalculaDose#CalculaDoseMax(int, double, double, double)
	 */
	public double CalculaDoseMax(int idade, 
			double peso, double multiplicaMax){
		double resultado = peso * multiplicaMax;
		
		if (resultado < (doseMax/intervalo)){
			return resultado;	
		}else{
			double pacienteDoseMaxima = (doseMax/intervalo);
			return pacienteDoseMaxima;
		}
		
	}
	
	public String getNome() {
		return this.getNome();
	}
	
	public int getIntervado() {
		return this.getIntervado();
	}

}
