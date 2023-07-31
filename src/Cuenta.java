package src;

import java.util.Date;

public class Cuenta {
    private Date fechaApertura;
    private String numero;
    private double saldo;
    private double interes;     // tipo de interes de la cuenta
    private Cliente cliente;    // datos del cliente asociado a la cuenta

    public Cuenta() {

    }

    public Cuenta(String numero, Date fechaApertura, double saldo, double interes, Cliente cliente) {
        this.numero = numero;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
        this.interes = interes;
        this.cliente = cliente;
    }


    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("Monto inválido. Debe ser mayor que cero.");
        }
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            return true;
        } else {
            return false;
        }
    }

    public boolean transferir(Cuenta cuentaDestino, double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            cuentaDestino.depositar(monto);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "\n" +
                "fechaApertura=" + fechaApertura + "\n" +
                ", numero='" + numero + '\'' + "\n" +
                ", saldo=" + saldo + "\n" +
                ", interes=" + interes + "\n" +
                ", cliente=" + cliente + "\n" +
                '}' + "\n";
    }
}
