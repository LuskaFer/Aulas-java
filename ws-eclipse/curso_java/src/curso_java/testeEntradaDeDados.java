package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class TesteEntradaDeDados {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		/*
		 * String x; x = sc.next(); System.out.println("Você digitou: " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * int x; x = sc.nextInt(); System.out.println("Você digitou: " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * double x; x = sc.nextDouble(); System.out.println("Você digitou: " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * char x; x = sc.next().charAt(0); System.out.println("Você digitou: " + x);
		 * 
		 * sc.close();
		 */

		/*
		 * String x; int y; double z;
		 * 
		 * x = sc.next(); y = sc.nextInt(); z = sc.nextDouble();
		 * 
		 * System.out.println("Dados digitados: "); System.out.println(x);
		 * System.out.println(y); System.out.println(z); sc.close();
		 */

		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine();		// para limpar o buffer de leitura 
		s1 = sc.nextLine(); // para ler linha inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		sc.close();

	}

}
