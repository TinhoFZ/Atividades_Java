package atividade_2025_05_13;

public class Main {

private static int escolha;
	
	public static void main(String[] args) {
		
		System.out.println("Qual atividade deseja visualizar? \n [1] calcular dias \n [2] calcular IPI \n [3] repertir texto \n [4] filtrar números \n [5] filtrar pessoas \n [0] sair");

		
		switch (escolha) {
		
		case 0:
			System.exit(0);
			break;
		
		case 1:
			Atv1.calcularDias();
			break;
		
		case 2:
			Atv2.calcularIPI();
			break;
			
		case 3:
			Atv3.repetirTexto();
			break;
			
		case 4:
			Atv4.filtrarNumeros();
			break;
			
		case 5:
			Atv5.filtrarPessoas();
			break;
			
		default:
			System.out.println("Valor inserido inválido");
		}
	}

}
