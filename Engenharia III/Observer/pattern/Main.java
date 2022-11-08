package pattern;

public class Main {

    public static void main(String[] args) {
        Noticia noticia = new Noticia();
        Assinante assinante = new Assinante ("Juliana","juliana@gmail.com");

        Site_view siteView = new siteView ();
        Assinante_view assView = new assinante_view();

        noticia.registrarObserver(siteView);
        noticia.registrarObserver(assView);

        siteView.enviarNoticia("Assinante" + assinante.email);
        assView.enviarNoticia("Nova noticia no portal!");

    }
}