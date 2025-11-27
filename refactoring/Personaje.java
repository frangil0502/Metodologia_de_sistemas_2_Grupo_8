package refactoring;

import refactoring.TipoHabilidad;


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
        return this.tipoHabilidad;
    }

    public Personaje personajeConMasDaño(Personaje[] personajes) {

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

    public void imprimirInfo() {
        System.out.println(this.nombre + " tiene como daño " + this.daño);
        System.out.println(tipoHabilidad.descripcion());
        System.out.println(tipoHabilidad.efecto());
    }
}
