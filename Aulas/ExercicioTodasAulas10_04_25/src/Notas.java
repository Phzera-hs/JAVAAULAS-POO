public class Notas {
    
    private String nomeMateria;
    private String nomeProfessor;
    private Double valor;
    
    public Notas(String nomeMateria, String nomeProfessor, Double valor) {
        this.nomeMateria = nomeMateria;
        this.nomeProfessor = nomeProfessor;
        this.valor = valor;
    }
    
    /*Getters and Setters */
    public String getNomeMateria() {
        return nomeMateria;
    }
    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }
    public String getNomeProfessor() {
        return nomeProfessor;
    }
    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    

    

}
