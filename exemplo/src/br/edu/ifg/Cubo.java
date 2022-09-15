package br.edu.ifg;

public class Cubo extends FormaTresDimencoes {

	private double aresta;

	public void setAresta(double e) {
		aresta = e;
	}

	public double getAresta() {
		return aresta;
	}

	public double calculaArea() {
		return 6 * Math.pow(getAresta(), 2);
	}

	public double calculaVolume() {
		return Math.pow(getAresta(), 3);
	}

	@Override
	public String toString() {
		return String.format("Cubo \n" + "Aresta: %.2f" + "\n" + "Area: %.2f", getAresta(), calculaArea());
	}

}
