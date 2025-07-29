package atividade_2025_07_23;

public class Contagem {
	public void rodar() {
		System.out.println("Contagem regressiva iniciada!");
		for(int i = 10; i > 0; i --) {
			try {
				System.out.println(i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		System.out.println("O foguete foi lançado!");
	}
}
