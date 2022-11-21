package antipattern;

public class Newlestter {
    
	private String titulo;
	private String tema;
	private String data_publicacao;

	public  Newlestter(String titulo, String tema, String data_publicacao) {
		super();
		this.titulo = titulo;
		this.tema = tema;
		this.data_publicacao = data_publicacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getData_publicacao() {
		return data_publicacao;
	}

	public void setData_publicacao(String data_publicacao) {
		this.data_publicacao = data_publicacao;
	}

	public void setInfo(String titulo, String tema, String data_publicacao) {
		this.titulo = titulo;
		this.tema = tema;
		this.data_publicacao = data_publicacao;

		Noticia.mandarNoticia(titulo, tema, data_publicacao);

	}

    @Override
	public String toString() {
		return "\nTítulo: " + titulo + "\nTema: " + tema + "\nData de publicação: " + data_publicacao;
	}

}


