package controller;
import functions.NotaFunction;

public class NotasController {


    private int qtd_nota_100;
    private int qtd_nota_50;
    private int qtd_nota_20;
    private int qtd_nota_10;
    private int	qtd_nota_5;

    private int qtd_moeda_1;
    private int qtd_moeda_050;
    private int qtd_moeda_025;
    private int qtd_moeda_010;
    private int qtd_moeda_005;
    private int qtd_moeda_001;

    public String validacaoNotas(Double valor){
        Double total = valor;
        int qtd_nota_100 = (int) (valor / 100);
        valor -= (qtd_nota_100 * 100);

        int qtd_nota_50 = (int) (valor / 50);
        valor -= (qtd_nota_50 * 50);

        int qtd_nota_20 = (int) (valor / 20);
        valor -= (qtd_nota_20 * 20);

        int qtd_nota_10 = (int) (valor / 10);
        valor -= (qtd_nota_10 * 10);

        int qtd_nota_5 = (int) (valor / 5);
        valor -= (qtd_nota_5 * 5);

        int qtd_moeda_1 = (int) (valor / 1);
        valor -= (qtd_moeda_1 * 1);

        int qtd_moeda_050 = (int) (valor / 0.50);
        valor -= (qtd_moeda_050 * 0.50);

        int qtd_moeda_025 = (int) (valor / 0.25);
        valor -= (qtd_moeda_025 * 0.25);

        int qtd_moeda_010 = (int) (valor / 0.10);
        valor -= (qtd_moeda_010 * 0.10);

        int qtd_moeda_005 = (int) (valor / 0.05);
        valor -= (qtd_moeda_005 * 0.05);

        int qtd_moeda_001 = (int) (valor / 0.01);
        valor -= (qtd_moeda_001 * 0.01);

        return  qtd_nota_100 + " notas(s)  de R$ 100.00\n" +
                qtd_nota_50 + " notas(s)  de R$ 50.00\n" +
                qtd_nota_20 + " notas(s)  de R$ 20.00\n" +
                qtd_nota_10 + " notas(s)  de R$ 10.00\n" +
                qtd_nota_5 + " notas(s)  de R$ 5.00\n" +
                qtd_moeda_1 + " moedas(s) de R$ 1.00\n" +
                qtd_moeda_050 + " moedas(s) de R$ 0.50\n" +
                qtd_moeda_010 + " moedas(s) de R$ 0.10\n" +
                qtd_moeda_001 + " moedas(s) de R$ 0.01\n" +
                "Total: R$" + total + "\n"
                ;

    }

}
