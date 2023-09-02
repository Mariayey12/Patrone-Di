package FACTORYCreaciónWidgeInterfazGráfica;

public class CampoTexto implements Widget{
    @Override
    public void dibujar() {
        System.out.println("Dibujando un campo de texto.");
    }

    @Override
    public void clic() {
        System.out.println("Haciendo clic en un campo de texto.");

    }
}
