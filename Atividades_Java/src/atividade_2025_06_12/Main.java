package atividade_2025_06_12;

import java.util.Scanner;

public class Main {
	
public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Que atividade deseja visualizar? \n [1] Calcuar salário \n [2] Comprar combustível "
				+ "\n [3] Simular famílias \n [4] Usar lanhouse \n [13] Sair");
		int escolha = input.nextInt();
		
		switch (escolha) {
		case 1:
			CalculoSalario.informarSalario();
			break;
		case 2:
			CompraCombustivel.informarCombustivel();
			break;
		case 3:
			SimulacaoFamilias.informarFamilia();
			break;
		case 4:
			ServicoLanhouse.escolherServico();
			break;
		case 13:
			System.exit(0);
			break;
			default:
				System.out.println("Você inseriu um valor inválido!");
				System.exit(0);
		}
	}

}
