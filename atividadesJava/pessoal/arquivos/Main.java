
class Main {

	public static void main(String [] args) {
	
	Escrever escrever = new Escrever();
	Procura procura = new Procura();
	Ler ler = new Ler();
	
	procura.procurarArquivo();
	escrever.escreverArquivo();
	ler.lerArquivo();
	ler.lerLinhas();
	}
}