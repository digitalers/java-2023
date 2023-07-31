package src.menu;

import src.Cliente;
import src.Sucursal;

import java.awt.*;
import java.util.Scanner;

public class MenuSucursal {
    public static void mostrarMenuSucursal(Sucursal sucursal) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("MENÚ DE SUCURSAL: " + sucursal.getIdSucursal());
            System.out.println("1. Agregar cliente");
            System.out.println("2. Dar de baja cliente");
            System.out.println("3. Modificar datos de cliente");
            System.out.println("4. Ver datos de clientes");
            System.out.println("5. Gestionar cuentas");
            System.out.println("6. Volver al menú principal");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    agregarCliente(sucursal);
                    break;
                case 2:
                    darDeBajaCliente(sucursal);
                    break;
                case 3:
                    modificarCliente(sucursal);
                    break;
                case 4:
                    sucursal.consultarDatosClientes();
                    break;
                case 5:
                    MenuCuenta.gestionCuentasEnSucursal(sucursal);
                    break;
                    case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }

    }

    private static void agregarCliente(Sucursal sucursal) {
        Scanner scanner = new Scanner(System.in);

        // Pedir los datos del nuevo cliente
        System.out.print("Ingrese el DNI del cliente: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese el teléfono del cliente: ");
        String telefono = scanner.nextLine();

        // creamos el cliente con los datos ingresados
        Cliente cliente = new Cliente(dni, nombre, direccion, telefono);

        // agregamos el cliente a la sucursal
        sucursal.agregarCliente(cliente);

        System.out.println("Cliente agregado exitosamente.");
    }

    private static void darDeBajaCliente(Sucursal sucursal) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CLIENTES EN SUCURSAL " + sucursal.getIdSucursal());
        System.out.println("------------------------");
        sucursal.mostrarDNIClientes();

        // Pedir el DNI del cliente a dar de baja
        System.out.print("\nIngrese el DNI del cliente a dar de baja: ");
        String dni = scanner.nextLine();

        // Buscar el cliente en la sucursal
        Cliente clienteEncontrado = null;
        for (Cliente cliente : sucursal.getClientes()) {
            if (cliente.getDni().equals(dni)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            // Dar de baja al cliente de la sucursal
            sucursal.darDeBajaCliente(clienteEncontrado);
            System.out.println("Cliente con DNI " + dni + " dado de baja exitosamente.");
        } else {
            System.out.println("Cliente con DNI " + dni + " no encontrado en la sucursal.");
        }
    }

    private static void modificarCliente(Sucursal sucursal) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el DNI del cliente a modificar
        System.out.print("Ingrese el DNI del cliente a modificar: ");
        String dni = scanner.nextLine();

        // Buscar el cliente en la sucursal
        Cliente clienteEncontrado = null;
        for (Cliente cliente : sucursal.getClientes()) {
            if (cliente.getDni().equals(dni)) {
                clienteEncontrado = cliente;
                break;
            }
        }

        if (clienteEncontrado != null) {
            // Pedir los nuevos datos del cliente
            System.out.print("Ingrese la nueva dirección del cliente: ");
            String nuevaDireccion = scanner.nextLine();

            System.out.print("Ingrese el nuevo teléfono del cliente: ");
            String nuevoTelefono = scanner.nextLine();

            // Modificar los datos del cliente en la sucursal
            sucursal.modificarCliente(clienteEncontrado, nuevaDireccion, nuevoTelefono);
            System.out.println("Datos del cliente modificados exitosamente.");
        } else {
            System.out.println("Cliente con DNI " + dni + " no encontrado en la sucursal.");
        }
    }

}
