import java.util.Locale;
import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario < 2000.0) {
			System.out.println("ISENTO");
		}
		else if (salario < 3000.0) {
			salario = salario - 2.000;
			imposto = salario / 100 * 8 ;
			System.out.printf("R$%.2f\n", imposto);
		}
		else if (salario < 4500.0) {
			salario = salario - 2000.0;
			imposto = salario / 100 * 18;
			System.out.printf("R$%.2f\n", imposto);
		}
		else if (salario > 4500.0) {
			salario = salario - 2000.0;
			imposto = salario / 100 * 28;
			System.out.printf("R$.2f\n", imposto);
		}
		sc.close();
	}

}
