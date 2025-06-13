package atividade_2025_06_05;

import java.util.Scanner;

public class Recepicionista {
	public static Scanner input = new Scanner(System.in);
	Cliente log = new Cliente();
	public static int logi;
	public static int id = 0;
	
	public static void iniciar() {
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("Bem-Vindo ao TINHOXV");
		System.out.println("---------------------------------");
		System.out.println("Campo de insercao:");
		System.out.println("");
		System.out.println("Inserir 1   |   Ir para cadastro");
		System.out.println("");
		System.out.println("Inserir 2   |   Sair");
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.print(": ");
			logi = input.nextInt();
			switch (logi) {
			case 1:
				cadastrar();
				break;
			case 2:
				System.exit(0);
				break;
				default:
					System.out.println("Essa opção não existe!");
			}
	}
	public static void cadastrar() {
		System.out.println("");
		System.out.println("");
		System.out.println("---------------------------------");
		System.out.println("TINHOXV - Cadastro");
		System.out.println("---------------------------------");
		System.out.println("Cadastrar como:");
		System.out.println("");
		System.out.println("Inserir 1     |     Cliente");
		System.out.println("");
		System.out.println("Inserir 2     |     Veterianario");
		System.out.println("");
		System.out.println("Inserir 3     |     Sair");
		System.out.println("---------------------------------");
		System.out.print(": ");
			logi = input.nextInt();
		switch (logi) {
		case 1: {
			Cliente.cadastrarCliente();
		}
		case 2: {
			Veterinario.cadastrarVeterinario();
		}
		case 3: {
			iniciar();
		}
		default:
			System.out.println("Essa opcao nao existe!");
			iniciar();
		}
	}
//	private static void logar() {
//		System.out.println("");
//		System.out.println("");
//		System.out.println("---------------------------------");
//		System.out.println("TINHOXV - Login");
//		System.out.println("---------------------------------");
//		System.out.println("Logar como:");
//		System.out.println("");
//		System.out.println("Inserir 1     |     Cliente");
//		System.out.println("");
//		System.out.println("Inserir 2     |     Veterianario");
//		System.out.println("");
//		System.out.println("Inserir 3     |     Sair");
//		System.out.println("---------------------------------");
//		System.out.print(": ");
//			logi = input.nextInt();
//			input.nextLine();
//		switch (logi) {
//		case 1: {
//			Cliente.logarCliente();
//		}
//		case 2: {
//			Veterinario.logarVeterinario();
//		}
//		case 3: {
//			iniciar();
//		}
//		default:
//			System.out.println("Essa opcao nao existe!");
//			iniciar();
//		}
}