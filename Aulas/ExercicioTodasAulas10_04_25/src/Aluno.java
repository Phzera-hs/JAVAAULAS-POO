public class Aluno {
    private String nome;
    private Integer matricula;
    private Double[] nota = new Double[3];

    
    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getMatricula() {
        return matricula;
    }
    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }
    public Double[] getNota() {
        return nota;
    }
    public void setNota(Double[] nota) {
        this.nota = nota;
    }

    

}
