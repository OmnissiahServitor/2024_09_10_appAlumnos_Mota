import Paquete.BotonGuardarListener;
import Paquete.Main_GUI;
import Paquete.alumno;
import javax.swing.*;

import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Main_GUI pantalla = new Main_GUI();
                pantalla.setVisible(true);

                pantalla.setBotonGuardarListener(new BotonGuardarListener(){
                    public void guardando(alumno persona){
                        System.out.println("Nombre: " + persona.getNombre());
                        System.out.println("A. paterno: " + persona.getApellidoPaterno());
                        System.out.println("A. materno: " + persona.getApellidoMaterno());
                        System.out.println("CURP: " + persona.getCurp());
                        System.out.println("Correo: " + persona.getCorreo());
                        System.out.println("Telefono: " + persona.getTelefono());
                        System.out.println("Sexo: " + persona.getSexo());
                        System.out.println("Es discapacitado? " + persona.getDiscapacidad());
                        System.out.println("Edad: " + calcularEdad(persona.getCurp()));

                        Path path = Path.of("C:\\Users\\ivancenteno\\IdeaProjects\\2024_09_05_UI_DatosPersonales\\luis.txt");
                        String content = persona.getNombre();

                        try( FileWriter archivo = new FileWriter(path.toFile(), true) ){
                            PrintWriter pw = new PrintWriter(archivo);
                            //pw.println(content);
                            archivo.write(content);
                        } catch (IOError e) {
                            e.getMessage();
                        } catch(IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }); // end pantalla.setBotonGuardarListener()
                // CURP = CEGI980405HDFNRV01
            } // end run()
        }); // end SwingUtilities.invokeLater()
    } // end main()

    public static int calcularEdad(String Curp){
        int yearsCurp, monthCurp, dayCurp, edad;

        yearsCurp = Integer.parseInt(Curp.substring(4,6));
        monthCurp = Integer.parseInt(Curp.substring(6,8));
        dayCurp = Integer.parseInt(Curp.substring(8,10));

        LocalDate ahora = LocalDate.now();

        int currentYear = ahora.getYear();
        int currentMonth = ahora.getMonthValue();
        int currentDay = ahora.getDayOfMonth();

        if(yearsCurp > (currentYear - 2000) ){ // la persona nacio antes de 1999
            yearsCurp +=1900;
        }
        else { // la persona nacio despues de los 2000
            yearsCurp +=2000;
        } // end if-else

        edad = currentYear - yearsCurp; // si aun no es cumpleanos de la persona, se le restara uno a la edad

        System.out.println("Current year: " + currentYear +
                            "\nCurrent month: " + currentMonth +
                            "\nCurrent day: " + currentDay +
                            "\nCURP year: " + yearsCurp +
                            "\nCURP month: " + monthCurp +
                            "\nCURP day: " + dayCurp +
                            "\nEdad: " + edad);

        if(currentMonth < monthCurp){
            edad--;
            System.out.println("if 1");
            return edad;
        } // end if

        if(currentMonth == monthCurp && currentDay < dayCurp){
            edad--;
            System.out.println("if 2");
            return edad;
        } // end if

        return edad;
    } // end calcularEdad()
} // end class Main
