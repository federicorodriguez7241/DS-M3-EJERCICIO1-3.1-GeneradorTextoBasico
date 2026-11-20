public class Main {
    public static void main(String[] args) {

        // Instanciamos las fábricas especializadas
        CreadorDocumento creadorTxt = new CreadorTextoPlano();
        CreadorDocumento creadorRtf = new CreadorEnriquecido();

        System.out.println("--- PROBANDO CREACIÓN DE DOCUMENTOS ---");

        // Opción 1: Pedir el documento y abrirlo
        Documento doc1 = creadorTxt.crearDocumento();
        doc1.abrir();

        // Opción 2: Usar el método directo del creador
        creadorRtf.abrirNuevoDocumento();
    }
}