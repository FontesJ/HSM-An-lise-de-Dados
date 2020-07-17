import javax.swing.*;
import java.util.Random;

public class ContaInvestimento extends Conta{
    private double saldo;
    private double saldo_anterior;
    private double saldo_especial;

    public ContaInvestimento() {
        this.saldo = 0;
        this.saldo_anterior = 0;
        this.saldo_especial = 0;
    }

    public void deposito(double deposito){
        this.saldo_anterior = this.saldo;
        double bonus = deposito * 0.01;
        this.saldo += (deposito + bonus);
        this.saldo_especial = this.saldo*2;
    }

    public void saque(double saque){
        this.saldo_anterior = this.saldo;
        this.saldo -= saque;
        this.saldo_especial = this.saldo*2;
    }

    public void limite(ContaInvestimento conta){
        double limite = this.saldo*2;
    }

    public void imprimirDadosInvestimento(ContaInvestimento conta){
        System.out.println("Número da conta: " + conta.getNumero_conta() +
                           "\nTitular da conta: " + conta.getNome() +
                           "\nAgencia: " + conta.getAgencia() +
                           "\nSaldo: " + conta.getSaldo() +
                           "\nLimite: " + conta.getSaldo_especial() +
                           "\nSaldo Anterior: " + conta.getSaldo_anterior());
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo_anterior() {
        return saldo_anterior;
    }

    public void setSaldo_anterior(double saldo_anterior) {
        this.saldo_anterior = saldo_anterior;
    }

    public double getSaldo_especial() {
        return saldo_especial;
    }

    public void setSaldo_especial(double saldo_especial) {
        this.saldo_especial = saldo_especial;
    }
}
