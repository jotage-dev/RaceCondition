package RaceCondition;

public class Caixa implements Runnable {
    private Conta contaCompartilhada;
    public Caixa(Conta conta){
        this.contaCompartilhada = conta;
    }

    @Override
    public void run() {
        contaCompartilhada.depositar(10.0);
    }
}
