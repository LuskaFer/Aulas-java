package curso_java;

import java.util.Scanner;

public class testeEscopoIniciacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double price = sc.nextDouble();
		
		if (price > 100.0) {
		double discount = price * 0.1;
		System.out.println(discount);
		}
		
		sc.close();
		//System.out.println(discount); // está fora do escopo e n vai funcionar
	}

}
