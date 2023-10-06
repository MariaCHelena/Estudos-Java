package relacionamentos.exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		telaInicial();

	}
	
	public static void telaInicial() {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		System.out.println("BEM VINDO AO SISTEMA DE CADASTRO");
		System.out.println("================================");
		
		System.out.println("Em qual tipo de pessoa você deseja realizar sua operação");
		System.out.println("1 - Pessoa Física; \n2 - Pessoa Jurídica;");
		int res = sc.nextInt();
		switch (res) {
		case 1:
			PessoaFisica pessoaFis1 = new PessoaFisica();
			pessoaFis1.operacaoUsuario();
			break;
		case 2:
			PessoaFisica pessoaJud1 = new PessoaFisica();
			break;
		}
		
		sc.close();
	}

}
