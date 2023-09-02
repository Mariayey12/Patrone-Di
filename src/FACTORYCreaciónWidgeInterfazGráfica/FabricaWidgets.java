package FACTORYCreaciónWidgeInterfazGráfica;

// Paso 3: Crea la clase FabricaWidgets para aplicar el patrón Factory.
class FabricaWidgets {
    public Widget crearWidget(String tipo) {
        Widget widget;
        switch (tipo.toLowerCase()) {
            case "boton":
                widget = new Boton();
                break;
            case "campotexto":
                widget = new CampoTexto();
                break;
            case "panel":
                widget = new Panel();
                break;
            default:
                throw new IllegalArgumentException("Tipo de widget no válido: " + tipo);
        }
        return widget;
    }
}
