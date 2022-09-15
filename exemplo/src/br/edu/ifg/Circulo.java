package br.edu.ifg;

public class Circulo extends FormaDuasDimencoes {

	private double raio;

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	@Override
	public double calculaArea() {
		return Math.PI * (Math.pow(raio, 2));

	}

	@Override
	public String toString() {
		return String.format("Circulo \n" + "Raio: %.2f" + "\n" + "Area: %.2f", getRaio(), calculaArea());

	}

}