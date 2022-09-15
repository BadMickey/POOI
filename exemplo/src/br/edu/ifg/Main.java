package br.edu.ifg;

public class Main {

	public static void main(String[] args) {
		
		Circulo circulo = new Circulo();
		circulo.setRaio(2);
		System.out.println(circulo.toString());
		System.out.println("------------------------");
		
		Cubo cubo = new Cubo();
		cubo.setAresta(2);
		System.out.println(cubo.toString());
		System.out.println("------------------------");
		
		Esfera esfera = new Esfera();
		esfera.setRaio(2);
		System.out.println(esfera.toString());
		System.out.println("------------------------");
		
		Quadrado quadrado = new Quadrado(2);
		System.out.println(quadrado.toString());
		System.out.println("------------------------");
		
		Tretaedro tretaedro = new Tretaedro(2);
		System.out.println(tretaedro.toString());
		System.out.println("------------------------");
		
		Triangulo triangulo = new Triangulo(3,2);
		System.out.println(triangulo.toString());
		System.out.println("------------------------");
	}

}
