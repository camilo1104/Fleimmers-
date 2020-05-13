package proyecto.integrador;


public class rpg extends videoJuegos {
     private int misionesCumplidas;
     private String logrosObtenidos;

    public rpg(int misionesCumplidas, String logrosObtenidos, String nombre, char controles, int cantidadJugadores) {
        super(nombre, controles, cantidadJugadores);
        this.misionesCumplidas = misionesCumplidas;
        this.logrosObtenidos = logrosObtenidos;
    }
     public void sumarMisiones(){

     }
     public void registroLogros(){

     }

}
