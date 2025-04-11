package com.example.notaarimeticaum;

import java.util.Scanner;

import com.example.notaarimeticaum.notas.Nota;

/*Escrever um programa que leia o nome de um aluno e as notas das três
provas que ele obteve no semestre. No final informar o nome do aluno e a sua
média (aritmética). */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno");
        String nome = sc.nextLine();


        Nota n1 = new Nota("Portugues", 5.9);
        Nota n2 = new Nota("Portugues", 2.5);
        Nota n3 = new Nota("Portugues", 10.0);

        Double media = Nota.mediaArimetica(n1.valor,n2.valor,n3.valor);
        System.out.println("\nAluno: " + nome);
        System.out.printf("Média: %.2f\n", media);

        if(media >= 6) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

        sc.close();

    }
}