package atividade_2025_05_21;

import java.util.Scanner;

public class Paciente {

static Scanner teclado = new Scanner(System.in);

public static String nome;
public static int i, idade, escolha, numeroHistorico = 0;
public static String [] historico = new String[100];
public static int [] dia = new int [100], mes = new int[100], ano = new int[100];

	public static void informarPaciente() {
		System.out.println("Qual o nome do paciente?");
		nome = teclado.nextLine();
		
		System.out.println("Qual a idade do paciente?");
		idade = teclado.nextInt();
		
		escolha();
		}
	
	public static void escolha() {
		System.out.println("[1] Visualizar o histórico | [2] Registrar no histórico | [0] Sair");
		escolha = teclado.nextInt();
		switch(escolha) {
		case 0:
			System.exit(0);
		break;
		
		case 1:
			visualizarHistorico();
		break;
		
		case 2: 
			registrarHistorico();
		break;
		
		default:
			System.out.println("Valor inserido inválido");
			escolha();
		}
	}
	
	public static void registrarHistorico() {
		
		System.out.println("Adicione a data da consulta ao histórico: ");
			
		System.out.println("Dia:");
		dia[i] = teclado.nextInt();
			
		System.out.println("Mês:");
		mes[i] = teclado.nextInt();
			
		System.out.println("Ano:");
		ano[i] = teclado.nextInt();
			
		historico[i] = dia[i] + "/" + mes[i] + "/" + ano[i];
		numeroHistorico = numeroHistorico + 1;
		i ++;
		
		escolha();
	}
	public static void visualizarHistorico() {
		System.out.println("O histórico do do paciente é: ");
		for (int i = 0; i < numeroHistorico; i ++) {
			System.out.println(historico[i]);
		}
		escolha();
	}

}
