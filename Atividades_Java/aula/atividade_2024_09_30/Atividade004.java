package atividade_2024_09_30;

import java.util.Scanner;

public class Atividade004 {

	public static void main(String[] args) {
		double metro;
		double centimetro;
		
		Scanner teclado = new Scanner(System.in);

		System.out.println("Qual metros você quer converter?");
		metro = teclado.nextDouble();
		
		centimetro = metro * 100;
		
		System.out.println(metro + " metros são iguais a " + centimetro + " centimetros.");
	}

}
