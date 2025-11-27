package refactoring;


// TipoHabilidad (superclase abstracta)
public abstract class TipoHabilidad {

    public abstract double calcularDaño(double base);

    public abstract String descripcion();

    public abstract String efecto();
}
