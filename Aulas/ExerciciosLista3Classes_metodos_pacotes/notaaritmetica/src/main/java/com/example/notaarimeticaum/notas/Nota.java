package com.example.notaarimeticaum.notas;

public class Nota {

    String materia;
    public Double valor;

    public Nota(String materia, Double valor) {
        this.materia = materia;
        this.valor = valor;
    }
    
    public static Double mediaArimetica(Double n1, Double n2, Double n3){
        return (n1+n2+n3)/3;
    }

    
}
