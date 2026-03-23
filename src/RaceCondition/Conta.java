package RaceCondition;

public class Conta {
    double saldo = 0.00;

    void depositar(double valor){
        saldo =+ valor + saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
