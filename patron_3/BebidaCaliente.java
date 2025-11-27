package patron_3;

// CLASE ABSTRACTA (El Template)
abstract class BebidaCaliente {

    // 1. EL MÉTODO PLANTILLA (Template Method)
    // Se declara 'final' para que las subclases no puedan cambiar la estructura del algoritmo.
    public final void preparar() {
        calentarAgua();
        agregarIngredientePrincipal();
        verterAguaCaliente();
        agregarCondimentosOFinalizar(); // Paso abstracto

        // HOOK (Gancho): Paso opcional
        if (clienteQuiereLimpiar()) {
            hookLimpieza(); 
        }
    }
// PASOS COMUNES (Implementados en la clase base)
    private void calentarAgua() {
        System.out.println("1. Calentando el agua...");
    }

    private void verterAguaCaliente() {
        System.out.println("3. Vertiendo el agua caliente en el recipiente...");
    }

    // PASOS ABSTRACTOS (Deben ser implementados por las subclases)
    protected abstract void agregarIngredientePrincipal();
    protected abstract void agregarCondimentosOFinalizar();

    // HOOKS (Ganchos)
    // Métodos con implementación por defecto (vacía o básica) que pueden ser redefinidos opcionalmente.
    protected boolean clienteQuiereLimpiar() {
        return true; // Por defecto, asumimos que sí
    }

    protected void hookLimpieza() {
        // Implementación vacía por defecto 
    }
}