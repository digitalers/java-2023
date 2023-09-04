
package digitalers.java;


public class Profesor extends Persona{
    private int id_profesor;
   private  String departamento;
   private Asignatura materia=new Asignatura("", "", 0, 0);

    public Profesor(int id_profesor, int dni, String nombre, String apellido, String direccion
            , String departamento, Asignatura materia) {
        super(dni, nombre, apellido, direccion);
        this.id_profesor = id_profesor;
        this.departamento = departamento;
        this.materia = materia;
    }

    public Profesor(int id_profesor, int dni, String nombre, String apellido, String direccion) {
        super(dni, nombre, apellido, direccion);
        this.id_profesor = id_profesor;
    }

    public Profesor(int id_profesor, int dni, String nombre, String apellido,
            String direccion, String departamento) {
        super(dni, nombre, apellido, direccion);
        this.id_profesor = id_profesor;
        this.departamento = departamento;
    }
    

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Profesor{" + "id_profesor=" + id_profesor +
                ", departamento=" + departamento + ", materia=" 
                + materia.getNombre_asignatura()+
        materia.getTipo_asignatura()+ '}';
    
    }
   public void consultarAsignatura(){
       System.out.println(materia);
   }
     public void MostrarPersona(){
      System.out.println( 
                "Alumno" + "id_profesor=" + id_profesor+ " , nombre: "+
                getNombre()+" ,apellido: "+ getApellido()+ ", DNI N° "+
                getDni()+
                " ,dirección: " + getDireccion());
  }
     public void MostrarProfesor(){
        System.out.println( 
                "Docente" + "id_profesor=" + id_profesor + " , nombre: "+
                getNombre()+" ,apellido: "+ getApellido()+ ", DNI N° "+
                getDni()+
                " ,dirección: " + getDireccion()+
                ", departamento: " + getDepartamento()); 
     }
         
    public void MostrarProfesorCompleto() {
        System.out.println( 
                "Docente" + "id_profesor=" + id_profesor + " , nombre: "+
                getNombre()+" ,apellido: "+ getApellido()+ ", DNI N° "+
                getDni()+
                " ,dirección: " + getDireccion()+
                ", departamento: " + getDepartamento()+
                ", asignatura: " + materia.getNombre_asignatura() +
                        ", tipo de asignatura"+ materia.getTipo_asignatura()+
                        ", horas cátedra "+ materia.getHoras_asignatura()+
                        ", cuatrimestre " + materia.getCuatrimestre_asignatura()+ '.');
    }
    public void inscribirMateriaProfesor(String nombre_asignatura_profesor, String tipo_asignatura_profesor,
            int horas_asignatura_profesor, int cuatrimestre_asignatura_profesor){
       
        Asignatura p = new Asignatura(nombre_asignatura_profesor, tipo_asignatura_profesor, 
                horas_asignatura_profesor, cuatrimestre_asignatura_profesor);
        setMateria(p);
        }
}
