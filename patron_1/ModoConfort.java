public class ModoConfort implements IProgramaClimatizacion {
    @Override
    public void ejecutarCiclo() {
        System.out.println("--- EJECUTANDO MODO CONFORT DIARIO ---");
        System.out.println("1. Ajustando temperatura a 22 °C.");
        System.out.println("2. Manteniendo humedad al 50 %.");
        System.out.println("3. Ventilacion MEDIA activada (Duración: 8 horas continuas).");
        System.out.println("--------------------------------------");
    }
}
