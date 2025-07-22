package atividade_2025_07_22;

import java.util.Scanner;
import java.util.HashMap;
import java.util.InputMismatchException;

public class TestarArrayAluno {
	
	private Scanner input = new Scanner(System.in);
	
	private Aluno[] turma = {
		new Aluno("João", 7, 8),
		new Aluno("Pedro", 5, 6.5),
		new Aluno("Leticia", 8, 6),
		new Aluno("Joaquim", 3, 5),
		new Aluno("Ester", 9, 10)
	};
	
	public void rodar() {
		HashMap<Integer, Runnable> acoes = new HashMap<>();
			acoes.put(1, () -> verTodosAlunos());
			acoes.put(2, () -> procurarAluno());
			acoes.put(3, () -> verAcimaDaMedia());
			acoes.put(4, () -> verAbaixoDaMedia());
			acoes.put(5, () -> System.exit(0));
		
		
		System.out.println("O que deseja fazer? \n [1] Ver todos os alunos \n [2] Procurar um aluno específico "
				+ "\n [3] Ver todos os alunos acima da média \n [4] Ver todos os alunos abaixo da média \n [5] Sair");
		int escolha = 0;
		
		try{
			escolha = input.nextInt();
		} catch(InputMismatchException ime) {
			System.out.println("Insira um valor válido!");
			System.exit(0);
		}
		
		acoes.get(escolha).run();
		rodar();
	}
	
	private void verTodosAlunos() {
		for(Aluno aluno : turma) {
			System.out.println("Nome: " + aluno.getNome() + " | Média: " + aluno.calcularMedia());
		}
	}
	
	private void procurarAluno() {
		System.out.println("Qual o id do aluno que deseja visualizar?");
		int id = 0;
		
		try{
			id = input.nextInt();
		} catch(InputMismatchException ime) {
			System.out.println("Insira um valor válido!");
			System.exit(0);
		}
		
		if(id < turma.length) {
			System.out.println("Nome: " + turma[id].getNome() + " | Média: " + turma[id].calcularMedia());
		} else {
			System.out.println("Esse aluno não existe!");
		}
	}
	
	private void verAcimaDaMedia() {
		int quantidade = 0;
		for(Aluno aluno : turma) {
			if(aluno.calcularMedia() >= 6) {
				System.out.println("Nome: " + aluno.getNome() + " | Média: " + aluno.calcularMedia());
				quantidade ++;
			}
		}
		System.out.println("Existem " + quantidade + " acima da media!");
	}
	
	private void verAbaixoDaMedia() {
		int quantidade = 0;
		for(Aluno aluno : turma) {
			if(aluno.calcularMedia() < 6) {
				System.out.println("Nome: " + aluno.getNome() + " | Média: " + aluno.calcularMedia());
				quantidade ++;
			}
		}
		System.out.println("Existem " + quantidade + " abaixo da media!");
	}
}
