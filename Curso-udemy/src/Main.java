import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double valor = area * metroQuadrado;
		
		System.out.printf("Área = %.2f\n", area);
		System.out.printf("Preço = %.2f\n", valor);
		
		
		sc.close();
	}

}
