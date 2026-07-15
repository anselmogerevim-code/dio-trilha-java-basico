import java.util.Scanner;
import java.util.Locale;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        double a, b, media;

        System.out.println("Insira o primeiro valor: ");
        a = sc.nextDouble();

        System.out.println("Insira o segundo valor: ");
        b = sc.nextDouble();

        media = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("MEDIA = %.5f", media);
        System.out.println();

        sc.close();
    }
}