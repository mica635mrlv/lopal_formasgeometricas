package br.sp.senai.jandira.calcular_formageometrica.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formasgeometricas.model.Quadrado;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Retangulo;

public class RetanguloRepository {

	public void criarRetangulo() {
		Scanner leitor = new Scanner(System.in);
		System.out.println();
		System.out.println("Criando um retangulo...");
		System.out.print("Qual é a altura do retângulo? ");
		
		Retangulo retangulo = new Retangulo();
		
		retangulo.setAltura(leitor.nextDouble());
		
		System.out.print("Qual é a base do retângulo? ");
		retangulo.setBase(leitor.nextDouble());
		retangulo.mostrarDados();
		
		leitor.close();
		
		}		
	
}
