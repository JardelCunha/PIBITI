package br.com.pibiti.qualdose.medicameto;

import br.com.pibiti.qualdose.paciente.Paciente;

public abstract class Medicamento extends Paciente{
	protected String nome;
	protected double multiplicaMax;
	protected double multiplicaMin;
	protected double doseMax;
	protected int intervalo;
	
	abstract public String getNome();
	
	public int getIdade() {
		return super.getIdade();
	}
	
	public double getPeso() {
		return super.getPeso();
	}
}
