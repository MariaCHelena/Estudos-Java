package exercicio3.entities;

public class Student {
	private String name;
	private double nota1;
	private double nota2;
	private double nota3;
	
	public Student(String name, double nota1, double nota2, double nota3) {
		this.name = name;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	public double calcFinalGrade() {
		return this.nota1 + this.nota2 + this.nota3;
	}
	
	public double calcMissingPoints() {
		return 60.00 - calcFinalGrade();
	}
	
	public String toString() {
		if (calcFinalGrade() >= 60.00) {
			return "FINAL GRADE = " + calcFinalGrade() + "\nPASS";
		} else {
			return "FINAL GRADE = " + String.format("%.2f", calcFinalGrade()) + "\nFAILED\n" + "MISSING " + String.format("%.2f", calcMissingPoints()) + " POINTS";
		}
	}
}
