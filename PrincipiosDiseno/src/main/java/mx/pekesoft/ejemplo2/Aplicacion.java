package mx.pekesoft.ejemplo2;

public class Aplicacion {

    public static void main(String[] args) {
        Documento documento1 = new Documento();
        Documento documento2 = new DocumentoSoloLectura();

        procesar(documento1);
        procesar(documento2);  // ?
    }

    public static void procesar(Documento doc) {
        doc.imprimir();
    }
}
