package atividade_2025_05_20;

import java.util.Scanner;

public class Atividade2 {

static Scanner teclado = new Scanner(System.in);

public static int codigo;

	public static void escreverExtenso() {

		System.out.println("Escreva o código:");
		codigo = teclado.nextInt();
		
		switch (codigo){
		case 1:
			System.out.println("Um");
		break;
		
		case 2:
			System.out.println("Dois");
		break;
		
		case 3:
			System.out.println("Três");
		break;
		
		
		default:
			System.out.println("Código inválido");
			escreverExtenso();
		}
	}
}
