package refactoring;


// Videojuego (refactorizado)


import java.util.List;

public class Videojuego {

    private List<Personaje> personajes;

    public Videojuego(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    public Personaje personajeConMasDaño() {

        Personaje temp = null;
        double max = 0;

        for (Personaje p : personajes) {
            double daño = p.getTipoHabilidad().calcularDaño(p.getDaño());
            if (daño > max) {
                temp = p;
                max = daño;
            }
        }

        return temp;
    }

    public void imprimirInfo(Personaje p) {

        System.out.println(p.getNombre() + " tiene como daño " + p.getDaño());

        TipoHabilidad h = p.getTipoHabilidad();

        System.out.println(h.descripcion());
        System.out.println(h.efecto());
    }
}