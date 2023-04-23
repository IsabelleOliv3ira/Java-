import java.util.Scanner;

public class Main24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			if (n2 == 0) {
				System.out.println("Divisão impossível");
			}
			else {
				double produto = (double) n1 / n2;
				System.out.println(produto);
			}
		}
		
		sc.close();
	}

}
