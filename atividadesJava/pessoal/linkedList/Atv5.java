package linkedList;

//New Concept: When adding digits like 8 + 7 = 15, you need to store 5 and carry over 1.
//Task:
//    Write a method that takes 3 numbers: digit1, digit2, carry
//    Returns a new digit and updated carry
//Example:
//addDigits(8, 7, 0) → returns [5, 1]   // 8 + 7 = 15
//addDigits(2, 3, 1) → returns [6, 0]   // 2 + 3 + 1 = 6

public class Atv5 {
	
	public void rodar() {
		int[] numeros = somarResto(7, 4, 1);
		for (int numero : numeros) {
			System.out.print(numero + " ");
		}
	}
	
	public int[] somarResto(int num1, int num2, int resto) {
		int soma = num1 + num2 + resto;
		int numFinal = soma % 10;
		int restante = soma / 10;
		int[] numeros = {numFinal, restante};
		return numeros;
	}
}
