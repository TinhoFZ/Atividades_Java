package abstracao;

import java.util.ArrayList;
import java.util.List;

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
		
		Livro livro = new Livro("El necronomicon", 59.99);
		Roupa roupa = new Roupa("Jeans", 199.89);
		Eletronico eletronico = new Eletronico("Celular", 1899.59);
		
		ArrayList<Atv3Item> itens = new ArrayList<>();
		itens.add(livro);
		itens.add(roupa);
		itens.add(eletronico);
		
		for (Atv3Item item : itens) {
			item.mostrarPreco();
		}
		
		Guerreiro dps = new Guerreiro("Tunho");
		Curandeiro suporte = new Curandeiro("Margarida");
		
		ArrayList<Atv4Personagem> personagens = new ArrayList<>();
		
		personagens.add(dps);
		personagens.add(suporte);
		
		for (Atv4Personagem personagem : personagens) {
			personagem.atacar();
			if (personagem.equals(suporte)) {
				suporte.curar(20);
			}
		}
		
		Pocao pocao = new Pocao("poção");
		Espada espada = new Espada("Espada");
		Pergaminho pergaminho = new Pergaminho("Pergaminho");
		
		List<Atv5Itens> inventario = new ArrayList<>();
		inventario.add(pocao);
		inventario.add(espada);
		inventario.add(pergaminho);
		
		for (Atv5Itens item : inventario) {
			item.descrever();
			// Vai checar se o item está implementando "Usavel"
		    if (item instanceof Usavel) {
		        ((Usavel) item).usar();
		    }
		}
	}
}
