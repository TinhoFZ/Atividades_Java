package atividade_2025_05_20;

import java.util.Scanner;

public class Atividade3 {

static Scanner teclado = new Scanner(System.in);

public static double preco;

	public static void calcularCarro() {
		
		System.out.println("Qual o valor do carro?");
		// 1.73 == porcentagem do distribuidor + impostos
		preco = teclado.nextDouble() * 1.73;
		
		System.out.println("O custo final do seu carro será: R$ " + preco);
	}
}
