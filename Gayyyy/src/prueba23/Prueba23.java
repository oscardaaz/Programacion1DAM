/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba23;

import javax.swing.JOptionPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author oscar.domalo
 */
public class Prueba23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereimport javax.swing.*;




        // Crear la ventana principal
        JFrame frame = new JFrame("Pregunta");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600); // Ventana aún más grande (800x600)
        frame.setLayout(null);

        // Etiqueta con la pregunta
        JLabel preguntaLabel = new JLabel("¿Eres gay?");
        preguntaLabel.setFont(new Font("Arial", Font.PLAIN, 36)); // Aumentamos el tamaño de la fuente
        preguntaLabel.setBounds(300, 100, 300, 50); // Posición centrada en la ventana
        frame.add(preguntaLabel);

        // Botón "Sí"
        JButton siButton = new JButton("Sí");
        siButton.setFont(new Font("Arial", Font.PLAIN, 30)); // Aumentamos el tamaño de la fuente
        siButton.setBounds(150, 400, 200, 50); // Botón más grande y en una mejor posición
        frame.add(siButton);

        // Botón "No"
        JButton noButton = new JButton("No");
        noButton.setFont(new Font("Arial", Font.PLAIN, 30)); // Aumentamos el tamaño de la fuente
        noButton.setBounds(450, 400, 200, 50); // Botón más grande y en una mejor posición
        frame.add(noButton);

        // Listener para mover el botón "No"
        noButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Mueve el botón "No" a una nueva posición aleatoria cuando pasa el ratón
                int x = (int) (Math.random() * (frame.getWidth() - noButton.getWidth()));
                int y = (int) (Math.random() * (frame.getHeight() - noButton.getHeight()));
                noButton.setBounds(x, y, 200, 50); // Se mantiene el tamaño del botón
            }
        });

        // Acción para el botón "Sí"
        siButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "¡Gracias por ser maricon!");
            System.exit(0); // Cerrar la aplicación
        });

        // Asegurarse de que la ventana sea visible después de agregar todos los componentes
        frame.setVisible(true);
    }
}



