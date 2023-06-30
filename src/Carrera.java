package src;

public class Carrera {
    private String nombre;
    private String sede;

    public Carrera(String nombre, String sede) {
        this.nombre = nombre;
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
