package patron_2;




// Estereotipo: Adapter (para Tarjeta de Crédito)
public class AdapterTarjetaCredito implements IProcesadorPago {
    
    private TarjetaCredito sistemaTarjeta; // Referencia al Adaptee

    public AdapterTarjetaCredito() {
        this.sistemaTarjeta = new TarjetaCredito();
    }

    @Override
    public void procesarPago(Huesped huesped, double monto) {
        // Traducimos la llamada simple a la lógica compleja del legado
        System.out.println("--- Iniciando pago vía Adaptador Tarjeta ---");
        
        if (sistemaTarjeta.validarLimite(huesped.numeroTarjeta, monto)) {
            sistemaTarjeta.autorizarCargo(huesped.numeroTarjeta, monto);
            System.out.println("--- Pago finalizado ---");
        } else {
            System.out.println("Error: Límite insuficiente.");
        }
    }
}
