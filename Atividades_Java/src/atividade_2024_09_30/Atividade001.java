package atividade_2024_09_30;

import java.util.Scanner;

public class Atividade001 {

	public static void main(String[] args) {
		
		double primeiraNota;
		double segundaNota;
		double mediaNotas;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escreva a primeira nota do aluno");
		primeiraNota =  teclado.nextDouble();
		
		System.out.println("Escreva a segunda nota do aluno");
		segundaNota = teclado.nextDouble();
		
		mediaNotas = (primeiraNota + segundaNota) / 2;
		
		if(mediaNotas >= 6) {
			System.out.println("O aluno foi aprovado com uma média de: " + mediaNotas);
		} else {
			System.out.println("O aluno foi reprovado com uma média de: " + mediaNotas);
		}
		
	}
}

