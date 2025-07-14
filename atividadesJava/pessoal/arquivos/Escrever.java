import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

class Escrever {

	public void escreverArquivo() {

		try {
			System.out.println(Procura.nome);
			FileWriter fw = new FileWriter(Procura.nome, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.newLine();
			bw.write("Nome: Eduardo");
			bw.newLine();
			bw.write("Idade: 16");
			bw.newLine();
			bw.write("Ocupação: Estudante");
			bw.close();
			System.out.println("As informações do arquivo foram atualizadas!");
		} catch (IOException e) {
			System.out.println("Houve um erro no sistema!");
		}
	}
}