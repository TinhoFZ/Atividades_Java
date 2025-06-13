package atividade_2025_05_15_2;

import java.util.Scanner;

public class Main {

public static int escolha;

static Scanner teclado = new Scanner(System.in);
	
Atv1 conversao = new Atv1();
Atv2 poupanca = new Atv2();
Atv3 produtos = new Atv3();

	public static void main(String[] args) {

		System.out.println("Qual atividade deseja visualizar? \n [1] para converter dolar em real. \n [2] para calcular rendimento."
				+ "\n [3] para aumentar o preço de um produto.");
		escolha = teclado.nextInt();
		
		switch (escolha) {
		case 1:
			Atv1.conversaoRealDolar();
		break;
		
		case 2:
			Atv2.calcularPoupanca();
		break;
		
		case 3:
			Atv3.calcularProduto();
		break;

		default: 
			System.out.println("Valor inválido.");
			
		}
	}

}
