class Propiedad {
    private String numeroMatricula;
    private String direccion;
    private String barrio;
    private String zona;
    private int precioAlquiler;
    private String descripcion;
    private String disponibilidad;

    public Propiedad(String numeroMatricula, String direccion, String barrio, String zona, int precioAlquiler, String descripcion, String disponibilidad) {
        this.numeroMatricula = numeroMatricula;
        this.direccion = direccion;
        this.barrio = barrio;
        this.zona = zona;
        this.precioAlquiler = precioAlquiler;
        this.descripcion = descripcion;
        this.disponibilidad = disponibilidad;
    }

    // Getters y setters
    public String getNumeroMatricula() { return numeroMatricula; }
    public void setNumeroMatricula(String numeroMatricula) { this.numeroMatricula = numeroMatricula; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public String getBarrio() { return barrio; }
    public void setBarrio(String barrio) { this.barrio = barrio; }
    public String getZona() { return zona; }
    public void setZona(String zona) { this.zona = zona; }
    public int getPrecioAlquiler() { return precioAlquiler; }
    public void setPrecioAlquiler(int precioAlquiler) { this.precioAlquiler = precioAlquiler; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(String disponibilidad) { this.disponibilidad = disponibilidad; }
}

