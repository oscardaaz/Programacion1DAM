package tienda_repuestos_v2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TiendaRepuestosGUI extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTable table;
    private DefaultTableModel model;
    private JTextField txtCodigo, txtDescripcion, txtDepartamento, txtStock;
    private GestionRepuestos gestionRepuestos;

    public TiendaRepuestosGUI() {
        gestionRepuestos = new GestionRepuestos();
        gestionRepuestos.cargarDatos();

        setTitle("Tienda de Repuestos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // Crear la tabla
        String[] columnNames = {"Código", "Descripción", "Departamento", "Stock"};
        model = new DefaultTableModel(columnNames, 0);
        table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        // Panel de formulario
        JPanel panelFormulario = new JPanel(new GridLayout(5, 2));
        panelFormulario.add(new JLabel("Código:"));
        txtCodigo = new JTextField();
        panelFormulario.add(txtCodigo);

        panelFormulario.add(new JLabel("Descripción:"));
        txtDescripcion = new JTextField();
        panelFormulario.add(txtDescripcion);

        panelFormulario.add(new JLabel("Departamento:"));
        txtDepartamento = new JTextField();
        panelFormulario.add(txtDepartamento);

        panelFormulario.add(new JLabel("Stock:"));
        txtStock = new JTextField();
        panelFormulario.add(txtStock);

        add(panelFormulario, BorderLayout.NORTH);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        JButton btnAlta = new JButton("Alta");
        JButton btnModificar = new JButton("Modificar");
        JButton btnBorrar = new JButton("Borrar");
        JButton btnListar = new JButton("Listar");

        panelBotones.add(btnAlta);
        panelBotones.add(btnModificar);
        panelBotones.add(btnBorrar);
        panelBotones.add(btnListar);
        add(panelBotones, BorderLayout.SOUTH);

        // Acciones de los botones
        btnAlta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(txtCodigo.getText());
                String descripcion = txtDescripcion.getText();
                String departamento = txtDepartamento.getText();
                int stock = Integer.parseInt(txtStock.getText());
                if (gestionRepuestos.altaRepuesto(codigo, descripcion, departamento, stock)) {
                    JOptionPane.showMessageDialog(null, "Repuesto dado de alta.");
                    actualizarTabla();
                }
            }
        });

        btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(txtCodigo.getText());
                String descripcion = txtDescripcion.getText();
                String departamento = txtDepartamento.getText();
                int stock = Integer.parseInt(txtStock.getText());
                if (gestionRepuestos.modificarRepuesto(codigo, descripcion, departamento, stock)) {
                    JOptionPane.showMessageDialog(null, "Repuesto modificado.");
                    actualizarTabla();
                }
            }
        });

        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(txtCodigo.getText());
                if (gestionRepuestos.borrarRepuesto(codigo)) {
                    JOptionPane.showMessageDialog(null, "Repuesto borrado.");
                    actualizarTabla();
                }
            }
        });

        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestionRepuestos.listarPorCodigo();
                actualizarTabla();
            }
        });

        setVisible(true);
    }

    private void actualizarTabla() {
        model.setRowCount(0);
        for (Repuesto r : gestionRepuestos.getRepuestos()) {
            model.addRow(new Object[]{r.getCodigo(), r.getDescripcion(), r.getDepartamento(), r.getStock()});
        }
    }

    public static void main(String[] args) {
        new TiendaRepuestosGUI();
    }
}
