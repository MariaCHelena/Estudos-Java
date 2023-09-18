import java.util.Scanner;

public class ExercicioScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, pi, raio;
		pi = 3.14159;
		raio = sc.nextDouble();
		area = raio*raio*pi;
//		int x, y, soma;
//		x = sc.nextInt();
//		y = sc.nextInt();
//		soma = x + y;
		System.out.printf("A = %.4f", area);
		sc.close();
		
	}

}
