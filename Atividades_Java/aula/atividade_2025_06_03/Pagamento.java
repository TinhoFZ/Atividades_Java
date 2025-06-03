package atividade_2025_06_03;

import java.util.Scanner;

public class Pagamento {
	
public static Scanner teclado = new Scanner(System.in);

public static int codigo;
public static double preco, pagamento;


	public static void escolherPagamento() {
		
		System.out.println("Qual o preço do produto?");
		preco = teclado.nextDouble();
		
		System.out.println("Qual o código? \n [1] À vista em dinheiro ou cheque, recebe 10% de desconto \n"
				+ "[2] À vista no cartão de crédito, recebe 15% de desconto \n"
				+ "[3] Em duas vezes, preço normal de etiqueta sem juros \n"
				+ "[4] Em duas vezes, preço normal de etiqueta mais juros de 10%");
		codigo = teclado.nextInt();
	}
	
	public static void efetuarPagamento() {
		
		switch (codigo) {
		case 1:
			pagamento = preco * 0.9;
			System.out.println("Você deverá pagar R$ " + pagamento);
			break;
		case 2:
			pagamento = preco * 0.85;
			System.out.println("Você deverá pagar R$ " + pagamento);
			break;
		case 3:
			pagamento = preco / 2;
			System.out.println("Você deverá pagar 2 vezes R$ " + pagamento);
			break;
		case 4:
			pagamento = preco * 1.1 / 2;
			System.out.println("Você deverá pagar 2 vezes R$ " + pagamento);
			break;
			default :
				System.out.println("Valor inserido inválido");
		}
	}
}
