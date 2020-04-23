package app;

import java.util.ArrayList;
import java.util.List;

public class Pooflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public void inicializarCatalogo() {
        this.inicializarDaredevil();
        this.inicializarJessicaJones();

        
    }

    public void inicializarDaredevil() {

        // Inicio serie Daredevil
        Serie serie1 = new Serie();
        serie1.nombre = "Daredevil";
        List<Serie> series;
        this.series.add(serie1);

        // otros datos de la serie
        Clasificacion clasificacion16 = new Clasificacion();
        clasificacion16.edadMin = 16;
        clasificacion16.descripcion = "Desnudez fuerte y explícita, escenas fuertes, alcohol y drogas, insultos, imágenes muy intensas y/o un poco de sangre.";
        serie1.clasificacion = clasificacion16;
        Genero genero1 = new Genero();
        genero1.nombre = "Drama, policiaco";
        genero1.descripcion = "Es un género de cine y televisión que generalmente se enfoca en las narrativas sobre la práctica legal y el sistema de justicia.";
        serie1.genero = genero1;
        serie1.anio = 2015;
        serie1.descripcion = "Matt Murdock, un abogado del barrio neoyorquino de Hell's Kitchen, que quedó ciego en un accidente que incrementó sus cuatro sentidos restantes y que lucha como un justiciero todas las noches contra el crimen bajo el sobrenombre de Daredevil";
        serie1.calificacion = 8.01;

        Actor actorDd = new Actor();
        actorDd.nombre = "Charlie Cox";
        actorDd.edad = 37;
        serie1.elenco.add(actorDd);

        actorDd = new Actor();
        actorDd.nombre = "Deborah Ann Woll";
        actorDd.edad = 35;
        serie1.elenco.add(actorDd);

        actorDd = new Actor();
        actorDd.nombre = "Elden Henson";
        actorDd.edad = 42;
        serie1.elenco.add(actorDd);

        actorDd = new Actor();
        actorDd.nombre = "Vincent D'Onofrio";
        actorDd.edad = 60;
        serie1.elenco.add(actorDd);

        // Agrego primera temporada
        Temporada tempoDd = new Temporada();
        tempoDd.numero = 1;
        serie1.temporadas.add(tempoDd);

        // Agrego episodios de la T1
        Episodio epiDd = new Episodio(1,"En el ring");
        //epiDd.numero = 1;
        //epiDd.nombre = "En el ring";
        tempoDd.episodios.add(epiDd);
        Episodio epiDd2 = new Episodio(2,"Enmascarado y ensangrentado");
        //epiDd2.numero = 2;
        //epiDd2.nombre = "Enmascarado y ensangrentado";
        tempoDd.episodios.add(epiDd2);
        Episodio epiDd3 = new Episodio(3,"Un conejo en una tormenta de nieve");
        //epiDd3.numero = 3;
        //epiDd3.nombre = "Un conejo en una tormenta de nieve";
        tempoDd.episodios.add(epiDd3);

        // Agrego segunda temporada
        Temporada tempoDd2 = new Temporada();
        tempoDd2.numero = 2;
        serie1.temporadas.add(tempoDd2);

        // Agrego episodios de la T2
        Episodio epiDd4 = new Episodio(1,"Bang");
        //epiDd4.numero = 1;
        //epiDd4.nombre = "Bang";
        tempoDd2.episodios.add(epiDd4);
        Episodio epiDd5 = new Episodio(2,"Perros en la pelea");
        //epiDd5.numero = 2;
        //epiDd5.nombre = "Perros en la pelea";
        tempoDd2.episodios.add(epiDd5);
        Episodio epiDd6 = new Episodio(3,"El orgullo de Nueva York");
        //epiDd6.numero = 3;
        //epiDd6.nombre = "El orgullo de Nueva York";
        tempoDd2.episodios.add(epiDd6);

        // Agrego tercera temporada
        Temporada tempoDd3 = new Temporada();
        tempoDd3.numero = 3;
        serie1.temporadas.add(tempoDd3);

        // Agrego episodios de la T3
        Episodio epiDd7 = new Episodio(1,"Resurrección");
        //epiDd7.numero = 1;
        //epiDd7.nombre = "Resurrección";
        tempoDd3.episodios.add(epiDd7);
        Episodio epiDd8 = new Episodio(2,"Por favor");
        //epiDd8.numero = 2;
        //epiDd8.nombre = "Por favor";
        tempoDd3.episodios.add(epiDd8);
        Episodio epiDd9 = new Episodio(3,"Dios da y Dios quita");
        //epiDd9.numero = 3;
        //epiDd9.nombre = "Dios da y Dios quita";
        tempoDd3.episodios.add(epiDd9);

        //Agregando websodio
        Websodio webi = new Websodio();
        webi.numero = 25;
        webi.nombre = "Episodio web";
        webi.duracionEnMinutos = 30;
        webi.url = "http://websodio.com";
        tempoDd.episodios.add(webi);
    }

    public void inicializarJessicaJones() {

        // Inicio serie Jessica Jones
        Serie serie2 = new Serie();
        serie2.nombre = "Jessica Jones";
        List<Serie> series;
        this.series.add(serie2);

        // otros datos de serie
        Clasificacion clasificacionJj = new Clasificacion();
        clasificacionJj.edadMin = 16;
        clasificacionJj.descripcion = "Desnudez fuerte y explícita, escenas fuertes, alcohol y drogas, insultos, imágenes muy intensas y/o un poco de sangre.";
        serie2.clasificacion = clasificacionJj;
        Genero genero2 = new Genero();
        genero2.nombre = "ficcion detectivezca";
        genero2.descripcion = "Un investigador (muy a menudo un detective, ya sea profesional o amateur, ya sea o no integrante de las fuerzas oficiales) investiga un determinado crimen, a menudo un asesinato.";
        serie2.genero = genero2;
        serie2.anio = 15;
        serie2.descripcion = "Jessica Jones es una mujer con superpoderes que tuvo una breve carrera como superheroína hasta un incidente en la que el villano Kilgrave hizo que matara a alguien. Después de ese incidente, se convirtió en una investigadora privada. Cuando Kilgrave reaparece, Jessica debe levantarse para detenerlo.";
        serie2.calificacion = 8.0;

        Actor actorJj = new Actor();
        actorJj.nombre = "Krysten Ritter";
        actorJj.edad = 38;
        serie2.elenco.add(actorJj);

        actorJj = new Actor();
        actorJj.nombre = "Rachael Taylor";
        actorJj.edad = 35;
        serie2.elenco.add(actorJj);

        actorJj = new Actor();
        actorJj.nombre = "Eka Darville";
        actorJj.edad = 31;
        serie2.elenco.add(actorJj);

        actorJj = new Actor();
        actorJj.nombre = "Carrie-Anne Moss";
        actorJj.edad = 52;
        serie2.elenco.add(actorJj);

        actorJj = new Actor();
        actorJj.nombre = "David Tennant";
        actorJj.edad = 49;
        serie2.elenco.add(actorJj);

        // Agrego T1
        Temporada tempoJj = new Temporada();
        tempoJj.numero = 1;
        serie2.temporadas.add(tempoJj);

        // Agrego episodios de la T1
        Episodio epiJj = new Episodio(1,"Noche de chicas");
        //epiJj.numero = 1;
        //epiJj.nombre = "Noche de chicas";
        tempoJj.episodios.add(epiJj);
        Episodio epiJj2 = new Episodio(2,"Sindrome de aplastamiento");
        //epiJj2.numero = 2;
        //epiJj2.nombre = "Síndrome de aplastamiento";
        tempoJj.episodios.add(epiJj2);
        Episodio epiJj3 = new Episodio(3,"El whisky ayuda");
        //epiJj3.numero = 3;
        //epiJj3.nombre = "El whisky ayuda";
        tempoJj.episodios.add(epiJj3);

        // Agrego T2
        Temporada tempoJj2 = new Temporada();
        tempoJj2.numero = 2;
        serie2.temporadas.add(tempoJj2);

        // Agrego episodios de la T2
        Episodio epiJj4 = new Episodio(1,"Empezar por el principio");
        //epiJj4.numero = 1;
        //epiJj4.nombre = "Empezar por el principio";
        tempoJj2.episodios.add(epiJj4);
        Episodio epiJj5 = new Episodio(2,"Accidente extraño");
        //epiJj5.numero = 2;
        //epiJj5.nombre = "Accidente extraño";
        tempoJj2.episodios.add(epiJj5);
        Episodio epiJj6 = new Episodio(3,"Única sobreviviente");
        //epiJj6.numero = 3;
        //epiJj6.nombre = "Única sobreviviente";
        tempoJj2.episodios.add(epiJj6);
    }

    public void inicializarTbbt() {

        Serie serie3 = new Serie();
        serie3.nombre = "The big bang theory";
        List<Serie> series;
        this.series.add(serie3);
        Clasificacion clasificacionTbbt = new Clasificacion();
        clasificacionTbbt.descripcion = "El programa contiene violencia ficticia, lejos del plano educativo";
        clasificacionTbbt.edadMin = 7;
        serie3.clasificacion = clasificacionTbbt;
        Genero genero3 = new Genero();
        genero3.nombre = "comedia de situación";
        genero3.descripcion = "es un tipo de serie cuyos episodios se desarrollan regularmente en los mismos lugares y con los mismos personajes, y donde se suelen incluir risas grabadas o en vivo";
        serie3.genero = genero3;
        serie3.anio = 2007;
        serie3.descripcion = "La serie comienza con la llegada de Penny, aspirante a actriz, al apartamento vecino del que comparten Sheldon y Leonard, dos físicos que trabajan en el Instituto Tecnológico de California (Caltech). Leonard se enamora desde el primer momento de Penny.";       
        serie3.calificacion = 9.5;

        Actor actorTbbt = new Actor();
        actorTbbt.nombre = "Jim Parsons";
        actorTbbt.edad = 47;
        serie3.elenco.add(actorTbbt);

        actorTbbt = new Actor();
        actorTbbt.nombre = "Kaley Cuoco";
        actorTbbt.edad = 34;
        serie3.elenco.add(actorTbbt);
        
        actorTbbt = new Actor();
        actorTbbt.nombre = "Johnny Galecki";
        actorTbbt.edad = 44;
        serie3.elenco.add(actorTbbt);

        actorTbbt = new Actor();
        actorTbbt.nombre = "Kunal Nayyar";
        actorTbbt.edad = 38;
        serie3.elenco.add(actorTbbt);

        actorTbbt = new Actor();
        actorTbbt.nombre = "Simon Helberg";
        actorTbbt.edad = 39;
        serie3.elenco.add(actorTbbt);
        
        actorTbbt = new Actor();
        actorTbbt.nombre = "Mayim Bialik";
        actorTbbt.edad = 44;
        serie3.elenco.add(actorTbbt);

        actorTbbt = new Actor();
        actorTbbt.nombre = "Melissa Rauch";
        actorTbbt.edad = 39;
        serie3.elenco.add(actorTbbt);

        Temporada tempoTbbt = new Temporada();
        tempoTbbt.numero = 1;
        serie3.temporadas.add(tempoTbbt);
        /*
        Episodio epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt.episodios.add();
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt.episodios.add();
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt.episodios.add();

        Temporada tempoTbbt2 = new Temporada();
        tempoTbbt2.numero = 2;
        serie3.temporadas.add(tempoTbbt2);
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();

        Temporada tempoTbbt3 = new Temporada();
        tempoTbbt3.numero = 1;
        serie3.temporadas.add(tempoTbbt3);
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();

        Temporada tempoTbbt4 = new Temporada();
        tempoTbbt4.numero = 1;
        serie3.temporadas.add(tempoTbbt4);
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();
        epiTbbt = new Episodio();
        epiTbbt.numero = 1;
        epiTbbt.nombre = "";
        tempoTbbt2.episodios.add();
        */
    }

    public Serie buscarSerie(String titulo) {
        for (Serie s : this.series) {
            if (s.nombre.equals(titulo))
                return s;
        }
        return null;
    }

}