package com.example.cursocc.Calculos;

public class NotasEPesos {
    
    
    public static Double retornaNotaLaboratorio(Double nota){
        return nota * 2;
    }

    public static Double retornaNotaAvSemestral(Double nota){
        return nota * 3;
    }

    public static Double retornaNotaProvaFinal(Double nota){
        return nota * 5;
    }

    public static Double retornaMedia(Double soma){
        return (soma) / 10; 
    }
}
