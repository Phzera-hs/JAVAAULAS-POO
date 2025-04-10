public class TestePessoa {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Joseph Camole", 30);
        var filha = new Pessoa("Fernandanda", 0);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        
        System.out.println(filha.getNome());
        System.out.println(filha.getIdade());
    }
}
