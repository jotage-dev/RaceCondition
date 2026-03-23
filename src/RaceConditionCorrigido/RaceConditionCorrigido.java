package RaceConditionCorrigido;

public class RaceConditionCorrigido {
    public static void main(String[] args) throws InterruptedException {

        Conta minhaConta = new Conta();

        int numeroDeThreads = 1000;
        Thread[] threads = new Thread[numeroDeThreads];

        System.out.println("Iniciando depósitos...");

        long tempoInicio = System.currentTimeMillis();

        for (int i = 0; i < numeroDeThreads; i++) {
            threads[i] = new Thread(new Caixa(minhaConta));
            threads[i].start();
        }

        for (int i = 0; i < numeroDeThreads; i++) {
            threads[i].join();
        }

        // MARCA O TEMPO FINAL
        long tempoFim = System.currentTimeMillis();
        long tempoTotal = tempoFim - tempoInicio;

        System.out.println("Todas as transacoes concluidas.");
        System.out.println("Saldo Final Esperado: R$ 10000.0");
        System.out.println("Saldo Final Real: R$ " + minhaConta.getSaldo());
        System.out.println("Tempo total de execucao: " + tempoTotal + " milissegundos");
    }
}