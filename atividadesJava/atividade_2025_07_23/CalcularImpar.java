package atividade_2025_07_23;

public class CalcularImpar {
	public void rodar() {
		System.out.println("Entre 1 e 50 os números ímpares são:");
		for(int i = 1; i < 51; i ++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
