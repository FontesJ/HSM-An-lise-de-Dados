import javax.swing.*;
import java.util.List;

public class Evento {
    private String nome;
    private Responsavel responsavel;
    private String data_inicio;
    private String data_fim;
    private int carga_horaria;
    private List<Palestra> palestras;

    public Evento(String nome) {
        this.nome = nome;
    }

    public static double custosResponsavel(Evento evento){
        double valor = evento.getResponsavel().getValor_por_hora();
        int duracao = evento.getCarga_horaria();

        return valor*duracao;
    }

    public static double custoPalestra(Palestra palestra){
        float valor_palestrante = palestra.getPalestrante().getValor_hora();
        double duracao = palestra.getCarga_horaria();

        return valor_palestrante*duracao;
    }

    public static double valorTotalPalestras(Evento evento){
        List<Palestra> palestra = evento.getPalestras();
        int tamanho = palestra.size();
        double total=0;

        for(int i=0; i<tamanho; i++) {
            total += custoPalestra(palestra.get(i));
        }
        return total;
    }

    public static void palestranteMaisCaro(Evento evento){
        List<Palestra> palestra = evento.getPalestras();
        double custo_atual=0;
        double maior_custo=0;
        String palestrante_mais_caro = null;

        for(int i=0; i<palestra.size(); i++) {
            custo_atual = custoPalestra(palestra.get(i));
            if(custo_atual>maior_custo){
                maior_custo=custo_atual;
                palestrante_mais_caro = palestra.get(i).getPalestrante().getNome();
            }
        }
        JOptionPane.showMessageDialog(null,
                "Palestrante mais caro: "+palestrante_mais_caro);
    }

    public static void palestranteMaisBarato(Evento evento){
        List<Palestra> palestra = evento.getPalestras();
        double custo_atual=0;
        double menor_custo=0;
        String palestrante_mais_barato = null;

        for(int i=0; i<palestra.size(); i++) {
            custo_atual = custoPalestra(palestra.get(i));
            if(custo_atual<menor_custo){
                menor_custo=custo_atual;
                palestrante_mais_barato = palestra.get(i).getPalestrante().getNome();
            }
        }
        JOptionPane.showMessageDialog(null,
                "Palestrante mais caro: "+palestrante_mais_barato);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }

    public String getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    public String getData_fim() {
        return data_fim;
    }

    public void setData_fim(String data_fim) {
        this.data_fim = data_fim;
    }

    public int getCarga_horaria() {
        return carga_horaria;
    }

    public void setCarga_horaria(int carga_horaria) {
        this.carga_horaria = carga_horaria;
    }

    public List<Palestra> getPalestras() {
        return palestras;
    }

    public void setPalestras(Palestra palestra) {
        this.palestras.add(palestra);
    }
}
