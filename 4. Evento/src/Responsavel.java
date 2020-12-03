import java.util.List;

public class Responsavel{
    private String nome;
    private String telefone;
    private double valor_por_hora;

    public Responsavel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getValor_por_hora() {
        return valor_por_hora;
    }

    public void setValor_por_hora(double valor_por_hora) {
        this.valor_por_hora = valor_por_hora;
    }
}
