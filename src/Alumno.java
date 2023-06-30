package src;

import java.util.ArrayList;

public class Alumno extends Persona {
    private String idAlumno;
    private ArrayList<Asignatura> materias;
    Carrera carrera;
    boolean activo;
    public Alumno(String dni, String nombre, String direccion, String idAlumno,ArrayList<Asignatura> materias,Carrera carrera,boolean activo) {
        super(dni, nombre, direccion);
        this.idAlumno = idAlumno;
        this.materias = materias;
        this.carrera = carrera;
        this.activo = activo;

    }


    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public ArrayList<Asignatura> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Asignatura> materias) {
        this.materias = materias;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}