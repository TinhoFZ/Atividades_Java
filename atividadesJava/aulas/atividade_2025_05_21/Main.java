package atividade_2025_05_21;

import java.util.Scanner;

public class Main {

static Scanner teclado = new Scanner(System.in);
public static int escolha;

	public static void main(String[] args) {

		System.out.println("Que atividade deseja visualizar? \n"
				+ " [1] Calcular circulo \n [2] Calcular retângulo \n [3] Aprovar Aluno \n [4] Histórico de paciente \n [5] Biblioteca digital \n [0] Sair");
		escolha = teclado.nextInt();
		
		switch(escolha) {
		case 0:
			System.exit(0);
			break;
		
		case 1:
			Circulo.circulo();
			break;
		
		case 2:
			Retangulo.retangulo();
			break;
		
		case 3:
			Aluno.avaliarAluno();
			break;
		
		case 4:
			Paciente.informarPaciente();
			break;
		
		case 5:
			Livro.escolha();
			break;
		
		default:
			System.out.println("Valor inserido inválido");
		}

	}

}
