import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, soma;
        System.out.println("Insira o primeiro valor: ");
        a = sc.nextInt();

        System.out.println("Insira o segundo valor: ");
        b = sc.nextInt();
        soma = a + b;

        System.out.println("SOMA = " + soma);

        sc.close();
    }
}