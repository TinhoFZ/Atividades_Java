package atividade_2025_05_15_1;

import java.util.Scanner;

public class Atv6 {

static Scanner teclado = new Scanner(System.in);	

public static double salario, vendas, salarioTotal;

	public static void calcularVendas() {
		
		System.out.println("Qual seu salário fixo?");
		salario = teclado.nextDouble();
		
		System.out.println("Qual o valor das vendas?");
		vendas = 0.07 * teclado.nextDouble();
		
		if (vendas > 1500) {
			vendas = (vendas - 1500) * 0.03 + 1500;
		}
		
		salarioTotal = salario + vendas;
	
		System.out.println("O seu salário final será: " + salarioTotal);
	}
}
