package mx.pekesoft.ejemplo3.solucion;

public class ValidadorUsuario {

    public boolean esValido(String usuario) {
        return usuario.matches("^[a-zA-Z0-9_.-]+$");
    }
}
