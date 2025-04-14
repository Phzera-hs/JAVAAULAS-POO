package com.example.mamaocomacucar;

import com.example.mamaocomacucar.RandomNamesForProds.RandomNames;
import com.example.mamaocomacucar.produtos.Produtos;


/*A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco)
prestações sem juros. Faça um programa que receba um valor de uma
compra e mostre o valor das prestações */
public class Main {
    public static void main(String[] args) {
        Produtos[] listaProd = new Produtos[5];
        Double soma = 0.0;

        for(int i = 0; i < 5; i++){
            listaProd[i] = new Produtos();
            listaProd[i].setId_Prod(i+1);
            listaProd[i].setNameProd(RandomNames.getRandomName());
            listaProd[i].setPrice(RandomNames.getRandomPrice());
            
            soma += listaProd[i].getPrice();

            System.out.println("Produto ID: " + listaProd[i].getId_Prod());
            System.out.println("Produto Nome: " + listaProd[i].getNameProd());
            System.out.println("Produto Preço: " + String.format("%.2f", listaProd[i].getPrice()));
        }
        System.out.println("Total: R$ " + String.format("%.2f", soma));

        soma = soma/5;

        System.out.println("Se você for comprar os 5 produtos e parcelar em 5 vezes, o valor de cada parcela sera de: R$ " + String.format("%.2f", soma));

    }
}