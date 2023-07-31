package src;

import java.util.Date;

public class CuentaCorriente extends Cuenta{
    private TarjetaDeCredito tarjetaDeCredito;

    public CuentaCorriente(){

    }
    public CuentaCorriente(Date fechaApertura, String numero, double saldo, double interes, Cliente cliente, TarjetaDeCredito tarjetaDeCredito) {
        super( numero, fechaApertura, saldo, interes, cliente);
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "tarjetaDeCredito=" + tarjetaDeCredito +
                '}';
    }
}

