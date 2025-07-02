package hashmap;

import java.util.*;

//Description: Input a string and use a HashMap to count how many times each character appears (excluding spaces).
//Example Input: "banana"
//Expected Output: {b=1, a=3, n=2}

public class Atv4 {

	
	public Scanner input = new Scanner(System.in);
	
	public void rodar() {
		System.out.println("Escreva uma palavra:");
		String palavra = input.nextLine();
		
		HashMap<String, Integer> resultado = contar(palavra);
		System.out.println(resultado);
	}
	
	public HashMap<String, Integer> contar(String palavra) {
		HashMap<String, Integer> map = new HashMap<>();
		
		String palavraCortada = palavra.replaceAll("\\s+", "");
		String[] letras = palavraCortada.split("");
		
		for(String letra : letras) {
			map.put(letra, map.getOrDefault(letra, 0) + 1);
		}
	return map;	
	}
	
}
