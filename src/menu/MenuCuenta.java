package src.menu;

import src.Cliente;
import src.Cuenta;
import src.Sucursal;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuCuenta {
    public static void gestionCuentasEnSucursal(Sucursal sucursal) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("MENU GESTIÓN DE CUENTAS");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Ver cuentas");
            System.out.println("3. Operar con cuenta");
            System.out.println("4. Volver al menú principal");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    crearCuentaEnSucursal(sucursal);
                    break;
                case 2:
                    verCuentasEnSucursal(sucursal);
                    break;
                case 3:
                    operarConCuenta(sucursal);
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }

    private static void crearCuentaEnSucursal(Sucursal sucursal) {
        Scanner scanner = new Scanner(System.in);

        String numeroCuenta;
        double saldoInicial;
        double interes;

        System.out.println("Creando una nueva cuenta en la sucursal: " + sucursal.getDireccion());
        System.out.println("-------------------------------------------");

        // solicita los detalles de la cuenta al usuario
        System.out.print("Ingrese el número de cuenta: ");
        numeroCuenta = scanner.nextLine();

        System.out.print("Ingrese el saldo inicial: ");
        saldoInicial = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la tasa de interés: ");
        interes = Double.parseDouble(scanner.nextLine());

        Date fechaApertura = new Date();

        ArrayList<Cliente> clientesSucursal = sucursal.getClientes();

        System.out.println("Clientes en la sucursal:");
        for (int i = 0; i < clientesSucursal.size(); i++) {
            System.out.println((i + 1) + ". " + clientesSucursal.get(i).getNombre() + " (DNI: " + clientesSucursal.get(i).getDni() + ")");
        }

    // solicitar al usuario que seleccione un cliente
        System.out.print("Ingrese el número del cliente deseado: ");
        int opcionCliente = Integer.parseInt(scanner.nextLine());

        if (opcionCliente >= 1 && opcionCliente <= clientesSucursal.size()) {
            Cliente clienteSeleccionado = clientesSucursal.get(opcionCliente - 1);
            Cuenta cuentaNueva = new Cuenta(numeroCuenta, new Date(), saldoInicial, 0.0, clienteSeleccionado);
            clienteSeleccionado.agregarCuenta(cuentaNueva);

            System.out.println("Cuenta creada y asociada al cliente " + clienteSeleccionado.getNombre() + " exitosamente.");
        } else {
            System.out.println("Opción inválida. No se ha asociado la cuenta a ningún cliente.");
        }

        System.out.println("Cuenta creada exitosamente.");
    }

    private static void verCuentasEnSucursal(Sucursal sucursal) {
        Scanner scanner = new Scanner(System.in);

        if (!sucursal.getClientes().isEmpty()) {
            System.out.println("CLIENTES EN LA SUCURSAL");
            System.out.println("-----------------------");
            int index = 1;
            for (Cliente cliente : sucursal.getClientes()) {
                System.out.println(index + ". " + cliente.getNombre() + " - DNI: " + cliente.getDni());
                index++;
            }
            System.out.print("Ingrese el número del cliente para ver sus cuentas: ");
            int opcionCliente = Integer.parseInt(scanner.nextLine());

            if (opcionCliente >= 1 && opcionCliente <= sucursal.getClientes().size()) {
                Cliente clienteSeleccionado = sucursal.getClientes().get(opcionCliente - 1);
                System.out.println("Cuentas de " + clienteSeleccionado.getNombre() + ":");
                System.out.println("-----------------------");

                ArrayList<Cuenta> cuentasCliente = clienteSeleccionado.getCuentas();
                if (!cuentasCliente.isEmpty()) {
                    int cuentaIndex = 1;
                    for (Cuenta cuenta : cuentasCliente) {
                        System.out.println(cuentaIndex + ". Número de cuenta: " + cuenta.getNumero());
                        System.out.println("   Saldo: " + cuenta.getSaldo());
                        System.out.println("-----------------------");
                        cuentaIndex++;
                    }
                } else {
                    System.out.println("Este cliente no tiene cuentas asociadas.");
                }
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } else {
            System.out.println("No hay clientes en la sucursal.");
        }
    }

    private static void operarConCuenta(Sucursal sucursal) {
        Scanner scanner = new Scanner(System.in);

        if (!sucursal.getClientes().isEmpty()) {
            System.out.println("CLIENTES EN LA SUCURSAL");
            System.out.println("-----------------------");
            int index = 1;
            for (Cliente cliente : sucursal.getClientes()) {
                System.out.println(index + ". " + cliente.getNombre() + " - DNI: " + cliente.getDni());
                index++;
            }
            System.out.print("Ingrese el número del cliente para operar con sus cuentas: ");
            int opcionCliente = Integer.parseInt(scanner.nextLine());

            if (opcionCliente >= 1 && opcionCliente <= sucursal.getClientes().size()) {
                Cliente clienteSeleccionado = sucursal.getClientes().get(opcionCliente - 1);
                System.out.println("Cuentas de " + clienteSeleccionado.getNombre() + ":");
                System.out.println("-----------------------");

                ArrayList<Cuenta> cuentasCliente = clienteSeleccionado.getCuentas();
                if (!cuentasCliente.isEmpty()) {
                    int cuentaIndex = 1;
                    for (Cuenta cuenta : cuentasCliente) {
                        System.out.println(cuentaIndex + ". Número de cuenta: " + cuenta.getNumero());
                        System.out.println("   Saldo: " + cuenta.getSaldo());
                        System.out.println("-----------------------");
                        cuentaIndex++;
                    }

                    System.out.print("Ingrese el número de la cuenta con la que desea operar: ");
                    int opcionCuenta = Integer.parseInt(scanner.nextLine());

                    if (opcionCuenta >= 1 && opcionCuenta <= cuentasCliente.size()) {
                        Cuenta cuentaSeleccionada = cuentasCliente.get(opcionCuenta - 1);
                        System.out.println("Cuenta seleccionada: " + cuentaSeleccionada.getNumero());
                        operarConCuenta(cuentaSeleccionada);
                    } else {
                        System.out.println("Opción inválida. Intente nuevamente.");
                    }
                } else {
                    System.out.println("Este cliente no tiene cuentas asociadas.");
                }
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } else {
            System.out.println("No hay clientes en la sucursal.");
        }
    }

    private static void operarConCuenta(Cuenta cuentaSeleccionada) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("MENÚ DE OPERACIONES DE CUENTA");
            System.out.println("-----------------------------");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Transferir fondos");
            System.out.println("4. Mostrar saldo");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = Double.parseDouble(scanner.nextLine());
                    cuentaSeleccionada.depositar(montoDeposito);
                    System.out.println("¡Depósito exitoso! Saldo actual: " + cuentaSeleccionada.getSaldo());
                    break;
                case 2:
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = Double.parseDouble(scanner.nextLine());
                    boolean retiroExitoso = cuentaSeleccionada.retirar(montoRetiro);
                    if (retiroExitoso) {
                        System.out.println("¡Retiro exitoso! Saldo actual: " + cuentaSeleccionada.getSaldo());
                    } else {
                        System.out.println("Saldo insuficiente para realizar el retiro.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el número de cuenta a la que desea transferir: ");
                    String numeroCuentaDestino = scanner.nextLine();
                    System.out.print("Ingrese el monto a transferir: ");
                    double montoTransferencia = Double.parseDouble(scanner.nextLine());
//                    boolean transferenciaExitosa = cuentaSeleccionada.transferir(numeroCuentaDestino, montoTransferencia);

//                    if (transferenciaExitosa) {
//                        System.out.println("¡Transferencia exitosa! Saldo actual: " + cuentaSeleccionada.getSaldo());
//                    } else {
//                        System.out.println("No se pudo realizar la transferencia. Verifique el número de cuenta destino.");
//                    }
                    break;
                case 4:
                    System.out.println("Saldo actual: " + cuentaSeleccionada.getSaldo());
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
    }
}
