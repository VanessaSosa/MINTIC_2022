package com.utp.p74.r4.modelo.dao;

//Estructura de datos
import java.util.ArrayList;

import com.utp.p74.r4.modelo.vo.Lider;
import com.utp.p74.r4.modelo.vo.Proyecto;
//import com.utp.p74.r4.modelo.vo.Tipo;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import com.utp.p74.r4.util.JDBCUtilities;

public class ProyectoDao {

    public ArrayList<Proyecto> query_requerimiento_1() throws SQLException {

        ArrayList<Proyecto> requerimiento1 = new ArrayList<Proyecto>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String query = "SELECT DISTINCT Constructora, Serial FROM Proyecto WHERE Clasificacion = 'Casa' ";
            // Preparar el query
            PreparedStatement pStatement = conexion.prepareStatement(query);
            // Ejecutar la consulta
            ResultSet resultado = pStatement.executeQuery();

            while (resultado.next()) {
                Proyecto vista_requerimiento_1 = new Proyecto();
                vista_requerimiento_1.setNombre_constructora(resultado.getString("Constructora"));
                vista_requerimiento_1.setSerial(resultado.getString("Serial"));

                requerimiento1.add(vista_requerimiento_1);
            }
            conexion.close();
            resultado.close();
            pStatement.close();

        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println(e);
        }
        return requerimiento1;
    }

    public ArrayList<Proyecto> query_requerimiento_2() throws SQLException {
        ArrayList<Proyecto> requerimiento2 = new ArrayList<Proyecto>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String query = "SELECT Numero_Habitaciones, Numero_Banos, Nombre, Primer_Apellido, Estrato FROM Proyecto p "
                    + "INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider " 
                    + "INNER JOIN Tipo t ON t.ID_Tipo = p.ID_Tipo "
                    + "WHERE p.Clasificacion = 'Casa' ";
            // Preparar el query
            PreparedStatement pStatement = conexion.prepareStatement(query);
            // Ejecutar la consulta
            ResultSet resultado = pStatement.executeQuery();

            while (resultado.next()) {
                Proyecto vista_requerimiento_2 = new Proyecto();
                //Lider lider = new Lider();
                vista_requerimiento_2.setNum_habitaciones(resultado.getInt("Numero_Habitaciones"));
                vista_requerimiento_2.setNum_banios(resultado.getInt("Numero_Banos"));
                vista_requerimiento_2.setNombre(resultado.getString("Nombre"));
                vista_requerimiento_2.setPrimer_apellido(resultado.getString("Primer_Apellido"));
                 vista_requerimiento_2.setEstrato_proyecto(resultado.getInt("Estrato"));
                //prto2.getLider().setNombre(resultado2.getString("Nombre"));
                //prto2.setLider(lider).setNombre(resultado2.getString("Nombre"));
                requerimiento2.add(vista_requerimiento_2);

            }
            conexion.close();
            resultado.close();
            pStatement.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
        }
        return requerimiento2;
    }

    public ArrayList<Proyecto> query_requerimiento_3() throws SQLException {
        ArrayList<Proyecto> requerimiento3 = new ArrayList<Proyecto>();
        Connection conexion = JDBCUtilities.getConnection();

        try {
            String query = "SELECT DISTINCT COUNT(p.Clasificacion) as Casas , Constructora " + "FROM Proyecto p "
                    + "WHERE p.Clasificacion = 'Casa' " + "GROUP BY Constructora";
            // Preparar el query
            PreparedStatement pStatement = conexion.prepareStatement(query);
            // Ejecutar la consulta
            ResultSet resultado = pStatement.executeQuery();

            while (resultado.next()) {
                Proyecto vista_requerimiento_3 = new Proyecto();
                vista_requerimiento_3.setNombre_constructora(resultado.getString("Constructora"));
                vista_requerimiento_3.setCant_clasificaciones(resultado.getInt("Casas"));

                requerimiento3.add(vista_requerimiento_3);
            }
            conexion.close();
            resultado.close();
            pStatement.close();

        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println(e);
        }
        return requerimiento3;

    }

    public ArrayList<Proyecto> query_requerimiento_5() throws SQLException {
        ArrayList<Proyecto> requerimiento5 = new ArrayList<Proyecto>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String query = "SELECT DISTINCT COUNT(p.Clasificacion) as Casas ,Constructora as Constructora "
                    + "FROM Proyecto p " + "WHERE p.Clasificacion = 'Casa' " + "GROUP BY Constructora "
                    + "HAVING Casas >= 18 " + "ORDER BY Casas ASC ";
            // Preparar el query
            PreparedStatement pStatement = conexion.prepareStatement(query);
            // Ejecutar la consulta
            ResultSet resultado = pStatement.executeQuery();

            while (resultado.next()) {
                Proyecto vista_requerimiento_5 = new Proyecto();
                vista_requerimiento_5.setNombre_constructora(resultado.getString("Constructora"));
                vista_requerimiento_5.setCant_clasificaciones(resultado.getInt("Casas"));

                requerimiento5.add(vista_requerimiento_5);
            }
            conexion.close();
            resultado.close();
            pStatement.close();

        } catch (SQLException e) {
            // TODO: handle exception
            System.err.println(e);
        }
        return requerimiento5;
    }

}