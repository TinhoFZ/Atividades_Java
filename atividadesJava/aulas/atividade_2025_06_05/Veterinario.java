 package atividade_2025_06_05;
import java.util.Scanner;

public class Veterinario {
	public static Scanner input = new Scanner(System.in);
	public static String[] especialidade = new String[10];
	public static String[] nomeV = new String[10];
	public static String[] sexoV = new String[10];
	public static String[] cpfV = new String[10];
	public static String cpfVConsulta;
	public static int id = 0, escolha;
;
	
	public static void cadastrarVeterinario() {
		System.out.println("Qual seu nome?");
			nomeV[id] = input.next();
		System.out.println("Qual seu cpf?");
			cpfV[id] = input.next();
		System.out.println("Qual seu sexo?");
			sexoV[id] = input.next();
		System.out.println("Qual sua especialidade?");
			especialidade[id] = input.next();
		id++;
		System.out.println("Deseja ver relatorios?? [1] Sim | [2] Não");
		escolha = input.nextInt();
		
		switch (escolha) {
		case 1:
			System.out.println(Consulta.informacaoConsulta);
			break;
		case 2:
			Recepicionista.cadastrar();
		}
		Recepicionista.cadastrar();
	}
	
	public static void logarVeterinario() {
		System.out.println("Qual seu cpf?");
		cpfVConsulta = input.nextLine();
		
		for (int i = 0; i < Recepicionista.id; i ++) {
			
			if (cpfVConsulta.equals(cpfV[i])) {
				System.out.println(Consulta.informacaoConsulta);
			}
		}
	}
}
