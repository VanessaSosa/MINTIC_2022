package com.utp.p74.r4.vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.ImageIcon;

import com.utp.p74.r4.controlador.Controlador;


public class MenuGUI_reto5 extends JFrame{
    //ATRIBUTOS 

    public JLabel lblMensaje;

    //Botones
    private JButton btnRequerimiento_1;
    private JButton btnRequerimiento_2;
    private JButton btnRequerimiento_3;
    private JButton btnRequerimiento_4;
    private JButton btnRequerimiento_5;

    //Controlador

    private Controlador objControlador;

    public void iniciarGUI(){

        this.objControlador = new Controlador();
        this.setTitle("MENÚ DE REQUERIMIENTOS");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Crear (Instanciar) componentes

        ImageIcon icono1 = new ImageIcon("imagenes/r1.png");
        Image img = icono1.getImage();
        icono1 = new ImageIcon( img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));

        btnRequerimiento_1 = new JButton(icono1);
        btnRequerimiento_1.setText("Requerimiento 1");
        btnRequerimiento_1.setFont(new Font("Calibri", Font.PLAIN, 20));
        btnRequerimiento_1.setBackground(Color.PINK);
        btnRequerimiento_1.setForeground(Color.MAGENTA);
        btnRequerimiento_1.addActionListener(objControlador);
        btnRequerimiento_1.setActionCommand("requerimiento1");


        ImageIcon icono2 = new ImageIcon("imagenes/r2.png");
        Image img2 = icono2.getImage();
        icono2 = new ImageIcon( img2.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));

        btnRequerimiento_2 = new JButton(icono2);
        btnRequerimiento_2.setText("Requerimiento 2");
        btnRequerimiento_2.setFont(new Font("Calibri", Font.PLAIN, 20));
        btnRequerimiento_2.setBackground(Color.PINK);
        btnRequerimiento_2.setForeground(Color.MAGENTA);
        btnRequerimiento_2.addActionListener(objControlador);
        btnRequerimiento_2.setActionCommand("requerimiento2");

   
        ImageIcon icono3 = new ImageIcon("imagenes/casa.png");
        Image img3 = icono3.getImage();
        icono3 = new ImageIcon( img3.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));

        btnRequerimiento_3 = new JButton(icono3);
        btnRequerimiento_3.setText("Requerimiento 3");
        btnRequerimiento_3.setFont(new Font("Calibri", Font.PLAIN, 20));
        btnRequerimiento_3.setBackground(Color.PINK);
        btnRequerimiento_3.setForeground(Color.MAGENTA);
        btnRequerimiento_3.addActionListener(objControlador);
        btnRequerimiento_3.setActionCommand("requerimiento3");

        ImageIcon icono4 = new ImageIcon("imagenes/r4.png");
        Image img4 = icono4.getImage();
        icono4 = new ImageIcon( img4.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));

        btnRequerimiento_4 = new JButton(icono4);
        btnRequerimiento_4.setText("Requerimiento 4");
        btnRequerimiento_4.setFont(new Font("Calibri", Font.PLAIN, 20));
        btnRequerimiento_4.setBackground(Color.PINK);
        btnRequerimiento_4.setForeground(Color.MAGENTA);
        btnRequerimiento_4.addActionListener(objControlador);
        btnRequerimiento_4.setActionCommand("requerimiento4");

        ImageIcon icono5 = new ImageIcon("imagenes/r5.png");
        Image img5 = icono5.getImage();
        icono5 = new ImageIcon( img5.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH));

        btnRequerimiento_5 = new JButton(icono5);
        btnRequerimiento_5.setText("Requerimiento 5");
        btnRequerimiento_5.setFont(new Font("Calibri", Font.PLAIN, 20));
        btnRequerimiento_5.setBackground(Color.PINK);
        btnRequerimiento_5.setForeground(Color.MAGENTA);
        btnRequerimiento_5.addActionListener(objControlador);
        btnRequerimiento_5.setActionCommand("requerimiento5");


        //Añadir componentes a contenedores o contenedores intermedios

        JPanel panel = new JPanel();
        panel.add(btnRequerimiento_1);
        panel.add(btnRequerimiento_2);
        panel.add(btnRequerimiento_3);
        panel.add(btnRequerimiento_4);
        panel.add(btnRequerimiento_5);

        //Contendor intermedio a las ventanas

        getContentPane().add(panel);

        //Establecer últimas propiedades del frame

        setSize(250,300);
        setLocationRelativeTo(null);
        setVisible(true);



    }
}
