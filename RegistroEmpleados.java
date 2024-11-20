
package registroempleados;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroEmpleados {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Empleados");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        JLabel labelNombre = new JLabel("Nombre:");
        JTextField textNombre = new JTextField(20);
        JLabel labelApellido = new JLabel("Apellido:");
        JTextField textApellido = new JTextField(20);
        JLabel labelFecha = new JLabel("Fecha de Nacimiento:");
        JTextField textFecha = new JTextField(10);
        JButton buttonGuardar = new JButton("Guardar");
        JLabel labelEmpleados = new JLabel("<html>Lista de empleados:<br/></html>");

        buttonGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String empleado = textNombre.getText() + " " + textApellido.getText() + " (" + textFecha.getText() + ")";
                labelEmpleados.setText(labelEmpleados.getText() + empleado + "<br/>");
                textNombre.setText("");
                textApellido.setText("");
                textFecha.setText("");
            }
        });

        frame.add(labelNombre);
        frame.add(textNombre);
        frame.add(labelApellido);
        frame.add(textApellido);
        frame.add(labelFecha);
        frame.add(textFecha);
        frame.add(buttonGuardar);
        frame.add(labelEmpleados);

        frame.setVisible(true);
    }
}
