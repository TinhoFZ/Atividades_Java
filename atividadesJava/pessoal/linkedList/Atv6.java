package linkedList;

//Goal: Add values from both lists, correctly managing when one is longer than the other, and carrying when needed.
//Task:
//    Input: 2 -> 4 -> 3 and 5 -> 6
//    Output: 7 -> 0 -> 4
//Assume missing nodes are treated as zero.

public class Atv6 {

	public boolean restou = false;
	
	public void rodar() {
		
 		Node lista1 = new Node(2);
		Node l1n1 = new Node(4);
		Node l1n2 = new Node(3);
		lista1.setNext(l1n1);
		l1n1.setNext(l1n2);
		
		Node lista2 = new Node(5);
		Node l2n1 = new Node(6);
		lista2.setNext(l2n1);
		
		Node atual1 = lista1;
		Node atual2 = lista2;
		
		int[] numeros = new int[3];
		
		for (int i = 0; i < 3; i ++) {
			int resto = 0;
			if(restou) {
				resto ++;
				restou = false;
			}
			if(atual1 == null) {
				numeros[i] = somarResto(0, atual2.getValor(), resto);
				resto = 0;
				
				atual2 = atual2.getNext();
			} else if (atual2 == null) {
				numeros[i] = somarResto(atual1.getValor(), 0, resto);
				resto = 0;
				
				atual1 = atual1.getNext();
			} else {
				numeros[i] = somarResto(atual1.getValor(), atual2.getValor(), resto);
				resto = 0;
				
				atual1 = atual1.getNext();
				atual2 = atual2.getNext();
			}
		}
		
		for (int numero : numeros) {
			System.out.print(numero);
		}
	}
	
	public int somarResto(int num1, int num2, int resto) {
		int soma = num1 + num2 + resto;
		if (soma >= 10) {
			int numFinal = soma % 10;
			restou = true;
			return numFinal;
		}
		return soma;
	}
}
