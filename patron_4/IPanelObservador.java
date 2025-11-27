package patron_4;

// Estereotipo: Observer
// Interfaz que deben implementar todos los paneles visuales.
public interface IPanelObservador {
    void actualizar(String tipoSensor, double valor);
}
