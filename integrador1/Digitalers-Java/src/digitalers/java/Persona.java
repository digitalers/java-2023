package digitalers.java;

public abstract class Persona {

    private int dni;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(int dni, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre
                + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }

    public void Mostrar() {
        System.out.println("***** El nombre es " + nombre + ", apellido "
                + apellido + " , direccion: "
                + direccion + ", DNI N° " + dni + ".");

    }
}
