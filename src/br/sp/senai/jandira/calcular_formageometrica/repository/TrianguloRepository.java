package br.sp.senai.jandira.calcular_formageometrica.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formasgeometricas.model.Triangulo;

public class TrianguloRepository {
	
	public void criarTriangulo() {
		Scanner leitor = new Scanner(System.in);

		Triangulo triangulo = new Triangulo();
		
		System.out.println();
		System.out.println("Criando um triângulo");
		System.out.print("Qual é o valor da base do triângulo? ");
		triangulo.setBase(leitor.nextDouble());
		
		System.out.print("Qual é o valor da altura do triângulo? ");
		triangulo.setAltura(leitor.nextDouble());
		
		triangulo.mostrarDados();
		
		leitor.close();
		
	}

}