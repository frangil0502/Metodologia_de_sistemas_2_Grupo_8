package patron_3;

// CLASE CONCRETA: CAFE
class Cafe extends BebidaCaliente {

    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("2. Poniendo café molido en la taza.");
    }

    @Override
    protected void agregarCondimentosOFinalizar() {
        System.out.println("4. Agregando azúcar al gusto.");
    }

    // Café decide no usar el hook de limpieza, usa el comportamiento por defecto
    protected boolean clienteQuiereLimpiar() {
        return false; 
    }
}
