package src;

import src.Alumno;

import java.util.Date;

public class Tramite {
    private int numero;
    private Date fecha;
    private Alumno alumno;
    private String estado;

    public Tramite(int numero, Date fecha, Alumno alumno, String estado) {
        this.numero = numero;
        this.fecha = fecha;
        this.alumno = alumno;
        this.estado = estado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
