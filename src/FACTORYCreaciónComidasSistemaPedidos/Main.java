package FACTORYCreaciónComidasSistemaPedidos;

public class Main {
    public static void main(String[] args) {
        // Paso 4: Utiliza la fábrica para crear comidas, mostrar descripciones y calcular precios.
        FabricaComidas fabrica = new FabricaComidas();

        Comida comida1 = fabrica.crearHamburguesa();
        Comida comida2 = fabrica.crearPizza();
        Comida comida3 = fabrica.crearEnsalada();

        System.out.println("Comida 1: " + comida1.mostrarDescripcion() + ", Precio: $" + comida1.calcularPrecio());
        System.out.println("Comida 2: " + comida2.mostrarDescripcion() + ", Precio: $" + comida2.calcularPrecio());
        System.out.println("Comida 3: " + comida3.mostrarDescripcion() + ", Precio: $" + comida3.calcularPrecio());
    }
}
