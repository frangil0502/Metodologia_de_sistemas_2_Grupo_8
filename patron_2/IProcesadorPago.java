package patron_2;

//Esta es la interfaz común que usará la Reserva.
// Estereotipo: Target
public interface IProcesadorPago {
    void procesarPago(Huesped huesped, double monto);
}
