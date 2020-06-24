import javax.swing.*;

public class MediaSemestral2 {

    public static void main(String[] args){

        float prova[] = new float[3], projeto[] = new float[3], lista[] = new float[3];
        double media = 0;

        for(int i = 0; i<3; i++) {
            prova[i] = Float.parseFloat(JOptionPane.showInputDialog(
                    "Digite a nota da prova do "+ (i+1) +" bimestre: "));
            projeto[i] = Float.parseFloat(JOptionPane.showInputDialog(
                    "Digite a nota do projeto do "+ (i+1) +" bimestre: "));
            lista[i] = Float.parseFloat(JOptionPane.showInputDialog(
                    "Digite a nota da lista do "+ (i+1) +" bimestre: "));

            media = ((prova[i]*0.5) + (projeto[i]*0.3) + (lista[i]*0.2)) + media;
        }
        media /= 3;

        if(media >= 8){
            JOptionPane.showMessageDialog(null,"Aluno aprovado! \n" +
                    "Média: " + media);
        }
        else if(media >=5 && media <=7.9){
            JOptionPane.showMessageDialog(null,"Realizar Avaliação Final! \n" +
                    "Média mínima para aprovação: 8.0\n" +
                    "Média mínima para AF: 5.0\n" +
                    "Média: " + media);
        }

        else{
            JOptionPane.showMessageDialog(null,"Aluno reprovado!\n" +
                    "Média mínima para aprovação: 8.0\n" +
                    "Média: " + media);
        }
    }
}
