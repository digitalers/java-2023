
package digitalers.java;


public class Asignatura_cursada extends Asignatura{
    private int nota;
    private int examen_final;

    public Asignatura_cursada( String nombre_asignatura, String tipo_asignatura, 
            int horas_asignatura, int cuatrimestre_asignatura,int nota, int examen_final) {
        
        super(nombre_asignatura, tipo_asignatura, horas_asignatura, cuatrimestre_asignatura);
        this.nota = nota;
        this.examen_final = examen_final;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getExamen_final() {
        return examen_final;
    }

    public void setExamen_final(int examen_final) {
        this.examen_final = examen_final;
    }

    @Override
    public String toString() {
        return "Asignatura_cursada{ Nombre de la materia :"+
                getNombre_asignatura()+
                " ,tipo: "+ getTipo_asignatura()+
                " ,horas cátedra: "+ getHoras_asignatura()+
                " ,nota=" + nota + ", examen_final=" + examen_final + '}';
    }
    
    
    
}
