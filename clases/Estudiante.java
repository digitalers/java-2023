package clases;

import java.util.Date;

public class Estudiante extends Persona{
    private int idEstudiante;
    private Carrera carrera;
    private String universidad;
    private String estado;
    private Date fechaIngreso;
    private float promedio;
    private Matricula matricula;

    private boolean activo;

    public Estudiante(){

    }


    public Estudiante(String nombre, String apellido, int dni, String direccion, String telefono, int idEstudiante, Carrera carrera, String universidad, String estado, Date fechaIngreso, float promedio, Matricula matricula) {
        super(nombre, apellido, dni, direccion, telefono);
        this.idEstudiante = idEstudiante;
        this.carrera = carrera;
        this.universidad = universidad;
        this.estado = estado;
        this.fechaIngreso = fechaIngreso;
        this.promedio = promedio;
        this.matricula = matricula;
        this.activo = true;
    }

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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        if (isActivo()){
            return "idEstudiante: " + idEstudiante +
                    ", Nombre: " + getNombre() +
                    ", Apellido: " + getApellido() +
                    ", DNI: " + getDni() +
                    ", Direccion: " + getDireccion() +
                    ", carrera: " + carrera.getNombre() +
                    ", universidad: '" + universidad + '\'' +
                    ", promedio: " + promedio +
                    '\n';
        }
        else {
            return "";
        }

    }
}
