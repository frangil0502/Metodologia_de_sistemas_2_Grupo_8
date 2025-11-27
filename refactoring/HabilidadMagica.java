package refactoring;
// Subclase HabilidadMagica

public class HabilidadMagica extends TipoHabilidad {

    @Override
    public double calcularDaño(double base) {
        return base * 2;
    }

    @Override
    public String descripcion() {
        return "Habilidad tipo mágica";
    }

    @Override
    public String efecto() {
        return "Esta habilidad dobla tu fuerza";
    }
}
