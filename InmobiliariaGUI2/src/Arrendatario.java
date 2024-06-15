class Arrendatario {
    private String cedula;
    private String nombre;
    private String telefono;
    private String profesion;

    public Arrendatario(String cedula, String nombre, String telefono, String profesion, String estudiante) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    // Getters y setters
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getProfesion() { return profesion; }
    public void setProfesion(String profesion) { this.profesion = profesion; }
}

