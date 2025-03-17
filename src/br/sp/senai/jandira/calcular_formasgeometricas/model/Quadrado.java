package br.sp.senai.jandira.calcular_formasgeometricas.model;

public class Quadrado {
	private double lado;

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return lado;
	}
	
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}
	
	public void mostrarDados () {
		double area = calcularArea();
		double perimetro = calcularPerimetro();
		
		System.out.println("--------------------");
		System.out.printf("QUADRADO \n");
		System.out.println("--------------------");
		System.out.printf("Lado: %s \n", lado);
		System.out.printf("Área: %s \n", area);
		System.out.printf("Perímetro: %s \n", perimetro);
		System.out.printf("=====================");
	}
	
}