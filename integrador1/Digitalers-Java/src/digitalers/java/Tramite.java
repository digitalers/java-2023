
package digitalers.java;

import java.time.LocalDate;


public class Tramite {
    private LocalDate fecha;
    private int id_tramite;
    private String estado;

    public Tramite(LocalDate fecha, int id_tramite, String estado) {
        this.fecha = fecha;
        this.id_tramite = id_tramite;
        this.estado = estado;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getId_tramite() {
        return id_tramite;
    }

    public void setId_tramite(int id_tramite) {
        this.id_tramite = id_tramite;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tramite{" + "fecha=" + fecha + ", id_tramite=" + id_tramite + ", estado=" + estado + '}';
    }
    
    
    
    
    
}
