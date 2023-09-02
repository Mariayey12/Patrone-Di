package FACTORYPersonajesVideojuegoRPG;
// Paso 4: Crea la clase FabricaPersonajes para aplicar el patrón Factory.
public class FabricaPersonajes {
    public Personaje crearPersonaje(String tipo){
        Habilidad habilidad;
        switch (tipo.toLowerCase()) {
            case "guerrero":
                habilidad = new AtaqueEspada();
                break;
            case "mago":
                habilidad = new LanzarHechizo();
                break;
            case "arquero":
                habilidad = new DispararFlecha();
                break;
            default:
                throw new IllegalArgumentException("Tipo de personaje no válido: " + tipo);
        }
        return new Personaje(tipo, habilidad);
    }
}


