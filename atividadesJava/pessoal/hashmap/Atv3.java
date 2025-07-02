package hashmap;

import java.util.*;

//Description: Implement a simple phone book where:
//    Key = name (String)
//    Value = phone number (String)
//    Let the user:
//    Add a contact
//    Remove a contact
//    Search for a contact
//Use a Scanner for interaction.

public class Atv3 {

	public Scanner input = new Scanner(System.in);
	public HashMap<String, String> map = new HashMap<>();
	// "Runnable" é código
	public HashMap<Integer, Runnable> escolha = new HashMap<>();
	public int quantidadeNumeros = 0;
	
	public void rodar() {
		// O () -> está dizendo que o código vai rodar apenas quando um .run for usado
		escolha.put(1, () -> criarNumero());
		escolha.put(2, () -> System.out.println(map));
		escolha.put(3, () -> atualizarNumero());
		escolha.put(4, () -> apagarNumero());
		escolha.put(5, () -> System.exit(0));
		listarOpcoes();
	}
	
	private void listarOpcoes() {
		System.out.println("O que deseja fazer?"
				+ "\n [1] Adicionar número de telefone"
				+ "\n [2] Ver números de telefone"
				+ "\n [3] Atualizar números de telefone"
				+ "\n [4] Apagar números de telefone"
				+ "\n [5] Sair");
		escolherOpcoes();
	}
	
	private void escolherOpcoes() {
		int escolher = 0;
		try {
		escolher = input.nextInt();
		input.nextLine();
		} catch (InputMismatchException e) {
			System.out.println("Insira um valor válido! O valor escolhido será 1");
			escolher = 1;
			input.nextLine();
		}
		
		if (escolha.containsKey(escolher)) {
			escolha.get(escolher).run();
			listarOpcoes();
		} else {
			System.out.println("Essa opção não existe!");
			listarOpcoes();
		}
	}
	
	private void criarNumero() {
		System.out.println("Qual o nome da pessoa?");
		String nome = input.nextLine();
		
		System.out.println("Qual o número de telefone?");
		String numero = input.nextLine();
		
		map.put(nome, numero);
		
	}

	private void atualizarNumero() {
		System.out.println("Qual o nome do número que deseja atualizar?");
		String nome = input.nextLine();
		
		if (map.containsKey(nome)) {
			System.out.println("Qual o número novo?");
			String numero = input.nextLine();
			map.put(nome, numero);
			System.out.println("O número foi atualizado com sucesso!");
		} else {
			System.out.println("Essa pessoa não existe!");
		}
	}
	
	private void apagarNumero() {
		System.out.println("Qual o nome do número que deseja apagar?");
		String nome = input.nextLine();
		
		if (map.containsKey(nome)) {
			map.remove(nome);
			System.out.println("O número foi apagado com sucesso!");
		} else {
			System.out.println("Essa pessoa não existe!");
		}
	}
}
