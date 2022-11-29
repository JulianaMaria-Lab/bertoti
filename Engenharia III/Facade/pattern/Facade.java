public class Facade {
    private Cliente cliente;
	private Pedido pedido;

	public Facade() {
		this.cliente = new Cliente();
		this.pedido = new Pedido();
	}

	public void fazerPedido(int valor, Cliente cliente, Pedido pedido){
        System.out.printf("Cliente:", cliente.nomeCliente());
        System.out.printf("Número do pedido:", pedido.numeroPedido());
        System.out.printf("Valor: R$", valor);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
}
