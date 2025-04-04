public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Lobby lobby = new Lobby();

        juego.iniciarPartida();

        lobby.entrarLobby();
    }
}
