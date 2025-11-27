package patron_3;

// CLASE PRINCIPAL (Para probar)
public class MainBebidas {
    public static void main(String[] args) {
        System.out.println("--- PREPARANDO MATE ---");
        BebidaCaliente miMate = new Mate();
        miMate.preparar();

        System.out.println("\n--- PREPARANDO CAFÉ ---");
        BebidaCaliente miCafe = new Cafe();
        miCafe.preparar();
    }
}