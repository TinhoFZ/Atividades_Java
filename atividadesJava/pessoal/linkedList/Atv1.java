package linkedList;

import java.util.*;

public class Atv1 {
	
	private Node head;
	private int next;
	
	Scanner input = new Scanner(System.in);
	
	public void iniciar() {
		Node primeiro = new Node(3);
		Node segundo = new Node(7);
		Node terceiro = new Node(9);

		primeiro.next = segundo;
		segundo.next = terceiro;
		
		Node atual = primeiro;
		while (atual.next != null) {
			atual = atual.next;
		}
		
		
		LinkedList<Integer> numeros = new LinkedList<>();
		numeros.add(3);
		numeros.add(7);
		numeros.add(9);
		System.out.println(numeros);
		
		LinkedList<Integer> invertido = new LinkedList<>();
		int tamanho = numeros.size();
		for (int i = 0; i < tamanho; i ++) {
			invertido.add(numeros.getLast());
			numeros.removeLast();
		}
		System.out.println(invertido);
	}
}