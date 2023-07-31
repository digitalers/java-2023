package src;

import java.util.Date;

public class FondoDeInversion {
    private Date fechaApertura;    // fecha de apertura del fondo
    private Date fechaVencimiento; // fecha de vencimiento del fondo
    private String nombre;         // nombre del fondo de inversión
    private double importe;        // importe del fondo
    private double rentabilidad;

    public FondoDeInversion() {

    }

    public FondoDeInversion(Date fechaApertura, Date fechaVencimiento, String nombre, double importe, double rentabilidad) {
        this.fechaApertura = fechaApertura;
        this.fechaVencimiento = fechaVencimiento;
        this.nombre = nombre;
        this.importe = importe;
        this.rentabilidad = rentabilidad;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getRentabilidad() {
        return rentabilidad;
    }

    public void setRentabilidad(double rentabilidad) {
        this.rentabilidad = rentabilidad;
    }

    @Override
    public String toString() {
        return "FondoDeInversion{" + "\n" +
                "fechaApertura=" + fechaApertura + "\n" +
                ", fechaVencimiento=" + fechaVencimiento + "\n" +
                ", nombre='" + nombre + '\'' + "\n" +
                ", importe=" + importe + "\n" +
                ", rentabilidad=" + rentabilidad + "\n" +
                '}' + "\n";
    }
}
