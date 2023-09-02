package PROTOTYPEClonaciónDocumentos;

public class Main {
    public static void main(String[] args) {
        // Paso 4: Crea instancias de documentos y clona diferentes tipos de documentos.
        DocumentoTexto textoOriginal = new DocumentoTexto("Este es un documento de texto.");
        DocumentoTexto textoClonado;

        DocumentoImagen imagenOriginal = new DocumentoImagen("Imagen PNG");
        DocumentoImagen imagenClonada;

        try {
            // Clonar documentos de texto y mostrar sus contenidos y formatos.
            textoClonado = (DocumentoTexto) textoOriginal.clone();
            System.out.println("Texto Original: " + textoOriginal.mostrarContenido() + ", Formato: " + textoOriginal.obtenerFormato());
            System.out.println("Texto Clonado: " + textoClonado.mostrarContenido() + ", Formato: " + textoClonado.obtenerFormato());

            // Clonar documentos de imagen y mostrar sus contenidos y formatos.
            imagenClonada = (DocumentoImagen) imagenOriginal.clone();
            System.out.println("Imagen Original: " + imagenOriginal.mostrarContenido() + ", Formato: " + imagenOriginal.obtenerFormato());
            System.out.println("Imagen Clonada: " + imagenClonada.mostrarContenido() + ", Formato: " + imagenClonada.obtenerFormato());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}