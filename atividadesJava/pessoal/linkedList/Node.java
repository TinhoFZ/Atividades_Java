package linkedList;

public class Node {
	// valor da posição atual da lista
	private int valor;
	// tamanho total da lista (baseado nos next)
	private int tamanho;
	// próximo da lista
	private Node next;
	// anterior da lista
	private Node prev;
	// primeiro da lista
	private Node head;
	// ultimo da lista
	private Node tail;
	
	public Node(int valor) {
		this.valor = valor;
		this.next = null;
		this.prev = null;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public Node getNext() {
		tamanho ++;
		return next;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public Node getPrev() {
		return prev;
	}
	
	public Node getHead() {
		return head;
	}
	
	public void setHead(Node head) {
		this.head = head;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	public int getTamanho() {
		return tamanho;
	}
}
