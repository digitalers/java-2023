package src;

import java.util.Date;

public class CajaDeAhorro extends Cuenta{
    private int meses;

    public CajaDeAhorro() {

    }

    public CajaDeAhorro(String numero, Date fechaApertura, double saldo, double interes, Cliente cliente, int meses) {
        super(numero, fechaApertura, saldo, interes, cliente);
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }

    @Override
    public String toString() {
        return "CajaDeAhorro{" +
                "meses=" + meses +
                '}';
    }
}
