package pattern;

public class Assinante_view implements Observer{
    public void enviarNoticia(String noticia){
        mostrar(noticia);
    }
    public void mostrar(String noticia){

        System.out.println("Assinante");
        System.out.println("Newlestter:" + noticia);
    }
}
}
