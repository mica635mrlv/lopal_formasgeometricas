package br.sp.senai.jandira.calcular_formageometrica;

import java.util.Scanner;

import br.sp.senai.jandira.calcular_formasgeometricas.ui.Menu;

public class CalcularFormas {

	public static void main(String[] args) {
		
		int contador = 0;
		while (contador <= 10) {
			int resultado = 9 * contador;
			System.out.println("9 x " + contador + " = " + 9 * contador);
			contador = contador + 1;
		}
		
		System.out.println();
		System.out.println("Números ímpares de 0 à 100");
		System.out.println();
		contador = 0;
		while(contador <=100) {
			if(contador % 2 == 1) {
				System.out.println(contador);
			}
			contador++;
			// contador = contador + 1;
		}	
		
		System.out.println();
		System.out.println("--------------------");
		Scanner leitor = new Scanner(System.in);
		String resposta = "s";
		while (resposta.equalsIgnoreCase("S")) {
			System.out.print("Estamos dando voltas!");			
			System.out.println("\n");			
			System.out.print("Mais uma volta (S/N)? ");
			resposta = leitor.next();
			System.out.println("\n--------------------");	
		}
		
		leitor.close();
		
		//System.out.println(9 % 2);
		
		// int contador = 0;
		// while(contador <= 10) {
		//	System.out.println("9 x " + contador + " = " + 9 * contador);
		//	contador = contador + 1;
		// }
		
		//Menu.criarMenu();
		
	}
	
}
