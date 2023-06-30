package src;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //instancias de clases
        //carreras
        Carrera ing_sistemas = new Carrera("Ing en sistemas","Cordoba");
        Carrera ing_electronica = new Carrera("Ing electrónica","Buenos Aires");
        Carrera psicologia = new Carrera("Psicología","Buenos Aires");
        Carrera medicina = new Carrera("Medicina","Santa fé");

        //Asignatura matematicas
        ArrayList<Carrera> carrerasTotales = new ArrayList<>();
        carrerasTotales.add(ing_sistemas);
        carrerasTotales.add(ing_electronica);
        carrerasTotales.add(psicologia);
        carrerasTotales.add(medicina);
        Asignatura matematica = new Asignatura("matematicas","basica",6,carrerasTotales,1);

        //Asignatura Biologia
        ArrayList<Carrera> bioCarreras = new ArrayList<>();
        bioCarreras.add(medicina);
        Asignatura biologia = new Asignatura("biologia","ciencias naturales",3,bioCarreras,1);

        //Asignatura psicoanalisis
        ArrayList<Carrera> psicoanalisisCarreras = new ArrayList<>();
        psicoanalisisCarreras.add(psicologia);
        Asignatura psicoanalisis = new Asignatura("Psicoanalisis","especialidad",5,carrerasTotales,2);


        //Todas las asignaturas
        ArrayList<Asignatura> asignaturasTotales = new ArrayList<>();
        asignaturasTotales.add(matematica);
        asignaturasTotales.add(biologia);
        asignaturasTotales.add(psicoanalisis);
        //Alumno Juan
        ArrayList<Asignatura> asignaturasJuan = new ArrayList<>();
        asignaturasJuan.add(matematica);
        Alumno juan = new Alumno("21321442","Juan","San juan 124","1",asignaturasJuan,ing_sistemas,true);

        //Alumna María
        ArrayList<Asignatura> asignaturasMaria = new ArrayList<>();
        asignaturasMaria.add(psicoanalisis);
        Alumno maria = new Alumno("36821849","Maria","Duarte Quiros 963","2",asignaturasMaria,psicologia,true);
        int ultimoAlumno = 2;
        //Array Alumnos
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(juan);
        alumnos.add(maria);


        //Tramite
        Date fechaT1 = new Date(2023,6,15);
        Date fechaT2 = new Date(2023,4,9);
        Tramite t1 = new Tramite(1,fechaT1,juan,"iniciado");
        Tramite t2 = new Tramite(2,fechaT2,maria,"finalizado");


        int opcion = -1;
        while (opcion != 5){
            System.out.print("1- Dar de alta un alumno \n" +
            "2- Mostrar los datos de los alumnos\n" +
            "3- Modificar los datos de un alumno \n" +
            "4- Eliminar un alumno \n" +
            "5- Salir \n" +
            "Ingrese su opcion: "
            );
            opcion = Integer.parseInt(scanner.next());

            if(opcion == 1){
                ultimoAlumno +=1;
                System.out.print("Ingrese el dni del alumno: ");
                String dni =scanner.next();
                System.out.print("Ingrese el nombre del alumno: ");
                String nombre =scanner.next();
                System.out.print("Ingrese la direccion del alumno: ");
                String direccion =scanner.next();
                ArrayList<Asignatura> materiasAlumno = new ArrayList<>();
                Carrera carreraAlumno = null;
                int selMateria = -1;
                while (selMateria != 0) {
                    int cont = 0;
                    System.out.println("0-Salir");
                    for (Asignatura materia : asignaturasTotales) {
                        cont += 1;
                        System.out.println(cont + "-" + materia.getNombre());
                    }
                    System.out.print("Ingrese el numero de la materia que cursa: ");
                    selMateria = Integer.parseInt(scanner.next());
                    if (selMateria != 0){
                        materiasAlumno.add(asignaturasTotales.get(selMateria-1));
                    }
                }
                int cont2 = 0;
                for (Carrera carrera : carrerasTotales) {
                    cont2 += 1;
                    System.out.println(cont2 + "-" + carrera.getNombre());
                }
                System.out.print("Ingrese el numero de la carrera que cursa: ");
                int selCarrera = Integer.parseInt(scanner.next());

                if (selCarrera != 0){
                    carreraAlumno = carrerasTotales.get(selCarrera-1);
                    System.out.println();
                }
               String idAlumno =String.valueOf(ultimoAlumno);
                Alumno alumno = new Alumno(dni,nombre,direccion,idAlumno,materiasAlumno,carreraAlumno,true);
                alumnos.add(alumno);
                mostrarAlumnos(alumnos);
            }
            else if (opcion == 2){
                mostrarAlumnos(alumnos);

            } else if (opcion == 3) {
                System.out.print("Ingrese el dni del alumno a modificar: ");
                String dni =scanner.next();
                for (Alumno alumno:alumnos){
                    if(alumno.getDni().equals(dni)){
                        System.out.print("Ingrese la nueva direccion del alumno");
                        String direccion =scanner.next();
                        alumno.setDireccion(direccion);
                        System.out.println("Alumno modificado correctamente");
                        mostrarAlumnos(alumnos);
                    }
                }

            } else if (opcion ==4) {
                System.out.print("Ingrese el id del alumno que desea eliminar: ");
                String id = scanner.next();
                for (Alumno alumno:alumnos) {
                    if (alumno.getIdAlumno().equals(id)){
                        alumno.setActivo(false);
                        System.out.println("Alumno eliminado correctamente");
                    }
                }
            }
        }

    }
    public static void mostrarAlumnos(ArrayList<Alumno> alumnos){

        System.out.println("===================================================================================================================");
        System.out.printf("|%-10s|%-15s|%-18s|%-16s|%-32s|%-15s|\n", "dni", "nombre", "direccion", "idAlumno", "materias", "carrera");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        for (Alumno alumno : alumnos) {
            String materiasString="";
            if (alumno.isActivo()){
                for (Asignatura materia : alumno.getMaterias()) {
                    materiasString = materiasString.concat(materia.getNombre() + ",");
                }
                System.out.printf("|%-10s|%-15s|%-18s|%-16s|%-32s|%-15s|\n", alumno.getDni(), alumno.getNombre(), alumno.getDireccion(), alumno.getIdAlumno(), materiasString, alumno.getCarrera().getNombre());

            }
        }
        System.out.println("===================================================================================================================");

    }
}
