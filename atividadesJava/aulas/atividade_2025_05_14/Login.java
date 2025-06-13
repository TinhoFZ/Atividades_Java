package atividade_2025_05_14;

import java.util.Scanner;

public class Login {

	//Máximo de 100 usuários
public static String[] email = new String [100], senha = new String [100];
public static String emailLogin, senhaLogin;
public static int escolha, i, numUsuario = 0;
public static boolean emailCorreto, senhaCorreta;

public static Scanner teclado = new Scanner(System.in);

	static void escolherUsuario() {
		
		emailCorreto = false;
		senhaCorreta = false;
		
		System.out.println("Você deseja se cadastrar ou fazer login? Digite 1 para cadastro e 2 para login.");
		escolha = teclado.nextInt();
		// O nextLine é necessário para impedir erros de acontecerem nos próximos métodos
		email[numUsuario] = teclado.nextLine();
		if (escolha == 1) {
			numUsuario = numUsuario + 1;
			cadastrarUsuario();
		} else if (escolha == 2) {
			logarUsuario();
		} else {
			System.out.println("Valor invalido!");
			escolherUsuario();
		}
	}
	
	static void cadastrarUsuario() {
		

		System.out.println("Insira seu email: ");
		email[numUsuario] = teclado.nextLine();
		
		System.out.println("Insira sua senha: ");
		senha[numUsuario] = teclado.nextLine();
		
		escolherUsuario();
		
	}
	
	static void logarUsuario() {
		System.out.println("Usuários no sistema: " + numUsuario);
		
		System.out.println("Insira seu email: ");
		emailLogin = teclado.nextLine();
			
		System.out.println("Insira sua senha: ");
		senhaLogin = teclado.nextLine();
		

		
		for (i = 0; i < numUsuario; i ++) {
			if (senhaLogin.equals(senha[i]) && emailLogin.equals(email[i])) {
				senhaCorreta = true;
				emailCorreto = true;
				System.out.println("Estão corretos!");
				break;
			} else if (i == numUsuario) {
				System.out.println("Email incorreto.");
				escolherUsuario();
			}
		}
	}
}
