package atividade_2025_05_13;

import java.util.Scanner;

public class Atv1 {

public static int dia, mes, ano, diasTotais;
	
public static Scanner teclado = new Scanner(System.in);
	
	public static void calcularDias() {
		System.out.println("Quantos você tem?");
		ano = teclado.nextInt();
		
		System.out.println("Quantos meses de idade você tem?");
		mes = teclado.nextInt();
		
		System.out.println("Quantos dias de idade você tem?");
		dia = teclado.nextInt();
		
		 ano = ano * 365;
		 mes = mes * 30;
		 diasTotais = ano + mes + dia;
		 
		 System.out.println("Você tem " + diasTotais + " dias de vida!");
	}
}
