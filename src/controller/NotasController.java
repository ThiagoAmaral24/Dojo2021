package controller;

public class NotasController {

    private int valor;
    private int qtd_notas_100;
    private int qtd_nota_50;
    private int qtd_nota_10;
    private int	qtd_nota_5;

    private int qtd_moeda_1;
    private int qtd_moeda_050;
    private int qtd_moeda_025;
    private int qtd_moeda_010;
    private int qtd_moeda_005;

    private Double validacaoNotas(){
        int qtd_notas_100 = valor / 100;
        valor -= qtd_notas_100;

        return null;
    }
}
