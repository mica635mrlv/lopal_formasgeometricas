package br.sp.senai.jandira.calcular_formageometrica;

import br.sp.senai.jandira.calcular_formasgeometricas.model.Circunferencia;
import br.sp.senai.jandira.calcular_formasgeometricas.model.Retangulo;

public class CalcularFormas {

	public static void main(String[] args) {
	
		Retangulo formaR = new Retangulo();
		Circunferencia formaC = new Circunferencia();
		
		formaR.setAltura(13);
		formaR.setBase(145);
		formaR.mostrarDados();
		
		formaC.setRaio(25);
		formaC.mostrarDados();
		
		
	}

}
