import javax.swing.*;

public class Principal {

    public static void main(String[] args){
        Conta conta = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaInvestimento ci = new ContaInvestimento();
        int resp;

        String nome = JOptionPane.showInputDialog("Seu nome: ");
        String cpf = JOptionPane.showInputDialog("Seu CPF: ");
        conta.setNome(nome);
        conta.setCpf(cpf);

        JOptionPane.showMessageDialog(null,
         "Parabéns, Agora você possui uma Conta corrente e uma Conta Investimento!");

        try{
            cc.imprimirDadosCorrente(cc, conta);
        }catch (NullPointerException npe){
            System.out.println("Não possui conta corrente");
        }

        try{
            ci.imprimirDadosInvestimento(ci, conta);
        }catch (NullPointerException npe){
            System.out.println("Não possui conta investimento");
        }

        do {

            resp = Integer.parseInt(JOptionPane.showInputDialog("O que deseja fazer?\n" +
                    "1. Ver Saldo\n" +
                    "2. Saque\n" +
                    "3. Depósito\n" +
                    "0. Sair\n"));

            if (resp == 1) {
                try {
                    cc.imprimirDadosCorrente(cc, conta);
                } catch (NullPointerException npe) {
                    System.out.println("Não possui conta corrente");
                }

                try {
                    ci.imprimirDadosInvestimento(ci, conta);
                } catch (NullPointerException npe) {
                    System.out.println("Não possui conta investimento");
                }
            }

            if(resp == 2){
                try {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog(
                            "Valor que deseja sacar: "));

                    int resp2 = Integer.parseInt(JOptionPane.showInputDialog(
                            "Em qual conta deseja realizar o saque?\n" +
                            "1. Conta Corrente\n" +
                            "2. Conta investimento\n"));

                    if (resp2 == 1) {
                        cc.saque(valor);
                    }
                    if (resp2 == 2) {
                        ci.saque(valor);
                    } else {
                        System.out.println("Valor não reconhecido!");
                    }
                } catch (ClassCastException cce) {
                    JOptionPane.showMessageDialog(null,
                            "Valor digitado incorreto!");
                } catch (NullPointerException npe) {
                    JOptionPane.showMessageDialog(null,
                            "Ocorreu um erro! Fechando programa...");
                }
            }

            if(resp == 3) {
                try {
                    double valor = Double.parseDouble(JOptionPane.showInputDialog(
                            "Valor que deseja depositar: "));

                    int resp2 = Integer.parseInt(JOptionPane.showInputDialog("Em qual conta deseja depositar?\n" +
                            "1. Conta Corrente\n" +
                            "2. Conta investimento\n"));

                    if (resp2 == 1) {
                        cc.deposito(valor);
                    }
                    if (resp2 == 2) {
                        ci.deposito(valor);
                    } else {
                        System.out.println("Valor não reconhecido!");
                    }
                } catch (ClassCastException cce) {
                    JOptionPane.showMessageDialog(null,
                            "Valor digitado incorreto!");
                } catch (NullPointerException npe) {
                    JOptionPane.showMessageDialog(null,
                            "Ocorreu um erro! Fechando programa...");
                }
            }
        }while(resp != 0);
    }
}
