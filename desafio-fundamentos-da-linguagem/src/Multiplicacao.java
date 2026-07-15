// Abaixo segue um exemplo de código que você pode ou não utilizar
import java.util.Scanner;

public class Multiplicacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int fator1, fator2, prod;
		System.out.println("Insira o primeiro valor: ");
		fator1 = sc.nextInt();

		System.out.println("Insira o segundo valor: ");
		fator2 = sc.nextInt();

		prod = fator1 * fator2;

		System.out.println("PROD = " + prod);

        sc.close();
	}


}