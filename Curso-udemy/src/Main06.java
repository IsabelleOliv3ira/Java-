import java.util.Locale;
import java.util.Scanner;

public class Main06 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		double triangulo = A * C / 2.0;
		double circulo = 3.14159 * C * C;
		double trapezio = (A + B) * C / 2.0;
		double quadrado = B * B;
		double retangulo = A * B; 
		
		System.out.printf("TRI�NGULO = %.3f\n", triangulo);
		System.out.printf("CIRCULO = %.3f\n", circulo);
		System.out.printf("TRAP�ZIO =  %.3f\n", trapezio);
		System.out.printf("QUADRADO = %.3f\n", quadrado);
		System.out.printf("RET�NGULO = %.3f\n", retangulo);
		
		sc.close();
	}

}
