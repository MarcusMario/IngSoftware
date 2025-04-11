package mx.pekesoft.ejemplo5;

public class Aplicacion {

    public static void main(String[] args) {
        ServicioAlerta servicio = new ServicioAlerta();
        servicio.generarAlerta("El servidor de ICO está inactivo.");
    }
}
