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


public class Requerimiento3GUI extends JFrame{
    //ATRIBUTOS 

    //Botones
    private JTable jtTablaRequerimiento3;
    private Controlador objControlador;

    //Controlador

    public Requerimiento3GUI(ArrayList<Proyecto> valoresR3, Controlador objControlador){

        this.setTitle("REQUERIMIENTO 3");

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

        String[] encabezados = {"Cantidad Casas", "Constructora"};

        jtTablaRequerimiento3 = new JTable(this.formatoRequerimiento3(valoresR3, encabezados.length), encabezados);

        JScrollPane sp = new JScrollPane(jtTablaRequerimiento3);
        JPanel panel = new JPanel();
        panel.add(sp);
        panel.setBorder(new TitledBorder("---Requerimiento 3---"));

        getContentPane().add(panel);

        //Propiedades de la ventana

        setSize(500,200);

        setLocationRelativeTo(null);

        setVisible(true);



    }

    public String[][] formatoRequerimiento3(ArrayList<Proyecto> valoresR3, int numeroColumnas){

        //Contendor de los registros
        String [][] registros = new String[valoresR3.size()][numeroColumnas];

        //Desempaquetar informacion que llega a la coleccion de objetos
        for (int i = 0; i < registros.length; i++) {
            //Desempaquetar cada material en una fila

            registros[i][0] = String.valueOf(valoresR3.get(i).getCant_clasificaciones());

            registros[i][1] = String.valueOf(valoresR3.get(i).getNombre_constructora());

        }


        //Retornar registros en formato de arreglo convencional

        return registros;
    }

    

}
