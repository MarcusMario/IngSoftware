public class ConfiguracionMinecraft {

    private static ConfiguracionMinecraft instancia;
    private int distanciaRenderizado;
    private boolean modoHardcore;

    // Constructor privado para evitar múltiples instancias
    private ConfiguracionMinecraft() {
        this.distanciaRenderizado = 12;
        this.modoHardcore = false;
    }

    public static ConfiguracionMinecraft obtenerInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracionMinecraft();
        }
        return instancia;
    }

    public void ajustarRenderizado(int distancia) {
        this.distanciaRenderizado = distancia;
    }

    public void activarHardcore(boolean activar) {
        this.modoHardcore = activar;
    }

    public int obtenerRenderizado() {
        return distanciaRenderizado;
    }

    public boolean esHardcore() {
        return modoHardcore;
    }

    public void mostrarConfiguracion() {
        System.out.println("🌍 Configuración de Minecraft ");
        System.out.println("🔲 Distancia de Renderizado: " + distanciaRenderizado + " chunks");
        System.out.println("💀 Modo Hardcore: " + (modoHardcore ? "Activado" : "Desactivado"));
    }
}
