import java.util.Locale;
import java.util.Scanner;

public class Main03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, diferença;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		diferença = (A*B) - (C*D);
		System.out.println("DIFERENÇA = " + diferença);
		
		sc.close();
	}

}
