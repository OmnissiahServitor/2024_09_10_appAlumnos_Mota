package Paquete;

public class alumno {
    // Atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String curp;
    private String telefono;
    private String correo;
    private boolean discapacidad;

    private int edad;

    // Constructor parametrizado
    public alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, String telefono, String correo, boolean discapacidad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.curp = curp;
        this.telefono = telefono;
        this.correo = correo;
        this.discapacidad = discapacidad;

    } // end constructor parametrizado

    public String getNombre() {
        return nombre;
    } // end getNombre()
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // end setNombre()

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCurp() {
        return curp;
    }
    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isDiscapacidad() {
        return discapacidad;
    }
    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

} // end class alumno
