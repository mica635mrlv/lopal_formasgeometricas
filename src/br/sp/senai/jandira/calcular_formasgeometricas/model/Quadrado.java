package br.sp.senai.jandira.calcular_formasgeometricas.model;

public class Quadrado {
	private int lado;


	public void setLado(int lado) {
		if (lado >= 1) {
			this.lado = lado;
		} else {
			System.out.println("Valor Inválido");
		}
	}
	
	public int getLado() {
		return lado;
	}
	
	public double calcularArea() {
		double resultadoArea = lado * lado;
		return resultadoArea;
	}

	public double calcularPerimetro() {
		double resultadoPerimetro = lado * 4;
		return resultadoPerimetro;
	}
	
}
