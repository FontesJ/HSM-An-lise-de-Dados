public class Colaborador extends Pessoa{
    protected long matricula;
    protected String cargo;
    protected double salario;

    public Colaborador(String nome, long matricula, String cargo, double salario) {
        super(nome);
        this.matricula = matricula;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Colaborador(String nome, long matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }
}
