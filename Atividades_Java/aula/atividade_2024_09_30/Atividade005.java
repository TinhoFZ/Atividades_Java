package atividade_2024_09_30;

import java.util.Scanner;

public class Atividade005 {

	public static void main(String[] args) {

		double salarioHora;
		double horasTrabalhadas;
		double salarioTotal;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Quanto você ganha por hora?");
		salarioHora = teclado.nextDouble();
		
		System.out.println("Quantas horas você trabalha por mês?");
		horasTrabalhadas = teclado.nextDouble();
		
		salarioTotal = salarioHora * horasTrabalhadas;
		
		System.out.println("Você ganha um total de: " + salarioTotal);
	}
}