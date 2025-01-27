package UD22_MVC.Ejercicio3.Vistas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import UD22_MVC.Ejercicio3.Controller.AsignadoAController;
import UD22_MVC.Ejercicio3.Modelo.AsignadoA;

public class LeerAsignadoAView extends JFrame {
    private JTextArea textArea;

    public LeerAsignadoAView() {
        setTitle("Leer Asignaciones");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();

        textArea = new JTextArea(15, 30);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(scrollPane);

        add(panel);

        mostrarAsignaciones();
    }

    private void mostrarAsignaciones() {
        AsignadoAController controller = new AsignadoAController();
        List<AsignadoA> asignaciones = controller.getAllAsignados();

        StringBuilder sb = new StringBuilder();
        for (AsignadoA asignacion : asignaciones) {
            sb.append("ID Proyecto: ").append(asignacion.getIdProyecto()).append(", DNI: ").append(asignacion.getdni_cientifico()).append("\n");
        }

        textArea.setText(sb.toString());
    }
}
