package src;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private int codigo;
    private ArrayList   <Sucursal> sucursales;

    public Banco() {

    }
    public Banco(String nombre, int codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        sucursales.add(sucursal);
    }

    public void eliminarSucursal(Sucursal sucursal) {
        sucursales.remove(sucursal);
    }

    public void mostrarSucursales() {
        System.out.println("Sucursales del banco " + nombre + ":");
        int index = 1;
        for (Sucursal sucursal : sucursales) {
            System.out.println(index + ". " + " ID: " + sucursal.getIdSucursal());
            System.out.println("Dirección: " + sucursal.getDireccion());
            System.out.println("--------------");
            index++;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(ArrayList<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    @Override
    public String toString() {
        return "Banco{" + "\n" +
                "nombre='" + nombre + '\'' + "\n" +
                ", codigo=" + codigo + "\n" +
                '}' + "\n";
    }
}
