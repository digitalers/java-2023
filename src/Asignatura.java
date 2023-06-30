package src;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private String tipo;
    private int horas;
    private ArrayList<Carrera> carreras;
    private int cuatrimestre;

    public Asignatura(String nombre, String tipo, int horas, ArrayList<Carrera> carreras, int cuatrimestre) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.horas = horas;
        this.carreras = carreras;
        this.cuatrimestre = cuatrimestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }


}
