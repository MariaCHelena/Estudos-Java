import java.util.Scanner;

public class expressoesLogicas {

	public static void main(String[] args) {
		// && (e), || (ou), !(não)
		int hora;
		int minutos = 0;
		Scanner sc = new Scanner(System.in);
		hora = sc.nextInt();
		sc.close();
		if (hora > 1){
			minutos += 20;
		}
		System.out.printf("Você estudou por %d horas e deu uma pausa de %d minutos", hora, minutos);
	}
}
