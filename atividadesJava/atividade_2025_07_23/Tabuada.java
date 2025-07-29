package atividade_2025_07_23;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Tabuada {
	public void rodar() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escolha um número!");
		try {
			int numero = input.nextInt();
			System.out.println("Tabuada do número:");
			for(int i = 1; i < 11; i ++) {
				System.out.println(numero * i);
			}
		} catch (InputMismatchException ime) {
			System.out.println("Valor inválido!");
		}
		input.close();
	}
}
