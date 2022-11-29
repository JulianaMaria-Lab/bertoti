public class Teste {
    public static void main(String[] args){
        Cliente cliente = new Cliente ("Ronaldo Gaúcho");
        Pedido numeroPedido = new Pedido("10");
        Facade facade = new Facade();
        facade.fazerPedido(22,cliente, numeroPedido);
    }
}
