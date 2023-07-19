
import clases.*;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //CARRERA SISTEMAS
        Carrera sistemas = new Carrera(1, "Ingenieria en Sistemas", "5 años", "Ing en sistemas", "informatica", "UTN");


        Asignatura matematica = new Asignatura(1, "Matematica", "Algebra", "Activa", 6, 1, "Basica");
        Asignatura programacion = new Asignatura(2, "Programacion", "Java", "Activa", 5, 1, "programacion");
        Asignatura poo = new Asignatura(3, "POO", "C++", "Activa", 6, 1, "programacion");

        ArrayList<Asignatura> asignaturasSistemas = new ArrayList<>();
        asignaturasSistemas.add(matematica);
        asignaturasSistemas.add(programacion);
        asignaturasSistemas.add(poo);


        PlanDeEstudio planSistemas = new PlanDeEstudio(1, "Plan de estudios de Ing en Sistemas", sistemas, asignaturasSistemas);

        //CARRERA ALIMENTOS
        Carrera ingAlimentos = new Carrera(2, "Ingenieria en Alimentos", "5 años", "Ing en alimentos", "alimentos", "UBA");
        Asignatura quimica = new Asignatura(4, "Quimica", "Quimica", "Activa", 7, 1, "Basica");
        Asignatura biologia = new Asignatura(5, "Biologia", "Biologia", "Activa", 6, 1, "Basica");
        Asignatura nutricion = new Asignatura(6, "Nutricion", "Nutricion", "Activa", 6, 1, "Alimentacion");

        ArrayList<Asignatura> asignaturasAlimentos = new ArrayList<>();
        asignaturasAlimentos.add(quimica);
        asignaturasAlimentos.add(biologia);
        asignaturasAlimentos.add(nutricion);

        PlanDeEstudio planAlimentos = new PlanDeEstudio(2, "Plan de estudios de Ing en Alimentos", ingAlimentos, asignaturasAlimentos);

        ArrayList asignaturasJuan = new ArrayList<>();
        asignaturasJuan.add(matematica);
        asignaturasJuan.add(programacion);

        ArrayList asignaturasMaria = new ArrayList<>();
        asignaturasMaria.add(quimica);
        asignaturasMaria.add(nutricion);

        Matricula matriculaJuan = new Matricula(1, "activa", "UNC", asignaturasJuan, new Date());
        Matricula matriculaMaria = new Matricula(2, "activa", "UBA", asignaturasJuan, new Date());


        Estudiante juan = new Estudiante("Juan", "Perez", 12345678, "Cordoba", "3518754973", 1, sistemas, "UNC", "Activo", new Date(), 8.5f, matriculaJuan);
        Estudiante maria = new Estudiante("Maria", "Gomez", 12345678, "Buenos Aires", "35187549852", 2, ingAlimentos, "UBA", "Activo", new Date(), 8.5f, matriculaMaria);
        int ultimoEstudiante = 2;

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(juan);
        estudiantes.add(maria);

        ArrayList<Carrera> carrerasTotales = new ArrayList<>();
        carrerasTotales.add(sistemas);
        carrerasTotales.add(ingAlimentos);

        int opcion;
        do {
            System.out.print("1- Dar de alta un estudiante \n" +
                    "2- Matricular un estudiante \n" +
                    "3- Mostrar los datos de los estudiantes\n" +
                    "4- Modificar los datos de un estudiante \n" +
                    "5- Eliminar un estudiante \n" +
                    "6- Salir \n" +
                    "Ingrese su opcion: "
            );
            opcion = Integer.parseInt(scanner.next());

            if (opcion == 1) {

                ultimoEstudiante += 1;
                System.out.print("Ingrese el dni del es: ");
                String dni = scanner.next();
                System.out.print("Ingrese el nombre del estudiante: ");
                String nombre = scanner.next();
                System.out.print("Ingrese el apellido del estudiante: ");
                String apellido = scanner.next();
                System.out.print("Ingrese la direccion del estudiante: ");
                String direccion = scanner.next();
                System.out.print("Ingrese el telefono del estudiante: ");
                String telefono = scanner.next();
                Carrera carreraestudiante = null;

                int cont = 0;
                for (Carrera carrera : carrerasTotales) {
                    cont += 1;
                    System.out.println(cont + "-" + carrera.getNombre());
                }
                System.out.print("Ingrese el numero de la carrera que cursa: ");
                int selCarrera = Integer.parseInt(scanner.next());

                if (selCarrera != 0) {
                    carreraestudiante = carrerasTotales.get(selCarrera - 1);
                    System.out.println();
                }

                Estudiante estudiante = new Estudiante(nombre, apellido, Integer.parseInt(dni), direccion, telefono, ultimoEstudiante, carreraestudiante, carreraestudiante.getSede(), "Activo", new Date(), 0f, null);
                estudiantes.add(estudiante);

                System.out.println(estudiantes);
            } else if (opcion == 2){
                //System.out.println(estudiantes);
                System.out.println("PARA MATRICULAR EL ESTUDIANTE DEBE ESTAR DADO DE ALTA CON LA OPCION 1");
                System.out.print("Ingrese el id del estudiante a matricular: ");
                int id =Integer.parseInt(scanner.next());
                boolean existe = false;
                for (Estudiante estudiante:estudiantes){
                    if(estudiante.getIdEstudiante() == id) {
                        int selMateria = -1;
                        ArrayList<Asignatura> materiasestudiante = new ArrayList<>();
                        existe = true;
                        while (selMateria != 0) {
                            int cont = 0;
                            System.out.println("0-Salir");
                            if (estudiante.getCarrera() == sistemas) {
                                for (Asignatura materia : asignaturasSistemas) {
                                    cont += 1;
                                    System.out.println(cont + "-" + materia.getNombre());
                                }
                                System.out.print("Ingrese el numero de la materia que desea cursar: ");
                                selMateria = Integer.parseInt(scanner.next());
                                if (selMateria != 0) {
                                    materiasestudiante.add(asignaturasSistemas.get(selMateria - 1));
                                }
                            } else if (estudiante.getCarrera() == ingAlimentos) {
                                for (Asignatura materia : asignaturasAlimentos) {
                                    cont += 1;
                                    System.out.println(cont + "-" + materia.getNombre());
                                }
                                System.out.print("Ingrese el numero de la materia que desea cursar: ");
                                selMateria = Integer.parseInt(scanner.next());
                                if (selMateria != 0) {
                                    materiasestudiante.add(asignaturasAlimentos.get(selMateria - 1));
                                }
                            }

                        }
                        Matricula matricula = new Matricula(id, "Activa", estudiante.getCarrera().getSede(), materiasestudiante, new Date());
                        estudiante.setMatricula(matricula);
                    }
                    }
                if(!existe){
                    System.out.println("El estudiante no existe");
                }

            } else if (opcion == 3) {
                System.out.println("SE MUESTRAN LO DATOS PRINCIPALES DE LOS ESTUDIANTES");
                System.out.println("======================================================================================================================");
                System.out.println(estudiantes);
                System.out.println("======================================================================================================================");


            } else if (opcion == 4) {
                //MODIFICACION DE LA DIRECCION DEL ESTUDIANTE A MODO DE EJEMPLO, SE PODRÍA EXTENDER PARA MODIFICAR MAS CAMPOS
                System.out.print("Ingrese el id del estudiante a eliminar: ");
                int id =Integer.parseInt(scanner.next());
                for (Estudiante estudiante:estudiantes){
                    if(estudiante.getIdEstudiante() == id){
                        System.out.print("Ingrese la nueva direccion del estudiante: ");
                        String direccion =scanner.next();
                        estudiante.setDireccion(direccion);
                        System.out.println("Estudiante modificado correctamente");
                        System.out.println(estudiantes);
                    }
                }

            } else if (opcion == 5) {
                //BAJA LOGICA DEL ESTUDIANTE
                System.out.print("Ingrese el id del estudiante que desea eliminar: ");
                int id =Integer.parseInt(scanner.next());
                for (Estudiante estudiante:estudiantes) {
                    if (estudiante.getIdEstudiante() == (id)){
                        estudiante.setActivo(false);
                        System.out.println("estudiante eliminado correctamente");
                    }
                }
                System.out.println(estudiantes);
            }


            }while (opcion != 6);

        }
    }

