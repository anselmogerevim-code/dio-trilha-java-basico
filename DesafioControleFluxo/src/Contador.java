import java.util.Scanner; // Importa a classe Scanner para ler dados do usuário

public class Contador {
    public static void main(String[] args) {
        // Cria o objeto Scanner para capturar entrada do teclado
        Scanner terminal = new Scanner(System.in);

        // Solicita o primeiro parâmetro
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        // Solicita o segundo parâmetro
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        // Bloco try/catch para tratar exceção caso os parâmetros sejam inválidos
        try {
            contar(parametroUm, parametroDois); // Chama o método de contagem
        } catch (ParametrosInvalidosException e) {
            // Mensagem exibida se o segundo parâmetro for menor que o primeiro
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Fecha o Scanner para liberar recursos
        terminal.close();
    }

    // Método que realiza a contagem
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o segundo parâmetro é menor que o primeiro
        if (parametroDois < parametroUm) {
            throw new ParametrosInvalidosException(); // Lança exceção personalizada
        }

        System.out.println("========= Contagem =========");

        // Calcula a diferença entre os parâmetros
        int contagem = parametroDois - parametroUm;

        // Loop para imprimir os números de 0 até (contagem - 1)
        for (int i = 0; i < contagem; i++) {
            System.out.println(i+1); // Imprime o número atual + 1
        }
    }
}

