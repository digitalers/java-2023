package src;

public class Valor {

    private String tipo;
    private String nombre;
    private double cotizacion; // precio de cotizacion del valor

    public Valor() {

    }
    public Valor(String tipo, String nombre, double cotizacion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.cotizacion = cotizacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(double cotizacion) {
        this.cotizacion = cotizacion;
    }

    @Override
    public String toString() {
        return "Valor{" + "\n" +
                "tipo='" + tipo + '\'' + "\n" +
                ", nombre='" + nombre + '\'' + "\n" +
                ", cotizacion=" + cotizacion + "\n" +
                '}' + "\n";
    }
}
