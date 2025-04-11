package mx.pekesoft.ejemplo2.solucion;

public class DocumentoSoloLectura extends Documento {

    @Override
    public void imprimir() {
        System.out.println("Este documento es solo lectura y no puede imprimirse.");
    }

    @Override
    public boolean puedeImprimir() {
        return false;
    }
}
