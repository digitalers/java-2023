import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionEstudiantilApp {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        List<Profesor> profesores = new ArrayList<>();
        List<Tramite> tramites = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        int opcion;
        do {
            System.out.println("----- GESTIÓN ESTUDIANTIL -----");
            System.out.println("1. Agregar estudiante");
            System.out.println("2. Agregar profesor");
            System.out.println("3. Realizar trámite");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("----- AGREGAR ESTUDIANTE -----");
                    System.out.print("DNI: ");
                    String dniEstudiante = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreEstudiante = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccionEstudiante = scanner.nextLine();
                    System.out.print("Carrera: ");
                    String carreraEstudiante = scanner.nextLine();

                    Estudiante estudiante = new Estudiante(dniEstudiante, nombreEstudiante, direccionEstudiante, carreraEstudiante);
                    estudiantes.add(estudiante);
                    System.out.println("Estudiante agregado con éxito.");
                    break;

                case 2:
                    System.out.println("----- AGREGAR PROFESOR -----");
                    System.out.print("DNI: ");
                    String dniProfesor = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombreProfesor = scanner.nextLine();
                    System.out.print("Dirección: ");
                    String direccionProfesor = scanner.nextLine();
                    System.out.print("Departamento: ");
                    String departamentoProfesor = scanner.nextLine();

                    Profesor profesor = new Profesor(dniProfesor, nombreProfesor, direccionProfesor, departamentoProfesor);
                    profesores.add(profesor);
                    System.out.println("Profesor agregado con éxito.");
                    break;

                case 3:
                    System.out.println("----- REALIZAR TRÁMITE -----");
                    System.out.print("Número de trámite: ");
                    int numeroTramite = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Fecha de inicio: ");
                    String fechaInicio = scanner.nextLine();

                    Tramite tramite = new Tramite(numeroTramite, fechaInicio);
                    tramites.add(tramite);
                    System.out.println("Trámite realizado con éxito.");
                    break;

                case 4:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 4);
    }
}
