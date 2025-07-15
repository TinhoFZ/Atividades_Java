package arquivos;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Escrever {

	public void escreverArquivo() {

		try {
			Scanner input = new Scanner(System.in);
			FileWriter fw = new FileWriter(Procura.nome, true);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Escrever as linhas a serem adicionadas no arquivo. Digite 'Parar de digitar em (nome do arquivo)' para parar de digitar");
			
			boolean parar = true;
			
			String texto = input.nextLine();
			while(parar) {
				bw.newLine();
				bw.write(texto);
				texto = input.nextLine();
				parar = !texto.contains("Parar de digitar em " + Procura.nome);
			}
			input.close();
			bw.close();
			System.out.println("As informações do arquivo foram atualizadas!");
		} catch (IOException e) {
			System.out.println("Houve um erro no sistema!");
		}
	}
}