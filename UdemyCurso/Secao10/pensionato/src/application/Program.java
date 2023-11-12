package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Room[] rooms = new Room[10];
		for (int i = 0; i<n; i++) {
			int rent = i + 1;
			sc.nextLine();
			System.out.println("Rent #" + rent + ":");
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int num = sc.nextInt();
			int position = num - 1;
			rooms[position] = new Room(name, email, num);
			System.out.println("");
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i<10; i++) {
			if(rooms[i] != null) {
				System.out.println(rooms[i]);
			}
		}
		
		sc.close();
	}
}
