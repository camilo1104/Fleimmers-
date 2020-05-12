package proyecto.integrador;

public class Usuario {

    private String nombreUsuario;
    private int id;
    private String correo;
    private String contraseña;

    public Usuario(String nombreUsuario, String correo, String contraseña) {
        this.nombreUsuario = nombreUsuario;
        this.id = 0;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public int asignarId() {
        this.id = this.id + 1;
        return this.id;
    }

    public String ingresarCorreo(String correoLogin) {
        return correoLogin;
    }

    public String ingresarConstraseña(String contraseñaLogin) {
        return contraseñaLogin;
    }

    public boolean verificarLogin(String correoLogin, String contraseñaLogin, Usuario usuarios[], boolean verificarLogin, int auxCont2) {

        if (correoLogin.equals(usuarios[auxCont2].getCorreo()) && (contraseñaLogin.equals(usuarios[auxCont2].getContraseña()))) {
            System.out.println("acceso concedido");
            verificarLogin = true;

        } else if (auxCont2 == usuarios.length - 1) {
            System.out.println("correo o contraseña incorrecta intente de nuevo");
            verificarLogin = true;
        }

        return verificarLogin;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContraseña() {
        return contraseña;
    }
}
