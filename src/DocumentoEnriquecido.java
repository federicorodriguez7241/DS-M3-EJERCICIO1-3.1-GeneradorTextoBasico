public class DocumentoEnriquecido implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abriendo archivo .rtf/.docx con soporte para negritas, colores e imágenes.");
    }
}
