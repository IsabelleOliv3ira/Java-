import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int termino = sc.nextInt();
		
		int duracao;
		
		if (inicio < termino) {
			duracao = termino - inicio;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		else {
			duracao = 24 - inicio + termino;
			System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		}
		
		sc.close();
	}

}
