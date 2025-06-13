package atividade_2025_05_15_1;

import java.util.Scanner;

public class Main {

public static int escolha;

static Scanner teclado = new Scanner(System.in);
	
Atv1 metro_centimetro = new Atv1();
Atv2 salario = new Atv2();
Atv3 idade = new Atv3();
Atv4 emprestimo = new Atv4();
Atv5 horaExtra = new Atv5();
Atv6 vendasEmpresa = new Atv6();

	public static void main(String[] args) {

		System.out.println("Qual atividade deseja visualizar? \n [1] para converter metro em centimetro. \n [2] para calcular salário."
				+ "\n [3] para calcular a maioridade. \n [4] para calcular empréstimo. \n [5] para calcular hora extra. \n [6] para calcular ganhos de uma empresa.");
		escolha = teclado.nextInt();
		
		switch (escolha) {
		case 1:
			Atv1.converterMetro();
		break;
		
		case 2:
			Atv2.calcularSalario();
		break;
		
		case 3:
			Atv3.calcularMaioridade();
		break;
		
		case 4:
			Atv4.calcularEmprestimo();
		break;
		
		case 5:
			Atv5.calcularHoras();
		break;
		
		case 6:
			Atv6.calcularVendas();
		break;
		
		default: 
			System.out.println("Valor inválido.");
			
		}
	}

}
