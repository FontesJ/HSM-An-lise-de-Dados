public class Filial extends Escritorio{
    protected Colaborador nome_responsavel;

    public Filial(String nome, int codigo, Colaborador responsavel) {
        super(nome, codigo);
        this.nome_responsavel = responsavel;
    }

    public Colaborador getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(Colaborador nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }
}
