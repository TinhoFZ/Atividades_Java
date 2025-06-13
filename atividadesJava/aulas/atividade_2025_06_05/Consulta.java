package atividade_2025_06_05;

import java.util.Scanner;

public class Consulta {

public static Scanner input = new Scanner(System.in);

public static String [] informacaoConsulta = new String[10];
public static String cpfConsulta, motivo, data, animalEscolhido, preco;
public static int dia, mes, ano, idConsulta = 0;

	public static void marcarConsulta() {
		
		System.out.println("Qual o seu cpf?");
		cpfConsulta = input.nextLine();
		
		// Se o cpf inserido for igual a algum cpf de cliente
		
		for (int i = 0; i < Recepicionista.id; i ++) {
			
			if (cpfConsulta.equals(Cliente.cpfC[i])) {
				
				System.out.println(Animal.nomeAnimal + "Para qual deles é a consulta?");
				animalEscolhido = "\n O animal escolhido foi: " +  input.nextLine();
				
				System.out.println("Qual o dia, mês e ano da consulta?");
				dia = input.nextInt();
				mes = input.nextInt();
				ano = input.nextInt();
				input.nextLine();
				
				data = "\n A data da tua consulta é: " + dia + "/" + mes + "/" + ano;
				
				System.out.println("Para o que é a consulta?");
				motivo = "\n A consulta foi feita para: " + input.nextLine();
				
				
				System.out.println("Qual o preço da consulta?");
				preco = "\n O preço da consulta é: " + input.nextDouble();
				
				
				informacaoConsulta[idConsulta] = animalEscolhido + motivo + data + preco;
				idConsulta ++;
			}
		}
	}
}	