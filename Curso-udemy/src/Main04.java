import java.util.Locale;
import java.util.Scanner;

public class Main04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc = sc.nextInt();
		double numHoras = sc.nextInt();
		double valorHora = sc.nextDouble();
		
		double salario = numHoras * valorHora; 
		
		System.out.println("NÚMERO = " + numFunc);
		System.out.printf("SALÁRIO = %.2f\n", salario);
		
		sc.close();
	}

}
