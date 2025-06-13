package atividade_2025_05_21;

import java.util.Scanner;

public class Aluno {

static Scanner teclado = new Scanner(System.in);

public static String nome;
public static int matricula;
public static double nota1, nota2, nota3, nota4, notaMedia;

	public static void avaliarAluno() {
		System.out.println("Qual o nome do aluno?");
		nome = teclado.nextLine();
		
		System.out.println("Qual o núemro da matrícula?");
		matricula = teclado.nextInt();
		
		System.out.println("Qual a primeira nota do aluno?");
		nota1 = teclado.nextDouble();
		
		System.out.println("Qual a segunda nota do aluno?");
		nota2 = teclado.nextDouble();

		System.out.println("Qual a terceira nota do aluno?");
		nota3 = teclado.nextDouble();
		
		System.out.println("Qual a quarta nota do aluno?");
		nota4 = teclado.nextDouble();
		
		calcularMedia();
	}
	
	public static void calcularMedia() {
		
		notaMedia = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A nota média do aluno foi: " + notaMedia);
		
		aprovarAluno();
	}
	
	public static void aprovarAluno() {
		
		if (notaMedia >= 7) {
			System.out.println("O aluno foi aprovado");
		} else if (notaMedia < 7) {
			System.out.println("O aluno foi reprovado");
		}
	}
}
