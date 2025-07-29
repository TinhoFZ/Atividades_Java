package atividade_2025_07_23;

import java.util.Random;

public class ContarNegativos {
	public void rodar() {
		Random random = new Random();
		
		int vendasNegativas = 0;
		for(int i = 1; i < 11; i ++) {
			int vendas = random.nextInt(21) - 10;
			if(vendas < 0) {
				System.out.println("Vendedor " + i  + " teve vendas negativas!");
				vendasNegativas ++;
			}
		}
		System.out.println("Houve um total de " + vendasNegativas + " vendas negativas");
	}
}
