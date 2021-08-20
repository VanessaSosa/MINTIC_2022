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


public class Requerimiento2GUI extends JFrame{
    //ATRIBUTOS 

    //Botones
    private JTable jtTablaRequerimiento2;
    private Controlador objControlador;

    //Controlador

    public Requerimiento2GUI(ArrayList<Proyecto> valoresR2, Controlador objControlador){

        this.setTitle("REQUERIMIENTO 2");

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

        String[] encabezados = {"Número Habitaciones", "Numero Baños", "Nombre Lider", "Apellido Lider", "Estrato Proyecto"};

        jtTablaRequerimiento2 = new JTable(this.formatoRequerimiento2(valoresR2, encabezados.length), encabezados);

        JScrollPane sp = new JScrollPane(jtTablaRequerimiento2);
        JPanel panel = new JPanel();
        panel.add(sp);
        panel.setBorder(new TitledBorder("---Requerimiento 2---"));
        
        getContentPane().add(panel);

        //Propiedades de la ventana

        setSize(600,550);

        setLocationRelativeTo(null);

        setVisible(true);



    }

    public String[][] formatoRequerimiento2(ArrayList<Proyecto> valoresR2, int numeroColumnas){

        //Contendor de los registros
        String [][] registros = new String[valoresR2.size()][numeroColumnas];

        //Desempaquetar informacion que llega a la coleccion de objetos
        for (int i = 0; i < registros.length; i++) {
            //Desempaquetar cada material en una fila

            registros[i][0] = String.valueOf(valoresR2.get(i).getNum_habitaciones());

            registros[i][1] = String.valueOf(valoresR2.get(i).getNum_banios());

            registros[i][2] = valoresR2.get(i).getNombre();

            registros[i][3] = valoresR2.get(i).getPrimer_apellido();

            registros[i][4] = String.valueOf(valoresR2.get(i).getEstrato_proyecto());

        }


        //Retornar registros en formato de arreglo convencional

        return registros;
    }

    

}
