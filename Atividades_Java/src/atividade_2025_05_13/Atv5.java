package atividade_2025_05_13;

import java.util.Scanner;

public class Atv5 {

public static double[] alturaM = new double[10], alturaF = new double[10], menorAltura, maiorAltura;
public static String sexo;

public static Scanner teclado = new Scanner(System.in);

	public static void filtrarPessoas() {
		for (int i = 0; i < 10; i ++) {
		
		System.out.println("Qual seu sexo? ('M' para masculino, 'F' para feminino)");
		sexo = teclado.nextLine();
		
		if (sexo.equalsIgnoreCase("m")) {
			System.out.println("Qual sua altura? (use ',' ex: 1,86)");
			alturaM[i] = teclado.nextDouble();
		} else if (sexo.equalsIgnoreCase("f")) {
			System.out.println("Qual sua altura? (use ',' ex: 1,86)");
			alturaF[i] = teclado.nextDouble();
			} else {
				System.out.println("Valor inserido não é válido");
				System.exit(0);
			}
		}
		
	}
}
