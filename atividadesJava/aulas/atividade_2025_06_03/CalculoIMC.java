package atividade_2025_06_03;

import java.util.Scanner;

public class CalculoIMC {
	
public static double peso, altura, imc;

public static Scanner teclado = new Scanner(System.in);

	public static void receberMedidas() {
		System.out.println("Qual seu peso?");
		peso = teclado.nextDouble();
		
		System.out.println("Qual sua altura?");
		altura = teclado.nextDouble();
		
		imc = peso/ (altura * 2);
		
		informarPeso();
	}
	
	public static void informarPeso() {
		
		// Nada foi informado sobre um peso abaixo de 18.5
		if (imc < 18.5) {
			System.out.println("Você está abaixo do peso");
		} else if (imc < 25) {
			System.out.println("Seu peso está normal");
		} else if (imc < 30) {
			System.out.println("Você está acima do peso");
		} else {
			System.out.println("Você está obeso");
		}
	}
}
