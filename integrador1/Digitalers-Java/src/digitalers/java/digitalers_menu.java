package digitalers.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class digitalers_menu {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();
        Gestion gestion = new Gestion();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("...... MENÚ DE OPCIONES .......");
            System.out.println(" 1. Agregar persona");
            System.out.println(" 2. Consultar trámite");
            System.out.println(" 3. Inscripción a carrera");
            System.out.println(" 4. Inscripción a asignaturas (Alumnos)");
            System.out.println(" 5. Inscripción a asignaturas (Profesores)");
            System.out.println(" 6. Mostrar todas las personas");
            System.out.println(" 7. Mostrar todos los estudiantes");
            System.out.println(" 8. Mostrar todos los profesores");

            System.out.println(" 9. Modificar un estudiante");
            System.out.println(" 10. Modificar profesor");

            System.out.println(" 11. Eliminar un estudiante");
            System.out.println("  12. Eliminar profesor");
            System.out.println(" 13. Cargar historial académico");
            System.out.println(" 14. Consulta historial académico");
            System.out.println(" 15. Salir del programa");
            System.out.println(" Ingrese opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println(" ---------CARGAR PERSONA--------");
                    System.out.println(" [1] Cargar Estudiante ");
                    System.out.println(" [2] Cargar Profesor ");

                    System.out.println(" Ingrese opción");
                    int opPersona = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Ingrese DNI");
                    int dni = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Ingrese nombre");
                    String nombre = sc.nextLine();
                    System.out.println("Ingrese apellido");
                    String apellido = sc.nextLine();
                    System.out.println("Ingrese dirección");
                    String direccion = sc.nextLine();

                    switch (opPersona) {
                        case 1:
                            //alumno
                            System.out.println("Ingrese ID del alumno");
                            int id_alumno = sc.nextInt();

                            Alumno alumno = new Alumno(id_alumno, dni, nombre, apellido, direccion);
                            alumno.iniciarTramite(LocalDate.now(), id_alumno, "En curso");
                            gestion.agregarAlumno(alumno);

                            break;
                        case 2:
                            //PROFESOR
                            System.out.println("Ingrese ID del docente");
                            int id_profesor = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Ingrese departamento al que pertenece");
                            String departamento = sc.nextLine();

                            Profesor docente = new Profesor(id_profesor, dni, nombre, apellido,
                                    direccion, departamento);

                            //Se inserta profesor
                            gestion.agregarProfesor(docente);

                            break;

                        default:
                            System.out.println("Opción inválida. Ingrese nuevamente.");
                            break;

                    }
                    break;
                case 2:
                    System.out.println(" ---------CONSULTA DE TRÁMITE--------");

                    System.out.println("Ingrese DNI del estudiante");
                    int dni_alumno = sc.nextInt();

                    gestion.tramite(dni_alumno);

                    break;
                case 3:
                    System.out.println(" ---------INSCRIPCIÓN A CARRERA--------");

                    System.out.println("Ingrese DNI del estudiante");
                    int dni_alumno_carrera = sc.nextInt();
                    gestion.carrera(dni_alumno_carrera);

                    break;
                case 4:
                    System.out.println(" ---------INSCRIPCIÓN DE ASIGNATURAS (ALUMNOS) --------");

                    System.out.println("Ingrese DNI del estudiante");
                    int dni_alumno_materia = sc.nextInt();
                    gestion.materiaAlumno(dni_alumno_materia);

                    break;
                case 5:
                    System.out.println(" ---------INSCRIPCIÓN DE ASIGNATURAS (PROFESORES)--------");

                    System.out.println("Ingrese DNI del profesor");
                    int dni_profesor_materia = sc.nextInt();
                    gestion.materiaProfesor(dni_profesor_materia);
                    break;
                case 6:
                    System.out.println(" ---------MOSTRAR PERSONAS--------");

                    gestion.mostrarPersonas();
                    break;
                case 7:
                    System.out.println(" ---------MOSTRAR ALUMNOS --------");

                    gestion.mostrarAlumnos();
                    break;
                case 8:
                    System.out.println(" ---------MOSTRAR PROFESORES --------");

                    gestion.mostrarProfesores();
                    break;
                case 9:
                    System.out.println(" ---------MODIFICAR ALUMNO--------");

                    System.out.println("Ingrese DNI del alumno");
                    int dni_modif_alumno = sc.nextInt();

                    gestion.modificarAlumno(dni_modif_alumno);

                    break;
                case 10:
                    System.out.println(" ---------MODIFICAR PROFESOR--------");

                    System.out.println("Ingrese DNI del profesor");
                    int dni_prof_modif = sc.nextInt();
                    gestion.modificarProfesor(dni_prof_modif);
                    break;
                case 11:
                    System.out.println(" ---------ELIMINAR ALUMNO--------");

                    System.out.println("Ingrese DNI del estudiante");
                    int dni_elim = sc.nextInt();
                    gestion.eliminarAlumno(dni_elim);
                    break;
                case 12:
                    System.out.println(" ---------ELIMINAR PROFESOR--------");

                    System.out.println("Ingrese DNI del profesor");
                    int dni_eli = sc.nextInt();
                    gestion.eliminarProfesor(dni_eli);
                    break;
                case 13:
                    System.out.println(" ---------CARGAR HISTORIAL ACADÉMICO DE ALUMNO--------");

                    System.out.println("Ingrese DNI del alumno");
                    int dni_hist_alum = sc.nextInt();
                    gestion.iniciarCargaHistorial(dni_hist_alum);
                    break;
                case 14:
                    System.out.println(" ---------CONSULTAR HISTORIAL ACADÉMICO DE ALUMNO--------");

                    System.out.println("Ingrese DNI del alumno");
                    int dni_historial = sc.nextInt();
                    gestion.consultaHistorial(dni_historial);
                    break;
                case 15:
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese nuevamente.");
            }
        } while (op != 15);

    }

}
