package linkedList;

//Goal: Focus on traversing two lists at the same time and summing values node by node.
//Task:
//    Input: 1 -> 2 -> 3 and 4 -> 5 -> 6
//    Output: 5 -> 7 -> 9
//Don’t worry about carrying over digits yet.

public class Atv4 {

	public void rodar() {
		Node lista1 = new Node(1);
		Node l1n1 = new Node(2);
		Node l1n2 = new Node(3);
		lista1.setHead(lista1);
		lista1.setNext(l1n1);
		l1n1.setNext(l1n2);
		Node atual1 = lista1;
		
		Node lista2 = new Node(4);
		Node l2n1 = new Node(5);
		Node l2n2 = new Node(6);
		lista2.setHead(lista2);
		lista2.setNext(l2n1);
		l2n1.setNext(l2n2);
		Node atual2 = lista2;
		
		Node total = new Node(atual1.getValor() + atual2.getValor());
		total.setHead(total);
		Node novo = total;
		
		for (int i = 0; i < 2; i ++) {
			
			atual1 = atual1.getNext();
			atual2 = atual2.getNext();
			
			novo.setNext(new Node(atual1.getValor() + atual2.getValor()));
			novo = novo.getNext();
		}
		
		total = total.getHead();
		
		Node escrever = total;
        while (escrever != null) {
            System.out.print(escrever.getValor());
            if (escrever.getNext() != null) {
                System.out.print(" -> ");
            }
            escrever = escrever.getNext();
        }
	}
}
