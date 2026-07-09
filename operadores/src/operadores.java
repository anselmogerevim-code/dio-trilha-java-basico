public class operadores {
    public static void main(String[] args) {

        // classe Operadores.java

        // qual o resultado das expressoes abaixo?
        String concatenacao = "?";

        System.out.println(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        // Unários
        int numero = 5;

        System.out.println(-numero);

        // Verificando se numero é negativo ou positivo
        System.out.println(numero);

        // Atribuindo o valor negativo de numero para numero
        numero = -numero;

        System.out.println(numero);

        // Tornando numero positivo novamente
        numero = numero * -1;

        System.out.println(numero);

        // incrementando numero em 1 um numero, imprime 6
        numero++;
        System.out.println(numero);

        // incrementando numero em 1 um numero, imprime 7
        System.out.println(numero++); // imprime 6, o incremento só acontece na próxima linha

        // Agora sim imprime 7
        System.out.println(numero);

        // Ordem de precedência
        System.out.println(++numero); // imprime 8, o incremento acontece antes da impressão

        // (!) Operador unário lógico de negação
        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

        // classe Operadores.java
        int a, b;

        a = 5;
        b = 6;

        /*
         * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
         * if(a==b)
         * resultado = "verdadeiro";
         * else
         * resultado = "falso";
         */

        // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = a == b ? "verdadeiro" : "false";

        System.out.println(resultado);

        // Operadores Relacionais
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 > numero2) {
            System.out.println("=====Numero1 é menor que numero2====");

        } else {
            System.out.println("====Nossa condição é falsa====");
        }
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? " + simNao);

        simNao = numero1 < numero2;
        System.out.println("numero1 é maior que numero2? " + simNao);

        // Comparação de dois objetos ou textos:
        String nome1 = "Anselmo";
        // String nome2 = "Anselmo";
        String nome2 = new String("Anselmo");

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2)); // Utilizar .equals()

        Integer numero3 = 130;
        Integer numero4 = 130;

        System.out.println(numero3 == numero4); // false

        // A razão pela qual o resultado é false, é devido o Java tratar os valores
        // Como objetos a partir de agora.
        // Qual a solução ?
        // Quando queremos comparar objetos, usamos o método equals

        System.out.println(numero3.equals(numero4));

        // Operadores Lógicos:
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 || condicao2) {

            System.out.println("Pelo menos uma das condições é verdadeira");
            
        } if (condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
            
        } if (condicao1 && (7 > 4)) {
            
            System.out.println("As duas condições são verdadeiras");
            
        }
        System.out.println("Fim");

    }

}
