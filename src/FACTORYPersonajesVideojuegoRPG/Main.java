package FACTORYPersonajesVideojuegoRPG;

public class Main {
    public static void main(String[] args) {
        // Paso 5: Utiliza la fábrica para crear personajes y sus habilidades únicas.
        FabricaPersonajes fabrica = new FabricaPersonajes();
        Personaje guerrero = fabrica.crearPersonaje("Guerrero");
        Personaje mago = fabrica.crearPersonaje("Mago");
        Personaje arquero = fabrica.crearPersonaje("Arquero");

        Personaje guerrero1 = guerrero;
        guerrero1.realizarAccion();
        mago.realizarAccion();
        arquero.realizarAccion();
    }
}