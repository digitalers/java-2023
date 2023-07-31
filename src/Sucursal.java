package src;

import java.util.ArrayList;

public class Sucursal extends Banco{

    private String idSucursal;
    private String direccion;
    private ArrayList<Cliente> clientes;

    public Sucursal(String idSucursal, String direccion) {
        this.idSucursal = idSucursal;
        this.direccion = direccion;
        this.clientes = new ArrayList<>();
    }

    // agregar un cliente a la sucursal
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    // dar de baja a un cliente de la sucursal
    public void darDeBajaCliente(Cliente cliente) {
        clientes.remove(cliente);
    }
    // modificar los datos de un cliente de la sucursal
    public void modificarCliente(Cliente cliente, String nuevaDireccion, String nuevoTelefono) {
        // Se busca el cliente en la lista de clientes de la sucursal
        int index = clientes.indexOf(cliente);
        if (index != -1) {
            // Si se encuentra, se modifica su dirección y teléfono
            Cliente clienteEncontrado = clientes.get(index);
            clienteEncontrado.setDireccion(nuevaDireccion);
            clienteEncontrado.setTelefono(nuevoTelefono);
        }
    }

    public void mostrarDNIClientes() {
        System.out.println("DNI DE CLIENTES EN SUCURSAL " + idSucursal);
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getDni());
        }
    }

    // consultar los datos de todos los clientes de la sucursal
    public void consultarDatosClientes() {
        for (Cliente cliente : clientes) {
            System.out.println("DNI: " + cliente.getDni());
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Dirección: " + cliente.getDireccion());
            System.out.println("Teléfono: " + cliente.getTelefono());
            System.out.println("-----------------------------");
        }
    }

    public String getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(String idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "idSucursal='" + idSucursal + '\'' +
                ", direccion='" + direccion + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
