package exercicio2.entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	// Contructor
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}
	
	//Getters e Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	// Restante dos métodos
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public double increaseSalary(double percentage) {
		this.grossSalary += this.grossSalary * percentage/100;
		return netSalary();
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}
