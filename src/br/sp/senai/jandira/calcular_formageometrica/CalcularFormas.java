package br.sp.senai.jandira.calcular_formageometrica;

import br.sp.senai.jandira.calcular_formasgeometricas.model.Circunferencia;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Menu;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Quadrado;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Retangulo;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Trapezio;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Triangulo;

public class CalcularFormas {

	public static void main(String[] args) {
		
		Menu.criarMenu();
		

		Retangulo formaR = new Retangulo();
		formaR.setAltura(67);
		formaR.setBase(41);
		formaR.mostrarDados();
		
		Circunferencia formaC = new Circunferencia();
		formaC.setRaio(5);
		formaC.mostrarDados();
		
		Quadrado formaQ = new Quadrado();
		formaQ.setLado(25);
		formaQ.mostrarDados();
		
		Trapezio formaTz = new Trapezio();
		formaTz.setAltura(123);
		formaTz.setBaseMaior(56);
		formaTz.setBaseMenor(90);
		formaTz.mostrarDados();
		
		Triangulo formaTg = new Triangulo();
		formaTg.setBase(4);
		formaTg.setAltura(7);
		formaTg.mostrarDados();
	}

}
