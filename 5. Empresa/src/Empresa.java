import java.util.List;

public class Empresa {
    protected String nome;
    protected String cnpj;
    protected String inauguracao;
    protected List<Socio> socios;
    protected List<Filial> filiais;
    protected Sede sede;

    public Empresa(String nome) {
        this.nome = nome;
    }

    public static double faturamentoAnual(Empresa empresa){
        if(empresa.getFiliais() != null) {
            double faturamento = 0;
            if (empresa.getFiliais() !=null){
                for(int i=0; i<empresa.getFiliais().size(); i++){
                    faturamento += empresa.getFiliais().get(i).getFaturamento_mensal();
                }
            faturamento *= 12;
            }
            faturamento += (empresa.getSede().getFaturamento_mensal()*12);

            return faturamento;
        }
        else{
            return -1;
        }
    }

    public static String filialMaiorFaturamento(Empresa empresa){
         if(empresa.getFiliais() != null) {
             String filial_maior_faturamento = null, filial_atual;
             double maior_faturamento = 0, faturamento_atual;
             for (int i = 0; i < empresa.getFiliais().size(); i++) {
                 faturamento_atual = empresa.getFiliais().get(i).getFaturamento_mensal();
                 filial_atual = empresa.getFiliais().get(i).getNome();
                 if (faturamento_atual > maior_faturamento) {
                     maior_faturamento = faturamento_atual;
                     filial_maior_faturamento = filial_atual;
                 }
             }
             return filial_maior_faturamento;
         }
         else{
             return "Nenhuma filial associada";
         }
    }

    public static String filialMenorFaturamento(List<Filial> filiais){
        String filial_menor_faturamento = null, filial_atual;
        double menor_faturamento = 0, faturamento_atual;

        for(int i=0; i<filiais.size(); i++){
            faturamento_atual = filiais.get(i).getFaturamento_mensal();
            filial_atual = filiais.get(i).getNome();

            if(faturamento_atual < menor_faturamento){
                menor_faturamento = faturamento_atual;
                filial_menor_faturamento = filial_atual;
            }
        }
        return filial_menor_faturamento;
    }

    public static double mediaSalarial(List<Filial> filiais){
        double salarios_filial = 0, salario_empresa = 0;
        int quantidade_funcionarios = 0;

        for(int i=0; i<filiais.size(); i++){
            Filial filial_atual = filiais.get(i);
            List<Colaborador> colaboradores = filial_atual.getColaboradores();
            try {
                quantidade_funcionarios += colaboradores.size();
            }catch(NullPointerException npe){
                System.out.println("Nenhum funcionário cadastrtadana filial " +
                                    filial_atual.getNome());
            }

            for(int j=0; j<colaboradores.size(); j++){
                Colaborador colaborador = colaboradores.get(j);
                salarios_filial += colaborador.getSalario();
            }
            salario_empresa += salarios_filial;
        }

        return salario_empresa/quantidade_funcionarios;
    }

    public static double somaSalarial(Empresa empresa){
        double salarios_filial = 0, salario_empresa = 0;
        int filiais = empresa.getFiliais().size(), quantidade_funcionarios = 0;
        for(int i=0; i<filiais; i++){
            Filial filial =  empresa.getFiliais().get(i);
            int funcionarios = filial.getColaboradores().size();

            for(int j=0; j<funcionarios;j++) {
                salarios_filial += filial.getColaboradores().get(j).getSalario();
            }
            salario_empresa += salarios_filial;
        }
        return salario_empresa;
    }

    public static double balancoAnual(Empresa empresa){
        double faturamento_anual = faturamentoAnual(empresa);
        double despesas_anuais = somaSalarial(empresa);

        return  faturamento_anual - despesas_anuais;
    }

    public static List<Socio> sociosNegativos(List<Empresa> empresa){
        double balanco = 0;
        List<Socio> socios_negativos = null;
        for(int i=0; i<empresa.size(); i++) {
            balanco = balancoAnual(empresa.get(i));
            if (balanco < 0) {
                Empresa auxiliar = empresa.get(i);
                for (int j = 0; j < auxiliar.getSocios().size(); j++) {
                    socios_negativos.add(auxiliar.getSocios().get(j));
                }
            }
            else{
                continue;
            }
        }
        return socios_negativos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInauguracao() {
        return inauguracao;
    }

    public void setInauguracao(String inauguracao) {
        this.inauguracao = inauguracao;
    }

    public List<Socio> getSocios() {
        return socios;
    }

    public void setSocios(List<Socio> socios) {
        this.socios = socios;
    }

    public List<Filial> getFiliais() {
        return filiais;
    }

    public void setFiliais(List<Filial> filiais) {
        this.filiais = filiais;
    }

    public Sede getSede() {
        return sede;
    }

    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
