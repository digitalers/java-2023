
package digitalers.java;


public class Carrera {
    private String nombre_carrera;
    private String nombre_sede;

    public Carrera(String nombre_carrera, String nombre_sede) {
        this.nombre_carrera = nombre_carrera;
        this.nombre_sede = nombre_sede;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getNombre_sede() {
        return nombre_sede;
    }

    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre_carrera=" + nombre_carrera + ", nombre_sede=" + nombre_sede + '}';
    }
    
    
}
