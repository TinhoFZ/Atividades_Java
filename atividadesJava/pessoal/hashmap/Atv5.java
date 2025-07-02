package hashmap;

import java.util.*;

//Description: Given a HashMap of <String, Integer>, invert it to <Integer, List<String>> to handle duplicate values.
//Example Input: {Ana=1, Bob=2, Carol=1}
//Expected Output: {1=[Ana, Carol], 2=[Bob]}

public class Atv5 {

	public Scanner input = new Scanner(System.in);
	
	public void rodar() {
		HashMap<String, Integer> normal = new HashMap<>();
		
		
		System.out.println("Quantos nomes deseja escrever?");
		int quantidade = input.nextInt();
		input.nextLine();
		
		for(int i = 0; i < quantidade;i++) {
			System.out.println("Escreva um nome");
			String nome = input.nextLine();
			
			System.out.println("Escreva um número");
			int numero = input.nextInt();
			input.nextLine();
			
			normal.put(nome, numero);
		}
		
		HashMap<Integer, List<String>> invertido = inverter(normal);
		System.out.println(invertido);
	}

	private HashMap<Integer, List<String>> inverter(HashMap<String, Integer> normal){
		HashMap<Integer, List<String>> invertido = new HashMap<>();
		String nome = "";
		int numero = 0;
		// Vai usar "entry" que pega ambos, key e values do HashMap "normal"
		for (HashMap.Entry<String, Integer> tudo : normal.entrySet()) {
			nome = tudo.getKey();
			numero = tudo.getValue();
			// Se o HashMap invertido ainda não contém um par com essa "key" vai criar um novo, junto de uma lista
			if (!invertido.containsKey(numero)) {
				invertido.put(numero, new ArrayList<>());
			}
			// Se já contém, vai apenas adicionar na lista, que será referido por sua "key"
			invertido.get(numero).add(nome);
		}
		
		return invertido;
	}
}
