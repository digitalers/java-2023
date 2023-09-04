
package digitalers.java;


public class Asignatura {
    private String nombre_asignatura;
    private String tipo_asignatura;
    private int horas_asignatura;
    private int cuatrimestre_asignatura;

    public Asignatura(String nombre_asignatura, String tipo_asignatura, int horas_asignatura, int cuatrimestre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
        this.tipo_asignatura = tipo_asignatura;
        this.horas_asignatura = horas_asignatura;
        this.cuatrimestre_asignatura = cuatrimestre_asignatura;
    }

    public String getNombre_asignatura() {
        return nombre_asignatura;
    }

    public void setNombre_asignatura(String nombre_asignatura) {
        this.nombre_asignatura = nombre_asignatura;
    }

    public String getTipo_asignatura() {
        return tipo_asignatura;
    }

    public void setTipo_asignatura(String tipo_asignatura) {
        this.tipo_asignatura = tipo_asignatura;
    }

    public int getHoras_asignatura() {
        return horas_asignatura;
    }

    public void setHoras_asignatura(int horas_asignatura) {
        this.horas_asignatura = horas_asignatura;
    }

    public int getCuatrimestre_asignatura() {
        return cuatrimestre_asignatura;
    }

    public void setCuatrimestre_asignatura(int cuatrimestre_asignatura) {
        this.cuatrimestre_asignatura = cuatrimestre_asignatura;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "nombre_asignatura=" + nombre_asignatura +
                ", tipo_asignatura=" + tipo_asignatura +
                ", horas_asignatura=" + horas_asignatura + 
                ", cuatrimestre_asignatura=" + cuatrimestre_asignatura + '}';
    }
    
    
}
