package src;

import src.menu.MenuBanco;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Banco> listaBancos = new ArrayList<>();
        boolean salir = false;
        Banco banco = null;

        // agrego informacion
        Banco galicia = new Banco("galicia", 22 );
        Banco nacion = new Banco("nacion", 1 );
        Banco frances = new Banco("frances", 30 );

        // Crear instancias de Sucursal
        Sucursal sucursal1 = new Sucursal("S001", "Sobremonte 22");
        Sucursal sucursal2 = new Sucursal("S002", "Belgrano 12");

        // Creamos un cliente
        Cliente cliente1 = new Cliente("43609808",  "tomy", "brasil", "35414555");
        sucursal1.agregarCliente(cliente1);

        // Agregar las sucursales al banco
        galicia.agregarSucursal(sucursal1);
        nacion.agregarSucursal(sucursal2);

        listaBancos.add(galicia);
        listaBancos.add(nacion);
        listaBancos.add(frances);


        while (!salir) {
            System.out.println("MENU PRINCIPAL");
            System.out.println("1. Crear banco");
            System.out.println("2. Mostrar bancos");
            System.out.println("4. Gestionar sucursal");
            System.out.println("5. Salir");
            System.out.print("Ingrese la opción deseada: ");


            String opcionStr = scanner.nextLine(); // Leer la opción como cadena de texto
            int opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    // crear banco y agregarle sucursales
                    banco = MenuBanco.crearBanco();
                    listaBancos.add(banco);
                    break;
                case 2:
                    // mostrar bancos
                    MenuBanco.mostrarBancos(listaBancos);
                    break;
                case 4:
                    // gestion sucursal
                    MenuBanco.gestionSucursal(listaBancos);
                    break;

                case 5:
                    // salir del programa
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        scanner.close();
        System.out.println("Adiosssssssssssssss");
    }
}
