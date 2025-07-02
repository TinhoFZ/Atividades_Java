package hashmap;

import java.util.*;

// Use only a List<String> to input several names and find which names are repeated.

public class Atv7 {

	Scanner input = new Scanner(System.in);
	
	public void rodar() {
		List<String> palavras = new ArrayList<>();
		
		System.out.println("Quantas palavras deseja escrever?");
	    int quantidade = input.nextInt();
	    input.nextLine(); 

	    for (int i = 0; i < quantidade; i++) {
	        System.out.println("Escreva uma palavra:");
	        String palavra = input.nextLine();
	        palavras.add(palavra);
	    }
	    
	    HashMap <String, Integer> resultado = contar(palavras);
	    System.out.println(resultado);
	}
	
	public HashMap<String, Integer> contar(List<String> palavras) {
		HashMap <String, Integer> contador = new HashMap<>();
		
		for (String palavra : palavras) {
			contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
		}
		return contador;
	}
}
