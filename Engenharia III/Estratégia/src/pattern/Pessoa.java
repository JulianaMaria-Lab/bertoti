package pattern;

public class Pessoa {
	
		private Acesso acesso;
	
		public void setAcesso (Acesso acesso) {
			this.acesso = acesso;
		}
		
		public void acessarPortal () {
			this.acesso.acessar();
		}
		
}