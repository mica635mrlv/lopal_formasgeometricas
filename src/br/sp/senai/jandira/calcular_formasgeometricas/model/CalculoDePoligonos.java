package br.sp.senai.jandira.calcular_formasgeometricas.model;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formasgeometricas.ui.Menu;

public class CalculoDePoligonos {

	public static void calcularRetangulo() {

		Menu.criarMenu();
		
		Retangulo retangulo = new Retangulo();
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Altura do retângulo: ");
		double altura = leitor.nextDouble();
		
		System.out.print("Base do retângulo: ");
		double base = leitor.nextDouble();
		
		retangulo.setAltura(altura);
		retangulo.setBase(base);
		retangulo.mostrarDados();
		
		leitor.close();
	}
	
}
