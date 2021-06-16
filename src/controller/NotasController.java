package controller;

public class NotasController {

    private int qtd_notas_100;
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
        int qtd_notas_100 = (int) (valor / 100);
        valor -= (qtd_notas_100 * 100);

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

        return "Notas 100: " + qtd_notas_100 + "\n" +
                "Notas 50: " + qtd_nota_50 + "\n" +
                "Notas 20: " + qtd_nota_20 + "\n" +
                "Notas 10: " + qtd_nota_10 + "\n" +
                "Notas 5: " + qtd_nota_5 + "\n" +
                "Moedas 1: " + qtd_moeda_1 + "\n" +
                "Moedas 0,50: " + qtd_moeda_050 + "\n" +
                "Moedas 0,25: " + qtd_moeda_025 + "\n" +
                "Moedas 0,10: " + qtd_moeda_010 + "\n" +
                "Moedas 0,05: " + qtd_moeda_005 + "\n" +
                "Moedas 0,01: " + qtd_moeda_001 + "\n" +
                "Total: R$" + total;

    }
}
