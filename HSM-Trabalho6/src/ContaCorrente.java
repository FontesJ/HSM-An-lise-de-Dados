public class ContaCorrente extends Conta {
    private double saldo;
    private double saldo_anterior;

    public ContaCorrente() {
        this.saldo = 0;
        this.saldo_anterior = 0;
    }

    public void deposito(double deposito){
        this.saldo_anterior = this.saldo;
        this.saldo += deposito;
    }

    public void saque(double saque){
        this.saldo_anterior = this.saldo;
        this.saldo -= saque;
    }

    public void imprimirDadosCorrente(ContaCorrente conta){
        System.out.println( "Número da conta: " + conta.getNumero_conta() +
                            "\nTitular da conta: " + conta.getNome() +
                            "\nAgencia: " + conta.getAgencia() +
                            "\nSaldo: " + conta.getSaldo() +
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
}
