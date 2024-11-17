
public class Persona {
    private String nombre;
    private String cedula;
    private String fechaNacimiento;
    private String correo;
    private String ciudadResidencia;
    private String ciudadOrigen;
    private Cancion[] canciones = new Cancion[3];
    private byte indice;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCiudadResidencia() {
        return ciudadResidencia;
    }

    public void setCiudadResidencia(String ciudadResidencia) {
        this.ciudadResidencia = ciudadResidencia;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public void agregarCancion(Cancion cancion) {
        if (indice < canciones.length) {
            canciones[indice++] = cancion;
        }
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cedula: " + cedula);
        System.out.println("Fecha de Nacimiento: " + fechaNacimiento);
        System.out.println("Correo: " + correo);
        System.out.println("Ciudad de Residencia: " + ciudadResidencia);
        System.out.println("Ciudad de Origen: " + ciudadOrigen);
        System.out.println("Canciones Favoritas:");
        for (Cancion cancion : canciones) {
            if (cancion != null) {
                cancion.mostrarCancion();
            }
        }
    }


}
