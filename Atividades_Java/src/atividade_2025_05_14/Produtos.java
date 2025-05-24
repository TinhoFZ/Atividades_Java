package atividade_2025_05_14;

import java.util.Scanner;

public class Produtos {

public static boolean[] produtoComprado = new boolean[38];
public static boolean produtoEscolhidoMenor;
public static double[] produto = new double [40];
public static int produtoEscolhido;

// Arrays.fill preenche todos os valores do array com o valor inserido

	
public static Scanner teclado = new Scanner(System.in);
	
	static void mostrarProdutos() {
		System.out.println("Esses são os produtos que temos disponíveis: "
			+ "1 espátula de silicone [0] \r\n"
			+ "1 colher de pau ou silicone [1] \r\n"
			+ "2 peneiras (uma média e uma pequena) [2-3] \r\n"
			+ "1 tábua de corte de vidro [4] \r\n"
			+ "1 rolo para abrir massas (plástico ou madeira) [5] \r\n"
			+ "1 pinça [5] \r\n"
			+ "1 conjunto de medidores [6] \r\n"
			+ "1 xícara de medidas [7]\r\n"
			+ "1 saca-rolhas [8] \r\n"
			+ "1 abridor de latas [9] \r\n"
			+ "1 abridor de garrafas [10] \r\n"
			+ "1 tesoura [11] \r\n"
			+ "1 ralador [12] \r\n"
			+ "1 funil [13] \r\n"
			+ "1 espremedor de alho [14] \r\n"
			+ "3 panelas (uma média, uma pequena e uma grande) [15-16-17] \r\n"
			+ "1 panela de pressão [18] \r\n"
			+ "1 frigideira média antiaderente com tampa [19]\r\n"
			+ "1 leiteira ou caneca para ferver líquidos [20] \r\n"
			+ "2 formas para pizza [21-22]\r\n"
			+ "1 forma retangular [23] \r\n"
			+ "1 forma redonda [24] \r\n"
			+ "1 forma redonda com furo no meio [25] \r\n"
			+ "Conjunto de facas (faca grande para corte de carnes, faca média, faca com serra para pães, faca com ponta fina para legumes) [26] \r\n"
			+ "2 conchas (uma grande, uma média) [27-28]\r\n"
			+ "1 escumadeira [29] \r\n"
			+ "1 garfão para preparo de alimentos [30] \r\n"
			+ "1 escorredor de macarrão [31] \r\n"
			+ "Formas de gelo (caso sua geladeira não possua) [32]\r\n"
			+ "2 pegadores de panela [33-34] \r\n"
			+ "1 luva de silicone [35] \r\n"
			+ "Coador de café [36] \r\n"
			+ "1 chaleira [37]");
		comprarProdutos();
	}
	
	static void comprarProdutos() {
		 System.out.println("Insira o valor dentro dos [] do produto que deseja comprar. Digite [38] para ver os produtos novamente."
		 		+ "Digite [39] para ver os produtos já comprados. Ao finalizar digite [40] para prosseguir ao pagamento");
		 produtoEscolhido = teclado.nextInt();
		 produtoEscolhidoMenor = produtoEscolhido < 38;
		 // Se o produto já foi comprado então...
		 switch (produtoEscolhido) {
		 case 38:
			 mostrarProdutos();
			 break;
		 case 39:
			 //Mostrar todos os produtos escolhidos que são "true"
			 for (int i = 0; i < 38; i ++) {
				 if (produtoComprado[i]) {
					 System.out.println("O produto " + i + " já foi comprado.");
				 }
			 }
			 comprarProdutos();
			 break;
		 case 40:
			 //Ir para pagamento
			 break;
			 default: 
				 if (produtoComprado[produtoEscolhido]) {
					 System.out.println("Esse produto já foi escolhido!");
					 comprarProdutos();
				 } else if (produtoComprado[produtoEscolhido] == false) {
					 System.out.println("Produto adicionado ao carrinho!");
					 produtoComprado[produtoEscolhido] = true;
					 comprarProdutos();
				 } else {
					 System.out.println("Valor inválido!");
					 comprarProdutos();
				 }
		 }
	}
}
