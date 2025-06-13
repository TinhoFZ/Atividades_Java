package atividade_2025_05_20;

import java.util.Scanner;

public class Atividade4 {

public static int escolha;
public static double saldo, deposito, depositado, saque, taxaOperacao = 0.995;
// "primeiraVez" é usado para checar se o código está sendo usado pela primeira vez
public static boolean primeiraVez;

static Scanner teclado = new Scanner(System.in);

	public static void usarConta() {
		
		if (primeiraVez == false) {
			System.out.println("Qual seu saldo inicial?");
			saldo = teclado.nextDouble();
			primeiraVez = true;
		}
		
		System.out.println("O que deseja fazer? (Saldo: R$ " + saldo + " | Depositado: R$ " + deposito + " "
				+ "\n Sair [0] \n Depositar[1] \n Sacar[2] (0,5% será retirado do valor sacado se usuário normal, 0,1% se especial) \n Mudar de conta [3]");
		escolha = teclado.nextInt();
		
		switch (escolha) {
		case 0:
			System.exit(0);
		break;
		
		case 1: 
			depositarSaldo();
		break;
		
		case 2:
			sacarSaldo();
		break;
		
		case 3:
			primeiraVez = false;
			depositado = 0;
			usarConta();
		break;
		
		default:
			System.out.println("Valor inserido inválido");
			usarConta();
		}
	}
	
	public static void depositarSaldo() {
		System.out.println("Quanto deseja depositar?");
		deposito = teclado.nextDouble();
		if(deposito > saldo) {
			System.out.println("Você não tem tanto dinheiro!");
		} else {
			saldo = saldo - deposito;
			depositado = depositado + deposito;
			usarConta();
		}
	}
	
	public static void sacarSaldo() {
		System.out.println("Quanto deseja sacar?");
		saque = teclado.nextDouble();
		if(saque > depositado) {
			System.out.println("você não tem tanto dinheiro depositado!");
			usarConta();
		} else {
			saque = saque * taxaOperacao;
			depositado = depositado - saque;
			System.out.println("Após o valor ser debitado seu saque foi de: " + saque);
			usarConta();
		}
	}
}
