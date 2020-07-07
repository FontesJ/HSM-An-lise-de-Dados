import java.util.List;

public class Principal {

    public static void main(String[] args){
        double x,y;

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
        filial1.setColaborador(c3);
        Filial filial2 = new Filial("Filial MG", 003, c4);
        Filial filial3 = new Filial("Filial RJ", 004, c6);

        Filial filial4 = new Filial("Filial PE", 2, c2);
        Filial filial5 = new Filial("Filial AM", 3, c5);

        Sede sede1 = new Sede("Brasil", 001);
        Sede sede2 = new Sede("Brasil", 1);

        empresa1.setSocio(s1);
        empresa1.setSocio(s3);
        empresa1.setSede(sede1);
        empresa1.setFilial(filial1);
        empresa1.setFilial(filial2);
        empresa1.setFilial(filial3);

        empresa2.setSocio(s2);
        empresa2.setSede(sede2);
        empresa2.setFilial(filial4);
        empresa2.setFilial(filial5);

        List<Empresa> empresas = null;
        empresas.add(empresa1);
        empresas.add(empresa2);

        x = Empresa.faturamentoAnual(empresa1);
        System.out.println("Faturamento anual na "+ empresa1.getNome() +": " + x);

        String z = Empresa.filialMaiorFaturamento(empresa1);
        System.out.println("filial com maior faturamento na "+ empresa1.getNome() +": " + z);

        z = Empresa.filialMenorFaturamento(empresa1);
        System.out.println("filial com menor faturamento na "+ empresa1.getNome() +": " + z);

        x = Empresa.mediaSalarial(empresa1);
        System.out.println("Média salarial na "+ empresa1.getNome() +": " + x);

        x = Empresa.balancoAnual(empresa1);
        System.out.println("Balanço anual na "+ empresa1.getNome() +": " + x);


        x = Empresa.faturamentoAnual(empresa2);
        System.out.println("Faturamento anual na "+ empresa2.getNome() +": " + x);

        z = Empresa.filialMaiorFaturamento(empresa2);
        System.out.println("filial com maior faturamento na "+ empresa2.getNome() +": " + z);

        z = Empresa.filialMenorFaturamento(empresa2);
        System.out.println("filial com menor faturamento na "+ empresa2.getNome() +": " + z);

        x = Empresa.mediaSalarial(empresa2);
        System.out.println("Média salarial na "+ empresa2.getNome() +": " + x);

        x = Empresa.balancoAnual(empresa2);
        System.out.println("Balanço anual na "+ empresa2.getNome() +": " + x);

    }
}
