package atividade_2025_05_15_2;

import java.util.Scanner;

public class Atv2 {

static Scanner teclado = new Scanner(System.in);

public static double deposito, rendimento;

	public static void calcularPoupanca() {
		System.out.println("Quanto deseja depositar?");
		deposito = teclado.nextDouble();
		
		rendimento = deposito * 1.07;
		System.out.println("Após um mês o rendimento foi de: " + rendimento);
	}
}