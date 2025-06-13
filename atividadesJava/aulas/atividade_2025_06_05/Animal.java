package atividade_2025_06_05;

import java.util.Scanner;

// Necessário para usar Arrays.fill
import java.util.Arrays;

public class Animal {

public static Scanner input = new Scanner(System.in);
	
public static String [] nomeAnimal = new String[10], sexoAnimal = new String[10],
especie = new String[10], raca = new String[10], clienteAnimais = new String[10];
// Rodou chega se o código já foi rodado uma vez
public static boolean rodou = false;
public static int [] idadeAnimal = new int [10];
public static String cpfConsulta;
public static int numeroAnimal = 0;

	public static void informarAnimal() {
		
		if (rodou == false) {
			// Se o código ainda não foi usado todos os valores do array vão ser nada
			Arrays.fill(clienteAnimais, "Seus animais são: \n");
			rodou = true;
		}
		
		System.out.println("Cadastre seu pet!");
		System.out.println("---------------------------------");
		System.out.println("Qual o seu CPF?");
		cpfConsulta = input.nextLine();
		System.out.println(Cliente.id);
		
		
		for (int i = 0; i < Cliente.id; i ++) {
			
			if (cpfConsulta.equals(Cliente.cpfC[i])) {
				
				System.out.println("Qual o nome do seu pet?");
				nomeAnimal[Cliente.id] = input.nextLine();
				
				System.out.println("Qual a especie do seu pet?");
				especie[Cliente.id] = input.nextLine();
				
				System.out.println("Qual a raça do seu pet?");
				raca[Cliente.id] = input.nextLine();
				
				System.out.println("Qual o sexo do seu pet?");
				sexoAnimal[Cliente.id] = input.nextLine();
				
				System.out.println("Quantos anos tem seu pet?");
				idadeAnimal[Cliente.id] = input.nextInt();
				input.nextLine();
			
				
				
				
				clienteAnimais[i] = clienteAnimais[i] + nomeAnimal[Cliente.id];
				Cliente.id++;
				Main.main(null);
			}
		}
		System.out.println("Cpf inserido é inválido!");
		Main.main(null);
	}
	
}
