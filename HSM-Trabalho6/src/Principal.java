import javax.swing.*;

public class Principal {

    public static void main(String[] args){
        Conta conta = new Conta();

        conta.cadastro();

        String resp = JOptionPane.showInputDialog("Deseja criar uma Conta Corrente? [S/N]");

        if(resp == "S"){
            ContaCorrente cc = new ContaCorrente();
            cc.setNumero_conta(conta.getNumero_conta());
            cc.imprimirDadosCorrente(cc);
        }

        resp = JOptionPane.showInputDialog("Deseja criar uma Conta Corrente? [S/N]");

        if(resp == "S"){
            ContaInvestimento ci = new ContaInvestimento();
            ci.setNumero_conta(conta.getNumero_conta());
            ci.imprimirDadosInvestimento(ci);
        }

        

    }
}
