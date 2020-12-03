//Julio Cezar de Fontes Borges

import javax.swing.*;

public class MediaClasseSemestral {

    public static void main(String[] args){

        float prova[] = new float[3], projeto[] = new float[3], lista[] = new float[3];
        int qtde_alunos, controle = 0, aprovados=0, af=0, reprovados=0;;
        double mediaGeral = 0, mediaClasse = 0, somaAluno[] = new double[10], mediaAluno[] = new double[10],
        menor_nota = 0, maior_nota=0;

        qtde_alunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos: "));

        double notaBimestreAluno[] = new double[qtde_alunos];
        double notasAluno[][] = new double[qtde_alunos][10];

        do {
            for (int i = 0; i < 3; i++) {
                prova[i] = Float.parseFloat(JOptionPane.showInputDialog(
                        "Digite a nota do aluno "+ (controle+1) +" na prova do " + (i + 1) + " bimestre: "));
                projeto[i] = Float.parseFloat(JOptionPane.showInputDialog(
                        "Digite a nota do aluno "+ (controle+1) +" no projeto do " + (i + 1) + " bimestre: "));
                lista[i] = Float.parseFloat(JOptionPane.showInputDialog(
                        "Digite a nota do aluno "+ (controle+1) +" na lista do " + (i + 1) + " bimestre: "));

                notaBimestreAluno[i] = ((prova[i] * 0.5) + (projeto[i] * 0.3) + (lista[i] * 0.2));
                notasAluno[controle][i] = notaBimestreAluno[i];
                somaAluno[controle] += notasAluno[controle][i];
            }
            mediaAluno[controle] = somaAluno[controle]/3;
            mediaClasse += mediaAluno[controle];
            controle++;
        }while (controle < qtde_alunos) ;

        mediaGeral = mediaClasse/qtde_alunos;

        JOptionPane.showMessageDialog(null, "Média da Turma: " + mediaGeral);

        for(int i=0; i<qtde_alunos-1; i++){
            double x = mediaAluno[i], y=mediaAluno[i+1];
            if(y<x){
                menor_nota=y;
            }else{
                menor_nota=x;
            }
        }
        JOptionPane.showMessageDialog(null, "Menor nota: " + menor_nota);

        for(int i=0; i<qtde_alunos-1; i++){
            double x = mediaAluno[i];
            if(x>maior_nota){
                maior_nota=x;
            }
        }
        JOptionPane.showMessageDialog(null, "Maior nota: " + maior_nota);

        for(int i=0; i<=qtde_alunos-1; i++){
            if(mediaAluno[i] >= 8) {
                aprovados++;
            }
            else if(mediaAluno[i] < 8 && mediaAluno[i] >= 5 ){
                af++;
            }
            else{
                reprovados++;
            }
        }
        JOptionPane.showMessageDialog(null, "Aprovados: " + aprovados);
        JOptionPane.showMessageDialog(null, "reprovados: " + reprovados);
        JOptionPane.showMessageDialog(null, "Avaliação Final: " + af);
    }
}