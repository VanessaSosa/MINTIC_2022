package com.utp.p74.r4.vista;

import java.sql.SQLException;
import java.util.ArrayList;

//import java.sql.SQLException;
//import java.util.ArrayList;

import com.utp.p74.r4.controlador.Controlador;
import com.utp.p74.r4.modelo.vo.Lider;
//import com.utp.p74.r4.modelo.vo.Lider;
//import com.utp.p74.r4.modelo.vo.Proyecto;
import com.utp.p74.r4.modelo.vo.Proyecto;

public class Vista {

    public static final Controlador controlador = new Controlador();

    public static void vista_requerimiento_1() {

        try {
            ArrayList<Proyecto> listaRequerimiento_1;
            listaRequerimiento_1 = controlador.Solucionar_requerimiento_1();

            // for (int i = 0; i < listaRequerimiento_1.size(); i++) {}
            for (Proyecto pr : listaRequerimiento_1) {
                System.out.println("Constructora: " + pr.getNombre_constructora() + " - Serial: " + pr.getSerial());
            }

        } catch (SQLException e) {
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }

    }

    public static void vista_requerimiento_1b(ArrayList<Proyecto> listaRequerimiento_1) {

        for (Proyecto pr : listaRequerimiento_1) {
            System.out.println("Constructora: " + pr.getNombre_constructora() + " - Serial: " + pr.getSerial());
        }

    }

    public static void vista_requerimiento_2() {
        try {
            ArrayList<Proyecto> listaRequerimiento_2;
            listaRequerimiento_2 = controlador.Solucionar_requerimiento_2();

            for (Proyecto pr2 : listaRequerimiento_2) {
                System.out.println("Numero_Habitaciones: " + pr2.getNum_habitaciones() + " - Numero_Banos: "
                        + pr2.getNum_banios() + " - Nombre_Lider: " + pr2.getNombre() + " - Apellido_Lider: "
                        + pr2.getPrimer_apellido() + " - Estrato_Proyecto: " + pr2.getEstrato_proyecto());
            }

        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void vista_requerimiento_2b(ArrayList<Proyecto> listaRequerimiento_2) {

        for (Proyecto pr2 : listaRequerimiento_2) {
            System.out.println("Numero_Habitaciones: " + pr2.getNum_habitaciones() + " - Numero_Banos: "
                    + pr2.getNum_banios() + " - Nombre_Lider: " + pr2.getNombre() + " - Apellido_Lider: "
                    + pr2.getPrimer_apellido() + " - Estrato_Proyecto: " + pr2.getEstrato_proyecto());
        }

    }

    public static void vista_requerimiento_3() {
        try {
            ArrayList<Proyecto> listaRequerimiento_3;
            listaRequerimiento_3 = controlador.Solucionar_requerimiento_3();

            for (Proyecto pr3 : listaRequerimiento_3) {
                System.out.println("Cantidad_Casas: " + pr3.getCant_clasificaciones() + " - Constructora: "
                        + pr3.getNombre_constructora());
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void vista_requerimiento_3b(ArrayList<Proyecto> listaRequerimiento_3) {

        for (Proyecto pr3 : listaRequerimiento_3) {
            System.out.println("Cantidad_Casas: " + pr3.getCant_clasificaciones() + " - Constructora: "
                    + pr3.getNombre_constructora());
        }

    }

    public static void vista_requerimiento_4() {
        try {
            ArrayList<Lider> listaRequerimiento_4;
            listaRequerimiento_4 = controlador.Solucionar_requerimiento_4();

            for (Lider ld : listaRequerimiento_4) {
                System.out.println("Nombre_Lider: " + ld.getNombre() + " - Apellido_Lider: " + ld.getApellido());
            }
        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void vista_requerimiento_4b(ArrayList<Lider> listaRequerimiento_4) {

        for (Lider ld : listaRequerimiento_4) {
            System.out.println("Nombre_Lider: " + ld.getNombre() + " - Apellido_Lider: " + ld.getApellido());
        }

    }

    public static void vista_requerimiento_5() {
        try {
            ArrayList<Proyecto> listaRequerimiento_5;
            listaRequerimiento_5 = controlador.Solucionar_requerimiento_5();

            for (Proyecto pr5 : listaRequerimiento_5) {
                System.out.println("Cantidad_Casas: " + pr5.getCant_clasificaciones() + " - Constructora: "
                        + pr5.getNombre_constructora());
            }

        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println("Ha ocurrido un error!" + e.getMessage());
        }
    }

    public static void vista_requerimiento_5b(ArrayList<Proyecto> listaRequerimiento_5) {

        for (Proyecto pr5 : listaRequerimiento_5) {
            System.out.println("Cantidad_Casas: " + pr5.getCant_clasificaciones() + " - Constructora: "
                    + pr5.getNombre_constructora());
        }

    }

}