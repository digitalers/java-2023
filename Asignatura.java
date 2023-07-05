public class Asignatura {
    private String nombre;
    private int cantidadHoras;
    private int cuatrimestre;
    private String tipo;

    public Asignatura(String nombre, int cantidadHoras, int cuatrimestre, String tipo) {
        this.nombre = nombre;
        this.cantidadHoras = cantidadHoras;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public void setCantidadHoras(int cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
