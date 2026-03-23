package RaceConditionCorrigido;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Conta {
    private double saldo = 0.0;
    private final Lock lock = new ReentrantLock();

    public void depositar(double valor) {
        lock.lock();
        try {
            saldo += valor;
        } finally {
            lock.unlock();
        }
    }

    public double getSaldo() {
        return saldo;
    }
}