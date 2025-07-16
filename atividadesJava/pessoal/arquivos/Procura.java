package arquivos;

import java.io.File;
import java.util.Scanner;

public class Procura {

	Criar criar = new Criar();
	public Scanner input = new Scanner(System.in);
	public static String nome;

	public void procurarArquivo() {
		System.out.println("Qual o nome do arquivo deseja procurar?");
		nome = input.nextLine() + ".txt";
		File arquivo = new File(nome);
		if(arquivo.exists()){
			System.out.println("O arquivo existe!");
		} else {
			criar.escolher(nome);
		}
	}
}