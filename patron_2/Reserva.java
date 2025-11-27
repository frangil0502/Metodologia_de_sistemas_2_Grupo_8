package patron_2;


public class Reserva {
    private Huesped huesped;
    private double montoTotal;

    public Reserva(Huesped huesped, double montoTotal) {
        this.huesped = huesped;
        this.montoTotal = montoTotal;
    }

    public void pagarCon(IProcesadorPago medioDePago) {
        System.out.println("\nProcesando reserva para: " + huesped.nombre);
        medioDePago.procesarPago(this.huesped, this.montoTotal);
    }
}
