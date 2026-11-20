public class DocumentoTextoPlano implements Documento {
    @Override
    public void abrir() {
        System.out.println("Abriendo archivo .txt en modo texto plano (sin formatos).");
    }
}
