package abstracao;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Carro carro = new Carro();
		Bicicleta bicicleta = new Bicicleta();
		
		// Inserindo Atv1Veiculo aqui significa que a lista vai ter suas subclasses
		ArrayList<Atv1Veiculos> veiculos = new ArrayList<>();
		veiculos.add(carro);
		veiculos.add(bicicleta);
		
		for (Atv1Veiculos veiculoAtual : veiculos) {
			veiculoAtual.mover();
		}
		
		Cachorro cachorro = new Cachorro("Tonho");
		Gato gato = new Gato("Tinho");
		
		ArrayList<Atv2Animais> animais = new ArrayList<>();
		animais.add(cachorro);
		animais.add(gato);
		
		for (Atv2Animais animal : animais) {
			animal.falar();
		}
	}

}
