package br.com.pibiti.qualdose.medicameto;

public interface CalculaDose {
	
	public double CalculaDoseMin(int idade, 
			double peso, double multiplicaMin, double doseMax);
	
	public double CalculaDoseMax(int idade, 
			double peso, double multiplicaMax, double doseMax);
}
