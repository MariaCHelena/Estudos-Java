package exercicio2;

import java.util.Locale;
import java.util.Scanner;

import exercicio2.entities.Employee;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		
		Employee employee = new Employee(name, grossSalary, tax);
		
		System.out.println("");
		System.out.println("Employee: " + employee);
		
		System.out.println("");
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("");
		
		System.out.println("Updated data: " + employee);
	}
}
