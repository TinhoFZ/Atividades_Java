package arquivos;

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;


class Ler {

	public String filtro = "";
	
	public void lerArquivo() {
		try {
			FileReader fr = new FileReader(Procura.nome);
			BufferedReader br = new BufferedReader(fr);
			Scanner input = new Scanner(System.in);
			
			System.out.println("Que conteúdo deseja ver? Digite que palavras a linha deve conter.");
			filtro = input.nextLine();
			System.out.println("Conteúdo do arquivo:");
			while(br.readLine() != null) {
				String texto = br.readLine();
				if (texto.contains(filtro)) {
					System.out.println(texto);
				}
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
			int linha = 0, linhaF = 0;
			String texto = br.readLine();
			while(texto != null) {
				linha ++;
				if(texto.contains(filtro)) {
					linhaF ++;
				}
				texto = br.readLine();
			}
			br.close();
			
			System.out.println("Número total de linhas com o filtro: " + linhaF);
			System.out.println("Número total de linhas sem o filtro: " + linha);
		} catch (IOException e) {
			System.out.println("Houve um erro no sistema!");
		}

	}
}