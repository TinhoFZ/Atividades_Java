package atividade_2025_06_05;

import java.util.Scanner;


public class Cliente {

	public static Scanner input = new Scanner(System.in);
	
	public static String[] nomeC = new String[10];
	public static String[] cpfC = new String[10];
	public static String[] sexoC = new String[10];
	public static int[] idadeC = new int[10];
	public static String cpfCConsulta;
	public static int id = 0, escolha;

	

	public static void cadastrarCliente() {

		System.out.println("Qual seu nome?");
			nomeC[id] = input.next();
		System.out.println("Qual seu cpf?");
			cpfC[id] = input.next();
		System.out.println("Qual seu sexo?");
			sexoC[id] = input.next();
			
			id++;
		
		System.out.println("Deseja cadastrar seu pet? [1] Sim | [2] Não | [3] Marcar consulta");
		escolha = input.nextInt();
		switch (escolha) {
		case 1:
			Animal.informarAnimal();
			break;
		case 2:
			Recepicionista.cadastrar();
		case 3: Consulta.marcarConsulta();
		}
	}
	
	public static void logarCliente() {
		System.out.println("Qual seu cpf?");
		cpfCConsulta = input.nextLine();
		
		for (int i = 0; i < Recepicionista.id; i ++) {
			
			if (cpfCConsulta.equals(cpfC[i])) {
				Animal.informarAnimal();
			}
		}
	}

}