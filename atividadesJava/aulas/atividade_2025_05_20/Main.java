package atividade_2025_05_20;

import java.util.Scanner;

public class Main {

static Scanner teclado = new Scanner(System.in);
	
public static int escolha1, escolha2;

	public static void main(String[] args) {


		
		System.out.println("Escolha uma atividade: \n [0] Sair \n [1] Comparar números \n [2] Escrever por extenso \n [3] Comprar carro \n [4] Usar banco");
		escolha1 = teclado.nextInt();
		
		switch (escolha1) {
		case 0:
			System.exit(0);
		break;
		
		case 1:
			Atividade1.compararNumero();
		break;
		
		case 2:
			Atividade2.escreverExtenso();
		break;
		
		case 3:
			Atividade3.calcularCarro();
		break;
		
		case 4:
			System.out.println("Deseja entrar como usuário normal [0] ou especial [1]?");
			escolha2 = teclado.nextInt();
			if(escolha2 == 0) {
				Atividade4.usarConta();
			}	else if(escolha2 == 1) {
				Atividade4_2.usarConta();
			}
		break;
		
		default:
			System.out.println("Valor inserido não válido");
		}
	}

}
