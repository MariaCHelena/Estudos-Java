package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta;
		
		System.out.println("Digite o número da conta: ");
		int numero = sc.nextInt();
		System.out.println("Digite o nome do titular da conta: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.println("Deseja realizar um depósito inicial? [y/n] ");
		String resposta = sc.next();
		
		if(resposta.contentEquals("y")) {
			System.out.println("Infore o valor do depósito inicial:");
			double saldo = sc.nextDouble();
			conta = new Account(numero, nome, saldo);
		} else {
			conta = new Account(numero, nome);
		}
		
		System.out.println();
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor que deseja depositar: ");
		double deposito = sc.nextDouble();
		
		System.out.println();
		conta.realizarDeposito(deposito);
		
		System.out.println();
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Digite o valor que deseja sacar: ");
		double saque = sc.nextDouble();
		conta.realizarSaque(saque);
		
		System.out.println();
		System.out.println(conta);
		
		sc.close();
	}
}
