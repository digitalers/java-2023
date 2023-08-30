package ar.digitalers.domain;

public class Asignatura {
    String nombre;
    Profesor profesor;
    String descripcion;
    int idAsignatura;
    String estado;


    public Asignatura(String nombre, Profesor profesor, String descripcion, int idAsignatura, String estado) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.descripcion = descripcion;
        this.idAsignatura = idAsignatura;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}