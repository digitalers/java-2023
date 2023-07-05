public class Tramite {
    private int numeroTramite;
    private String fechaInicio;

    public Tramite(int numeroTramite, String fechaInicio) {
        this.numeroTramite = numeroTramite;
        this.fechaInicio = fechaInicio;
    }

    public int getNumeroTramite() {
        return numeroTramite;
    }

    public void setNumeroTramite(int numeroTramite) {
        this.numeroTramite = numeroTramite;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
