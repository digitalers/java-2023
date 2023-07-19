package clases;

import java.util.ArrayList;
import java.util.Date;

public class Matricula {

    private int idMatricula;
    private String estado;
    private String nombreInstituto;
    private ArrayList<Asignatura> asignaturaIns;

    private Date fechaMatriculacion;

    public Matricula(int idMatricula, String estado, String nombreInstituto, ArrayList<Asignatura> asignaturaIns, Date fechaMatriculacion) {
        this.idMatricula = idMatricula;
        this.estado = estado;
        this.nombreInstituto = nombreInstituto;
        this.asignaturaIns = asignaturaIns;
        this.fechaMatriculacion = fechaMatriculacion;
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

    public ArrayList<Asignatura> getAsignaturaIns() {
        return asignaturaIns;
    }

    public void setAsignaturaIns(ArrayList<Asignatura> asignaturaIns) {
        this.asignaturaIns = asignaturaIns;
    }

    public Date getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public void setFechaMatriculacion(Date fechaMatriculacion) {
        this.fechaMatriculacion = fechaMatriculacion;
    }
}
