
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class InmobiliariaGUI extends JFrame {
    private Inmobiliaria inmobiliaria;

    public InmobiliariaGUI() {
        inmobiliaria = new Inmobiliaria();

        // Configuraci�n de la ventana
        setTitle("Gesti�n Inmobiliaria");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creaci�n de men�s
        JMenuBar menuBar = new JMenuBar();
        JMenu menuClientes = new JMenu("Clientes");
        JMenuItem itemRegistrarArrendatario = new JMenuItem("Registrar Arrendatario");
        itemRegistrarArrendatario.addActionListener((ActionEvent e) -> {
            // L�gica para registrar arrendatario
            Arrendatario arrendatario = new Arrendatario("123456", "Juan Perez", "1234567890", "1234567", "Estudiante");
            inmobiliaria.registrarArrendatario(arrendatario);
        });
        JMenuItem itemEliminarArrendatario = new JMenuItem("Eliminar Arrendatario");
        itemEliminarArrendatario.addActionListener((ActionEvent e) -> {
            // L�gica para eliminar arrendatario
            String cedula = JOptionPane.showInputDialog("Ingrese la c�dula del arrendatario a eliminar");
            inmobiliaria.eliminarArrendatario(cedula);
        });
        JMenuItem itemModificarArrendatario = new JMenuItem("Modificar Arrendatario");
        itemModificarArrendatario.addActionListener((ActionEvent e) -> {
            // L�gica para modificar arrendatario
            String cedula = JOptionPane.showInputDialog("Ingrese la c�dula del arrendatario a modificar");
            Arrendatario arrendatario = inmobiliaria.buscarArrendatario(cedula);
            if (arrendatario!= null) {
                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del arrendatario");
                arrendatario.setNombre(nombre);
                inmobiliaria.modificarArrendatario(arrendatario);
            }
        });
        menuClientes.add(itemRegistrarArrendatario);
        menuClientes.add(itemEliminarArrendatario);
        menuClientes.add(itemModificarArrendatario);

        JMenu menuPropiedades = new JMenu("Propiedades");
        JMenuItem itemRegistrarPropiedad = new JMenuItem("Registrar Propiedad");
        itemRegistrarPropiedad.addActionListener((ActionEvent e) -> {
            // L�gica para registrar propiedad
            Propiedad propiedad = new Propiedad("123456", "Calle Falsa 123", "Barrio Falso", "Zona 1", 1000, "Departamento en buen estado", "Disponible");
            inmobiliaria.registrarPropiedad(propiedad);
        });
        JMenuItem itemEliminarPropiedad = new JMenuItem("Eliminar Propiedad");
        itemEliminarPropiedad.addActionListener((ActionEvent e) -> {
            // L�gica para eliminar propiedad
            String numeroMatricula = JOptionPane.showInputDialog("Ingrese el n�mero de matr�cula de la propiedad a eliminar");
            inmobiliaria.eliminarPropiedad(numeroMatricula);
        });
        JMenuItem itemModificarPropiedad = new JMenuItem("Modificar Propiedad");
        itemModificarPropiedad.addActionListener((ActionEvent e) -> {
            // L�gica para modificar propiedad
            String numeroMatricula = JOptionPane.showInputDialog("Ingrese el n�mero de matr�cula de la propiedad a modificar");
            Propiedad propiedad = inmobiliaria.buscarPropiedad(numeroMatricula);
            if (propiedad!= null) {
                String direccion = JOptionPane.showInputDialog("Ingrese la nueva direcci�n de la propiedad");
                propiedad.setDireccion(direccion);
                inmobiliaria.modificarPropiedad(propiedad);
            }
        });
        JMenuItem itemGestionarAlquileres = new JMenuItem("Gestionar Alquileres");
        itemGestionarAlquileres.addActionListener((ActionEvent e) -> {
            // L�gica para gestionar alquileres
            String numeroMatricula = JOptionPane.showInputDialog("Ingrese el n�mero de matr�cula de la propiedad a alquilar");
            Propiedad propiedad = inmobiliaria.buscarPropiedad(numeroMatricula);
            if (propiedad!= null) {
                String cedulaArrendatario = JOptionPane.showInputDialog("Ingrese la c�dula del arrendatario");
                inmobiliaria.registrarAlquiler(propiedad, cedulaArrendatario);
            }
        });
        menuPropiedades.add(itemRegistrarPropiedad);
        menuPropiedades.add(itemEliminarPropiedad);
        menuPropiedades.add(itemModificarPropiedad);
        menuPropiedades.add(itemGestionarAlquileres);

        menuBar.add(menuClientes);
        menuBar.add(menuPropiedades);
        setJMenuBar(menuBar);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new InmobiliariaGUI().setVisible(true);
        });
    }
}
