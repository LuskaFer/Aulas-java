package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class ExerEstuturaSequencial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Exercicio Exemplo 
		/*
		 
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f %n", area);
		System.out.printf("PRECO = %.2f %n", preco);
		
		sc.close();
		 */
		
		//Exercicio 01
		/*
		Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
		mensagem explicativa, conforme exemplos.
		*/
		/*
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
		
		System.out.println("SOMA = " + soma);
		
		sc.close();
		*/
		
		//Exercicio 02 
		/*
		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159
		*/
		/*
		double valorA = sc.nextDouble();
		
		double pi = 3.14159;
		
		double area = pi * (valorA * valorA);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
		*/
		
		//Exercicio 03
		/*
		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		*/
		/*
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		int diferenca = (a * b - c * d);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		sc.close();
		*/
		
		//Exercicio 04
		/*
		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
		decimais.
		 */
		/*
		int number = sc.nextInt();
		
		int workhours = sc.nextInt();
		
		double pph = sc.nextDouble();
		
		double salary = workhours * pph;
		
		System.out.println("NUMBER = " + number);
		System.out.printf("SALARY = U$ %.2f %n", salary);
		
		sc.close();
		*/
		
		//Exercicio 05
		/*
		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		 */
		/*
		int cod1 = sc.nextInt();
		int num1 = sc.nextInt();
		double val1 = sc.nextDouble();
		int cod2 = sc.nextInt();
		int num2 = sc.nextInt();
		double val2 = sc.nextDouble();
		
		double buy = (num1 * val1) + (num2 * val2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", buy);
		
		sc.close();
		*/
		
		//Exercicio 06
		/*
		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
		mostre:
		a) a área do triângulo retângulo que tem A por base e C por altura.
		b) a área do círculo de raio C. (pi = 3.14159)
		c) a área do trapézio que tem A e B por bases e C por altura.
		d) a área do quadrado que tem lado B.
		e) a área do retângulo que tem lados A e B.
		*/
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
	
		double areaTri = (a * c)/2 ;
		
		double areaCir = 3.14159 * (c * c);
		
		double areaTra = ((a + b) * c) / 2;
		
		double areaQua = b * b;
		
		double areaRet = a * b;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTri);
		System.out.printf("CIRCULO: %.3f%n", areaCir);
		System.out.printf("TRAPEZIO: %.3f%n", areaTra);
		System.out.printf("QUADRADO: %.3f%n", areaQua);
		System.out.printf("RETANGULO: %.3f%n", areaRet);
		
		sc.close();

		
		}

}
