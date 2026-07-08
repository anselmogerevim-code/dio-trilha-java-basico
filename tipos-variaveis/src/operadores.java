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

    }

}
