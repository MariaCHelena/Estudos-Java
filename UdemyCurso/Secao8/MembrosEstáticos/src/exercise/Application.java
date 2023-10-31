package exercise;

import java.util.Locale;
import java.util.Scanner;

import exercise.utils.CurrencyConverter;

public class Application {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double dollar = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		double amount = sc.nextDouble();
		
		System.out.printf("Amount to be pain in reais = %.2f", CurrencyConverter.converter(dollar, amount));
		
		sc.close();
	}
}
