import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSeja bem-vindo ao nosso banco, para criar sua conta, por favor, digite as informações abaixo: ");
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0.0;

        System.out.println("\nPor favor, digite o número da agência: ");
        agencia = scanner.nextLine();


        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine();//Limpeza do buffer do scanner

        System.out.println("Por favor, digite seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.println("================== Conta Criada com Sucesso! ==================");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    scanner.close();
    }
}
