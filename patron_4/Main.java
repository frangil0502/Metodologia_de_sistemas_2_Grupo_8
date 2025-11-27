package patron_4;
// Prueba del Sistema (Principal)
public class Main {
    public static void main(String[] args) {
        // 1. Crear los Sensores (Observables)
        Sensor termometro = new SensorTemperatura();
        Sensor detectorCO2 = new SensorCO2();

        // 2. Crear los Paneles (Observadores)
        IPanelObservador panelGeneral = new PanelGeneral();
        IPanelObservador panelAlertas = new PanelAlertas();
        IPanelObservador logger = new LoggerConsola();

        // 3. Configurar suscripciones 
        System.out.println("--- CONFIGURANDO SISTEMA ---");
        // El termómetro reporta a todos
        termometro.agregarObservador(panelGeneral);
        termometro.agregarObservador(panelAlertas);
        termometro.agregarObservador(logger);

        // El CO2 solo reporta a alertas y logger (no al general)
        detectorCO2.agregarObservador(panelAlertas);
        detectorCO2.agregarObservador(logger);

        // 4. Simulación de funcionamiento
        System.out.println("\n--- CAMBIOS DE ESTADO ---");
        
        // Cambio normal
        termometro.setValor(25.0); 
        
        // Cambio crítico (debería disparar alerta)
        System.out.println("\n--- PICO DE CALOR ---");
        termometro.setValor(35.5);

        // 5. Desconexión en tiempo real
        System.out.println("\n--- DESACTIVANDO LOGGER PARA TEMPERATURA ---");
        termometro.eliminarObservador(logger);
        
        termometro.setValor(28.0); // El logger ya no imprime esto

        System.out.println("\n--- FUGA DE GAS ---");
        detectorCO2.setValor(1200); // Dispara alerta y logger CO2
    }
}
