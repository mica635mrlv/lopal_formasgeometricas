package br.sp.senai.jandira.calcular_formageometrica;

import br.sp.senai.jandira.calcular_formasgeometricas.model.Circunferencia;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Quadrado;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Retangulo;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Trapezio;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Triangulo;

public class CalcularFormas {

	public static void main(String[] args) {
	
		Retangulo formaR = new Retangulo();
		Circunferencia formaC = new Circunferencia();
		Quadrado formaQ = new Quadrado();
		Trapezio formaTz = new Trapezio();
		Triangulo formaTg = new Triangulo();
		
		formaR.setAltura(13);
		formaR.setBase(145);
		formaR.mostrarDados();
		
		formaC.setRaio(5);
		formaC.mostrarDados();
		
		formaQ.setLado(25);
		formaQ.mostrarDados();
		
		formaTz.setAltura(123);
		formaTz.setBaseMaior(56);
		formaTz.setBaseMenor(90);
		formaTz.mostrarDados();
		
		formaTg.setBase(4);
		formaTg.setAltura(7);
		formaTg.mostrarDados();
	}

}
