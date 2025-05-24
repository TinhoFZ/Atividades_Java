package atividade_2025_05_15_1;

import java.util.Scanner;

public class Atv2 {

static Scanner teclado = new Scanner(System.in);	

public static double salarioBase, salarioGratificacao, salarioTotal;

	public static void calcularSalario() {
		
		System.out.println("Qual seu salario base?");
		salarioBase = teclado.nextDouble();
		
		// Gratificação sobre salario base, imposto sobre o total (base + gratificação)
		salarioGratificacao = salarioBase * 1.10;
		salarioTotal = salarioGratificacao * 0.79;

		System.out.println("O seu salário base com gratificação é: " + salarioGratificacao + " | O seu salario total é: " + salarioTotal);
	}
}
