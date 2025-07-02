package hashmap;

import java.util.*;

// Use a HashMap<Character, List<String>> to group words by their first letter.

public class Atv6 {

	public Scanner input = new Scanner(System.in);
	
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

	    HashMap<Character, List<String>> resultado = agruparLetra(palavras);
	    System.out.println(resultado);
	}
	
	public HashMap<Character, List<String>> agruparLetra(List<String> palavras) {
		
	    HashMap<Character, List<String>> agrupamento = new HashMap<>();
	    
	    for (String palavra : palavras) {
	        Character letra = palavra.charAt(0);
	        
	        if (!agrupamento.containsKey(letra)) {
	            agrupamento.put(letra, new ArrayList<>());
	        }
	        agrupamento.get(letra).add(palavra);
	    }
	    
	    return agrupamento;
	}
}
