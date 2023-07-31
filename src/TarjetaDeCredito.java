package src;

import java.util.Date;

public class TarjetaDeCredito {
    private Date fechaVencimiento; // Fecha de vencimiento de la tarjeta de crédito
    private String numero;
    private String tipo;           // tipo de la tarjeta (Visa, MasterCard, etc.)
    private String titular;

    public TarjetaDeCredito() {

    }

    public TarjetaDeCredito(Date fechaVencimiento, String numero, String tipo, String titular) {
        this.fechaVencimiento = fechaVencimiento;
        this.numero = numero;
        this.tipo = tipo;
        this.titular = titular;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito{" + "\n" +
                "fechaVencimiento=" + fechaVencimiento + "\n" +
                ", numero='" + numero + '\'' + "\n" +
                ", tipo='" + tipo + '\'' + "\n" +
                ", titular='" + titular + '\'' + "\n" +
                '}' + "\n";
    }
}
