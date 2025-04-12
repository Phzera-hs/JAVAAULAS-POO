package com.example.consumomediodois;

import java.util.Scanner;

import com.example.consumomediodois.calculo.calculoPorKm;
import com.example.consumomediodois.veiculo.Veiculo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String modelo;
        Integer distancia;
        Double consumo;

        System.out.println("Digite o modelo do carro: ");
        modelo = sc.nextLine();

        System.out.println("Digite o consumo da " + modelo + " : ");
        consumo = sc.nextDouble();

        System.out.println("Digite a distancia percorrida por esse carro: ");
        distancia = sc.nextInt();

        Veiculo carro = new Veiculo(modelo, consumo);

        Double media = calculoPorKm.Calcular(distancia, consumo);

        System.out.println("O consumo médio de " + carro.getModelo() + " é de " + media );

        
    }
}