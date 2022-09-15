package br.edu.ifg;

public class Esfera extends FormaTresDimencoes {

	private double raio;

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double calculaVolume() {
		double v = 4 / 3;
		return (v * Math.PI) * (Math.pow(getRaio(), 3));
	}

	public double calculaArea() {
		return (4 * Math.PI) * (Math.pow(getRaio(), 2));
	}

	@Override
	public String toString() {
		return String.format("Esfera \n" + "Raio: %.2f" + "\n" + "Volume: %.2f" + "\n" + "Area: %.2f", getRaio(),
				calculaVolume(), calculaArea());
	}

}
