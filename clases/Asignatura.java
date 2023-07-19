package clases;

public class Asignatura {

    private int idAsignatura;
    private String nombre;
    private String descripcion;
    private String estado;
    private int cantHoras;
    private int cuatrimestre;
    private String tipo;

    public Asignatura() {
    }

    public Asignatura(int idAsignatura, String nombre, String descripcion, String estado, int cantHoras, int cuatrimestre, String tipo) {
        this.idAsignatura = idAsignatura;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.cantHoras = cantHoras;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
