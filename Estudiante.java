import java.util.List;

public class Estudiante extends Persona {
    private String carrera;
    private List<Asignatura> asignaturasCursando;
    private HistorialAcademico historialAcademico;

    public Estudiante(String dni, String nombre, String direccion, String carrera) {
        super(dni, nombre, direccion);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Asignatura> getAsignaturasCursando() {
        return asignaturasCursando;
    }

    public void setAsignaturasCursando(List<Asignatura> asignaturasCursando) {
        this.asignaturasCursando = asignaturasCursando;
    }

    public HistorialAcademico getHistorialAcademico() {
        return historialAcademico;
    }

    public void setHistorialAcademico(HistorialAcademico historialAcademico) {
        this.historialAcademico = historialAcademico;
    }
}
