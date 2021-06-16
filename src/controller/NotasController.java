package controller;

public class NotasController {

    private int qtd_notas_100;
    private int qtd_nota_50;
    private int qtd_nota_10;
    private int	qtd_nota_5;

    private int qtd_moeda_1;
    private int qtd_moeda_050;
    private int qtd_moeda_025;
    private int qtd_moeda_010;
    private int qtd_moeda_005;

    private String validacaoNotas(int valor){
        int qtd_notas_100 = valor / 100;
        valor -= (qtd_notas_100 * 100);

        int qtd_nota_50 = valor / 50;
        valor -= (qtd_nota_50 * 50);

        int qtd_nota_10 = valor / 10;
        valor -= (qtd_nota_10 * 10);

        int qtd_nota_5 = valor / 5;
        valor -= (qtd_nota_5 * 5);

        int qtd_moeda_1 = valor / 1;
        valor -= (qtd_moeda_1 * 1);

        int qtd_moeda_050 = valor / (50/100);
        valor -= (qtd_moeda_050 * (50/100));

        int qtd_moeda_025 = valor / (25/100);
        valor -= (qtd_moeda_025 * (25/100));

        int qtd_moeda_010 = valor / (10/100);
        valor -= (qtd_moeda_010 * (10/100));

        int qtd_moeda_005 = valor / (5/100);
        valor -= (qtd_moeda_005 * (5/100));

        return "";
    }
}
