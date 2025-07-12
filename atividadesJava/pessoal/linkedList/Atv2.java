package linkedList;

//Goal: Learn how to traverse a list and rewire its next pointers.
//Task:
//    Take a manually built list like: 3 -> 7 -> 9
//    Reverse it so the result becomes: 9 -> 7 -> 3
//This helps you practice traversing and manipulating pointers.

public class Atv2 {
	public void rodar() {
        Node lista = new Node(3);
        Node n2 = new Node(7);
        Node n3 = new Node(9);

        lista.setNext(n2);
        n2.setPrev(lista);
        n2.setNext(n3);
        n3.setPrev(n2);

        Node atual = lista;
        while (atual.getNext() != null) {
            atual = atual.getNext();
        }

        Node listaInvertida = new Node(atual.getValor());
        Node cauda = listaInvertida;

        while (atual.getPrev() != null) {
            atual = atual.getPrev();
            Node novo = new Node(atual.getValor());
            cauda.setNext(novo);
            novo.setPrev(cauda);
            cauda = novo;
        }

        Node escrever = listaInvertida;
        while (escrever != null) {
            System.out.print(escrever.getValor());
            if (escrever.getNext() != null) {
                System.out.print(" -> ");
            }
            escrever = escrever.getNext();
        }
	}
}
