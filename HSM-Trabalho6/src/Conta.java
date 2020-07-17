import javax.swing.*;
import java.util.Random;

public class Conta {
    private String nome;
    private String cpf;
    private String agencia;
    private int numero_conta;

    public Conta() {
        Random n = new Random();
        this.numero_conta = n.nextInt((9999-0)+1)+0;
        this.agencia = "000";
    }

    public void cadastro(){
        String nome = JOptionPane.showInputDialog(null, "Seu nome: ");
        String cpf = JOptionPane.showInputDialog(null, "Seu CPF: ");
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }
}
