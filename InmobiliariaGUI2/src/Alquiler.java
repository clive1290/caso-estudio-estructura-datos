class Alquiler {
    private Propiedad propiedad;
    private String cedulaArrendatario;

    public Alquiler(Propiedad propiedad, String cedulaArrendatario) {
        this.propiedad = propiedad;
        this.cedulaArrendatario = cedulaArrendatario;
    }

    // Getters y setters
    public Propiedad getPropiedad() { return propiedad; }
    public void setPropiedad(Propiedad propiedad) { this.propiedad = propiedad; }
    public String getCedulaArrendatario() { return cedulaArrendatario; }
    public void setCedulaArrendatario(String cedulaArrendatario) { this.cedulaArrendatario = cedulaArrendatario; }
}
