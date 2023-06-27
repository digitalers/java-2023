import java.util.ArrayList;
import java.util.List;

class Alumno {
    private String DNI;
    private String nombre;
    private String direccion;
    private Carrera carrera;
    private List<Asignatura> asignaturasCursando;
    private List<HistorialAcademico> historialAcademico;

    public Alumno(String DNI, String nombre, String direccion, Carrera carrera) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.carrera = carrera;
        this.asignaturasCursando = new ArrayList<>();
        this.historialAcademico = new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public List<Asignatura> getAsignaturasCursando() {
        return asignaturasCursando;
    }

    public List<HistorialAcademico> getHistorialAcademico() {
        return historialAcademico;
    }

    public void agregarAsignaturaCursando(Asignatura asignatura) {
        asignaturasCursando.add(asignatura);
    }

    public void registrarHistorialAcademico(Asignatura asignatura, double nota, String examenFinal) {
        HistorialAcademico historial = new HistorialAcademico(asignatura, nota, examenFinal);
        historialAcademico.add(historial);
    }

    public List<Asignatura> obtenerAsignaturasAprobadas() {
        List<Asignatura> asignaturasAprobadas = new ArrayList<>();
        for (HistorialAcademico historial : historialAcademico) {
            if (historial.getNota() >= 6.0) {
                asignaturasAprobadas.add(historial.getAsignatura());
            }
        }
        return asignaturasAprobadas;
    }
}

class Carrera {
    private String nombre;
    private String sede;
    private List<Asignatura> asignaturas;

    public Carrera(String nombre, String sede) {
        this.nombre = nombre;
        this.sede = sede;
        this.asignaturas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void agregarAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }
}

class Asignatura {
    private String nombre;
    private int horas;
    private int cuatrimestre;
    private String tipo;
    private Profesor profesor;

        public Asignatura(String nombre, int horas, int cuatrimestre, String tipo, Profesor profesor) {
        this.nombre = nombre;
        this.horas = horas;
        this.cuatrimestre = cuatrimestre;
        this.tipo = tipo;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}

class Profesor {
    private String DNI;
    private String nombre;
    private String direccion;
    private String departamento;

    public Profesor(String DNI, String nombre, String direccion, String departamento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.direccion = direccion;
        this.departamento = departamento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}

class HistorialAcademico {
    private Asignatura asignatura;
    private double nota;
    private String examenFinal;

    public HistorialAcademico(Asignatura asignatura, double nota, String examenFinal) {
        this.asignatura = asignatura;
        this.nota = nota;
        this.examenFinal = examenFinal;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getExamenFinal() {
        return examenFinal;
    }

    public void setExamenFinal(String examenFinal) {
        this.examenFinal = examenFinal;
    }
}
