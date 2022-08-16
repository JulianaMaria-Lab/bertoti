package pattern;

public class Pessoa {
		private Acesso acesso;
	
		public void setAcesso (Acesso acesso) {
			this.acesso = acesso;
		}
		
		public void lancarNota () {
			this.acesso.lancarNota();
		}
		public void verNota() {
			this.acesso.verNota();
		}
		
}