public abstract class CreadorDocumento {

    // Método de fábrica abstracto
    public abstract Documento crearDocumento();

    // Método opcional que usa el producto sin saber cuál es exactamente
    public void abrirNuevoDocumento() {
        Documento doc = crearDocumento();
        doc.abrir();
    }
}