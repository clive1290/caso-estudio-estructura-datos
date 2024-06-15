
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

        // Configuración de la ventana
        setTitle("Gestión Inmobiliaria");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creación de menús
        JMenuBar menuBar = new JMenuBar();
        JMenu menuClientes = new JMenu("Clientes");
        JMenuItem itemRegistrarArrendatario = new JMenuItem("Registrar Arrendatario");
        itemRegistrarArrendatario.addActionListener((ActionEvent e) -> {
            // Lógica para registrar arrendatario
            Arrendatario arrendatario = new Arrendatario("123456", "Juan Perez", "1234567890", "1234567", "Estudiante");
            inmobiliaria.registrarArrendatario(arrendatario);
        });
        JMenuItem itemEliminarArrendatario = new JMenuItem("Eliminar Arrendatario");
        itemEliminarArrendatario.addActionListener((ActionEvent e) -> {
            // Lógica para eliminar arrendatario
            String cedula = JOptionPane.showInputDialog("Ingrese la cédula del arrendatario a eliminar");
            inmobiliaria.eliminarArrendatario(cedula);
        });
        JMenuItem itemModificarArrendatario = new JMenuItem("Modificar Arrendatario");
        itemModificarArrendatario.addActionListener((ActionEvent e) -> {
            // Lógica para modificar arrendatario
            String cedula = JOptionPane.showInputDialog("Ingrese la cédula del arrendatario a modificar");
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
            // Lógica para registrar propiedad
            Propiedad propiedad = new Propiedad("123456", "Calle Falsa 123", "Barrio Falso", "Zona 1", 1000, "Departamento en buen estado", "Disponible");
            inmobiliaria.registrarPropiedad(propiedad);
        });
        JMenuItem itemEliminarPropiedad = new JMenuItem("Eliminar Propiedad");
        itemEliminarPropiedad.addActionListener((ActionEvent e) -> {
            // Lógica para eliminar propiedad
            String numeroMatricula = JOptionPane.showInputDialog("Ingrese el número de matrícula de la propiedad a eliminar");
            inmobiliaria.eliminarPropiedad(numeroMatricula);
        });
        JMenuItem itemModificarPropiedad = new JMenuItem("Modificar Propiedad");
        itemModificarPropiedad.addActionListener((ActionEvent e) -> {
            // Lógica para modificar propiedad
            String numeroMatricula = JOptionPane.showInputDialog("Ingrese el número de matrícula de la propiedad a modificar");
            Propiedad propiedad = inmobiliaria.buscarPropiedad(numeroMatricula);
            if (propiedad!= null) {
                String direccion = JOptionPane.showInputDialog("Ingrese la nueva dirección de la propiedad");
                propiedad.setDireccion(direccion);
                inmobiliaria.modificarPropiedad(propiedad);
            }
        });
        JMenuItem itemGestionarAlquileres = new JMenuItem("Gestionar Alquileres");
        itemGestionarAlquileres.addActionListener((ActionEvent e) -> {
            // Lógica para gestionar alquileres
            String numeroMatricula = JOptionPane.showInputDialog("Ingrese el número de matrícula de la propiedad a alquilar");
            Propiedad propiedad = inmobiliaria.buscarPropiedad(numeroMatricula);
            if (propiedad!= null) {
                String cedulaArrendatario = JOptionPane.showInputDialog("Ingrese la cédula del arrendatario");
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
