import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        // selecaoCandidatos();
        //imprimirSelecinados();
        String[] candidatos = { "FELIPE", "JOAO", "MARIA", "LUCAS", "ANA" };
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);

        }

    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu=false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuarTentando && tentativasRealizadas < 3);
        if (atendeu)
            System.out.println("CONSEGUIMOS COTATO COM O CANDIDATO " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS COTATO COM O CANDIDATO " + candidato + " NÚMERO DE TENTATIVA " + tentativasRealizadas);


    }
    // Método auxiliar
    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecinados() {
        String[] candidatos = { "FELIPE", "JOAO", "MARIA", "LUCAS", "ANA" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O canditado de nº " + (indice + 1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma mais simples de imprimir a lista de candidatos:");
        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }

    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "JOAO", "MARIA", "LUCAS", "ANA", "MARIA", "LUCAS", "FELIPE", "PAULO",
                "jOAQUINA" };

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou esse valor de salario " + salarioPretendido);
            if (salarioBase > salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidatosAtual++;

        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        else {
            System.out.println("AGUARDANDO O RESULTADO DO DEMAIS CANDIDATOS");
        }
    }
}
