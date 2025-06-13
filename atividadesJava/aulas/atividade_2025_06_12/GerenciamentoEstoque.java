package atividade_2025_06_12;

import java.util.Scanner;

public class GerenciamentoEstoque {
public static Scanner input = new Scanner(System.in);

private static String [] nomeProduto = new String [255], informacoesProduto = new String [255];
private static int [] quantidadeProduto = new int [255], codigoProduto = new int [255];
private static double [] precoProduto = new double [255];
private static int totalProdutos = 0;
private static boolean rodou;

	public static void escolhaAcao() {
	
		if (!rodou) {
			System.out.println("Adicione o primeiro produto do sistema:");
			rodou = true;
			adicionarProduto();
		}
		System.out.println("O que deseja fazer? \n [1] Adicionar produto \n [2] Listar produto");
		int escolha = input.nextInt();
		switch (escolha){
		case 1:
			adicionarProduto();
			break;
		case 2:
			listarProduto();
			break;
		case 3:
			venderProduto();
			break;
		}
	}
	
	private static void adicionarProduto() {
// é usado dois ";" vazio porque a variável já existe e porque o for nunca irá acabar até que o usuário queira.
		for (;; totalProdutos ++) {
			System.out.println("Insira o nome do produto.");
			nomeProduto[totalProdutos] = input.nextLine();
			
			System.out.println("Insira o preço do produto.");
			precoProduto[totalProdutos] = input.nextDouble();
			
			System.out.println("Insira o código do produto.");
			codigoProduto[totalProdutos] = input.nextInt();
			
			System.out.println("Insira a quantidade do produto.");
			quantidadeProduto[totalProdutos] = input.nextInt();
			
			informacoesProduto[totalProdutos] = "Nome: " + nomeProduto + " | Preço: R$" + precoProduto + " | Codigo: " +
				codigoProduto + " | Quantidade: " + quantidadeProduto;
			
			System.out.println("Deseja continuar adicionando? \n [1] Não");
			int escolha = input.nextInt();
			
			if (escolha == 1) {
				escolhaAcao();
			}
		}
	}
	
	private static void listarProduto() {
		for (int i = 0; i < totalProdutos; i ++) {
			System.out.println(informacoesProduto[i]);
		}
	}
	
	private static void venderProduto() {
		
	}
}