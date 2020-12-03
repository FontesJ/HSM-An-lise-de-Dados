public class Socio extends Pessoa {
    protected float sociedade;  //quantidade de ações que o sócio tem

    public Socio(String nome) {
        super(nome);
    }

    public float getSociedade() {
        return sociedade;
    }

    public void setSociedade(float sociedade) {
        this.sociedade = sociedade;
    }
}
