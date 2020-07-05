import java.util.List;

public class Principal{

    public static void main(String[] args){

        Evento evento1 = new Evento("aniversario museu");
        Palestra palestra1 = new Palestra("Dinossauros");
        Palestra palestra2 = new Palestra("Arqueologia");
        Palestra palestra3 = new Palestra("Brasil Colonial");
        Palestrante palestrante1 = new Palestrante("João da Silva");
        Palestrante palestrante2 = new Palestrante("Ana Carolina de Sousa");
        Responsavel responsavel = new Responsavel("José dos Santos");

        palestrante1.setTelefone("9999-9999");
        palestrante1.setValor_hora(125);

        palestrante2.setTelefone("8888-8888");
        palestrante2.setValor_hora(105);

        palestra1.setDescricao("Período Jurássico e suas criaturas");
        palestra1.setInicio("13h00min");
        palestra1.setCarga_horaria(1.5);
        palestra1.setPalestrante(palestrante1);

        palestra2.setDescricao("Escavações no Egito e suas descobertas");
        palestra2.setInicio("15h20min");
        palestra2.setCarga_horaria(2);
        palestra2.setPalestrante(palestrante1);

        palestra3.setDescricao("Política do Brasil do séc XVI");
        palestra3.setInicio("11h30min");
        palestra3.setCarga_horaria(1.25);
        palestra3.setPalestrante(palestrante2);

        responsavel.setTelefone("7777-7777");
        responsavel.setValor_por_hora(400);

        evento1.setResponsavel(responsavel);
        evento1.setCarga_horaria(8);
        evento1.setPalestras(palestra1);
        evento1.setPalestras(palestra2);
        evento1.setPalestras(palestra3);
        evento1.setData_inicio("04/07/2020");
        evento1.setData_fim("05/07/2020");

        System.out.println("Custo por responsável: "+evento1.custosResponsavel(evento1));

        for(int i=0;i<evento1.getPalestras().size(); i++) {
            double custo = 0;
            custo = evento1.custoPalestra(evento1.getPalestras().get(i));
            System.out.println("Custo palestra '"+evento1.getPalestras().get(i).getTitulo()+"': "+custo);
        }

        double custo_total = evento1.valorTotalPalestras(evento1);
        System.out.println("valor total das palestras: "+custo_total);

        evento1.palestranteMaisCaro(evento1);

        evento1.palestranteMaisBarato(evento1);

    }
}
