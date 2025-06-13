package atividade_2025_05_15_1;

import java.util.Scanner;

public class Atv4 {

static Scanner teclado = new Scanner(System.in);	

public static double salario, emprestimo;

	public static void calcularEmprestimo() {
		
		System.out.println("Qual o seu salário?");
		salario = teclado.nextDouble();
		
		System.out.println("Quanto de empréstimo?");
		emprestimo = teclado.nextDouble();
		
		if (emprestimo > salario * 0.15) {
			System.out.println("Empréstimo não pode ser concedido.");
		} else {
			System.out.println("Empréstimo pode ser concedido.");
		}
	}
}
