public class Aluno {
    
    private String nome;
    private Integer rgm;
    private String curso;

    public Aluno( String curso, Integer rgm, String nome) {
        this.nome = nome;
        this.curso = curso;
        this.rgm = rgm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRgm() {
        return rgm;
    }

    public void setRgm(Integer rgm) {
        this.rgm = rgm;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }



}
