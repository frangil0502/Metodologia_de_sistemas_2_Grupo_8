package patron_2;

public class Main {
    public static void main(String[] args) {
        // 1. Datos iniciales
        Huesped cliente = new Huesped("Juan Perez", "juan@email.com", "4500-1234-5678-9010");
        Reserva reserva = new Reserva(cliente, 15000.00);

        // 2. Pago con Tarjeta de Crédito
        // Usamos el adaptador, no la clase Tarjeta directamente
        IProcesadorPago pagoConTarjeta = new AdapterTarjetaCredito();
        reserva.pagarCon(pagoConTarjeta);

        // 3. Pago con Billetera Virtual
        // Usamos el adaptador correspondiente
        IProcesadorPago pagoConBilletera = new AdapterBilleteraVirtual();
        reserva.pagarCon(pagoConBilletera);
    }


}
