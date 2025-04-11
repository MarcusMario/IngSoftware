package mx.pekesoft.ejemplo3.solucion;

import java.io.FileWriter;
import java.io.IOException;

public class EscritorArchivo {

    private final String rutaArchivo;

    public EscritorArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public void escribir(String mensaje) {
        try (FileWriter escritor = new FileWriter(rutaArchivo, true)) {
            escritor.write(mensaje + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
