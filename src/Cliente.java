package src;

import java.util.ArrayList;

public class Cliente {
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private ArrayList<Cuenta> cuentas;


    public Cliente() {

    }
    public Cliente(String dni, String nombre, String direccion, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "\n" +
                "dni='" + dni + '\'' + "\n" +
                ", nombre='" + nombre + '\'' + "\n" +
                ", direccion='" + direccion + '\'' + "\n" +
                ", telefono='" + telefono + '\'' + "\n" +
                '}' + "\n";
    }
}
