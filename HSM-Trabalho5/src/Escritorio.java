import java.util.List;

public class Escritorio{
    protected String nome;
    protected int codigo;
    protected List<Colaborador> colaboradores;
    protected String endereco;
    protected String inauguracao;
    protected double faturamento_mensal;

    public Escritorio(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public List<Colaborador> getColaboradores() {
        return colaboradores;
    }

    public void setColaborador(Colaborador colaboradores) {
        this.colaboradores.add(colaboradores);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInauguracao() {
        return inauguracao;
    }

    public void setInauguracao(String inauguracao) {
        this.inauguracao = inauguracao;
    }

    public double getFaturamento_mensal() {
        return faturamento_mensal;
    }

    public void setFaturamento_mensal(double faturamento_mensal) {
        this.faturamento_mensal = faturamento_mensal;
    }
}
