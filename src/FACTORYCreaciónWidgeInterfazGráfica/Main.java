package FACTORYCreaciónWidgeInterfazGráfica;

public class Main {
    public static void main(String[] args) {
        // Paso 4: Utiliza la fábrica para crear widgets y realizar acciones específicas.

        FabricaWidgets fabrica = new FabricaWidgets();
        Widget boton = fabrica.crearWidget("Boton");
        Widget campoTexto = fabrica.crearWidget("CampoTexto");
        Widget panel = fabrica.crearWidget("Panel");

        boton.dibujar();
        boton.clic();

        campoTexto.dibujar();
        campoTexto.clic();

        panel.dibujar();
        panel.clic();
    }
}