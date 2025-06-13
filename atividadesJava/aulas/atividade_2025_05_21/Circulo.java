package atividade_2025_05_21;

import java.util.Scanner;

public class Circulo {

static Scanner teclado = new Scanner(System.in);

public static double raio, area, perimetro;

	public static void circulo() {
		System.out.println("Qual o raio do círculo?");
		raio = teclado.nextDouble();
		calcularArea();
	}
	
	public static void calcularArea() {
		// Math.pow == potência (base, expoente)
		area = 3.14 * Math.pow(raio, 2);
		System.out.println("A área do círculo é: " + area);
		calcularPerimetro();
	}
	
	public static void calcularPerimetro() {
		perimetro = 2 * 3.14 * raio;
		System.out.println("O perímetro do circulo é: " + perimetro);
	}
}
