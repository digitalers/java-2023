package ar.digitalers.domain;

import java.util.ArrayList;

public class Matricula {
 int idMatricula;
 String estado;
 String nombreInstituto;
 Estudiante estudiante;
 ArrayList<Asignatura> asignaturasIns;

    public Matricula(int idMatricula, String estado, String nombreInstituto, Estudiante estudiante, ArrayList<Asignatura> asignaturasIns) {
        this.idMatricula = idMatricula;
        this.estado = estado;
        this.nombreInstituto = nombreInstituto;
        this.estudiante = estudiante;
        this.asignaturasIns = asignaturasIns;
    }

    public int getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(int idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public ArrayList<Asignatura> getAsignaturasIns() {
        return asignaturasIns;
    }

    public void setAsignaturasIns(ArrayList<Asignatura> asignaturasIns) {
        this.asignaturasIns = asignaturasIns;
    }
}