package atividade_2024_09_30;

import java.util.Scanner;

public class Atividade002 {

	public static void main(String[] args) {
		
		int anoAtual;
		int anoNascimento;
		int idade;

		Scanner teclado = new Scanner(System.in);
		
		anoAtual = teclado.nextInt();
		anoNascimento = teclado.nextInt();
		
		idade = anoAtual - anoNascimento;

		if(idade >= 18) {
		System.out.println("Você pode votar");
		} else {
			System.out.println("você não pode votar com " + idade + " anos");
		}
		
	}
}
