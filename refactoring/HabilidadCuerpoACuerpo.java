package refactoring;
// Subclase HabilidadCuerpoACuerpo

public class HabilidadCuerpoACuerpo extends TipoHabilidad {

    @Override
    public double calcularDaño(double base) {
        return base;
    }

    @Override
    public String descripcion() {
        return "Habilidad tipo Cuerpo a cuerpo";
    }

    @Override
    public String efecto() {
        return "Esta habilidad mantiene tu fuerza";
    }
}
