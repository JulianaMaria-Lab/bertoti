package pattern;

public class Site_view implements Observer{
    public void enviarNoticia(String noticia){
        mostrar(noticia);
    }
    public void mostrar(String noticia){

        System.out.println("NEWS");
        System.out.println("Enviando:" + noticia);
    }
}
