package FACTORYCreaciónComidasSistemaPedidos;

// Paso 3: Crea la clase FabricaComidas para aplicar el patrón Factory.
class FabricaComidas {
    public Comida crearHamburguesa() {
        return new Hamburguesa();
    }

    public Comida crearPizza() {
        return new Pizza();
    }

    public Comida crearEnsalada() {
        return new Ensalada();
    }
}