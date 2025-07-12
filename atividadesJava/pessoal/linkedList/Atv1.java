package linkedList;

//Goal: Understand how to build a linked list manually using a ListNode class and print its contents.
//Task:
//    Create a class ListNode with int val and ListNode next.
//    Use it to build the list: 3 -> 7 -> 9
//    Print it in the format: 3 -> 7 -> 9

public class Atv1 {
	public void rodar() {
		Node lista = new Node(3);
		lista.setNext(new Node(7));
		lista.getNext().setNext(new Node(9));
		
		Node atual = lista;
		
		while(atual != null) {
			System.out.print(atual.getValor());
			if(atual.getNext() != null) {
				System.out.print(" -> ");
			}
			atual = atual.getNext();
		}
	}
}
