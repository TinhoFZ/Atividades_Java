package arquivos;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


class Ler {

	public void lerArquivo() {
		try {
			FileReader fr = new FileReader(Procura.nome);
			BufferedReader br = new BufferedReader(fr);
			String texto = br.readLine();

			while(texto != null) {
				System.out.println(texto);
				texto = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Houve um erro no sistema!");
		}
	}

	public void  lerLinhas() {
		try {
			FileReader fr = new FileReader(Procura.nome);
			BufferedReader br = new BufferedReader(fr);
			String texto = "";
			int linha = 0;
			while(texto != null) {
				texto = br.readLine();
				linha ++;
			}
			br.close();
			
			System.out.println("Número total de linhas: " + linha);
		} catch (IOException e) {
			System.out.println("Houve um erro no sistema!");
		}

	}
}