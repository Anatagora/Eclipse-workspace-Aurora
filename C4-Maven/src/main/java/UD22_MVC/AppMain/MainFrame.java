package UD22_MVC.AppMain;

import javax.swing.*;

import UD22_MVC.Vista.ClienteCreateView;
import UD22_MVC.Vista.ClienteDeleteView;
import UD22_MVC.Vista.ClienteReadView;
import UD22_MVC.Vista.ClienteUpdateView;
import UD22_MVC.Vista.VideoCreateView;
import UD22_MVC.Vista.VideoDeleteView;
import UD22_MVC.Vista.VideoReadView;
import UD22_MVC.Vista.VideoUpdateView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    public MainFrame() {
        setTitle("Sistema de Gestión de Clientes y Videos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Menú para CRUD de Clientes
        JButton clienteCreateButton = new JButton("Agregar Cliente");
        clienteCreateButton.setBounds(50, 50, 200, 30);
        clienteCreateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ClienteCreateView();
            }
        });
        add(clienteCreateButton);

        JButton clienteReadButton = new JButton("Mostrar Todos los Clientes");
        clienteReadButton.setBounds(50, 100, 200, 30);
        clienteReadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ClienteReadView();
            }
        });
        add(clienteReadButton);

        JButton clienteUpdateButton = new JButton("Actualizar Cliente");
        clienteUpdateButton.setBounds(50, 150, 200, 30);
        clienteUpdateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ClienteUpdateView();
            }
        });
        add(clienteUpdateButton);

        JButton clienteDeleteButton = new JButton("Eliminar Cliente");
        clienteDeleteButton.setBounds(50, 200, 200, 30);
        clienteDeleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ClienteDeleteView();
            }
        });
        add(clienteDeleteButton);

        // Menú para CRUD de Videos
        JButton videoCreateButton = new JButton("Agregar Video");
        videoCreateButton.setBounds(300, 50, 200, 30);
        videoCreateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new VideoCreateView();
            }
        });
        add(videoCreateButton);

        JButton videoReadButton = new JButton("Mostrar Todos los Videos");
        videoReadButton.setBounds(300, 100, 200, 30);
        videoReadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new VideoReadView();
            }
        });
        add(videoReadButton);

        JButton videoUpdateButton = new JButton("Actualizar Video");
        videoUpdateButton.setBounds(300, 150, 200, 30);
        videoUpdateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new VideoUpdateView();
            }
        });
        add(videoUpdateButton);

        JButton videoDeleteButton = new JButton("Eliminar Video");
        videoDeleteButton.setBounds(300, 200, 200, 30);
        videoDeleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new VideoDeleteView();
            }
        });
        add(videoDeleteButton);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}

