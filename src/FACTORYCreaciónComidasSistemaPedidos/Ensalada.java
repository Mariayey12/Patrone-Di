package FACTORYCreaciónComidasSistemaPedidos;

class Ensalada implements Comida {
    @Override
    public String mostrarDescripcion() {
        return "Ensalada César";
    }

    @Override
    public double calcularPrecio() {
        return 4.49;
    }
}
