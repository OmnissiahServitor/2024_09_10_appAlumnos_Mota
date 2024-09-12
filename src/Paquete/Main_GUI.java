package Paquete;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// La informacion guardada debera guardarse en un artchivo de texto plano.
// Crear proyecto en Github y subir el url

// Se calificara diseno UI y algo mas
// entrega 17 de septiembre
public class Main_GUI extends JFrame { // anadir extends JFrame
    private JPanel pnPrincipal;
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
    private BotonGuardarListener botonGuardarListener;

    public Main_GUI() {
        // agregado el lunes 9 de septiembre de 2024
        setTitle("Alumnos");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // si no se pone, se queda activo el hilo de programacion

        setContentPane(pnPrincipal);
        pack();

        poblarComboBox();

        setLocationRelativeTo(null);


        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enviarDatos();
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Borrar();
            }
        });
    }

    public void setBotonGuardarListener(BotonGuardarListener listener) {
        this.botonGuardarListener = listener;
    } // end setBotonGuardarListener()

    private void enviarDatos() { // toma los datos y los guarda en variables
        String nombre = txtF_nombre.getText();
        String apellidoPaterno = txtF_apellidoPaterno.getText();
        String apellidoMaterno = txtF_apellidoMaterno.getText();
        String telefono = txtF_telefono.getText();
        String correo = txtF_correoElectronico.getText();
        String sexo = cmb_sexo.getSelectedItem().toString();
        String CURP = txtCURP.getText();
        Boolean discapacidad = chck_discapacidad.isSelected();

        alumno datos = new alumno(nombre,apellidoPaterno,apellidoMaterno,CURP,telefono,correo,discapacidad, sexo);

        if(botonGuardarListener != null){
            botonGuardarListener.guardando(datos);
        }
        Borrar();
    } // end enviarDatos()

    private void Borrar(){
        txtF_nombre.setText("");
        txtF_apellidoPaterno.setText("");
        txtF_apellidoMaterno.setText("");
        txtF_telefono.setText("");
        txtF_correoElectronico.setText("");
        chck_discapacidad.setSelected(false);
        txtCURP.setText("");
        cmb_sexo.setSelectedIndex(0);
    } // end borrar()

    private void poblarComboBox() {
        DefaultComboBoxModel <Genero> comboBoxModel = (DefaultComboBoxModel<Genero>) cmb_sexo.getModel();

        for(Genero genero : Genero.values()){
            comboBoxModel.addElement(genero);
        }
    } // end poblarComboBox()

} // end class Main_GUI