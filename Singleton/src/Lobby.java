public class Lobby {
    public void entrarLobby() {
        ConfiguracionMinecraft config = ConfiguracionMinecraft.obtenerInstancia();
        System.out.println("🏠 Entrando al Lobby...");
        config.mostrarConfiguracion();
    }
}
