package pattern;

public class Teste {
	public static void main(String[] args) {
		
		Pessoa juliana = new Pessoa();
		juliana.setAcesso(new VisualizarNotas());
		juliana.acessarPortal();
		
		//	juliana = estudante -> visualizar notas
		
		System.out.println("\n\n");
		
		
		
		juliana.setAcesso(new LancamentoDeNotas());
		juliana.acessarPortal();

		//juliana virou professora -> lançar notas
	}
	
}

	


