package br.edu.ifg;

public class Quadrado extends FormaDuasDimencoes {

	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	@Override
	public double calculaArea() {
		return Math.pow(getLado(), 2);
	}

	@Override
	public String toString() {
		return String.format("Quadrado \n" + "Lado: %.2f" + "\n" + "Area: %.2f", getLado(), calculaArea());
	
	}

}