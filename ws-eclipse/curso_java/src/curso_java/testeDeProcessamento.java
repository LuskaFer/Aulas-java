package curso_java;

public class TesteDeProcessamento {

	public static void main(String[] args) {
		
		
		/* exemplo 1
		int x, y;
		x = 5;
		y = 2 * x;
		System.out.println(x);
		System.out.println(y);
		
		/* exemplo 2
		
		int x;
		double y;
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		
		// exemplo 3 */ /*
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		// exemplo 4 */ /*

		int a, b;
		double resultado;
		a = 5;
		b = 2;
		resultado = (double) a / b; // especificar double antes "CASTING"
		System.out.println(resultado);
		
		 exemplo 5 */
		
		double a;
		int b;
		a = 5.0;
		b = (int) a; // forçar casting mesmo com perda de valor
		System.out.println(b);
		
	}

}
