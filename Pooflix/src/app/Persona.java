package app;

public class Persona {

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    private String nombre;
    private int edad;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}