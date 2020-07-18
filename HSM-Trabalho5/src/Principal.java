import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args){
        List<Colaborador> colaboradores1 = new ArrayList<>();
        List<Colaborador> colaboradores2 = new ArrayList<>();
        List<Colaborador> colaboradores3 = new ArrayList<>();
        List<Socio> socios1 = new ArrayList<>();
        List<Socio> socios2 = new ArrayList<>();
        List<Filial> filiais1 = new ArrayList<>();
        List<Filial> filiais2 = new ArrayList<>();

        Empresa empresa1 = new Empresa("Exemplo SA");
        Empresa empresa2 = new Empresa("Exemplo 2.0 LTDA");

        Socio s1 = new Socio("Marcelo Pompeu");
        Socio s2 = new Socio("Alex Kolesne");
        Socio s3 = new Socio("Mayara Puertas");

        Colaborador c1 = new Colaborador("João da Silva", 10001);
        c1.setSalario(2500.00);
        Colaborador c2 = new Colaborador("Maria de Sousa", 10002);
        c2.setSalario(4400.00);
        Colaborador c3 = new Colaborador("Ana Duarte", 10003);
        c3.setSalario(1800.00);
        Colaborador c4 = new Colaborador("José Soares", 20001);
        c4.setSalario(2000.00);
        Colaborador c5 = new Colaborador("Julio Borges", 20002);
        c5.setSalario(10000.00);
        Colaborador c6 = new Colaborador("Marina Fontes", 30001);
        c6.setSalario(5300.00);

        Filial filial1 = new Filial("Filial SP", 002, c1);
        colaboradores1.add(c3);
        filial1.setColaboradores(colaboradores1);
        Filial filial2 = new Filial("Filial RJ", 004, c6);
        colaboradores2.add(c4);
        filial2.setColaboradores(colaboradores2);

        Filial filial3 = new Filial("Filial PE", 2, c2);
        colaboradores3.add(c4);
        filial3.setColaboradores(colaboradores3);

        Sede sede1 = new Sede("Brasil", 001);
        Sede sede2 = new Sede("Brasil", 1);

        socios1.add(s1);
        socios1.add(s3);
        empresa1.setSocios(socios1);
        empresa1.setSede(sede1);
        filiais1.add(filial1);
        filiais1.add(filial2);
        empresa1.setFiliais(filiais1);

        socios2.add(s2);
        empresa2.setSocios(socios2);
        empresa2.setSede(sede2);
        filiais2.add(filial3);
        empresa2.setFiliais(filiais2);

        List<Empresa> empresas = new ArrayList<>();
        empresas.add(empresa1);
        empresas.add(empresa2);

        double faturamento_anual_1 = Empresa.faturamentoAnual(empresa1);
        System.out.println("Faturamento anual na "+ empresa1.getNome() +": " + faturamento_anual_1);

        String filial_maior_faturamento = Empresa.filialMaiorFaturamento(empresa1);
        System.out.println("filial com maior faturamento na "+ empresa1.getNome() +
                            ": " + filial_maior_faturamento);

        String filial_menor_faturamento = Empresa.filialMenorFaturamento(filiais1);
        System.out.println("filial com menor faturamento na "+ empresa1.getNome() +
                            ": " + filial_menor_faturamento);

        double media_salarial= Empresa.mediaSalarial(filiais1);
        System.out.println("Média salarial na "+ empresa1.getNome() +": " + media_salarial);

        double balanco_anual = Empresa.balancoAnual(empresa1);
        System.out.println("Balanço anual na "+ empresa1.getNome() +": " + balanco_anual);


        double faturamento_anual_2 = Empresa.faturamentoAnual(empresa2);
        System.out.println("Faturamento anual na "+ empresa2.getNome() +": " + faturamento_anual_2);

        String filial_maior_faturamento2 = Empresa.filialMaiorFaturamento(empresa2);
        System.out.println("filial com maior faturamento na "+ empresa2.getNome() +
                            ": " + filial_maior_faturamento2);

        String filial_menor_faturamento2 = Empresa.filialMenorFaturamento(filiais2);
        System.out.println("filial com menor faturamento na "+ empresa2.getNome() +
                            ": " + filial_menor_faturamento2);

        double media_salarial2 = Empresa.mediaSalarial(filiais2);
        System.out.println("Média salarial na "+ empresa2.getNome() +": " + media_salarial2);

        double balanco_anual2 = Empresa.balancoAnual(empresa2);
        System.out.println("Balanço anual na "+ empresa2.getNome() +": " + balanco_anual2);

    }
}
