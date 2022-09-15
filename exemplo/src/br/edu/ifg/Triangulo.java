package br.edu.ifg;

public class Triangulo extends FormaDuasDimencoes {
	private double base;
	private double altura;
	

	
	public Triangulo(double base, double altura)
	{
		this.base = base;
		this.altura = altura;
	}
	
	public void setBase(double base)
	{
		this.base = base;
	}
	
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
	
	public double getBase()
	{
		return base;
	}
	
	public double getAltura()
	{
		return altura;
	}

	@Override
	public double calculaArea() 
	{
		return (getBase() * getAltura()) / 2;
	}
	
	@Override
	public String toString()
	{
		return String.format("Triangulo \n" + "Altura: %.2f" + "\n" + "Base: %.2f" + "\n" + "Area: %.2f", getAltura(),
				getBase(), calculaArea());
	}
	
	
}
