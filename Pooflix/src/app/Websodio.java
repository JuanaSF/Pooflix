package app;
public class Websodio extends Episodio{

    public Websodio(int numero, String nombre, String url){
        super(numero, nombre);
        this.url = url;
    }

    private String url;

    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }
    
    @Override///Anotacion que indica que el metodo se sobre-escribe(redefinicion) 

    public void reproducir(){
        System.out.println("Reproduciendo websodio " + this.getNumero() + " " + this.getNombre() +" Url: "+ this.url);
    }

     /**
     * "envia" un mail de alerta cuando la serie este online.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }


}