package application;

import java.util.Locale;
import java.util.Scanner;

import entities.User;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		
	
		User user = new User(number, name);
		
		
		System.out.print("Is there na initial deposity (y/n)?");
		char resp = sc.next().charAt(0);
		
		
		if ( resp != 'n' ) {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			user.deposit(value);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		double value = sc.nextDouble();
		user.deposit(value);
		
		System.out.println("Updated account data:");
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		user.withdraw(value);
		
		System.out.println("Updated account data:");
		System.out.println(user);
		sc.close();

	}
}
