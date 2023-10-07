package exercicio3;

import java.util.Locale;
import java.util.Scanner;

import exercicio3.entities.Student;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double grade1 = sc.nextDouble();
		double grade2 = sc.nextDouble();
		double grade3 = sc.nextDouble();
		
		Student stu = new Student(name, grade1, grade2, grade3);
		
		System.out.println(stu);

	}

}
