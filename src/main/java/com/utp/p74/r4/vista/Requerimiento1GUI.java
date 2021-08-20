package com.utp.p74.r4.vista;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import com.utp.p74.r4.controlador.Controlador;
import com.utp.p74.r4.modelo.vo.Proyecto;


public class Requerimiento1GUI extends JFrame{
    //ATRIBUTOS 

    //Botones
    private JTable jtTablaRequerimiento1;
    private Controlador objControlador;

    //Controlador

    public Requerimiento1GUI(ArrayList<Proyecto> valoresR1, Controlador objControlador){

        this.setTitle("REQUERIMIENTO 1");

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

        String[] encabezados = {"Nombre Constructora", "Numero Serial"};

        jtTablaRequerimiento1 = new JTable(this.formatoRequerimiento1(valoresR1, encabezados.length), encabezados);

        JScrollPane sp = new JScrollPane(jtTablaRequerimiento1);
        JPanel panel = new JPanel();
        panel.add(sp);
        panel.setBorder(new TitledBorder("---Requerimiento 1---"));
        getContentPane().add(panel);

        //Propiedades de la ventana

        setSize(600,500);

        setLocationRelativeTo(null);

        setVisible(true);



    }

    public String[][] formatoRequerimiento1(ArrayList<Proyecto> valoresR1, int numeroColumnas){

        //Contendor de los registros
        String [][] registros = new String[valoresR1.size()][numeroColumnas];

        //Desempaquetar informacion que llega a la coleccion de objetos
        for (int i = 0; i < registros.length; i++) {
            //Desempaquetar cada material en una fila

            registros[i][0] = valoresR1.get(i).getNombre_constructora();

            registros[i][1] = valoresR1.get(i).getSerial();
            
        }


        //Retornar registros en formato de arreglo convencional

        return registros;
    }

    

}
