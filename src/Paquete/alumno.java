package Paquete;

public class alumno {
    // Atributos
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String curp;
    private String telefono;
    private String correo;
    private String sexo;

    private boolean discapacidad;

    private int edad;

    // Constructor parametrizado
    public alumno(String nombre, String apellidoPaterno, String apellidoMaterno, String curp, String telefono, String correo, boolean discapacidad, String sexo ) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.curp = curp;
        this.telefono = telefono;
        this.correo = correo;
        this.discapacidad = discapacidad;
        this.sexo = sexo;

    } // end constructor parametrizado


    // Metodos getter / setter
    public String getNombre() {
        return nombre;
    } // end getNombre()
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } // end setNombre()

    public String getApellidoPaterno() {
        return apellidoPaterno;
    } // end getApellidoPaterno()
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    } // end setApellidoPaterno()

    public String getApellidoMaterno() {
        return apellidoMaterno;
    } // end getApellidoMaterno()
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    } // end setApellidoMaterno()

    public String getCurp() {
        return curp;
    } // end getCurp()
    public void setCurp(String curp) {
        this.curp = curp;
    } // end setCurp()

    public String getTelefono() {
        return telefono;
    } // end getTelefono()
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    } // end setTelefono()

    public String getCorreo() {
        return correo;
    } // end getCorreo()
    public void setCorreo(String correo) {
        this.correo = correo;
    } // end setCorreo()

    public String getDiscapacidad() {
        if(discapacidad == true)
            return "SI";
        else
            return "NO";
    } // end getDiscapacidad()
    public void setDiscapacidad(boolean discapacidad) {
        this.discapacidad = discapacidad;
    } // end setDiscapacidad()

    public int getEdad() {
        return edad;
    } // end getEdad()
    public void setEdad(int edad) {
        this.edad = edad;
    } // setEdad()

    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
} // end class alumno
