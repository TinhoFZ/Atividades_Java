package atividade_2025_05_15_2;

import java.util.Scanner;

public class Atv1 {

static Scanner teclado = new Scanner(System.in);

public static double real, dolar, conversaoDolar;

	public static void conversaoRealDolar() {
		
		System.out.println("Qual o valor atual da conversão do real para dolar?");
		conversaoDolar = teclado.nextDouble();
		System.out.println("Quantos dolares deseja converter?");
		dolar = teclado.nextDouble();
		
		real = dolar * conversaoDolar;
		
		System.out.println(dolar + " US$ serão convertidos em " + real + " R$");
		
		
	}

}
