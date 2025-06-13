package atividade_2025_05_15_1;

import java.util.Scanner;

public class Atv1 {
	
static Scanner teclado = new Scanner(System.in);	

	// ambos são double pois há alguns problemas quando convertendo metro em int
public static double metro, centimetro;

	public static void converterMetro() {
		
		System.out.println("Quantos metros deseja converter?");
		metro = teclado.nextDouble();
		

		centimetro = metro * 100;
		
		System.out.println(metro + " centimetros são iguais a: " + centimetro + " metros");
		
	}
}
