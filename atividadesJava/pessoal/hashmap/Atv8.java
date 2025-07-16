package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

//Crie um programa que receba várias palavras e agrupe elas de acordo com o número de letras. O resultado será um HashMap<Integer, List<String>>, onde:
//    A chave representa o tamanho da palavra (quantidade de letras)
//    O valor é uma lista com todas as palavras desse tamanho
    
public class Atv8 {
	public void rodar() {
		Scanner input = new Scanner(System.in);
		HashMap<Integer, List<String>> mapa = new HashMap<>();
		
		System.out.println("Digite uma palavra:");
		for (int i = 0; i < 5; i ++) {
			String palavra = input.nextLine();
			int tamanho = palavra.length();
			
			if(!mapa.containsKey(tamanho)) {
				mapa.put(tamanho, new ArrayList<>());
			}
			mapa.get(tamanho).add(palavra);
		}
		System.out.println(mapa);
		input.close();
	}
}
