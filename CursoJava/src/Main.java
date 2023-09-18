import java.util.Locale;

/* <tipo> <nome> = <valor inicial>; atribuir valor inicial é opcional 
 * também possui endereço, mas isso aí é mais avançado
 * cada tipo primitivo numério pode armazenar um tamanho determinado
 * unicode-table
 * */
public class Main {

	public static void main(String[] args) {
		System.out.print("Olá, Mundo!! ");
		double x = 10.35784;
		char b = '\u0061';
		System.out.println(b);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);
		System.out.println("RESULTADO = " + x + " METROS :D");
		System.out.printf("RESULTADO = %.2f METROS%n :00%n", x);
		
		String nome = "Maria";
		int idade = 19;
		double renda = 30000.15;
		System.out.printf("Olá, meu nome é %s, eu tenho %d anos e ganho %.2f reais%n:33333333", nome, idade, renda);
		
	}

}
