package patron_4;

import java.util.ArrayList;
import java.util.List;


// Define la lógica de gestión de suscriptores.
public abstract class Sensor {
    
    // Lista de observadores suscritos
    private List<IPanelObservador> suscriptores = new ArrayList<>();
    
    protected String tipoSensor;
    protected double valorActual;

    public Sensor(String tipoSensor) {
        this.tipoSensor = tipoSensor;
    }

    // Método para suscribir un panel
    public void agregarObservador(IPanelObservador panel) {
        suscriptores.add(panel);
        System.out.println("[Sistema] " + panel.getClass().getSimpleName() + " suscrito a " + tipoSensor);
    }

    // Método para desuscribir un panel
    public void eliminarObservador(IPanelObservador panel) {
        suscriptores.remove(panel);
        System.out.println("[Sistema] " + panel.getClass().getSimpleName() + " desuscrito de " + tipoSensor);
    }

    // Método: Notifica a todos los observadores de la lista
    protected void notificarObservadores() {
        for (IPanelObservador observador : suscriptores) {
            observador.actualizar(this.tipoSensor, this.valorActual);
        }
    }

    // Método que simula el cambio de valor físico
    public void setValor(double nuevoValor) {
        this.valorActual = nuevoValor;
        // Inmediatamente notifica el cambio
        notificarObservadores();
    }
}
