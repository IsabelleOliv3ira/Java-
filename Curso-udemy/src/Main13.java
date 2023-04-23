import java.util.Locale;
import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 || y == 0) {
			System.out.println("Origem");
		}
		
		sc.close();
	}

}
