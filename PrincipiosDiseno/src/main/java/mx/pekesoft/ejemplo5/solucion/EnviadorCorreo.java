package mx.pekesoft.ejemplo5.solucion;

public class EnviadorCorreo implements IEnviadorCorreo {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando correo a " + destinatario + ": " + mensaje);
    }
}
