package hashmap;

import java.util.Scanner;

public class Main {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Atv1 atv1 = new Atv1();
		Atv2 atv2 = new Atv2();
		Atv3 atv3 = new Atv3();
		Atv4 atv4 = new Atv4();
		Atv5 atv5 = new Atv5();
		
		System.out.println("Que atividade deseja visualizar? [1] [2] [3] [4] [5]");
		int escolha = input.nextInt();
		
		switch (escolha) {
		case 1:
			atv1.rodar();
			break;
		case 2:
			atv2.rodar();
			break;
		case 3:
			atv3.rodar();
			break;
		case 4:
			atv4.rodar();
			break;
		case 5:
			atv5.rodar();
			break;
		}		
	}
}
