import java.util.ArrayList;
import java.util.List;

public class HistorialAcademico {
    private List<Asignatura> asignaturasCursadas;

    public HistorialAcademico() {
        asignaturasCursadas = new ArrayList<>();
    }

    public List<Asignatura> getAsignaturasCursadas() {
        return asignaturasCursadas;
    }

    public void agregarAsignaturaCursada(Asignatura asignatura) {
        asignaturasCursadas.add(asignatura);
    }

    // Otros métodos para consultar y manipular el historial académico
}
