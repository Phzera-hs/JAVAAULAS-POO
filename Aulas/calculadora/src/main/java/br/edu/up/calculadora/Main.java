package br.edu.up.calculadora;

import java.util.Scanner;

import br.edu.up.calculadora.math.Calculo;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Integer v1, v2, resultado;
        String operador;
        

        System.out.println("Digite o primeiro valor: ");
        v1 = sc.nextInt();
    
        System.out.println("Digite o segundo valor: ");
        v2 = sc.nextInt();

        System.out.println("Qual operacao deseja fazer entre esse valores:\n+\n-\n*\n/");
        operador = sc.next();


        resultado = Calculo.calcular(v1,v2,operador);

        if(resultado != null){
            Calculo.resultado(resultado);
        }else{
            System.out.println("Operador Incorreto, por tanto sem resultado!");
        }
    }
}