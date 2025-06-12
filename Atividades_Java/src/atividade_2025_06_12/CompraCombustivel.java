package atividade_2025_06_12;

import java.util.Scanner;

public class CompraCombustivel {
public static Scanner input = new Scanner(System.in);

private static double litros, alcool = 3.79, diesel = 4.39, gasolina = 5.49, combustivelAtual;
private static String escolha;

	public static void informarCombustivel() {
		System.out.println("Qual combustível deseja comprar? \n [A] Alcool \n [D] Diesel \n [G} Gasolina");
		try {
			escolha = input.nextLine();
			
			System.out.println("Quantos litros deseja?");
			litros = input.nextDouble();
		} catch (Exception e) {
			System.out.println("Você inseriu um valor inválido");
		}
		
		calcularCombustivel();
	}
	
	private static void calcularCombustivel() {
		
		if (litros <= 0) {
			System.out.println("Insira um valor maior que '0'");
		}
		
		switch (escolha) {
		case "A":
		case "a":
			combustivelAtual = alcool;
			break;
		case "D":
		case "d":
			combustivelAtual = diesel;
			break;
		case "G":
		case "g":
			combustivelAtual = gasolina;
			break;
			default:
			System.out.println("Valor inserido inválido");
		}
		
		double precoFinal = litros * combustivelAtual;
		System.out.println("Você deverá pagar: " + precoFinal);		
	}
}
