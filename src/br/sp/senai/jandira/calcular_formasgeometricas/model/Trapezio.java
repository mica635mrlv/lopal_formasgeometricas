package br.sp.senai.jandira.calcular_formasgeometricas.model;

public class Trapezio {
	
	private double baseMaior;
	private double baseMenor;
	private double altura;
	
	public void setBaseMaior (double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior () {
		return baseMaior;
	}
	
	public void setBaseMenor (double baseMenor) {
		this.baseMenor = baseMenor;
	}
	
	public double getBaseMenor () {
		return baseMenor;
	}
	
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double getAltura () {
		return altura;
	}
	
	public double calcularArea() {
		double area = (baseMenor + baseMaior) * altura / 2 ;
		return area;
	}
	
	public void mostrarDados () {
		double area = Math.round(calcularArea());
		
		System.out.println("\n--------------------");
		System.out.printf("TRAPÉZIO \n");
		System.out.println("--------------------");
		System.out.printf("Base Maior: %s \n", baseMaior);
		System.out.printf("Base Menor: %s \n", baseMenor);
		System.out.printf("Altura: %s \n", altura);
		System.out.printf("Area: %s \n", area);
		System.out.printf("=====================");
	}
	
}