package atividade_2025_05_13;

import java.util.Scanner;

public class Atv4 {

public static double[] numero = new double[20];

public static Scanner teclado = new Scanner(System.in);

	public static void filtrarNumeros() {
		for (int i = 0; i < 20; i ++) {
			
		System.out.println("Insira o " + (i + 1) + "° número:");
		numero[i] = teclado.nextDouble();
		}
		for (int i = 0; i < 20; i ++) {
			
			if (numero[i] > 8) {
				System.out.println("O número " + numero[i] + " é maior que 8");
			}
		}
	}
}
