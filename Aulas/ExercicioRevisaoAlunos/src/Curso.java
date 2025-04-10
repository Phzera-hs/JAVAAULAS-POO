public class Curso {

    private String name;
    private Integer codigo;
    private Aluno[] alunoPessoa;
    private Integer totalDeAlunos;

    public Curso(Integer codigo, String name) {
        this.codigo = codigo;
        this.name = name;
        this.totalDeAlunos = 0;
        this.alunoPessoa = new Aluno[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void matricularAluno(Aluno aluno) {
        if (totalDeAlunos < alunoPessoa.length) {
            alunoPessoa[totalDeAlunos] = aluno;
            totalDeAlunos++;
        } else {
            System.out.println("Turma cheia! Não é possível matricular mais alunos.");
        }
    }

    public void removerAluno(Aluno aluno) {
        int idxRemoved = -1;
        for (int i = 0; i < totalDeAlunos; i++) {
            if (alunoPessoa[i].getRgm().equals(aluno.getRgm())) {
                alunoPessoa[i] = null;
                idxRemoved = i;
            }
        }

        if (idxRemoved != -1) {
            for (int i = idxRemoved; i < totalDeAlunos - 1; i++) {
                alunoPessoa[i] = alunoPessoa[i + 1];
            }
            alunoPessoa[totalDeAlunos - 1] = null;
            totalDeAlunos--;
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }

    public void relatorio(){
        System.out.println(name + " tem " + totalDeAlunos + " alunos ");
        for(int i = 0; i < totalDeAlunos; i++){
            System.out.println(alunoPessoa[i].getNome());
        }
    }
}