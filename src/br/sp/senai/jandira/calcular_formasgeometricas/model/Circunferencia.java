package br.sp.senai.jandira.calcular_formasgeometricas.model;

public class Circunferencia {

	private double raio;
	
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}
	
	public double calcularCircunferencia() {
		double resultcircunferencia = Math.PI * (raio * raio);
		return resultcircunferencia;
	}
	
	public void mostrarDados() {
		System.out.println("\n--------------");
		System.out.println("CIRCULO");
		System.out.println("--------------");
		System.out.printf("Raio: %s\n", raio);
		System.out.printIn("Circunferencia: %s\n")
		System.out.println("==============");
	}
	
}
