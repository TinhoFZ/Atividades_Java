package atividade_2025_05_21;

// necessário para Arrays.fill
import java.util.Arrays;
import java.util.Scanner;

public class Livro {

static Scanner teclado = new Scanner(System.in);

public static String [] titulo = new String[100], autor = new String[100];
public static int [] pagina = new int[100], livrosEmprestados = new int[100];
public static boolean [] disponivel = new boolean[100];
public static int escolha, numeroLivros = 0;

	public static void escolha() {
		
		// Vai preencher todos os arrays de "disponivel" com "true"
		Arrays.fill(disponivel, true);

		System.out.println(" [1] Armazenar livro \n [2] Pegar livro emprestado \n [3] Devolver livro \n [4] Ver disponibilidade \n [0] Sair");
		escolha = teclado.nextInt();
		
		switch (escolha) {
		case 1:
			armazenarLivro();
			break;
		
		case 2:
			pegarLivro();
			break;
			default:
				System.out.println("Valor inserido invalido.");
				
		}
	}
	
	public static void armazenarLivro() {
		System.out.println("Qual o título do livro?");
		titulo[numeroLivros] = teclado.nextLine();
		
		System.out.println("Qual o nome do autor?");
		autor[numeroLivros] = teclado.nextLine();
		
		System.out.println("Quantas páginas tem o livro?");
		pagina[numeroLivros] = teclado.nextInt();
		
		escolha();
	}
	
	public static void pegarLivro() {
		
		System.out.println("Qual livro deseja pegar? Temos " + numeroLivros + " livros disponíveis");
		escolha = teclado.nextInt();
		
		if (disponivel[escolha] == true) {
			System.out.println("Você recebeu o livro!");
			disponivel[escolha] = false;
		} else {
			System.out.println("O livro não está disponível");
		}
	}
	
	public static void devolverLivro() {
		
	}
	
}