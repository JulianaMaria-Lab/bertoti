package pattern;

public class Teste {
	public static void main(String[] args) {
		
		Pessoa juliana = new Pessoa();
		//	juliana = estudante -> visualizar notas
		juliana.setAcesso(new VisualizarNotas());
		juliana.verNota();
		
		System.out.println("--------------------------------");
		
		//juliana virou professora da Fatec
		
		juliana.setAcesso(new Lan�amentoDeNotas());
		juliana.lancarNota();

		
	}
	
}

	


