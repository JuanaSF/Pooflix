package app;

import java.util.List;

public class Actor extends Persona implements INominable {

    public Actor(String nombre, int numero) {
        super(nombre, numero);
    }

    public boolean ganoPreviamente() {
        return true;

    }

    public void reproducirTrailerNominacion() {
        System.out.println("Reproduciendo trailer de escenas de " + this.getNombre());
    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean estaNominada() {
        // TODO Auto-generated method stub
        return false;
    }

}