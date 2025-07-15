package arquivos;

import java.io.File;
import java.util.Scanner;

class Criar {
	public Scanner input = new Scanner(System.in);

	public void escolher(String nome) {
		System.out.println("O arquivo não existe ou não foi encontrado...");
		System.out.println("Deseja criar um novo? [S/N]");
		String escolha = "";
		while (!escolha.equals("S") && !escolha.equals("N") ) {
			escolha = input.nextLine().toUpperCase();
		}

		if(escolha.equals("S")) {
			criarArquivo(nome);
		} else {
			System.exit(0);
		}
	}
	
	public void criarArquivo(String nome) {
		@SuppressWarnings("unused")
		File arquivo = new File(nome);
	}
}