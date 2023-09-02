package FACTORYCreaciónComidasSistemaPedidos;

// Paso 1: Define la interfaz Comida que representa las acciones comunes de las comidas.
interface Comida {
    String mostrarDescripcion();
    double calcularPrecio();
}