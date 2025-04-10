
public class TesteSistema {

    public static void main(String[] args) {
        var p1 = new Produto("Maçã", 6.00, 10);
        var p2 = new Produto("Leite", 5.99);
        var p3 = new Produto("Carne", 25.99);
        var p4 = new Produto("Café", 30000.00);
        
        Produto[] Lista1 = {p1,p2};
        Produto[] Lista2 = {p3,p4};

        var pedido1 = new Pedido();
        var pedido2 = new Pedido();

        pedido1.SetItens(Lista1);
        pedido2.SetItens(Lista2);

        var cliente1 = new Cliente("João", "111.111.111-11");
        var cliente2 = new Cliente("Maria", "111.111.111-11");
        System.out.println("Pedidos do João");
        cliente1.adicionarPedido(pedido1);
        cliente1.adicionarPedido(pedido2);
        cliente1.relatorio();


        System.out.println("Pedios da Maria");
        cliente2.adicionarPedido(pedido2);
        cliente2.relatorio();
        }
}
