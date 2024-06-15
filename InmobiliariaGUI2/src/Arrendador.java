class Arrendador {
    private String numeroMatricula;
    private String nombre;
    private String cedula;
    private String telefono;

    // Constructor
    public Arrendador(String numeroMatricula, String nombre, String cedula, String telefono) {
        this.numeroMatricula = numeroMatricula;
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
    }

    // Getters y setters
    public String getNumeroMatricula() { return numeroMatricula; }
    public void setNumeroMatricula(String numeroMatricula) { this.numeroMatricula = numeroMatricula; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
}
