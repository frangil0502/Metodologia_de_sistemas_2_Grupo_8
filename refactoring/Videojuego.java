package refactoring;


// Videojuego (refactorizado)


import java.util.List;

public class Videojuego {

    private List<Personaje> personajes;

    public Videojuego(List<Personaje> personajes) {
        this.personajes = personajes;
    }
}