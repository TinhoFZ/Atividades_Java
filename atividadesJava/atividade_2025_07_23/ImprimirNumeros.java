package atividade_2025_07_23;

public class ImprimirNumeros {
	private int[] mesas = new int[20];
	
	public void rodar() {
		for(int i = 1; i < 21; i ++) {
			mesas[i] = i;
			System.out.println(mesas[i]);
		}
	}
}
