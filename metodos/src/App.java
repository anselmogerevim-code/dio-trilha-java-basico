public class App {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        double resultadoSoma = myClass.somar(5, 10);
        myClass.imprimir("Resultado da soma: " + resultadoSoma);

        try {
            double resultadoDivisao = myClass.dividir(10, 0);
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        } catch (Exception e) {
            System.err.println("Erro ao dividir: " + e.getMessage());
        }

        myClass.metodoPrivado(); // Este método não pode ser chamado de fora da classe MyClass

    }


    
}
