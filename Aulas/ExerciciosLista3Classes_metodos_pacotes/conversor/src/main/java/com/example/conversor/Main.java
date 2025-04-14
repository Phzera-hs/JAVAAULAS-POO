package com.example.conversor;

import java.util.Scanner;

import com.example.conversor.EscolhaDolForRealOrViceVersa.Escolha;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int escolha;
    System.out.println("1 = Dolar -> Real\n2 = Real -> Dolar");
    escolha = sc.nextInt();
    if(escolha == 1){
        Escolha.forReal();
    }else if(escolha == 2){
        Escolha.forDol();
    }else{
        System.out.println("Escolha incorreta!");
    }


    }
}