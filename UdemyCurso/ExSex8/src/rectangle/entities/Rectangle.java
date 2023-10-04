package rectangle.entities;

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
				+ "\n\rPERIMETER = " + String.format("%.2f", perimeter()) 
				+ "\n\rDIAGONAL = " + String.format("%.2f", diagonal());
	}
}
