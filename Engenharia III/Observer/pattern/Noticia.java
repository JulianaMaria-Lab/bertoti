package pattern;
import Observer;


public class Noticia implements Observer{
    private array List Observers;
    private assinante ass;

    public noticias(){
        observers = new ArrayList();
    }

    public void registrarObserver(Observer o){
        observers.add(o);
    }

    public void removerObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notificarObserver(String noticia){
    for (int i =0;i < observers.size(); i++){
        Observer observer = (Observer)observers.get(i);
        observer.enviarNoticia(noticia);
    }
    }

    public String enviarNotificacao(Assinante ass, String nome){
        notificarObserver(ass.email);
        return nome;
    }
}
