package patron_2;

// Estereotipo: Adapter (para Billetera Virtual)
public class AdapterBilleteraVirtual implements IProcesadorPago {

    private BilleteraVirtual sistemaBilletera; // Referencia al Adaptee

    public AdapterBilleteraVirtual() {
        this.sistemaBilletera = new BilleteraVirtual();
    }

    @Override
    public void procesarPago(Huesped huesped, double monto) {
        // Traducimos la llamada: extraemos el email del huesped 
        System.out.println("--- Iniciando pago vía Adaptador Billetera ---");
        sistemaBilletera.realizarTransferencia(huesped.email, monto);
        System.out.println("--- Pago finalizado ---");
    }
}
