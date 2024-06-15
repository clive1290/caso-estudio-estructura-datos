
import java.util.ArrayList;

class Inmobiliaria {
    // ArrayLists para almacenar los arrendadores y propiedades
    private ArrayList<Arrendatario> arrendatarios;
    private ArrayList<Propiedad> propiedades;
    private ArrayList<Alquiler> alquileres;

    // Constructor
    public Inmobiliaria() {
        arrendatarios = new ArrayList<>();
        propiedades = new ArrayList<>();
        alquileres = new ArrayList<>();
    }

    // Métodos para registrar arrendatarios y propiedades
    public void registrarArrendatario(Arrendatario arrendatario) {
        arrendatarios.add(arrendatario);
    }

    public void registrarPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    // Métodos para eliminar arrendatarios y propiedades
    public void eliminarArrendatario(String cedula) {
        Arrendatario arrendatario = buscarArrendatario(cedula);
        if (arrendatario != null) {
            arrendatarios.remove(arrendatario);
        }
    }

    public void eliminarPropiedad(String numeroMatricula) {
        Propiedad propiedad = buscarPropiedad(numeroMatricula);
        if (propiedad != null) {
            propiedades.remove(propiedad);
        }
    }

    // Métodos para buscar arrendatarios y propiedades
    public Arrendatario buscarArrendatario(String cedula) {
        for (Arrendatario arrendatario : arrendatarios) {
            if (arrendatario.getCedula().equals(cedula)) {
                return arrendatario;
            }
        }
        return null;
    }

    public Propiedad buscarPropiedad(String numeroMatricula) {
        for (Propiedad propiedad : propiedades) {
            if (propiedad.getNumeroMatricula().equals(numeroMatricula)) {
                return propiedad;
            }
        }
        return null;
    }

    // Métodos para modificar arrendatarios y propiedades
    public void modificarArrendatario(Arrendatario arrendatario) {
        for (int i = 0; i < arrendatarios.size(); i++) {
            if (arrendatarios.get(i).getCedula().equals(arrendatario.getCedula())) {
                arrendatarios.set(i, arrendatario);
                break;
            }
        }
    }

    public void modificarPropiedad(Propiedad propiedad) {
        for (int i = 0; i < propiedades.size(); i++) {
            if (propiedades.get(i).getNumeroMatricula().equals(propiedad.getNumeroMatricula())) {
                propiedades.set(i, propiedad);
                break;
            }
        }
    }

    // Método para registrar alquileres
    public void registrarAlquiler(Propiedad propiedad, String cedulaArrendatario) {
        Alquiler alquiler = new Alquiler(propiedad, cedulaArrendatario);
        alquileres.add(alquiler);
        propiedad.setDisponibilidad("No disponible");
    }
}

