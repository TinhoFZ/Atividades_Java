package atividade_2025_06_03;

import java.util.Scanner;

public class EstadoCivil {

public static Scanner teclado = new Scanner(System.in);

public static String nome, sexo, estadoCivil;
public static int anos;

	public static void coletarInformacoes() {
		
		System.out.println("Insira seu nome");
		nome = teclado.nextLine();
		
		System.out.println("Qual o seu sexo?");
		sexo = teclado.nextLine();
		
		System.out.println("Qual seu estado civil?");
		estadoCivil = teclado.nextLine();
		
		if (sexo.equalsIgnoreCase("F") && estadoCivil.equalsIgnoreCase("casada")) {
			System.out.println("A quantos anos está casda?");
			anos = teclado.nextInt();
		}
	}
}
