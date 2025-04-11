package mx.pekesoft.ejemplo3.solucion;

import java.time.LocalDateTime;

public class RegistroActividad {

    private final EscritorArchivo escritor;
    private final ValidadorUsuario validador;

    public RegistroActividad() {
        this.escritor = new EscritorArchivo("registro.txt");
        this.validador = new ValidadorUsuario();
    }

    public void registrar(String usuario, String accion) {
        String mensaje = LocalDateTime.now() + " - " + usuario + ": " + accion;

        System.out.println(mensaje);
        escritor.escribir(mensaje);

        if (!validador.esValido(usuario)) {
            System.out.println("Advertencia: formato de usuario inválido.");
        }
    }
}
