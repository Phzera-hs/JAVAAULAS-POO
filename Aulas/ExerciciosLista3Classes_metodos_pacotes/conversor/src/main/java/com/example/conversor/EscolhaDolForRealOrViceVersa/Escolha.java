package com.example.conversor.EscolhaDolForRealOrViceVersa;

import java.util.Scanner;

public class Escolha {

    private static final Scanner sc = new Scanner(System.in);

    public static void forReal() {
        System.out.print("Quantidade de Dolar\n$");
        Double dolar = sc.nextDouble();
        System.out.print("Cotação:");
        Double cotacao = sc.nextDouble();
    
        Double real = dolar * cotacao;
    
        System.out.printf("\n--- Dólar → Real ---\nDólar: $%.2f\nCotação: R$%.2f\nValor Final: R$%.2f\n", dolar, cotacao, real);
    }

    public static void forDol() {
        System.out.print("Quantidade de Reais\nR$");
        Double real  = sc.nextDouble();

        System.out.print("Cotação:");
        Double cotacao  = sc.nextDouble();

        Double dolar = real / cotacao;

        System.out.printf("\n--- Real → Dólar ---\nReal: R$%.2f\nCotação: R$%.2f\nValor Final: $%.2f\n", real, cotacao, dolar);
    }

}
