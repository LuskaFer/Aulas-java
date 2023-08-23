package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rectangle widht and height: ");
		
		Rectangle x;
		x = new Rectangle();
		
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		
		
		System.out.printf("AREA = %.2f%n", x.area());

		System.out.printf("PERIMETER = %.2f%n", x.perimetro());
		
		System.out.printf("DIAGONAL = %.2f%n", x.diagonal());
		
		sc.close();
	}

}
