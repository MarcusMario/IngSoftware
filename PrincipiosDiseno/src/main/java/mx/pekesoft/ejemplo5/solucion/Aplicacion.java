package mx.pekesoft.ejemplo5.solucion;

public class Aplicacion {

    public static void main(String[] args) {
        IEnviadorCorreo enviador = new EnviadorCorreo();
        ServicioAlerta servicio = new ServicioAlerta(enviador);
        servicio.generarAlerta("El servidor de ICO está inactivo.");
    }
}
