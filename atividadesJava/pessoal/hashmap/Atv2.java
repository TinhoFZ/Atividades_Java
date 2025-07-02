package hashmap;

import java.util.*;

//Description: Given an array of integers, use a HashMap to find and print all duplicates.
//Example Input: [1, 2, 3, 2, 4, 1]
//Expected Output: 1 and 2 are duplicates

public class Atv2 {

	public static Scanner input = new Scanner(System.in);

	public void rodar() {
		HashMap<Integer, String> resultado = new HashMap<>();
		System.out.println("Quantos números deseja usar?");
		int quantidade = input.nextInt();
		// O número do array vai ser escolhido pelo usuário
		int[] numeros = new int[quantidade];
		
		for(int i = 0; i < quantidade;i++) {
			System.out.println("Qual o " + (i + 1) + "° número?");
			
			numeros[i] = input.nextInt();
		}
		
		resultado = procurarDuplicatas(numeros);
		System.out.println(resultado);
	}
	
	public HashMap<Integer, String> procurarDuplicatas(int[] numeros) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		for(int numero : numeros) {
			// Se já existir significa que é duplicado
			if(map.containsKey(numero)) {
				map.put(numero, "Duplicado");
			} else {
				map.put(numero, "Não duplicado");
			}
		}
		return map;
	}
}
