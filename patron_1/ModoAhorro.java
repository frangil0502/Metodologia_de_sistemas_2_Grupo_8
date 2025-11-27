public class ModoAhorro implements IProgramaClimatizacion {
    @Override
    public void ejecutarCiclo() {
        System.out.println("--- EJECUTANDO MODO AHORRO ENERGÉTICO ---");
        System.out.println("1. Ajustando temperatura a 19 °C.");
        System.out.println("2. Reduciendo humedad al 40 %.");
        System.out.println("3. Ventilación BAJA activada (Ciclos: 30min ON / 30min OFF).");
        System.out.println("4. Duración total: 12 horas.");
        System.out.println("-----------------------------------------");
    }
}
