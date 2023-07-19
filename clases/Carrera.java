package clases;

public class Carrera {
    private int idCarrera;
    private String nombre;
    private String duracion;
    private String titulo;
    private String area;
    private String sede;

    public Carrera() {
    }

    public Carrera(int idCarrera, String nombre, String duracion, String titulo, String area, String sede) {
        this.idCarrera = idCarrera;
        this.nombre = nombre;
        this.duracion = duracion;
        this.titulo = titulo;
        this.area = area;
        this.sede = sede;
    }

    public int getIdCarrera() {
        return idCarrera;
    }

    public void setIdCarrera(int idCarrera) {
        this.idCarrera = idCarrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
