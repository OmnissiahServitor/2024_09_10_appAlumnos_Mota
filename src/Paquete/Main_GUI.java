package Paquete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// La informacion guardada debera guardarse en un artchivo de texto plano.
// Crear proyecto en Github y subir el url

// Se calificara diseno UI y algo mas
// entrega 17 de septiembre
public class Main_GUI {
    private JPanel panel1;
    private JTextField txtF_nombre;
    private JButton aceptarButton;
    private JButton cancelarButton;
    private JTextField txtF_apellidoPaterno;
    private JTextField txtF_apellidoMaterno;
    private JTextField txtF_telefono;
    private JTextField txtF_correoElectronico;
    private JComboBox cmb_sexo;
    private JCheckBox chck_discapacidad;
    private JTextField txtCURP;

    public Main_GUI() {
        poblarComboBox();
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });
    }

    private void Borrar(){
        txtF_nombre.setText("");
        txtF_apellidoPaterno.setText("");
        txtF_apellidoMaterno.setText("");
        txtF_telefono.setText("");
        txtF_correoElectronico.setText("");
        chck_discapacidad.setSelected(false);
        txtCURP.setText("");
        cmb_sexo.setSelectedIndex(0);
    }

    private void poblarComboBox() {
        DefaultComboBoxModel <Genero> comboBoxModel = (DefaultComboBoxModel<Genero>) cmb_sexo.getModel();

        for(Genero genero : Genero.values()){
            comboBoxModel.addElement(genero);
        }
    }

    public static class alumno {
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private String curp;
        private String telefono;
        private String correo;
        private boolean discapacidad;

        private int edad;

        public alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, String telefono, String correo, boolean discapacidad) {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.curp = curp;
            this.telefono = telefono;
            this.correo = correo;
            this.discapacidad = discapacidad;

        }
    }

    public enum Genero {
        Hombre,
        Mujer

    }
}
