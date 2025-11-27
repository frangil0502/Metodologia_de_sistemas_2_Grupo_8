public class SistemaClimatizacion {
    
    // Referencia a la interfaz Strategy
    private IProgramaClimatizacion programaActual;

    
    public SistemaClimatizacion() {
        System.out.println("[Sistema] Inicializando sistema de climatización...");
    }

    // Método para establecer o cambiar la estrategia 
    public void setPrograma(IProgramaClimatizacion nuevoPrograma) {
        this.programaActual = nuevoPrograma;
        System.out.println("[Sistema] Programa cambiado exitosamente.");
    }

    // Método que delega la ejecución a la estrategia concreta
    public void iniciarFuncionamiento() {
        if (programaActual == null) {
            System.out.println("[Error] No se ha seleccionado ningún programa.");
        } else {
            programaActual.ejecutarCiclo();
        }
    }
}