import java.util.Scanner;

public class estruturasDeRepeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;
		
//		while (x != 0) {
//			soma += x;
//			x = sc.nextInt();
//		}
//		System.out.println("A soma dos números digitados foi: " + soma);
//		sc.close();

//		for (int i = 0; i < x; i++) {
//			int num = sc.nextInt();
//			soma += num;
//		}
		
		for (int i = x; i > 0; i--) {
			int num = sc.nextInt();
			soma += num;
		}
		
		System.out.println("O valor da soma foi: " + soma);
		sc.close();
		
	}

}
