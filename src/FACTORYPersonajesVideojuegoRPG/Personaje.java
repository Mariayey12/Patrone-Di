package FACTORYPersonajesVideojuegoRPG;

// Paso 3: Crea la clase base Personaje.
class Personaje {
    private String nombre;
    private Habilidad habilidad;

    public Personaje(String nombre, Habilidad habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public void realizarAccion() {
        System.out.println(nombre + " realiza su acción:");
        habilidad.usar();
    }
}

