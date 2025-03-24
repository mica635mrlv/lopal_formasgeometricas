package br.sp.senai.jandira.calcular_formageometrica.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formasgeometricas.model.Circunferencia;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Retangulo;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Trapezio;

public class TrapezioRepository {

	public void criarTrapezio() {
		Scanner leitor = new Scanner(System.in);
		
		Trapezio trapezio = new Trapezio();
		
		System.out.println();
		System.out.println("Criando um trapézio...");
		System.out.print("Qual é o valor da base maior do trapézio? ");
		trapezio.setBaseMaior(leitor.nextDouble());
		
		System.out.print("Qual é o valor da base menor do trapézio? ");
		trapezio.setBaseMenor(leitor.nextDouble());
		
		System.out.print("Qual é a altura do trapézio? ");
		trapezio.setAltura(leitor.nextDouble());
		
		trapezio.mostrarDados();
		
		leitor.close();

	}		

}
