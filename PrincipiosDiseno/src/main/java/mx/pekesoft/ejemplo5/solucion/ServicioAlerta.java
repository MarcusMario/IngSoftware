package mx.pekesoft.ejemplo5.solucion;

public class ServicioAlerta {

    private IEnviadorCorreo enviador;

    public ServicioAlerta(IEnviadorCorreo enviador) {
        this.enviador = enviador;
    }

    public void generarAlerta(String mensaje) {
        String destinatario = "jhc@empresa.com";
        System.out.println("Generando alerta: " + mensaje);
        enviador.enviar(destinatario, mensaje);
    }
}
