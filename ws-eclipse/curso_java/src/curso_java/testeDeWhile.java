package curso_java;

import java.util.Scanner;

public class TesteDeWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//Fazer um programa que lê números
		//inteiros até que um zero seja lido. Ao
		//final mostra a soma dos números lidos
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma += x;
			x = sc.nextInt();		
		}

		System.out.println(soma);
		
		sc.close();
	}

}
