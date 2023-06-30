package src;

public class Profesor extends Persona {
    private String id_Profesor;
    private String departamento;


    public Profesor(String dni, String nombre, String direccion, String id_Profesor, String departamento) {
        super(dni, nombre, direccion);
        this.id_Profesor = id_Profesor;
        this.departamento = departamento;
    }

    public String getId_Profesor() {
        return id_Profesor;
    }

    public void setId_Profesor(String id_Profesor) {
        this.id_Profesor = id_Profesor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
