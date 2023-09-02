package PROTOTYPECreaciónModificaciónPrototiposJuegosEstrategia;

public class Main {
    public static void main(String[] args) {
        // Paso 5: Crea instancias de unidades de juego,
        // clona unidades y realiza modificaciones personalizadas.
        try {
            Unidad soldadoOriginal = new Soldado("Soldado básico", 10, 5);
            Unidad arqueroOriginal = new Arquero("Arquero avanzado", 8, 3);

            Unidad soldadoClonado = ((Soldado) soldadoOriginal).clone();
            Unidad arqueroClonado = ((Arquero) arqueroOriginal).clone();

            System.out.println("Soldado Original: " + soldadoOriginal.mostrarDescripcion());
            System.out.println("Arquero Original: " + arqueroOriginal.mostrarDescripcion());

            soldadoClonado.modificarAtaque(12);
            arqueroClonado.modificarDefensa(4);

            System.out.println("Soldado Clonado: " + soldadoClonado.mostrarDescripcion());
            System.out.println("Arquero Clonado: " + arqueroClonado.mostrarDescripcion());

            soldadoClonado.atacar();
            arqueroClonado.defender();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
