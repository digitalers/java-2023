package clases;

import java.util.ArrayList;

public class Profesor extends Persona{
    private int idProfesor;
    private ArrayList<Asignatura> asignaturas;
    private String departamento;
    private String estadoLaboral;

    public Profesor(int idProfesor, ArrayList<Asignatura> asignaturas, String departamento, String estadoLaboral) {
        this.idProfesor = idProfesor;
        this.asignaturas = asignaturas;
        this.departamento = departamento;
        this.estadoLaboral = estadoLaboral;
    }

    public Profesor(String nombre, String apellido, int dni, String direccion, String telefono, int idProfesor, ArrayList<Asignatura> asignaturas, String departamento, String estadoLaboral) {
        super(nombre, apellido, dni, direccion, telefono);
        this.idProfesor = idProfesor;
        this.asignaturas = asignaturas;
        this.departamento = departamento;
        this.estadoLaboral = estadoLaboral;
    }

    public int getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getEstadoLaboral() {
        return estadoLaboral;
    }

    public void setEstadoLaboral(String estadoLaboral) {
        this.estadoLaboral = estadoLaboral;
    }
}
