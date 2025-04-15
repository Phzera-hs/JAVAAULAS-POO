package com.example.empresareajuste.salarios;

public class Reajuste {

    public static Double reajuste(Double salario){
        if(salario>(1500*3)){
            return salario * 0.5;
        }
        else if(salario<=(1500*10) && salario>(1500*3) ){
            return salario * 0.2;
        }
        else if(salario<=(1500*20) && salario>(1500*10)){
            return salario * 0.15;
        }
        
        return salario*0.1;
    }

}
