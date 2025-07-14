
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
			System.out.println("O arquivo não existe ou não foi encontrado...");
			System.out.println("Deseja criar um novo? [S/N]");
			String escolha = "";
			while (!escolha.equals("S") && !escolha.equals("N") ) {
				escolha = input.nextLine().toUpperCase();
			}

			if(escolha.equals("S")) {
				criar.criarArquivo(nome);
			} else {
				System.exit(0);
			}
			
		}
	}
}