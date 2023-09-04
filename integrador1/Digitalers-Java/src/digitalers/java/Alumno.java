package digitalers.java;

import java.time.LocalDate;

public class Alumno extends Persona {

    private int id_alumno;
    private Carrera carrera = new Carrera("", "");
    private Asignatura asignatura = new Asignatura("", "", 0, 0);

    public Alumno(int id_alumno, int dni, String nombre,
            String apellido, String direccion,
            Carrera carrera, Asignatura asignatura) {
        super(dni, nombre, apellido, direccion);
        this.id_alumno = id_alumno;
        this.carrera = carrera;
        this.asignatura = asignatura;
    }

    public Alumno(int id_alumno, int dni, String nombre, String apellido, String direccion) {
        super(dni, nombre, apellido, direccion);
        this.id_alumno = id_alumno;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public void MostrarPersona() {
        System.out.println(
                "Alumno" + "id_alumno=" + id_alumno + " , nombre: "
                + getNombre() + " ,apellido: " + getApellido() + ", DNI N° "
                + getDni()
                + " ,dirección: " + getDireccion());
    }

    public void MostrarAlumnoCompleto() {
        System.out.println(
                "Alumno{" + "id_alumno=" + id_alumno + " , nombre: "
                + getNombre() + " ,apellido: " + getApellido() + ", DNI N° "
                + getDni()
                + " ,dirección: " + getDireccion()
                + ", carrera: " + carrera.getNombre_carrera() + " ,en sede "
                + carrera.getNombre_sede()
                + ", asignatura: " + asignatura.getNombre_asignatura()
                + ", tipo de asignatura" + asignatura.getTipo_asignatura()
                + ", horas cátedra " + asignatura.getHoras_asignatura()
                + ", cuatrimestre " + asignatura.getCuatrimestre_asignatura() + '}');
    }

    public void mostrarCarrera() {
        System.out.println(
                "Alumno{" + "id_alumno=" + id_alumno + " , nombre: "
                + getNombre() + " ,apellido: " + getApellido() + ", DNI N° "
                + getDni()
                + " ,dirección: " + getDireccion()
                + ", carrera: " + carrera.getNombre_carrera() + " ,en sede "
                + carrera.getNombre_sede());
    }

    Tramite t;

    public Tramite iniciarTramite(LocalDate fecha, int id_tramite, String estado) {
        // if(carrera.equals("") && asignatura.equals("")){
        t = new Tramite(fecha, id_tramite, estado);
        return t;
        // }
        //System.out.println("error no puede realizarse el trámite");
        //return null;
    }

    public void consultarTramite(int dni_alumno) {
        System.out.println(t);
    }

    public void inscribirCarrera(String nombre_carrera, String nombre_sede) {
        if ("En curso".equals(t.getEstado())) {
            Carrera c = new Carrera(nombre_carrera, nombre_sede);
            setCarrera(c);

        } else {
            System.out.println("error no puede realizarse la inscripción");
        }
    }

    public void inscribirMateria(String nombre_asignatura, String tipo_asignatura,
            int horas_asignatura, int cuatrimestre_asignatura) {
        if (carrera != null) {
            Asignatura a = new Asignatura(nombre_asignatura, tipo_asignatura,
                    horas_asignatura, cuatrimestre_asignatura);
            setAsignatura(a);
        } else {
            System.out.println("error no puede realizarse la inscripción");
        }
    }
    Asignatura_cursada previa;

    public void cargar_Historial(String nombre_asignatura, String tipo_asignatura,
            int horas_asignatura, int cuatrimestre_asignatura, int nota, int examen_final) {
        previa = new Asignatura_cursada(nombre_asignatura,
                tipo_asignatura, horas_asignatura, cuatrimestre_asignatura, nota, examen_final);

    }

    public void historial_Academico() {
        System.out.println(previa);
    }
}
