package proyecto.integrador;


public class shooter extends videoJuegos {
    private int puntuacion;
    private int asesinatos;

    public shooter(int puntuacion, int asesinatos, String nombre, char controles, int cantidadJugadores) {
        super(nombre, controles, cantidadJugadores);
        this.puntuacion = puntuacion;
        this.asesinatos = asesinatos;
    }
    public void calcularPuntuacion(){

    }
    public void sumarAsesinatos(){

    }
}
