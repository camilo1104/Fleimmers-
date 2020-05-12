package proyecto.integrador;


public class salas {

    private int cantidadJugadores;
    private String usuariosParticipando;
    private String administradorSala;
    private String nombreSala;
    private String chat;

    public salas(int cantidadJugadores, String usuariosParticipando, String administradorSala, String nombreSala) {
        this.cantidadJugadores = cantidadJugadores;
        this.usuariosParticipando = usuariosParticipando;
        this.administradorSala = administradorSala;
        this.nombreSala = nombreSala;
        this.chat = "";
    }

    public void añadirParticipante() {

    }

    public void activarMicrofono() {

    }

    public void escribirChat() {

    }

    public void salir() {

    }

    public String getNombreSala() {
        return nombreSala;
    }

}
