package labirinto;

import java.util.*;

public class Interacoes {
	Scanner input = new Scanner(System.in);
	CriarLabirinto l = new CriarLabirinto();
	// labirinto no inicio
	public final String[][] labirintoOriginal1 = {
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
	public final String[][] labirintoOriginal2 = {
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
	// Posições inicais do jogador 
	public int xInicial = 7, yInicial = 8, 
			// xFuturo/yFuturo são as posições que o jogador deseja se mover
			xFuturo = 7, yFuturo = 8;
		
		public HashMap<String, Runnable> acoes = new HashMap<>();
		public HashMap<Integer, String[][]> original = new HashMap<>();
		
	public void criarAcoes() {
			original.put(1, labirintoOriginal1);
			original.put(2, labirintoOriginal2);
			acoes.put("W", () -> yFuturo--);
			acoes.put("A", () -> xFuturo--);
			acoes.put("D", () -> xFuturo++);
			acoes.put("S", () -> yFuturo++);
			acoes.put("R", () -> reiniciar());
		}
		
	public void movimento() {
		String movimento = input.nextLine();
		if (acoes.containsKey(movimento.toUpperCase())) {
			acoes.get(movimento.toUpperCase()).run();
		} else {
			System.out.println("Escolhe uma opção válida!");
		}
		
		if (!l.labirinto.get(l.nivel)[yFuturo][xFuturo].equals("P")) {
			l.labirinto.get(l.nivel)[l.y][l.x] = " ";
			// A posição real do jogador vai mudar
			l.x = xFuturo;
			l.y = yFuturo;
		} else {
			// Vai checar se o jogador consegue empurrar a parede
			interagirParede(movimento);
			xFuturo = l.x;
			yFuturo = l.y;
		}
	}
	
	public void interagirParede(String movimento) {
		// Posição da parede que o jogador está interagindo
		int xParede = xFuturo;
		int yParede = yFuturo;
		// Posição após a parede
		acoes.get(movimento.toUpperCase()).run();
		if (xFuturo < 0 || yFuturo < 0) {
			System.out.println("Você não pode passar por uma parede!");
			xFuturo = l.x;
			yFuturo = l.y;
			movimento();
		} else {
			if (l.labirinto.get(l.nivel)[yFuturo][xFuturo].equals(" ")) {
				l.labirinto.get(l.nivel)[yFuturo][xFuturo] = "P";
				l.labirinto.get(l.nivel)[yParede][xParede] = " ";
			} else {
				System.out.println("Você não pode passar por uma parede!");
				xFuturo = l.x;
				yFuturo = l.y;
				movimento();
			}
		}
	}
	
	public void reiniciar() {
		l.labirinto.get(l.nivel)[l.y][l.x] = " ";
		l.x = xInicial;
		l.y = yInicial;
		xFuturo = l.x;
		yFuturo = l.y;
		for (int i = 0; i < l.labirinto.get(l.nivel).length; i++) {
			for (int j = 0; j < l.labirinto.get(l.nivel)[0].length; j++) {
				// Vai escrever todos os elementos do labirinto
				l.labirinto.get(l.nivel)[i][j] = original.get(l.nivel)[i][j];
			}
		}
		System.out.println("Jogo reiniciado!");
	}
}
