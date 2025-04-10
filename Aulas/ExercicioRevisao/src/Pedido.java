public class Pedido {
    private Produto[] itens;

    public Produto[] getProdutos() {
        return itens;
    }

    public void SetItens(Produto[] produtos) {
        this.itens = produtos;
    }

    public double calcularValorTotal(){
        double valor = 0.0;
        for (Produto produtos : itens) {
            valor += produtos.getPreco();
        }
        return valor;
    }
}
