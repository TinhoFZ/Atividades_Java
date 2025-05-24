package atividade_2025_05_13;

import java.util.Scanner;

public class Atv2 {

public static int quant1, quant2;
public static double valor1, valor2, IPI, total;	

public static Scanner teclado = new Scanner(System.in);
	
	public static void calcularIPI() {

		System.out.println("Qual o valor do primeiro produto?");
		valor1 = teclado.nextDouble();
		
		System.out.println("Qual a quantidade?");
		quant1 = teclado.nextInt();
		System.out.println("-------------------------------------");
		
		System.out.println("Qual o valor do segundo produto?");
		valor2 = teclado.nextDouble();
		
		System.out.println("Qual a quantidade?");
		quant1 = teclado.nextInt();
		
		total = (valor1 * quant1 + valor2 * quant2) * (15/100 + 1);
		System.out.println("O total gasto é: " + total);
	}
}
