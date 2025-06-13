package atividade_2025_05_20;

import java.util.Scanner;

public class Atividade1 {

static Scanner teclado = new Scanner(System.in);

public static int numero1, numero2;

	public static void compararNumero() {
		
		System.out.println("Insira o primeiro número:");
		numero1 = teclado.nextInt();
		
		System.out.println("Insira o segundo número:");
		numero2 = teclado.nextInt();
		
		// Switch case não suportar boolean para comparar
		
		System.out.println("Os relacionamentos de ordens são: ==, !=, >, <, >=, <= | Aqui estão eles comparando os números:");
		if (numero1 == numero2) {
			System.out.println("Número 1 == Número 2");
		}
		if (numero1 != numero2) {
			System.out.println("Número 1 != Número 2");
		} 
		if (numero1 > numero2) {
			System.out.println("Número 1 > Número 2");
		} 
		if (numero1 < numero2) {
			System.out.println("Número 1 < Número 2");
		}
		if (numero1 >= numero2) {
			System.out.println("Número 1 >= Número 2");
		}
		if (numero1 <= numero2) {
			System.out.println("Número 1 <= Número 2");
		}
	}

}
