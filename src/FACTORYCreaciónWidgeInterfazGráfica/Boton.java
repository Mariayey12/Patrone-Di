package FACTORYCreaciónWidgeInterfazGráfica;

public class Boton implements  Widget{
    @Override
    public void dibujar() {
        System.out.println("Dibujando un botón.");
    }

    @Override
    public void clic() {
        System.out.println("Haciendo clic en un botón.");

    }
}
