package FACTORYCreaciónComidasSistemaPedidos;

class Pizza implements Comida {
    @Override
    public String mostrarDescripcion() {
        return "Pizza de pepperoni";
    }

    @Override
    public double calcularPrecio() {
        return 8.99;
    }
}
