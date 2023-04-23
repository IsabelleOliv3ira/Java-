import java.util.Scanner;

public class Main17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = sc.nextInt();
		
		while (tipo != 4) {
			if (tipo == 1) {
				alcool ++;
			}
			else if (tipo == 2) {
				gasolina ++;
			}
			else if (tipo == 3) {
				diesel ++;
			}
			tipo = sc.nextInt();
		}
		
		System.out.println("Muito obrigada!");
		System.out.println("Álcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}
