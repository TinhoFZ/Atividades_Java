package main;

import java.util.Scanner;

public class Main {

static Scanner teclado = new Scanner(System.in);
	
private static int escolha;
	
	public static void main(String[] args) {
		
		System.out.println("deseja visualizar a atividade de que data? \n [1] 2025/05/13 \n [2] 2025/05/14 (Incompleta) \n [3] 2025/05/15 (parte 1) \n [4] 2025/05/15 (parte 2) \n [5] 2025/05/20 \n [6] 2025_05_21 \n [0] Sair");
		escolha = teclado.nextInt();
		
		switch(escolha) {
		
		case 0:
			System.exit(0);
			break;
			
		case 1:
			atividade_2025_05_13.Main.main(null);
			
			break;
			
		case 2:
			atividade_2025_05_14.Main.main(null);
			break;
			
		case 3:
			atividade_2025_05_15_1.Main.main(null);
			break;
			
		case 4:
			atividade_2025_05_15_2.Main.main(null);
			break;
			
		case 5:
			atividade_2025_05_20.Main.main(null);
			break;
			
		case 6:
			atividade_2025_05_21.Main.main(null);
			break;
			
			default:
				System.out.println("Valor inválido");
		}
		
	}

}
