package clases;

import java.util.ArrayList;

public class PlanDeEstudio {
    private int idPlan;
    private String nombre;
    private Carrera carrera;
    private ArrayList<Asignatura> asignaturas;

    public PlanDeEstudio(int idPlan, String nombre, Carrera carrera, ArrayList<Asignatura> asignaturas) {
        this.idPlan = idPlan;
        this.nombre = nombre;
        this.carrera = carrera;
        this.asignaturas = asignaturas;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
