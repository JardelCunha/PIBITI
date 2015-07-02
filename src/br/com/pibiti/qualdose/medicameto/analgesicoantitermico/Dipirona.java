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
	
	/*
	 * calculando dosagem maxima para paciente
	 * (non-Javadoc)
	 * @see br.com.pibiti.qualdose.medicameto.CalculaDose#CalculaDoseMin(int, double, double, double)
	 */
	public double CalculaDoseMin(int idade, 
			double peso, double multiplicaMin, double doseMax){
		
		double resultado = peso * multiplicaMin;
		return resultado ;
	}
	
	/*
	 * calculando dosagem maxima para paciente
	 * (non-Javadoc)
	 * @see br.com.pibiti.qualdose.medicameto.CalculaDose#CalculaDoseMax(int, double, double, double)
	 */
	public double CalculaDoseMax(int idade, 
			double peso, double multiplicaMax, double doseMax){
		double resultado = peso * multiplicaMax;
		
		if (resultado < 500){
			return resultado;	
		}else{
			double dosemaxima = (500 / 6);
			return dosemaxima;
		}
		
	}
	
	public String getNome() {
		return this.getNome();
	}
	
	public int getIntervado() {
		return this.getIntervado();
	}
}
