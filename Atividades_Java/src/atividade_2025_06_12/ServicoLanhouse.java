package atividade_2025_06_12;

import java.util.Scanner;

public class ServicoLanhouse {
public static Scanner input = new Scanner(System.in);

private static String [] nomeCliente = new String[255];
private static boolean [] xerox = new boolean [255], impressao = new boolean [255], manutencao = new boolean [255];
					// iMostrar foi criado por conta de um erro com uma variável local + if else
private static int quantidadeClientes = 0, escolha, iMostrar;
	
	public static void escolherServico() {
		System.out.println("\n Qual seu nome?");
		nomeCliente[quantidadeClientes] = input.nextLine();
		quantidadeClientes ++;
		
		for (int i = 0; i < 4; i ++) {
			System.out.println("Que serviço deseja? \n [1] Xerox \n [2] Impressão \n [3] Manutenção \n [4] Continuar");
			try {
				escolha = input.nextInt();
				input.nextLine();
			} catch (Exception e) {
				System.out.println("Insira um valor válido");
				i --;
			}
			
			switch (escolha) {
			case 1:
				if (xerox[quantidadeClientes] == false) {
					xerox[quantidadeClientes] = true;
					System.out.println("Serviço escolhido com sucesso!");
				} else {
					System.out.println("você já escolheu esse serviço!");
					i--;
				}
				break;
			case 2:
				if (impressao[quantidadeClientes] == false) {
					impressao[quantidadeClientes] = true;
					System.out.println("Serviço escolhido com sucesso!");
				} else {
					System.out.println("você já escolheu esse serviço!");
					i--;
				}
				break;
			case 3:
				if (manutencao[quantidadeClientes] == false) {
					manutencao[quantidadeClientes] = true;
					System.out.println("Serviço escolhido com sucesso!");
				} else {
					System.out.println("você já escolheu esse serviço!");
					i--;
				}
				break;
			case 4:
				// Caso o usuário não tenha escolhido nada ele precisará confirmar que deseja continuar
				if (xerox[quantidadeClientes] == false && impressao[quantidadeClientes] == false
				&& manutencao[quantidadeClientes] == false) {
				System.out.println("Você ainda não comprou nada, deseja continuar? \n [1] Sim \n [2] Não");
				int escolha = input.nextInt();
				input.nextLine();
					if (escolha == 1) {
						mostrarClientes();
					} else {
						escolherServico();
					}
				} 
				mostrarClientes();
				break;
			}
		}
	}
	
	private static void mostrarClientes() {
		for (iMostrar = 0; iMostrar < quantidadeClientes; iMostrar++) {
		System.out.print(nomeCliente[iMostrar] + ": ");
			}
		
			if (xerox[iMostrar] == true) {
			System.out.print(" Xerox,");
			} if (impressao[iMostrar] == true) {
			System.out.print(" Impressão,");
			} if (manutencao[iMostrar] == true) {
			System.out.print(" Manutenção");
			} else if (xerox[quantidadeClientes] == false && impressao[quantidadeClientes] == false
			&& manutencao[quantidadeClientes] == false) {
			System.out.print ("O usuário não escolheu nenhum serviço");
			} 
			System.out.println("\n Esses foram todos os usuários. \n------------------------------------");
		escolherServico();
	}
}
