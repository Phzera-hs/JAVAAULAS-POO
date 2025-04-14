package com.example.cursocc.StatusPessoa;

public class ClassificacaoAluno {

    public static String ClasseDoAluno(double media){
        if(media >= 8.10){
            return "A";
        }
        else if (media >=7.8 && media < 8.10) {
            return "B";
        }
        else if (media >=6.7 && media < 7.8) {
            return "C";
        }
        else if (media >=5.6 && media < 6.7) {
            return "D";
        }
        else if (media >=0.5 && media < 5.6) {
            return "E";
        }
        return "Nota inferior a 0.5";

 }
}
