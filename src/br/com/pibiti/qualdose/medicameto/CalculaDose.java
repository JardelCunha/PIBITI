package br.com.pibiti.qualdose.medicameto;

public interface CalculaDose {
	
	public double CalculaDoseMin(int idade, 
			double peso);
	
	public double CalculaDoseMax(int idade, 
			double peso);
}
