package com.utp.p74.r4.vista;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;

import com.utp.p74.r4.controlador.Controlador;
import com.utp.p74.r4.modelo.vo.Lider;
import com.utp.p74.r4.modelo.vo.Proyecto;


public class Requerimiento4GUI extends JFrame{
    //ATRIBUTOS 

    //Botones
    private JTable jtTablaRequerimiento4;
    private Controlador objControlador;

    //Controlador

    public Requerimiento4GUI(ArrayList<Lider> arrayList, Controlador objControlador){

        this.setTitle("REQUERIMIENTO 4");

        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 

        String[] encabezados = {"Nombre Lider", "Apellido Lider"};

        jtTablaRequerimiento4 = new JTable(this.formatoRequerimiento4(arrayList, encabezados.length), encabezados);

        JScrollPane sp = new JScrollPane(jtTablaRequerimiento4);
        JPanel panel = new JPanel();
        panel.add(sp);
        panel.setBorder(new TitledBorder("---Requerimiento 4---"));

        getContentPane().add(panel);

        //Propiedades de la ventana

        setSize(600,500);

        setLocationRelativeTo(null);

        setVisible(true);



    }

    public String[][] formatoRequerimiento4(ArrayList<Lider> arrayList, int numeroColumnas){

        //Contendor de los registros
        String [][] registros = new String[arrayList.size()][numeroColumnas];

        //Desempaquetar informacion que llega a la coleccion de objetos
        for (int i = 0; i < registros.length; i++) {
            //Desempaquetar cada material en una fila

            registros[i][0] = arrayList.get(i).getNombre();

            registros[i][1] = arrayList.get(i).getApellido();

        }


        //Retornar registros en formato de arreglo convencional

        return registros;
    }

    

}
