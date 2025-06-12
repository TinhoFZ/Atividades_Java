package atividade_2025_06_12;

import java.util.Scanner;

public class SimulacaoFamilias {
public static Scanner input = new Scanner(System.in);

private static int [] quantidadeFamilia = new int [10];

	public static void informarFamilia() {
		for (int i = 0; i < 10; i ++) {
			System.out.println("Quantas pessoas tem família " + (i + 1) + "?");
			try {
			quantidadeFamilia[i] = input.nextInt();
			} catch (Exception e) {
				System.out.println("Insira um valor válido, família " + (i + 1) + " não será contada.");
				input.next();
			}
		}
		mostrarFamilia();
	}
	
	private static void mostrarFamilia() {
		for (int i = 0; i < 10; i ++) {
			if (quantidadeFamilia[i] > 5)
			System.out.println("Família " + (i + 1) + " tem mais de 5 pessoas.");
		}
	}
}
