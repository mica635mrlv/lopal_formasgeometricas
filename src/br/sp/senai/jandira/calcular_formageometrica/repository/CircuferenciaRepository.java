package br.sp.senai.jandira.calcular_formageometrica.repository;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formasgeometricas.model.Circunferencia;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Retangulo;

public class CircuferenciaRepository {

	public void criarCircunferencia() {
		Scanner leitor = new Scanner(System.in);
		System.out.println();
		System.out.println("Criando uma circunferencia...");
		System.out.print("Qual é o raio da circunferencia? ");
		
		Circunferencia circuferencia = new Circunferencia();
		
		circuferencia.setRaio(leitor.nextDouble());
		circuferencia.mostrarDados();
		
		leitor.close();
		
	}		
	
}
