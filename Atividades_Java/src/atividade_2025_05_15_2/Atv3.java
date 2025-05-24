package atividade_2025_05_15_2;

import java.util.Scanner;

public class Atv3 {

static Scanner teclado = new Scanner(System.in);

public static double [] produto = new double[8];
public static int escolha;

	public static void calcularProduto() {
		System.out.println("Escolha um dos produtos: \n"
				+ " [0]AÇUCAR \n"
				+ " [1]BANHA \n"
				+ " [2]BATATA INGLESA \n"
				+ " [3]BATATA DOCE \n"
				+ " [4]BISCOITO DE POLVILHO \n"
				+ " [5]BOLACHA DOCE ( Tipo maisena) \n"
				+ " [6]BOLACHA SALGADA (Tipo cracker)\n"
				+ " [7]CAFÉ");
		escolha = teclado.nextInt();
		
		System.out.println("Qual o preço?");
		produto[escolha] = 1.55 * teclado.nextDouble();
		
		System.out.println("Agora o produto custa " + produto[escolha] + "!");
		
	}
}