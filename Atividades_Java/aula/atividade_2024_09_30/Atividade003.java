package atividade_2024_09_30;

import java.util.Scanner;

public class Atividade003 {

	public static void main(String[] args) {
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double mediaBimestre;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual a sua primeira nota?");
		nota1 = teclado.nextDouble();
		
		System.out.println("Qual a sua segunda nota?");
		nota2 = teclado.nextDouble();
		
		System.out.println("Qual a sua terceira nota?");
		nota3 = teclado.nextDouble();
		
		System.out.println("Qual a sua quarta nota?");
		nota4 = teclado.nextDouble();
		
		mediaBimestre = (nota1 + nota2 + nota3 + nota4) / 4;
	
		System.out.println("A nota final foi: " + mediaBimestre);
		
	}

}
