package br.sp.senai.jandira.calcular_formasgeometricas.model;

public class Circunferencia {

	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double calcularArea() {
		double area = Math.PI * (raio * raio);
		return area;
	}
	
	public void mostrarDados() {
		double area = calcularArea();
		System.out.println("\n--------------");
		System.out.println("CIRCULO");
		System.out.println("--------------");
		System.out.printf("Raio: %s\n", raio);
		System.out.printf("Circunferência: %s\n", area);
		System.out.println("=====================");
	}
	
}
