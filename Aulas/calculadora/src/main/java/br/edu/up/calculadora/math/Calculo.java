package br.edu.up.calculadora.math;

public class Calculo {

    public static Integer calcular(Integer valor1, Integer valor2, String operador) {
        if("+".equals(operador)){
            return valor1 + valor2;
        }
        else if("-".equals(operador)){
            return valor1 - valor2;
        }
        else if("*".equals(operador)){
            return valor1*valor2;
        }
        else if("/".equals(operador)){
            return valor1/valor2;
        }

        System.out.println("Sinal incorreto!");
        return null;
    }
    

    public static void resultado(Integer result){
        System.out.println("O resultado final é: " + result);
    }
    

}
