package patron_4;

// Solo reacciona si los valores superan un umbral (Lógica de negocio en la vista)
public class PanelAlertas implements IPanelObservador {
    @Override
    public void actualizar(String tipoSensor, double valor) {
        // Ejemplo simple de lógica de alerta
        if (tipoSensor.equals("Temperatura") && valor > 30) {
            System.out.println("!!! [ALERTA] ¡Temperatura crítica detectada: " + valor + "°C!");
        } else if (tipoSensor.equals("CO2") && valor > 1000) {
            System.out.println("!!! [ALERTA] ¡Niveles de CO2 peligrosos: " + valor + "ppm!");
        }
    }
}