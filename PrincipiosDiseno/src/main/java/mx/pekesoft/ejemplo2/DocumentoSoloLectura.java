package mx.pekesoft.ejemplo2;

public class DocumentoSoloLectura extends Documento {

    @Override
    public void imprimir() {
        throw new UnsupportedOperationException("Este documento no puede imprimirse.");
    }
}
