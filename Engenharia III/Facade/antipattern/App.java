public public class App {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Cristiano Ronaldo");
		Pedido pedido = new Pedido("7");

		Pedir pedir = new Pedir();
		pedir.fazerPedido(33, cliente, pedido);
	}
}
