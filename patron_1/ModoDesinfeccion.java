public class ModoDesinfeccion implements IProgramaClimatizacion {
    @Override
    public void ejecutarCiclo() {
        System.out.println("--- EJECUTANDO MODO DESINFECCIÓN INTENSIVA ---");
        System.out.println("1. Elevando temperatura a 26 °C.");
        System.out.println("2. Reduciendo humedad al 30 %.");
        System.out.println("3. Ventilación MÁXIMA con flujo de OZONO activada.");
        System.out.println("4. Duración total: 2 horas.");
        System.out.println("----------------------------------------------");
    }
}
