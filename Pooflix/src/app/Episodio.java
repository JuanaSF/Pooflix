package app;

public class Episodio {

    public Episodio(int numero, String nombre){
        this.numero = numero;
        this.nombre = nombre;
    }

    public int numero;
    public String nombre;
    public int duracionEnMinutos;
    public String descripcion;

    public void reproducir() {
        System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
    }

}