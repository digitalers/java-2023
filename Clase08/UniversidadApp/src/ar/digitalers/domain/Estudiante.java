package ar.digitalers.domain;

public class Estudiante extends Persona {
    private int idEstudiante;
    private Carrera carrera;
    private float promedio;
    private float porcentajeAprobado;
    private Date FechaIngreso;
    private String universidad;
    private String estado;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public float getPorcentajeAprobado() {
        return porcentajeAprobado;
    }

    public void setPorcentajeAprobado(float porcentajeAprobado) {
        this.porcentajeAprobado = porcentajeAprobado;
    }

    public Date getFechaIngreso() {
        return FechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        FechaIngreso = fechaIngreso;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
