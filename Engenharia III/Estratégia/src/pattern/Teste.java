package pattern;

public class Teste {
	public static void main(String[] args) {
		
		Pessoa juliana = new Pessoa();
		//	juliana = estudante -> visualizar notas
		juliana.setAcesso(new VisualizarNotas());
		juliana.acessarPortal();
		
		System.out.println("\n\n");
		
		//juliana virou professora da Fatec
		
		juliana.setAcesso(new LancamentoDeNotas());
		juliana.acessarPortal();

		
	}
	
}

	


