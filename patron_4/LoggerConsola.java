package patron_4;

// Registro en consola
public class LoggerConsola implements IPanelObservador {
    @Override
    public void actualizar(String tipoSensor, double valor) {
        System.out.println("LOG: Cambio registrado en " + tipoSensor + " -> " + valor);
    }
}