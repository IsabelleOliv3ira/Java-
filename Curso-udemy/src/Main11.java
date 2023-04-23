import java.util.Locale;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int qtd = sc.nextInt();
		double preco;
		
		if (codigo == 1) {
			preco = qtd * 4.0;
		}
		else if (codigo == 2) {
			preco = qtd * 4.5;
		}
		else if (codigo == 3) {
			preco = qtd * 5.0;
		}
		else if (codigo == 4) {
			preco = qtd * 2.0;
		}
		else {
			preco = qtd * 1.5;
		}
		
		System.out.printf("TOTAL: R$%.2f\n", preco);
		
		sc.close();
	}
}
