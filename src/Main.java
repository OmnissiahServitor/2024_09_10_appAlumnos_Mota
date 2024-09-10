import Paquete.BotonGuardarListener;
import Paquete.Main_GUI;
import Paquete.alumno;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Main_GUI pantalla = new Main_GUI();
                pantalla.setVisible(true);

                pantalla.setBotonGuardarListener(new BotonGuardarListener());
                public void guardando(alumno persona){
                    System.out.println("Nombre: " + persona.getNombre());
                    System.out.println("A. paterno" + persona.getApellidoPaterno());
                }
            }
        });
    } // end main()
} // end class Main
