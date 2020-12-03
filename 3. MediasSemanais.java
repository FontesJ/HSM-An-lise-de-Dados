import javax.swing.*;

public class MediasSemanais {

    public static void main(String[] args){

        double acoes[][] = new double[4][7], media_semanal[] = new double[4], media_mensal =0;

        int semanas = Integer.parseInt(JOptionPane.showInputDialog("Em qual semana estamos?"));

        for(int i=0; i<semanas; i++){
            for(int j=0; j<7; j++) {
                acoes[i][j] = nota(j, i);
            }
        }
        media_semanal(acoes, media_semanal, semanas);

        media_mensal = media_mensal(media_semanal, semanas);
    }

    public static double nota(int dia, int semana){
        double nota=0;
        nota = Integer.parseInt(JOptionPane.showInputDialog(
               "Ações do dia "+(dia+1)+" da semana "+(semana+1)+": "));
        return nota;
    }

    public static void media_semanal(double[][] acoes, double[] media_s, int semanas){
        for(int i=0; i<semanas; i++){
            double media = 0;
            for(int j=0; j<7; j++){
                media += acoes[i][j];
            }
        media_s[i] = media/7;
        JOptionPane.showMessageDialog(null, "média semana "+(i+1)+": "+ media_s[i]);
        }
    }

    public static double media_mensal(double[] acoes, int semanas){
        double media = 0;
        for(int i=0; i<acoes.length; i++){
            media+= acoes[i];
        }
        double media_m = media/semanas;
        JOptionPane.showMessageDialog(null, "média ações mensal: "+ media_m);

        return media_m;
    }
}
