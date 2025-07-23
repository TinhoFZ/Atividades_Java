package atividade_2025_07_23;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		rodarAtividades();
	}
	
	public static void rodarAtividades() {
		Scanner input = new Scanner(System.in);
		
		ImprimirNumeros mesas = new ImprimirNumeros();
		SomarNumeros soma = new SomarNumeros();
		Contagem contagem = new Contagem();
		Tabuada tabuada = new Tabuada();
		CalcularFatorial fatorial = new CalcularFatorial();
		CalcularImpar impar = new CalcularImpar();
		ContarNegativos negativos = new ContarNegativos();
		ContarEstoque estoque = new ContarEstoque();
		
		System.out.println("Que atividade deseja ver? \n [1] [2] [3] [4] [5] [6] [7] [8]");
		int escolha = 0;
		try {
			escolha = input.nextInt();
		} catch(InputMismatchException ime) {
			System.out.println("Insira um valor válido!");
			System.exit(0);
		}
		
		switch(escolha) {
		case 1:
			mesas.rodar();
			break;
		case 2:
			soma.rodar();
			break;
		case 3:
			contagem.rodar();
			break;
		case 4:
			tabuada.rodar();
			break;
		case 5:
			fatorial.rodar();
			break;
		case 6:
			impar.rodar();
			break;
		case 7:
			negativos.rodar();
			break;
		case 8:
			estoque.rodar();
			break;
			default:
				System.out.println("Insira um valor válido!");
				System.exit(0);
		}
		input.close();
	}
}
