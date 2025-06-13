package atividade_2025_05_15_1;

import java.util.Scanner;

public class Atv5 {

static Scanner teclado = new Scanner(System.in);	

public static double horas, horasExtra, salarioHora, salarioTotal, salarioExtra;

	public static void calcularHoras() {
		System.out.println("Quantas horas são trabalhadas por semana?");
		horas = teclado.nextInt();
		
		System.out.println("Quanto ganha por hora?");
		salarioHora = teclado.nextInt();
		
		salarioExtra = salarioHora / 2 * (horas - 40);
		
		if (salarioExtra > 0) {
			salarioTotal = (40 * salarioHora + salarioExtra) * 4;
		} else {
			salarioTotal = 40 * salarioHora * 4;
		}
		
		System.out.println("Seu salário total ao mês é: " + salarioTotal);
	}
}
