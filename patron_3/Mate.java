package patron_3;

// CLASE CONCRETA: MATE
class Mate extends BebidaCaliente {

    @Override
    protected void agregarIngredientePrincipal() {
        System.out.println("2. Cebando la yerba en el mate.");
    }

    @Override
    protected void agregarCondimentosOFinalizar() {
        System.out.println("4. Colocando la bombilla para tomar.");
    }

    // Redefinición del Hook (Opcional)
    @Override
    protected void hookLimpieza() {
        System.out.println("   (Hook: Tirar la yerba usada al finalizar).");
    }
}
