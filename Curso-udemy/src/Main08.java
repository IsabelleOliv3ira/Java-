import java.util.Scanner;

public class Main08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("�MPAR");
		}
		
		sc.close();
	}

}
