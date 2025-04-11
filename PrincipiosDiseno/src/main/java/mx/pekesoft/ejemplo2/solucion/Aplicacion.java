package mx.pekesoft.ejemplo2.solucion;

public class Aplicacion {

    public static void main(String[] args) {
        Documento documento1 = new Documento();
        Documento documento2 = new DocumentoSoloLectura();

        procesar(documento1);
        procesar(documento2);
    }

    public static void procesar(Documento doc) {
        if (doc.puedeImprimir()) {
            doc.imprimir();
        } else {
            System.out.println("Este documento no puede imprimirse.");
        }
    }
}