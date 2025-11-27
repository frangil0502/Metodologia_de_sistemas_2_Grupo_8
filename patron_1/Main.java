public class Main {
    public static void main(String[] args) {
        // 1. Crear el contexto (El aire acondicionado)
        SistemaClimatizacion miClimatizador = new SistemaClimatizacion();

        // 2. Usuario selecciona Modo Confort
        System.out.println("\nUsuario selecciona: Modo Confort");
        miClimatizador.setPrograma(new ModoConfort());
        miClimatizador.iniciarFuncionamiento();

        // 3. Usuario decide cambiar a Modo Ahorro (Cambio en tiempo de ejecución)
        System.out.println("\nUsuario cambia a: Modo Ahorro");
        miClimatizador.setPrograma(new ModoAhorro());
        miClimatizador.iniciarFuncionamiento();

        // 4. Situación especial: Modo Desinfección
        System.out.println("\nUsuario activa: Modo Desinfección");
        miClimatizador.setPrograma(new ModoDesinfeccion());
        miClimatizador.iniciarFuncionamiento();
    }
}
