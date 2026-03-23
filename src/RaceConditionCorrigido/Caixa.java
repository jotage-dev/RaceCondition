package RaceConditionCorrigido;

public class Caixa implements Runnable {
    private Conta contaAlvo;

    public Caixa(Conta conta) {
        this.contaAlvo = conta;
    }

    @Override
    public void run() {
        contaAlvo.depositar(10.0);
    }
}