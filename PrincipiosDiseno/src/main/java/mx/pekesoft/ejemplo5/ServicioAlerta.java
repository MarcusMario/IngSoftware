package mx.pekesoft.ejemplo5;

public class ServicioAlerta {

    private EnviadorCorreo enviador;

    public ServicioAlerta() {
         this.enviador = new EnviadorCorreo();
    }

    public void generarAlerta(String mensaje) {
        String destinatario = "jhc@empresa.com";
        System.out.println("Generando alerta: " + mensaje);
        enviador.enviar(destinatario, mensaje);
    }
}
