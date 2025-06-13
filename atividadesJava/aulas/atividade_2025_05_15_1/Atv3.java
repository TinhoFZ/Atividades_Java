package atividade_2025_05_15_1;

import java.util.Scanner;

public class Atv3 {

static Scanner teclado = new Scanner(System.in);	

public static String nome;
public static int idade, mes;
public static boolean maioridade;

	public static void calcularMaioridade() {
		
		System.out.println("Qual seu nome?");
		nome = teclado.nextLine();
		
		System.out.println("Qual seu ano de nascimento?");
		idade = 2025 - teclado.nextInt();
		
		System.out.println("Qual seu mes de nascimento? (em número)");
		mes = 5 - teclado.nextInt();
		
		if (mes >= 0) {
			idade ++;
		}
		
		if (idade >= 18) {
			System.out.println(nome + ", sua entrada foi permitida!");
		} else {
			System.out.println(nome + ", sua idade foi recusada.");
		}
	}
}
