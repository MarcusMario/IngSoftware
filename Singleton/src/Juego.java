public class Juego {

    public void iniciarPartida() {
        ConfiguracionMinecraft config = ConfiguracionMinecraft.obtenerInstancia();
        System.out.println("🎮 Iniciando Minecraft...");
        config.mostrarConfiguracion();

        config.ajustarRenderizado(20);
        config.activarHardcore(true);
        System.out.println("⚙️ Configuración del Juego actualizada.");
    }
}

