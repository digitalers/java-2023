package digitalers.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {

    ArrayList<Persona> lista = new ArrayList<>();
    ArrayList<Asignatura_cursada> historial = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void agregarAlumno(Alumno alumno) {
        
        lista.add(alumno);
        System.out.println("Estudiante se cargó de manera exitosa");
        alumno.MostrarPersona();
        
    }
    // Agregar profesor

    public void agregarProfesor(Profesor docente) {
        lista.add(docente);
        System.out.println("Docente se cargó de manera exitosa");
        docente.MostrarProfesor();
    }

    public void mostrarPersonas() {
        for (Persona persona : lista) {
            persona.Mostrar();
        }
    }

    public void mostrarAlumnos() {
        
        for (Persona persona : lista) {
            if (persona instanceof Alumno) {
                 if("".equals(((Alumno) persona).getCarrera())){
                              System.out.println("Todavia no se realizó la carga de carrera");
                             ((Alumno) persona).MostrarPersona();

                }else{
                ((Alumno) persona).MostrarAlumnoCompleto();
                 }
            }
            
        }
    }
    // Mostrar profesores

    public void mostrarProfesores() {
        for (Persona persona : lista) {
            if (persona instanceof Profesor) {
             if("".equals(((Profesor) persona).getMateria())){
                  System.out.println("Todavia no se realizó la carga de asignatura a cargo");
                             ((Profesor) persona).MostrarPersona();

             }else{
                ((Profesor) persona).MostrarProfesorCompleto();
             }
            }
        }
        
    }

    //consultar tramite
    public void tramite(int dni_alumno) {
        for (Persona persona : lista) {
            if (persona instanceof Alumno) {
                if (persona.getDni() == dni_alumno) {
                    System.out.println("coincide");
                    ((Alumno) persona).consultarTramite(dni_alumno);
                }
            }
        }
    }

    //carrera
    public void carrera(int dni_alumno_carrera) {
        for (Persona persona : lista) {
            if (persona instanceof Alumno) {
                
                if (persona.getDni() == dni_alumno_carrera) {
                    System.out.println("coincide");
                    
                    System.out.println("Ingrese nombre de la carrera");
                    String nombre_carrera = sc.nextLine();
                    System.out.println("Ingrese sede");
                    String nombre_sede = sc.nextLine();
                    
                    ((Alumno) persona).inscribirCarrera(nombre_carrera, nombre_sede);
                    ((Alumno) persona).mostrarCarrera();
                    
                }
            }
        }
    }

    // materias
    public void materiaAlumno(int dni_alumno_materia) {
        for (Persona persona : lista) {
            if (persona instanceof Alumno) {
                if (persona.getDni() == dni_alumno_materia && ("".equals(((Alumno) persona).getCarrera().getNombre_carrera())
                        && "".equals(((Alumno) persona).getCarrera().getNombre_sede()))) {
                    
                    System.out.println("coincide");
                    
                    System.out.println("Todavia no se realizó la carga de carrera, por lo tanto, "
                            + "no es posible realizar la carga de asignaturas");
                } else {
                    System.out.println("Ingrese nombre de la materia");
                    String nombre_asignatura = sc.nextLine();
                    System.out.println("Ingrese tipo de materia");
                    String tipo_asignatura = sc.nextLine();
                    System.out.println("Ingrese cantidad de horas de la materia");
                    int horas_asignatura = sc.nextInt();
                    System.out.println("Ingrese cuatrimestre asignado");
                    int cuatrimestre_asignatura = sc.nextInt();
                    
                    ((Alumno) persona).inscribirMateria(nombre_asignatura,
                            tipo_asignatura, horas_asignatura,
                            cuatrimestre_asignatura);
                    ((Alumno) persona).MostrarAlumnoCompleto();
                }
            }
        }
    }

    public void materiaProfesor(int dni_profesor_materia) {
        for (Persona persona : lista) {
            if (persona instanceof Profesor) {
                if (persona.getDni() == dni_profesor_materia) {
                    System.out.println("coincide");
                    sc.nextLine();
                    System.out.println("Ingrese nombre de la materia");
                    
                    String nombre_asignatura_profesor = sc.nextLine();
                    System.out.println("Ingrese tipo de materia");
                    
                    String tipo_asignatura_profesor = sc.nextLine();
                    System.out.println("Ingrese cantidad de horas de la materia");
                    
                    int horas_asignatura_profesor = sc.nextInt();
                    System.out.println("Ingrese cuatrimestre asignado");
                    
                    int cuatrimestre_asignatura_profesor = sc.nextInt();
                    
                    ((Profesor) persona).inscribirMateriaProfesor(nombre_asignatura_profesor,
                            tipo_asignatura_profesor,
                            horas_asignatura_profesor,
                            cuatrimestre_asignatura_profesor);
                    
                }                
            }
        }
    }
    // Eliminar profesor, administrativo

    public void eliminarProfesor(long dni_eli) {
        boolean profesor_eliminado = lista.removeIf((p) -> (p instanceof Profesor && p.getDni() == dni_eli));
        if (profesor_eliminado) {
            System.out.println("Profesor ha sido eliminado");
        } else {
            System.out.println("Profesor no pudo ser eliminado");
        }
    }

    // Eliminar estudiante
    public void eliminarAlumno(long dni_elim) {
        
        boolean alumno_eliminado = lista.removeIf((p) -> (p instanceof Alumno && p.getDni() == dni_elim));
        if (alumno_eliminado) {
            System.out.println("Alumno ha sido eliminado");
        } else {
            System.out.println("Alumno no pudo ser eliminado");
        }
        
    }
    // Modificar personas: profesor

    public void modificarProfesor(int dni_prof_modif) {
        for (Persona persona : lista) {
            if (persona instanceof Profesor) {
                
                if (!(persona.getDni() == dni_prof_modif)) {
                    
                    System.out.println("El DNI ingresado no se corresponde con un docente de la Institución");
                } else {
                    sc.nextLine();
                    System.out.println("Modifique nombre del profesor");
                    String modif_nombre_prof = sc.nextLine();
                    
                    System.out.println("Modifique apellido del profesor");
                    String modif_apellido_prof = sc.nextLine();
                    System.out.println("Modifique domicilio del profesor");
                    String modif_dom_prof = sc.nextLine();
                    System.out.println("Modifique departamento");
                    String modif_dep_prof = sc.nextLine();
                    System.out.println("Modifique asignatura");
                    String modif_prof_materia = sc.nextLine();
                    System.out.println("Modifique tipo de asignatura");
                    String modif_prof_tipo = sc.nextLine();
                    System.out.println("Modifique horas cátedra");
                    int modif_prof_hs = sc.nextInt();
                    System.out.println("Modifique cuatrimestre");
                    int modif_prof_cuatri = sc.nextInt();
                    
                    ((Profesor) persona).setId_profesor(((Profesor) persona).getId_profesor());
                    persona.setDni(dni_prof_modif);
                    persona.setNombre(modif_nombre_prof);
                    persona.setApellido(modif_apellido_prof);
                    persona.setDireccion(modif_dom_prof);
                    ((Profesor) persona).setDepartamento(modif_dep_prof);
                    ((Profesor) persona).getMateria().setNombre_asignatura(modif_prof_materia);
                    ((Profesor) persona).getMateria().setTipo_asignatura(modif_prof_tipo);
                    ((Profesor) persona).getMateria().setHoras_asignatura(modif_prof_hs);
                    ((Profesor) persona).getMateria().setCuatrimestre_asignatura(modif_prof_cuatri);
                    
                    System.out.println("Profesor ha sido modificado");
                }
                
            }
        }
    }
    // Modificar estudiante

    public void modificarAlumno(int dni_modif_alumno) {
        for (Persona persona : lista) {
            if (persona instanceof Alumno) {
                
                if (!(persona.getDni() == dni_modif_alumno)) {
                    System.out.println("El DNI ingresado no se corresponde con un estudiante de la Institución");
                } else {
                    sc.nextLine();
                    System.out.println("Modifique nombre del alumno");
                    String modif_nombre_alumno = sc.nextLine();
                   
                    System.out.println("Modifique apellido del alumno");
                    String modif_apellido_alumno = sc.nextLine();
                   
                    System.out.println("Modifique domicilio del alumno");
                    String modif_dom_alumno = sc.nextLine();
                    
                    System.out.println("Modifique carrera");
                    String modif_carrera_alum = sc.nextLine();
                    
                    System.out.println("Modifique sede");
                    String modif_sede_alumno = sc.nextLine();
                   
                    System.out.println("Modifique asignatura");
                    String modif_materia_alumno = sc.nextLine();
                    
                    System.out.println("Modifique tipo de asignatura");
                    String modif_tipo_alumno = sc.nextLine();
                    
                    System.out.println("Modifique horas cátedra");
                    int modif_hs_alumno = sc.nextInt();
                    System.out.println("Modifique cuatrimestre");
                    int modif_cuatri_alumno = sc.nextInt();
                    ((Alumno) persona).setId_alumno(((Alumno) persona).getId_alumno());
                    persona.setDni(persona.getDni());
                    persona.setNombre(modif_nombre_alumno);
                    persona.setApellido(modif_apellido_alumno);
                    persona.setDireccion(modif_dom_alumno);
                    
                    ((Alumno) persona).getCarrera().setNombre_carrera(modif_carrera_alum);
                    ((Alumno) persona).getCarrera().setNombre_sede(modif_sede_alumno);
                   ((Alumno) persona).getAsignatura().setNombre_asignatura(modif_materia_alumno);
                   ((Alumno) persona).getAsignatura().setTipo_asignatura(modif_tipo_alumno);
                   ((Alumno) persona).getAsignatura().setHoras_asignatura(modif_hs_alumno);
                   ((Alumno) persona).getAsignatura().setCuatrimestre_asignatura(modif_cuatri_alumno);
                    
                    System.out.println("Estudiante ha sido modificado");
                    ((Alumno) persona).MostrarAlumnoCompleto();
                }
            }
        }
    }
        
    

    public void iniciarCargaHistorial(int dni_hist_alum) {
        for (Persona persona : lista) {
            if (persona instanceof Alumno) {
                
                if (!(persona.getDni() == dni_hist_alum)) {
                    System.out.println("El DNI ingresado no se corresponde con un estudiante de la Institución");
                } else {
                    sc.nextLine();
                    System.out.println("Ingrese nombre de la asignatura");
                    String nombre_asignatura = sc.nextLine();
                    
                    System.out.println("Ingrese tipo de asignatura");
                    
                    String tipo_asignatura = sc.nextLine();
                    System.out.println("Ingrese horas cátedra de la asignatura");
                    
                    int horas_asignatura = sc.nextInt();                    
                    System.out.println("Ingrese cuatrimestre de la asignatura");
                    
                    int cuatrimestre_asignatura = sc.nextInt();
                    System.out.println("Ingrese nota de la asignatura");
                    
                    int nota = sc.nextInt();
                    System.out.println("Ingrese nota del examen final de la asignatura");
                    
                    int examen_final = sc.nextInt();
                    
                    Asignatura_cursada hist_alumno = new Asignatura_cursada(nombre_asignatura, tipo_asignatura, horas_asignatura, cuatrimestre_asignatura, nota, examen_final);
                    hist_alumno.setNombre_asignatura(nombre_asignatura);
                    hist_alumno.setTipo_asignatura(tipo_asignatura);
                    hist_alumno.setHoras_asignatura(horas_asignatura);
                    hist_alumno.setCuatrimestre_asignatura(cuatrimestre_asignatura);
                    hist_alumno.setNota(nota);
                    hist_alumno.setExamen_final(examen_final);
                    ((Alumno) persona).cargar_Historial(nombre_asignatura, tipo_asignatura, horas_asignatura, cuatrimestre_asignatura, nota, examen_final);
                    historial.add(hist_alumno);
                    hist_alumno.toString();
                }
            }
        }
    }

    public void consultaHistorial(int dni_historial) {
        for (Persona persona : lista) {
            if (persona instanceof Alumno) {
                
                if (!(persona.getDni() == dni_historial)) {
                    System.out.println("El DNI ingresado no tiene historial académico");
                } else {
                    System.out.println("existen registros");
                    
                    ((Alumno) persona).historial_Academico();
                    
                }
            }
        }
    }
    
}
