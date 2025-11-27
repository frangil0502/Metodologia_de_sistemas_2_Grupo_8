package patron_4;

// Muestra los datos generales
public class PanelGeneral implements IPanelObservador {
    @Override
    public void actualizar(String tipoSensor, double valor) {
        System.out.println(">>> [Panel General] Sensor: " + tipoSensor + " | Valor Actual: " + valor);
    }
}
