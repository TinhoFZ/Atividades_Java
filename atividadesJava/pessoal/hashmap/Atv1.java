package hashmap;

import java.util.*;

//Description: Given a sentence, count how many times each word appears.
//Example Input: "java is fun and java is powerful"
//Expected Output: {java=2, is=2, fun=1, and=1, powerful=1}

public class Atv1 {
	
	public Scanner input = new Scanner(System.in);
	
	public void rodar() {
		System.out.println("Digite uma frase: ");
		String frase = input.nextLine();
		
		HashMap<String, Integer> resultado = contagem(frase);
		
		System.out.println(resultado);
	}
	
	public HashMap<String, Integer> contagem(String frase) {
		
		HashMap<String, Integer> map = new HashMap<>();
		
		String[] palavras = frase.split(" ");
		
		// Vai fazer um loop, inserindo o valor do array "palavras[]" na variável "palavra" a cada loop
		for(String palavra : palavras) {
			// getOrDefault vai checar se a palavra já existe no hash map, retornando seu valor atual, se não existir vai retornar como 0
			map.put(palavra, map.getOrDefault(palavra, 0) + 1);
		}
		return map;
	}
}
