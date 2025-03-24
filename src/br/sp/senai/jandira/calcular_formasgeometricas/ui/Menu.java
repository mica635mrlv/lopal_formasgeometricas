package br.sp.senai.jandira.calcular_formasgeometricas.ui;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formageometrica.repository.CircuferenciaRepository;
import br.sp.senai.jandira.calcular_formageometrica.repository.QuadradoRepository;
import br.sp.senai.jandira.calcular_formageometrica.repository.RetanguloRepository;
import br.sp.senai.jandira.calcular_formageometrica.repository.TrapezioRepository;
import br.sp.senai.jandira.calcular_formageometrica.repository.TrianguloRepository;
import br.sp.senai.jandira.calcular_formasgeometricas.model.CalculoDePoligonos;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Quadrado;

public class Menu {

	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("------------------------");
		System.out.println("CALCULADORA DE POLÍGONOS");
		System.out.println("------------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRAPÉZIO");
		System.out.println("4 - TRIÂNGULO");
		System.out.println("5 - CIRCUNFERÊNCIA");
		System.out.println("6 - SAIR");
		System.out.println("------------------------");
		System.out.print("Escolha uma opção (1 - 6): ");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoRepository quadradoRepository = new QuadradoRepository();
			quadradoRepository.criarQuadrado();
		} else if (opcao == 2) {
			RetanguloRepository retanguloRepository = new RetanguloRepository();
			retanguloRepository.criarRetangulo();
		} else if (opcao == 3){
			TrapezioRepository trapezioRepository = new TrapezioRepository();
			trapezioRepository.criarTrapezio();
		} else if (opcao == 4){
			TrianguloRepository trianguloRepository = new TrianguloRepository();
			trianguloRepository.criarTriangulo();
		} else if (opcao == 5){
			CircuferenciaRepository circuferenciaRepository = new CircuferenciaRepository();
			circuferenciaRepository.criarCircunferencia();
		} else if (opcao == 6) {
			System.out.print("Tem certeza que deseja sair? (S/N) ");
			String escolha = leitor.next();
			
			if (escolha.equalsIgnoreCase("S")) {			
			System.out.println();
			System.out.print("Encerrado o sistema. Bye!");
			System.exit(0);
			} else if (escolha.equalsIgnoreCase("N")){
				criarMenu();
			} else {
				System.out.println();
				System.out.print("Você deve escolher somente \"S\" ou \"N\"!");
				System.out.println("\n");
				criarMenu();
			}
			
		} else {
			System.out.println("\nA opção selecionada ainda não foi implementada!");
		}
		
	}
	
}
