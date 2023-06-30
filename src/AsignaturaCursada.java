package src;

public class AsignaturaCursada {
    private Alumno alumno;
    private float nota;
    private float Final;
    private Asignatura asignatura;

    public AsignaturaCursada(Alumno alumno, float nota, float aFinal, Asignatura asignatura) {
        this.alumno = alumno;
        this.nota = nota;
        Final = aFinal;
        this.asignatura = asignatura;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getFinal() {
        return Final;
    }

    public void setFinal(float aFinal) {
        Final = aFinal;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }
}
