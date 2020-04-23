package app;

import java.util.ArrayList;
import java.util.List;

public class Contenido {

    private String nombre;
    private Clasificacion clasificacion;
    private Genero genero;
    private int anio;
    private String descripcion;
    private double calificacion;
    private List<Actor> elenco = new ArrayList<>();

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * @return the clasificacion
     */
    public Clasificacion getClasificacion() {
        return clasificacion;
    }
    /**
     * @param clasificacion the clasificacion to set
     */
    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }
    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }
    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    /**
     * @return the anio
     */
    public int getAnio() {
        return anio;
    }
    /**
     * @param anio the anio to set
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    /**
     * @return the calificacion
     */
    public double getCalificacion() {
        return calificacion;
    }
    /**
     * @param calificacion the calificacion to set
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    /**
     * @return the elenco
     */
    public List<Actor> getElenco() {
        return elenco;
    }
    /**
     * @param elenco the elenco to set
     */
    public void setElenco(List<Actor> elenco) {
        this.elenco = elenco;
    }
    

}