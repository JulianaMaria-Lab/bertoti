public class Pedido {
	private String numeroPedido;
	private int valor;

	public int Pedir(int valor){
		System.out.println("Pedido realizado...");
		return this.setValor(this.getValor() + valor);
	}

	public String numeroPedido(){
		System.out.println("Número do pedido...");
		return this.numeroPedido;
	}

	public int obterValor(){
		System.out.println("Recebendo Valor...");
		return this.getValor();
	}

	public Pedido(){}

	public Pedido(String numeroPedido){
		this.numeroPedido = numeroPedido;
	}

	public int getValor() {
		return valor;
	}

	public int setValor(int valor) {
		this.valor = valor;
		return valor;
	}
}