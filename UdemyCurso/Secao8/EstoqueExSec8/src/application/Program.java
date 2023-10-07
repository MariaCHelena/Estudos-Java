package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.setName(sc.next());
		System.out.print("Value: ");
		product.setPrice(sc.nextDouble());
		System.out.print("Quantity: ");
		product.setQuantity(sc.nextInt());
		
		System.out.println("");
		System.out.println("Product data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Product updated data: " + product);
		
		System.out.println("");
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Product updated data: " + product);
		
		
		sc.close();
	}
}
