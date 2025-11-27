package refactoring;


// Personaje

public class Personaje {

    private String nombre;
    private int daño;
    private TipoHabilidad tipoHabilidad;

    public Personaje(String nombre, int daño, TipoHabilidad tipoHabilidad) {
        this.nombre = nombre;
        this.daño = daño;
        this.tipoHabilidad = tipoHabilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDaño() {
        return daño;
    }

    public TipoHabilidad getTipoHabilidad() {
        return tipoHabilidad;
    }
}
