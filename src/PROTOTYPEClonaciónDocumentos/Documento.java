package PROTOTYPEClonaciónDocumentos;

// Paso 1: Crea una clase abstracta llamada Documento con métodos comunes.
abstract class Documento implements Cloneable {
    private String contenido;
    private String formato;

    public Documento(String contenido, String formato) {
        this.contenido = contenido;
        this.formato = formato;
    }

    public String mostrarContenido() {
        return contenido;
    }

    public String obtenerFormato() {
        return formato;
    }

    // Paso 3: Implementa el método clone() para permitir la clonación profunda.
    @Override
    protected Documento clone() throws CloneNotSupportedException {
        return (Documento) super.clone();
    }
}

// Paso 2: Implementa clases concretas que hereden de Documento.
class DocumentoTexto extends Documento {
    public DocumentoTexto(String contenido) {
        super(contenido, "Texto");
    }
}

