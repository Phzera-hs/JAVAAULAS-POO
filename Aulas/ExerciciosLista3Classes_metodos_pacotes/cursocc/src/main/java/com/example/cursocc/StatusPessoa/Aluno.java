package com.example.cursocc.StatusPessoa;

public class Aluno {

    private String name;
    private String rgm;
    public Double[] notas = new Double[3];
    public Double mediaPonde;
    public String ClasseAluno;
    
    public Aluno(String name, String rGM) {
        this.name = name;
        this.rgm = rGM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }

    public Double[] getNotas() {
        return notas;
    }



    
}
