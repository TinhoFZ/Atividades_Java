package atividade_2025_06_03;

import java.util.Scanner;

public class CalculoInteiro {

public static Scanner teclado = new Scanner(System.in);

public static int A, B, C;

	public static void receberNumeros() {
		System.out.println("Qual o valor de A?");
		A = teclado.nextInt();
		
		System.out.println("Qual o valor de B?");
		B = teclado.nextInt();
		
		calcularNumeros();
	}
	
	public static void calcularNumeros() {
		if (A == B) {
			C = A + B;
			System.out.println("O valor final é: " + C);
		} else {
			C = A * B;
			System.out.println("O valor final é: " + C);
		}
	}
}
