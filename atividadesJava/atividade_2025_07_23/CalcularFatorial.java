package atividade_2025_07_23;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalcularFatorial {
	public void rodar() {
		Scanner input = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Escolha um número!");
		try {
			numero = input.nextInt();
			for(int i = numero - 1; i > 0; i --) {
				numero = numero * i;
			}
		} catch (InputMismatchException ime) {
			System.out.println("Valor inválido!");
		}
		
		System.out.println("O fatorial é: " + numero);
		input.close();
	}
}
