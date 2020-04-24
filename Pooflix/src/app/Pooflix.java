package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    private List<Pelicula> peliculas = new ArrayList<>();
    private List<Serie> series = new ArrayList<>();

    public List<Pelicula> getPeliculas() {
        return this.peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public List<Serie> getSeries() {
        return this.series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    public void inicializarCatalogo() {
        this.inicializarDaredevil();
        this.inicializarJessicaJones();
        this.inicializarTbbt();
    }

    public void inicializarDaredevil() {

        // Inicio serie Daredevil
        Serie serie1 = new Serie();
        serie1.setNombre("Daredevil");
        List<Serie> series;
        this.series.add(serie1);

        // otros datos de la serie
        Clasificacion clasificacion16 = new Clasificacion();
        clasificacion16.setEdadMin(16);
        clasificacion16.setDescripcion(
                "Desnudez fuerte y explícita, escenas fuertes, alcohol y drogas, insultos, imágenes muy intensas y/o un poco de sangre.");
        serie1.setClasificacion(clasificacion16);
        Genero genero1 = new Genero();
        genero1.setNombre("Drama, policiaco");
        genero1.setDescripcion(
                "Es un género de cine y televisión que generalmente se enfoca en las narrativas sobre la práctica legal y el sistema de justicia.");
        serie1.setGenero(genero1);
        serie1.setAnio(2015);
        serie1.setDescripcion(
                "Matt Murdock, un abogado del barrio neoyorquino de Hell's Kitchen, que quedó ciego en un accidente que incrementó sus cuatro sentidos restantes y que lucha como un justiciero todas las noches contra el crimen bajo el sobrenombre de Daredevil");
        serie1.setCalificacion(8.01);

        Actor actorDd = new Actor("Charlie Cox", 37);
        serie1.getElenco().add(actorDd);

        actorDd = new Actor("Deborah Ann Woll", 35);
        serie1.getElenco().add(actorDd);

        actorDd = new Actor("Elden Henson", 42);
        serie1.getElenco().add(actorDd);

        actorDd = new Actor("Vincent D'Onofrio", 60);
        serie1.getElenco().add(actorDd);

        // Agrego primera temporada
        Temporada tempoDd = new Temporada();
        tempoDd.setNumero(1);
        serie1.getTemporadas().add(tempoDd);

        // Agrego episodios de la T1
        Episodio epiDd = new Episodio(1, "En el ring");
        // epiDd.numero = 1;
        // epiDd.nombre = "En el ring";
        tempoDd.getEpisodios().add(epiDd);
        Episodio epiDd2 = new Episodio(2, "Enmascarado y ensangrentado");
        // epiDd2.numero = 2;
        // epiDd2.nombre = "Enmascarado y ensangrentado";
        tempoDd.getEpisodios().add(epiDd2);
        Episodio epiDd3 = new Episodio(3, "Un conejo en una tormenta de nieve");
        // epiDd3.numero = 3;
        // epiDd3.nombre = "Un conejo en una tormenta de nieve";
        tempoDd.getEpisodios().add(epiDd3);

        // Agrego segunda temporada
        Temporada tempoDd2 = new Temporada();
        tempoDd2.setNumero(2);
        serie1.getTemporadas().add(tempoDd2);

        // Agrego episodios de la T2
        Episodio epiDd4 = new Episodio(1, "Bang");
        // epiDd4.numero = 1;
        // epiDd4.nombre = "Bang";
        tempoDd2.getEpisodios().add(epiDd4);
        Episodio epiDd5 = new Episodio(2, "Perros en la pelea");
        // epiDd5.numero = 2;
        // epiDd5.nombre = "Perros en la pelea";
        tempoDd2.getEpisodios().add(epiDd5);
        Episodio epiDd6 = new Episodio(3, "El orgullo de Nueva York");
        // epiDd6.numero = 3;
        // epiDd6.nombre = "El orgullo de Nueva York";
        tempoDd2.getEpisodios().add(epiDd6);

        // Agrego tercera temporada
        Temporada tempoDd3 = new Temporada();
        tempoDd3.setNumero(3);
        serie1.getTemporadas().add(tempoDd3);

        // Agrego episodios de la T3
        Episodio epiDd7 = new Episodio(1, "Resurrección");
        // epiDd7.numero = 1;
        // epiDd7.nombre = "Resurrección";
        tempoDd3.getEpisodios().add(epiDd7);
        Episodio epiDd8 = new Episodio(2, "Por favor");
        // epiDd8.numero = 2;
        // epiDd8.nombre = "Por favor";
        tempoDd3.getEpisodios().add(epiDd8);
        Episodio epiDd9 = new Episodio(3, "Dios da y Dios quita");
        // epiDd9.numero = 3;
        // epiDd9.nombre = "Dios da y Dios quita";
        tempoDd3.getEpisodios().add(epiDd9);

        // Agregando websodio
        Websodio webi = new Websodio(25, "Episodio web", "http://websodio.com");
        // webi.numero = 25;
        // webi.nombre = "Episodio web";
        webi.setDuracionEnMinutos(30);
        // webi.url = "http://websodio.com";
        tempoDd.getEpisodios().add(webi);
    }

    public void inicializarJessicaJones() {

        // Inicio serie Jessica Jones
        Serie serie2 = new Serie();
        serie2.setNombre("Jessica Jones");
        List<Serie> series;
        this.series.add(serie2);

        // otros datos de serie
        Clasificacion clasificacionJj = new Clasificacion();
        clasificacionJj.setEdadMin(16);
        clasificacionJj.setDescripcion(
                "Desnudez fuerte y explícita, escenas fuertes, alcohol y drogas, insultos, imágenes muy intensas y/o un poco de sangre.");
        serie2.setClasificacion(clasificacionJj);
        Genero genero2 = new Genero();
        genero2.setNombre("ficcion detectivezca");
        genero2.setDescripcion(
                "Un investigador (muy a menudo un detective, ya sea profesional o amateur, ya sea o no integrante de las fuerzas oficiales) investiga un determinado crimen, a menudo un asesinato.");
        serie2.setGenero(genero2);
        serie2.setAnio(15);
        serie2.setDescripcion(
                "Jessica Jones es una mujer con superpoderes que tuvo una breve carrera como superheroína hasta un incidente en la que el villano Kilgrave hizo que matara a alguien. Después de ese incidente, se convirtió en una investigadora privada. Cuando Kilgrave reaparece, Jessica debe levantarse para detenerlo.");
        serie2.setCalificacion(8.0);

        Actor actorJj = new Actor("Krysten Ritter", 38);
        serie2.getElenco().add(actorJj);

        actorJj = new Actor("Rachael Taylor", 35);
        serie2.getElenco().add(actorJj);

        actorJj = new Actor("Eka Darville", 31);
        serie2.getElenco().add(actorJj);

        actorJj = new Actor("Carrie-Anne Moss", 52);
        serie2.getElenco().add(actorJj);

        actorJj = new Actor("David Tennant", 49);
        serie2.getElenco().add(actorJj);

        // Agrego T1
        Temporada tempoJj = new Temporada();
        tempoJj.setNumero(1);
        serie2.getTemporadas().add(tempoJj);

        // Agrego episodios de la T1
        Episodio epiJj = new Episodio(1, "Noche de chicas");
        // epiJj.numero = 1;
        // epiJj.nombre = "Noche de chicas";
        tempoJj.getEpisodios().add(epiJj);
        Episodio epiJj2 = new Episodio(2, "Sindrome de aplastamiento");
        // epiJj2.numero = 2;
        // epiJj2.nombre = "Síndrome de aplastamiento";
        tempoJj.getEpisodios().add(epiJj2);
        Episodio epiJj3 = new Episodio(3, "El whisky ayuda");
        // epiJj3.numero = 3;
        // epiJj3.nombre = "El whisky ayuda";
        tempoJj.getEpisodios().add(epiJj3);

        // Agrego T2
        Temporada tempoJj2 = new Temporada();
        tempoJj2.setNumero(2);
        serie2.getTemporadas().add(tempoJj2);

        // Agrego episodios de la T2
        Episodio epiJj4 = new Episodio(1, "Empezar por el principio");
        // epiJj4.numero = 1;
        // epiJj4.nombre = "Empezar por el principio";
        tempoJj2.getEpisodios().add(epiJj4);
        Episodio epiJj5 = new Episodio(2, "Accidente extraño");
        // epiJj5.numero = 2;
        // epiJj5.nombre = "Accidente extraño";
        tempoJj2.getEpisodios().add(epiJj5);
        Episodio epiJj6 = new Episodio(3, "Única sobreviviente");
        // epiJj6.numero = 3;
        // epiJj6.nombre = "Única sobreviviente";
        tempoJj2.getEpisodios().add(epiJj6);
    }

    public void inicializarTbbt() {

        Serie serie3 = new Serie();
        serie3.setNombre("The big bang theory");
        List<Serie> series;
        this.series.add(serie3);
        Clasificacion clasificacionTbbt = new Clasificacion();
        clasificacionTbbt.setDescripcion("El programa contiene violencia ficticia, lejos del plano educativo");
        clasificacionTbbt.setEdadMin(7);
        serie3.setClasificacion(clasificacionTbbt);
        Genero genero3 = new Genero();
        genero3.setNombre("comedia de situación");
        genero3.setDescripcion(
                "es un tipo de serie cuyos episodios se desarrollan regularmente en los mismos lugares y con los mismos personajes, y donde se suelen incluir risas grabadas o en vivo");
        serie3.setGenero(genero3);
        serie3.setAnio(2007);
        serie3.setDescripcion(
                "La serie comienza con la llegada de Penny, aspirante a actriz, al apartamento vecino del que comparten Sheldon y Leonard, dos físicos que trabajan en el Instituto Tecnológico de California (Caltech). Leonard se enamora desde el primer momento de Penny.");
        serie3.setCalificacion(9.5);

        Actor actorTbbt = new Actor("Jim Parsons", 47);
        serie3.getElenco().add(actorTbbt);

        actorTbbt = new Actor("Kaley Cuoco", 34);
        serie3.getElenco().add(actorTbbt);

        actorTbbt = new Actor("Johnny Galecki", 44);
        serie3.getElenco().add(actorTbbt);

        actorTbbt = new Actor("Kunal Nayyar", 38);
        serie3.getElenco().add(actorTbbt);

        actorTbbt = new Actor("Simon Helberg", 39);
        serie3.getElenco().add(actorTbbt);

        actorTbbt = new Actor("Mayim Bialik", 44);
        serie3.getElenco().add(actorTbbt);

        actorTbbt = new Actor("Melissa Rauch", 39);
        serie3.getElenco().add(actorTbbt);

        Temporada tempoTbbt = new Temporada();
        tempoTbbt.setNumero(1);
        serie3.getTemporadas().add(tempoTbbt);

        Episodio epiTbbt = new Episodio(1, "Pilot");
        tempoTbbt.getEpisodios().add(epiTbbt);
        epiTbbt = new Episodio(2, "The Big Bran Hypothesis");
        tempoTbbt.getEpisodios().add(epiTbbt);
        epiTbbt = new Episodio(3, "The Fuzzy Boots Corollary");
        tempoTbbt.getEpisodios().add(epiTbbt);

        Temporada tempoTbbt2 = new Temporada();
        tempoTbbt2.setNumero(3);
        serie3.getTemporadas().add(tempoTbbt2);
        epiTbbt = new Episodio(1, "The Electric Can Opener Fluctuation");
        tempoTbbt2.getEpisodios().add(epiTbbt);
        epiTbbt = new Episodio(2, "The Jiminy Conjecture");
        tempoTbbt2.getEpisodios().add(epiTbbt);
        epiTbbt = new Episodio(3, "The Gothowitz Deviation");
        tempoTbbt2.getEpisodios().add(epiTbbt);

        Temporada tempoTbbt3 = new Temporada();
        tempoTbbt3.setNumero(8);
        serie3.getTemporadas().add(tempoTbbt3);
        epiTbbt = new Episodio(1, "The Locomotion Interruption");
        tempoTbbt3.getEpisodios().add(epiTbbt);
        epiTbbt = new Episodio(2, "The Junior Professor Solution");
        tempoTbbt3.getEpisodios().add(epiTbbt);
        epiTbbt = new Episodio(3, "The First Pitch Insufficiency");
        tempoTbbt3.getEpisodios().add(epiTbbt);

        Temporada tempoTbbt4 = new Temporada();
        tempoTbbt4.setNumero(12);
        serie3.getTemporadas().add(tempoTbbt4);
        epiTbbt = new Episodio(22, "The Maternal Conclusion");
        tempoTbbt4.getEpisodios().add(epiTbbt);
        epiTbbt = new Episodio(23, "The Change Constant");
        tempoTbbt4.getEpisodios().add(epiTbbt);
        epiTbbt = new Episodio(24, "The Stockholm Syndrome");
        tempoTbbt4.getEpisodios().add(epiTbbt);
    }

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.getNombre().equals(titulo))
                return s;
        }
        return null;
    }

}