package src.menu;
import src.Banco;
import src.Sucursal;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuBanco {
    public static Banco crearBanco() {
        Scanner scanner = new Scanner(System.in);

        // variables para almacenar los datos del banco
        String nombreBanco;
        int codigoBanco;
        ArrayList<Sucursal> sucursales = new ArrayList<>();


        System.out.println("Bienvenido al sistema de creación de bancos.");
        System.out.println("-------------------------------------------");

        // pedimos al usuario los datos del banco
        System.out.print("Ingrese el nombre del banco: ");
        nombreBanco = scanner.nextLine();

        System.out.print("Ingrese el código del banco: ");
        codigoBanco = scanner.nextInt();
        scanner.nextLine(); // consumir la nueva linea que queda en el buffer

        // creamos el banco
        Banco banco = new Banco(nombreBanco, codigoBanco);

        // Preguntar al usuario si desea agregar sucursales al banco
        System.out.print("¿Desea agregar una sucursal al banco? (s/n): ");
        String opcion = scanner.nextLine();

        while (opcion.equalsIgnoreCase("s")) {
            // pedimos al usuario los datos de la sucursal
            System.out.print("Ingrese el ID de la sucursal: ");
            String idSucursal = scanner.nextLine();

            System.out.print("Ingrese la dirección de la sucursal: ");
            String direccionSucursal = scanner.nextLine();

            // creamos la sucursal con los datos ingresados
            Sucursal sucursal = new Sucursal(idSucursal, direccionSucursal);

            // Agregar la sucursal al banco
            banco.agregarSucursal(sucursal);

            // Preguntar al usuario si desea agregar otra sucursal al banco
            System.out.print("¿Desea agregar otra sucursal al banco? (s/n): ");
            opcion = scanner.nextLine();
        }


        return banco;
    }

    public static void mostrarBancos(ArrayList<Banco> listaBancos) {
        for (int i = 0; i < listaBancos.size(); i++) {
            System.out.println((i + 1) + ". " + listaBancos.get(i).getNombre());
        }
        System.out.println("\n" + "\n");
    }

    public static Sucursal seleccionarSucursalDeBanco(Banco banco) {
        // obtengo las sucursales del banco
        ArrayList<Sucursal> sucursales = banco.getSucursales();

        if (sucursales.isEmpty()) {
            System.out.println("El banco no tiene sucursales.");
            return null;
        } else {
            banco.mostrarSucursales();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese el número de la sucursal deseada: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            if (opcion >= 1 && opcion <= sucursales.size()) {
                return sucursales.get(opcion - 1);
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
                return null;
            }
        }

    }

    public static void gestionSucursal(ArrayList<Banco> listaBancos) {
        Scanner scanner = new Scanner(System.in);

        if (!listaBancos.isEmpty()) {
            mostrarBancos(listaBancos);
            System.out.print("Ingrese el número del banco deseado: ");
            int opcionBanco = Integer.parseInt(scanner.nextLine());

            if (opcionBanco >= 1 && opcionBanco <= listaBancos.size()) {
                Banco banco = listaBancos.get(opcionBanco - 1);

                Sucursal sucursalElegida = seleccionarSucursalDeBanco(banco);

                if (sucursalElegida != null) {
                        MenuSucursal.mostrarMenuSucursal(sucursalElegida);
                }
            } else {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } else {
            System.out.println("No hay bancos creados. Primero cree un banco.");
        }
    }


}

