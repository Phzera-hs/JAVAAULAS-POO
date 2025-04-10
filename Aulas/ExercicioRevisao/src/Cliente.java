public class Cliente {
    
    private String name;
    private String cpf;
    private Pedido[] pedidos;
    private int totalPedidos = 0;

    public Cliente(){
        pedidos = new Pedido[100];
        totalPedidos = 0;
    }

    public Cliente(String name, String cpf){
        this();
        this.name = name;
        this.cpf = cpf;
    }



    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void adicionarPedido(Pedido pedido){
        pedidos[totalPedidos] = pedido;
        totalPedidos++;
    }

    public void relatorio(){
        int count = 1;
        System.out.println("Total de pedidos: " + totalPedidos);
        for(Pedido pedido : pedidos){
            if(pedido == null){
                break;
            }
            System.out.println("Pedido ["+ count +"] total da compra: " + pedido.calcularValorTotal());
            count++;
        }
    }

}
