package Teste;
import java.util.Scanner;

public class OlaMundoFi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		String nome = sc.next();
		System.out.printf("%s é gay", nome);
		sc.close();
	}

}
