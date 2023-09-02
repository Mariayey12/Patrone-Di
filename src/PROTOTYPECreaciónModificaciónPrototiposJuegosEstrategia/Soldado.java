package PROTOTYPECreaciónModificaciónPrototiposJuegosEstrategia;

// Paso 2: Implementa clases concretas que hereden de Unidad para representar tipos de unidades de juego.
class Arquero implements Unidad {
    private String descripcion;
    private int ataque;
    private int defensa;

    public Arquero(String descripcion, int ataque, int defensa) {
        this.descripcion = descripcion;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    @Override
    public String mostrarDescripcion() {
        return descripcion;
    }

    @Override
    public void atacar() {
        System.out.println("Arquero atacando con un poder de ataque de " + ataque);
    }

    @Override
    public void defender() {
        System.out.println("Arquero defendiendo con una defensa de " + defensa);
    }

    // Paso 3: Implementa el método clone() para permitir la clonación de unidades.
    @Override
    public Unidad clone() throws CloneNotSupportedException {
        return (Unidad) super.clone();
    }

    // Paso 4: Agrega métodos para modificar atributos específicos de las unidades.
    public void modificarAtaque(int nuevoAtaque) {
        this.ataque = nuevoAtaque;
    }

    public void modificarDefensa(int nuevaDefensa) {
        this.defensa = nuevaDefensa;
    }
}