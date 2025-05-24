package atividade_2024_09_30;

import java.util.Scanner;

public class Atividade006 {

	public static void main(String[] args) {
		
		double precoBolsa;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva o preço de uma bolsa");
		precoBolsa = teclado.nextDouble();
		
		if (precoBolsa >= 50 && precoBolsa <= 80) {
			System.out.println("O preço está dentro do orçamento de Pedro");
		} else {
			System.out.println("O preço está fora do orçamento de Pedro");
		}
	
	}
}
