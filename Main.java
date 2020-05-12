package proyecto.integrador;

import javax.swing.JOptionPane;

public class ProyectoIntegrador {

    public static void main(String[] args) {
        //menu usuario
        Usuario usuarios[] = new Usuario[10];
        String nombreUsuario, correo, contraseña, correoLogin, contraseñaLogin;
        int operador, id = 0, auxCont = 0, auxCont2 = 0;
        boolean condicion = true, verificarLogin = false;

        while (condicion == true) {

            operador = Integer.parseInt(JOptionPane.showInputDialog("<<<BIENVENIDO AL MENU FLEIMMER>>>\n<<<<seleccione una opcion>>>>\n"
                    + "1-crear usuario\n"
                    + "2-ingresar con usuario creado\n"));

            switch (operador) {
                case 1:
                    nombreUsuario = JOptionPane.showInputDialog("ingrese el nombre de usuario");
                    correo = JOptionPane.showInputDialog("ingrese una cuenta de email");
                    contraseña = JOptionPane.showInputDialog("digite su contraseña");
                    usuarios[auxCont] = new Usuario(nombreUsuario, correo, contraseña);
                    usuarios[auxCont].asignarId();
                    System.out.println("El usuario ha sido creado correctamente");
                    auxCont++;
                    break;
                case 2:
                    correoLogin = JOptionPane.showInputDialog("ingrese el correo");
                    contraseñaLogin = JOptionPane.showInputDialog("ingrese la contraseña");
                    auxCont2 = 0;
                    while (verificarLogin == false) {
                        if (usuarios[auxCont2] != null) {
                            usuarios[auxCont2].verificarLogin(correoLogin, contraseñaLogin, usuarios, verificarLogin, auxCont2);

                        }
                        if (auxCont2 == 9) {
                            System.out.println("correo o contraseña incorrecta, intente de nuevo");
                            verificarLogin = true;
                        }
                        auxCont2++;
                    }
            }
        }
        //menu salas
        salas sala[] = new salas[5];
        int cantidadJugadores, auxCont3 = 0, auxCont4 = 0, operador2;
        String usuariosParticipando, administradorSala, nombreSala, loginSala, chat;
        auxCont2--;
        boolean condicion2 = true, verificarSala = false;
        while (condicion2 == true) {

            operador2 = Integer.parseInt(JOptionPane.showInputDialog("<<<BIENVENIDO AL MENU FLEIMMER>>>\n<<<<seleccione una opcion>>>>\n"
                    + "1-crear sala\n"
                    + "2-acceder a una sala\n"));

            switch (operador2) {
                case 1:
                    cantidadJugadores = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de jugadores"));
                    administradorSala = usuarios[auxCont2].getNombreUsuario();
                    nombreSala = JOptionPane.showInputDialog("ingrese el nombre de la sala");
                    usuariosParticipando = "En este momento la sala esta vacia";
                    sala[auxCont3] = new salas(cantidadJugadores, usuariosParticipando, administradorSala, nombreSala);
                    System.out.println("La sala fue creada correctamente");
                    auxCont3++;
                    break;
                case 2:
                    loginSala = JOptionPane.showInputDialog("Ingrese el nombre de la sala");
                    auxCont4 = 0;
                    while (verificarSala == false) {
                        if (sala[auxCont4] != null) {
                            if (loginSala.equals(sala[auxCont4].getNombreSala())) {
                                System.out.println("se accedio correctamente a la sala");
                                verificarSala = true;

                            } else if (auxCont4 == sala.length - 1) {
                                System.out.println("La sala no existe,intente de nuevo");
                                verificarSala = true;
                            }
                        }
                        if (auxCont4 == 4) {
                            System.out.println("La sala  no existe, intente de nuevo");
                            verificarSala = true;
                        }
                        auxCont4++;
                    }
                    break;

            }

        }
        boolean condicion3 = true;
        while (condicion2 == true) {

            operador2 = Integer.parseInt(JOptionPane.showInputDialog("<<<BIENVENIDO AL MENU FLEIMMER>>>\n<<<<seleccione una opcion>>>>\n"
                    + "1-crear sala\n"
                    + "2-acceder a una sala\n"));

            switch (operador2) {
                case 1:
            }
        }
    }
}
