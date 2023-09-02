package FACTORYCreaciónComidasSistemaPedidos;

// Paso 2: Implementa clases concretas que implementen la interfaz Comida.
class Hamburguesa implements Comida {
    @Override
    public String mostrarDescripcion() {
        return "Hamburguesa clásica";
    }

    @Override
    public double calcularPrecio() {
        return 5.99;
    }
}

