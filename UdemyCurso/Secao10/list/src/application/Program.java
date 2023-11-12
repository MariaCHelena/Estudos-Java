package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			int num = i + 1;
			
			System.out.println("Employee #" + num + ":");
			
			System.out.println("Id:");
			int id = sc.nextInt();
			
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			
			System.out.println("Salary:");
			double salary = sc.nextDouble();
			
			employees.add(new Employee(id, name, salary));
		}
		
		// Organizando o Array por ordem do ID
		Comparator<Employee> compareById = Comparator.comparing(Employee::getId);
		ArrayList<Employee> employeesSorted = employees.stream().sorted(compareById).collect(Collectors.toCollection(ArrayList::new));
		
		System.out.println("Enter the employee id that will have the salary increase:");
		int id = sc.nextInt();
		boolean contains = false;
		for(Employee emp : employeesSorted) {
			if(emp.getId() == id) {
				System.out.println("Enter the percentage: ");
				double perc = sc.nextDouble();
				emp.increaseSalary(perc);
				contains = true;
			}
		}
		
		if(!contains) {
			System.out.println("This id does not exist!");
		}
		
		for(Employee emp : employeesSorted) {
			System.out.println(emp);
		}
		
	}
}
