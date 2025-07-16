package linkedList;

//Goal: Learn how to write a method that transforms a standard array into a ListNode-based linked list.
//Task:
//    Create a method that takes an int[] like {5, 1, 9}
//    Return a linked list: 5 -> 1 -> 9
//Example:
//Input: {5, 1, 9}
//Output: Linked list with nodes containing 5, 1, and 9.
//Useful for testing inputs quickly.

public class Atv3 {

	public void rodar() {
		int[] numeros = {5, 1, 9};
		
		Node lista = transformarVetor(numeros);
		
		while(lista != null) {
			System.out.print(lista.getValor());
			if(lista.getNext() != null) {
				System.out.print(" -> ");
			}
			lista = lista.getNext();
		}
	}
	
	public Node transformarVetor(int[] numeros) {
		boolean rodou = false;
		
		Node lista = new Node(0);
		
		for (int numero : numeros) {
			
			Node novo = new Node(numero);
			if (!rodou) {
				lista.setValor(numero);
				lista.setHead(lista);
				
				rodou = true;
			} else {
				novo.setHead(lista.getHead());
				
				lista.setNext(novo);
				novo.setPrev(lista);
				lista = novo;
				lista.setTail(lista);
			}
		}
		return lista.getHead();
	}
}
