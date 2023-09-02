package PROTOTYPECreaciónModificaciónPrototiposJuegosEstrategia;

// Paso 1: Crea una interfaz llamada Unidad con métodos comunes.
interface Unidad extends Cloneable {
    String mostrarDescripcion();
    void atacar();
    void defender();

    void modificarAtaque(int i);

    void modificarDefensa(int i);
}