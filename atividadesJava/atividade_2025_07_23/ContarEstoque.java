package atividade_2025_07_23;

import java.util.Random;

public class ContarEstoque {
	public void rodar() {
		Random random = new Random();
		int[] estoque = new int[10];
		int maiorValor = 0;
		int maiorItem = 0;
		
		for(int i = 0; i < estoque.length; i ++) {
			estoque[i] = random.nextInt(101);
			if(estoque[i] > maiorValor) {
				maiorValor = estoque[i];
				maiorItem = i;
			}
		}
		System.out.println("O maior item no estoque é o item " + maiorItem + " com " + maiorValor + " em estoque");
	}
}
