package exercicio1.entities;

public class Rectangle {
	private double width;
	private double height;
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
	public String toString() {
		return "AREA = " + String.format("%.2f", area()) 
				+ "\nPERIMETER = " + String.format("%.2f", perimeter()) 
				+ "\nDIAGONAL = " + String.format("%.2f", diagonal());
	}
}
