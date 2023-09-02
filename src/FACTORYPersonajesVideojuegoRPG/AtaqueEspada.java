package FACTORYPersonajesVideojuegoRPG;

// Paso 2: Implementa clases concretas que implementen la interfaz Habilidad.
class AtaqueEspada implements Habilidad{

    @Override
    public void usar() {
        System.out.println("¡El guerrero ataca con su espada!");

    }
}