package atividade_2025_06_12;

import java.util.Scanner;

public class CalculoSalario {
public static Scanner input = new Scanner(System.in);
	
private static double salario, valorImposto, valorGratificacao, salarioFinal;

	public static void informarSalario() {

		System.out.println("Qual o seu salário?");
		try {
			salario = input.nextDouble();
		} catch (Exception e) {
			System.out.println("Insira um valor válido.");
		}
		
		calcularSalario();
	}
	
	public static void calcularSalario() {
		valorGratificacao = salario * 0.08;
		
		if (salario > 3000) {
			valorImposto = salario * 0.11;
		} else if (salario > 1500) {
			valorImposto = salario * 0.05;
		}
		salarioFinal = salario + valorGratificacao - valorImposto;
		
		System.out.println("Seu salário final foi: " + salarioFinal + "\n Gratificação de: R$" 
		+ valorGratificacao + "\n Imposto: R$" + valorImposto + "\n ");
	}
}
