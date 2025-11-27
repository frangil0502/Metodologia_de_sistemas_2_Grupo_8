package patron_2;


class TarjetaCredito {
    public boolean validarLimite(String nroTarjeta, double monto) {
        System.out.println("[Bank System] Verificando límite de tarjeta " + nroTarjeta + "...");
        return true; // Simulamos que siempre tiene saldo
    }

    public void autorizarCargo(String nroTarjeta, double monto) {
        System.out.println("[Bank System] Cargo de $" + monto + " autorizado en tarjeta " + nroTarjeta);
    }
    
}
