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
        if(saque<this.saldo) {
            this.saldo_anterior = this.saldo;
            this.saldo -= saque;
        }
        else{
            System.out.println("Valor indisponível");
        }
    }

    public void imprimirDadosCorrente(ContaCorrente ccorrente, Conta conta){
        System.out.println( "\nNúmero da conta: " + conta.getNumero_conta() +
                            "\nTitular da conta: " + conta.getNome() +
                            "\nAgencia: " + conta.getAgencia() +
                            "\nSaldo: " + ccorrente.getSaldo() +
                            "\nSaldo Anterior: " + ccorrente.getSaldo_anterior() + "\n");
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
