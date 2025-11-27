package patron_2;

// Adaptee 2: Sistema legado de Billetera (Simple: usa email)
class BilleteraVirtual {
    public void realizarTransferencia(String emailUsuario, double monto) {
        System.out.println("[Wallet System] Transferencia de $" + monto + " realizada desde la cuenta: " + emailUsuario);
    }
}
