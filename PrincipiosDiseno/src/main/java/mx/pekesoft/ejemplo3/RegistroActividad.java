package mx.pekesoft.ejemplo3;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class RegistroActividad {

    public void registrar(String usuario, String accion) {
        String mensaje = LocalDateTime.now() + " - " + usuario + ": " + accion;

        //  en consola
        System.out.println(mensaje);

        // Guardar a archivo
        try (FileWriter escritor = new FileWriter("registro.txt", true)) {
            escritor.write(mensaje + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Validando
        if (!usuario.matches("^[a-zA-Z0-9_.-]+$")) {
            System.out.println("Advertencia: formato de usuario inválido.");
        }
    }

    public static void main(String[] args) {
        RegistroActividad registro = new RegistroActividad();
        registro.registrar("admin123", "Acceso al sistema");
    }
}
