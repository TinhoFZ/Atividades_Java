package labirinto;

import java.util.*;

public class CriarLabirinto {
	public Scanner input = new Scanner(System.in);
	
	// x/y são posições atuais do jogador || nível é a profundidade atual do labirinto
	public int x = 7, y = 8, nivel = 1;
	
	HashMap<Integer, String[][]> labirinto = new HashMap<>();
	
	// Labirinto que vai ser modificado pelo jogador
	public String[][] labirinto1 = {
			{"P", "P", "P", "P", "P", "P", "P", "P", "P", "P"},
			{"P", "E", "P", "P", "P", "P", "P", "P", "P", "P"},
			{"P", " ", "P", "P", "P", "P", "P", "P", "P", "P"},
			{"P", " ", " ", "P", "P", "P", "P", "P", "P", "P"},
			{"P", " ", "P", " ", "P", "P", "P", "P", "P", "P"},
			{"P", "P", "P", " ", " ", "P", "P", "P", "P", "P"},
			{"P", " ", "P", " ", " ", " ", "P", "P", "P", "P"},
			{"P", " ", " ", "P", "P", "P", "P", "P", "P", "P"},
			{"P", " ", " ", " ", " ", " ", " ", "J", "P", "P"},
			{"P", "P", "P", "P", "P", "P", "P", "P", "P", "P"}
	}; 
	public String[][] labirinto2 = {
			{"P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P"},
		    {"P", "E", " ", " ", "P", " ", " ", " ", " ", "P", " ", " ", " ", "P", " ", " ", " ", " ", "J", "P"},
		    {"P", "P", "P", " ", "P", " ", "P", "P", " ", "P", " ", "P", " ", "P", " ", "P", "P", " ", "P", "P"},
		    {"P", " ", " ", " ", " ", " ", "P", " ", " ", " ", " ", "P", " ", " ", " ", " ", "P", " ", " ", "P"},
		    {"P", " ", "P", "P", "P", " ", "P", "P", "P", "P", " ", "P", "P", "P", "P", " ", "P", "P", " ", "P"},
		    {"P", " ", " ", " ", "P", " ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " ", " ", "P", " ", "P"},
		    {"P", "P", "P", " ", "P", "P", "P", " ", "P", "P", "P", "P", "P", " ", "P", "P", " ", "P", " ", "P"},
		    {"P", " ", " ", " ", " ", " ", "P", " ", " ", " ", " ", " ", "P", " ", " ", " ", " ", "P", " ", "P"},
		    {"P", " ", "P", "P", "P", " ", "P", "P", "P", "P", "P", " ", "P", "P", "P", "P", " ", "P", " ", "P"},
		    {"P", " ", " ", " ", "P", " ", " ", " ", " ", " ", "P", " ", " ", " ", " ", "P", " ", "P", " ", "P"},
		    {"P", "P", "P", " ", "P", "P", "P", "P", " ", "P", "P", "P", "P", "P", " ", "P", " ", "P", " ", "P"},
		    {"P", " ", " ", " ", " ", " ", " ", "P", " ", " ", " ", " ", " ", " ", " ", "P", " ", "P", " ", "P"},
		    {"P", " ", "P", "P", "P", "P", " ", "P", "P", "P", "P", "P", "P", "P", " ", "P", " ", "P", " ", "P"},
		    {"P", " ", "P", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "P", " ", "P", " ", " ", " ", "P"},
		    {"P", " ", "P", " ", "P", "P", "P", "P", "P", "P", "P", "P", " ", "P", " ", "P", "P", "P", "P", "P"},
		    {"P", " ", "P", " ", "P", " ", " ", " ", " ", " ", " ", "P", " ", "P", " ", " ", " ", " ", "P", "P"},
		    {"P", " ", "P", " ", "P", " ", "P", "P", "P", "P", " ", "P", " ", "P", "P", "P", "P", " ", "P", "P"},
		    {"P", " ", " ", " ", "P", " ", " ", " ", " ", "P", " ", " ", " ", " ", " ", " ", "P", " ", " ", "P"},
		    {"P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P"},
		    {"P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P", "P"}
	};
	
	public void rodar() {
		labirinto.put(1, labirinto1);
		labirinto.put(2, labirinto2);
		Interacoes interagir = new Interacoes();
		interagir.l = this;
		interagir.criarAcoes();
		criar(interagir);
	}
	
	public void criar(Interacoes interagir) {
		
		switch (nivel) {
		case 1:
			x = 7;
			y = 8;
			System.out.println("Espaços:"
					+ "\nP = Parede"
					+ "\nE = Entrada do labirinto"
					+ "\nJ = Jogador"
					+ "\n  = espaço vazio");
			
			System.out.println("Use:"
					+ "\nW = mover para cima"
					+ "\nA = mover para esquerda"
					+ "\nS = mover para baixo"
					+ "\nD = mover para direita"
					+ "\nR = reiniciar");
			break;
		case 2:
			x = 18;
			y = 1;
			System.out.println("Espaços:"
					+ "\nP = Parede"
					+ "\nE = Entrada do labirinto"
					+ "\nJ = Jogador"
					+ "\n  = espaço vazio");
			
			System.out.println("Use:"
					+ "\nW = mover para cima"
					+ "\nA = mover para esquerda"
					+ "\nS = mover para baixo"
					+ "\nD = mover para direita"
					+ "\nR = reiniciar");
			break;
		case 3:
			System.out.println("Parabéns, você escapou!");
			System.exit(0);
		}
		
		do {
			labirinto.get(nivel)[y][x] = "J";
			for (int i = 0; i < labirinto.get(nivel).length; i++) {
				// Criar linha nova
				System.out.println();
				for (int j = 0; j < labirinto.get(nivel)[0].length; j++) {
					// Vai escrever todos os elementos do labirinto
					System.out.print(labirinto.get(nivel)[i][j] + " ");
				}
			}
			System.out.println();
			
			interagir.movimento();
			atualizarPosicoes(interagir);
		} while (x != 1 || y != 1);
		
		nivel ++;
		criar(interagir);
	}
	
	// Pega as novas posições do labirinto da outra classe
	public void atualizarPosicoes(Interacoes interagir) {
		x = interagir.l.x;
		y = interagir.l.y;
		labirinto1 = interagir.l.labirinto1;
	}
}
