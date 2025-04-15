package com.example.empresareajuste;

import com.example.empresareajuste.Funcionarios.PessoasDoTrabalho;
import com.example.empresareajuste.randomizeSalario.RandomCash;
import com.example.empresareajuste.salarios.Reajuste;

/*Escrever um programa para uma empresa que decide dar um reajuste a
seus 584 funcionáriosde acordo com os seguintes critérios:
a) 50% para aqueles que ganham menos do que três salários mínimos;
b) 20% para aqueles que ganham entre três até dez salários mínimos;
c) 15% para aqueles que ganham acima de dez até vinte salários
mínimos;
d) 10% para os demais funcionários. */


public class Main {
    public static void main(String[] args) {
        PessoasDoTrabalho[] pessoa = new PessoasDoTrabalho[10];
        Double salario;

        for (int i = 0; i < 10; i++) {
            pessoa[i] = new PessoasDoTrabalho();
            salario = RandomCash.getRandomSalario();

            pessoa[i].setSalario(salario);
        }
        System.out.println("ANTES DO REAJUSTE");
        for(int i = 0; i < 10; i++){
            System.out.println("Pessoa " + (i+1) + "\nSalario: " + pessoa[i].getSalario());
            System.out.println();
        }

        for (int i = 0; i < 10; i++) {
            salario = Reajuste.reajuste(pessoa[i].getSalario());
            pessoa[i].setSalario(pessoa[i].getSalario() + salario);
        }

        System.out.println("DEPOIS DO REAJUSTE");
        for(int i = 0; i < 10; i++){
            System.out.println("Pessoa " + (i+1) + "\nSalario: " + pessoa[i].getSalario());
            System.out.println();
        }


    }
}