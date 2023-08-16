package curso_java;

import java.util.Locale;

public class TesteSaidaDeDados {

	public static void main(String[] args) {
		
		// AULA SAIDA DE DADOS EM JAVA
		
		//int y = 32;
		double x = 10.35784;
		
		//System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);

		System.out.printf("%.4f%n", x);
		
		//System.out.print("Olá Mundo!");
		//System.out.println("Boa Tarde!");
		
		System.out.println("O teste de concatenação " + x + " é assim que funciona");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		String nome = "Maria";
		int idade = 32;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		System.out.println("");
		System.out.println("");
		
		// EXERCICIO SAIDA DE DADOS
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n%n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender: %s%n%n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("Us decimal point: %.3f%n", measure);
	
	}

}
