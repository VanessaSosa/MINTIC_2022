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


public class Requerimiento5GUI extends JFrame{
    //ATRIBUTOS 

    //Botones
    private JTable jtTablaRequerimiento5;
    private Controlador objControlador;

    //Controlador

    public Requerimiento5GUI(ArrayList<Proyecto> valoresR5, Controlador objControlador){

        this.setTitle("REQUERIMIENTO 5");

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

        String[] encabezados = {"Cantidad Casas", "Constructora"};

        jtTablaRequerimiento5 = new JTable(this.formatoRequerimiento5(valoresR5, encabezados.length), encabezados);

        JScrollPane sp = new JScrollPane(jtTablaRequerimiento5);
        JPanel panel = new JPanel();
        panel.add(sp);
        panel.setBorder(new TitledBorder("---Requerimiento 5---"));

        getContentPane().add(panel);

        //Propiedades de la ventana

        setSize(500,150);

        setLocationRelativeTo(null);

        setVisible(true);



    }

    public String[][] formatoRequerimiento5(ArrayList<Proyecto> valoresR5, int numeroColumnas){

        //Contendor de los registros
        String [][] registros = new String[valoresR5.size()][numeroColumnas];

        //Desempaquetar informacion que llega a la coleccion de objetos
        for (int i = 0; i < registros.length; i++) {
            //Desempaquetar cada material en una fila

            registros[i][0] = String.valueOf(valoresR5.get(i).getCant_clasificaciones());

            registros[i][1] = String.valueOf(valoresR5.get(i).getNombre_constructora());

        }


        //Retornar registros en formato de arreglo convencional

        return registros;
    }

    

}
