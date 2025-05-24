package atividade_2025_05_21;

import java.util.Scanner;

public class Retangulo {

static Scanner teclado = new Scanner(System.in);

public static double largura, altura, area, perimetro;

	public static void retangulo() {
		System.out.println("Qual a largura do retangulo?");
		largura = teclado.nextDouble();
		
		System.out.println("Qual a altura do retangulo?");
		altura = teclado.nextDouble();
		
		calcularArea();
	}

	public static void calcularArea() {
		// Math.pow == potência (base, expoente)
		area = altura * largura;
		System.out.println("A área do retangulo é: " + area);
		calcularPerimetro();
	}

	public static void calcularPerimetro() {
		perimetro = 2 * (altura + largura);
		System.out.println("O perímetro do retangulo é: " + perimetro);
	}

}
