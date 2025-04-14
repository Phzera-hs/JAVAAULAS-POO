package com.example.cursocc;

import java.util.Scanner;

import com.example.cursocc.Calculos.NotasEPesos;
import com.example.cursocc.StatusPessoa.Aluno;
import com.example.cursocc.StatusPessoa.ClassificacaoAluno;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double soma;

        System.out.print("Digite o nome do aluno: ");
        String name = sc.next();

        System.out.printf("Digite o rgm de %s: ", name);
        String rgm = sc.next();

        Aluno aluno = new Aluno(name, rgm);

        aluno.notas[0] = 5.3;
        aluno.notas[1] = 5.3;
        aluno.notas[2] = 8.3;

        aluno.notas[0] = NotasEPesos.retornaNotaLaboratorio(aluno.notas[0]);
        // System.out.println("NOTA LAB = " + aluno.notas[0]);

        aluno.notas[1] = NotasEPesos.retornaNotaAvSemestral(aluno.notas[1]);
        // System.out.println("NOTA AVS = " + aluno.notas[1]);
        
        aluno.notas[2] = NotasEPesos.retornaNotaProvaFinal(aluno.notas[2]);
        // System.out.println("NOTA PROVA FINAL = " + aluno.notas[2]);

        soma = aluno.notas[0] + aluno.notas[1] + aluno.notas[2]; 

        aluno.mediaPonde = NotasEPesos.retornaMedia(soma);
        aluno.ClasseAluno = ClassificacaoAluno.ClasseDoAluno(aluno.mediaPonde);

        System.out.println("-- Relatorio Aluno --");
        System.out.println("Nome: " + aluno.getName());
        System.out.println("RGM: " + aluno.getRgm());
        System.out.println("Nota Final: " + aluno.mediaPonde);
        System.out.println("Classificacao: " + aluno.ClasseAluno);

    }
}