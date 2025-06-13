package atividade_2025_06_03;

import java.util.Scanner;

public class Main {

public static int escolha;

public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Escolha a atividade que deseja realizar: \n [1] Checar estado civil \n [2] Calcular números inteiros \n [3] Calcular IMC \n [0] Sair");
		escolha = teclado.nextInt();
		
		switch (escolha) {
		case 0:
			System.exit(0);
		case 1:
			EstadoCivil.coletarInformacoes();
			break;
		case 2:
			CalculoInteiro.receberNumeros();
			break;
		case 3:
			CalculoIMC.receberMedidas();
			break;
		case 4:
			Pagamento.escolherPagamento();
			default: 
				System.out.println("Valor inserido inválido");
		}
	}

}
