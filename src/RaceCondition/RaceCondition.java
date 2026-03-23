package RaceCondition;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {
        Conta c1 = new Conta();
        int threads = 1000;
        Thread[] threads1 = new Thread[threads];

        System.out.printf("Iniciando deposito...");

        for (int i = 0; i < threads; i++) {
            threads1[i] = new Thread(new Caixa(c1));
            threads1[i].start(); // Dá o "play" na thread
        }
        for (int i = 0; i < threads; i++) {
            threads1[i].join();
        }
        System.out.println("Todas as transacoes concluidas.");
        System.out.println("Saldo Final Esperado: R$ 10000.0");
        System.out.println("Saldo Final Real: R$ " + c1.getSaldo());
    }
}
