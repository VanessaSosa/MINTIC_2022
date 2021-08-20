package com.utp.p74.r4.modelo.dao;

//Estructura de datos
import java.util.ArrayList;

//Librerías para SQL y Base de Datos
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Clase para conexión
import com.utp.p74.r4.util.JDBCUtilities;

//Encapsulamiento de los datos
import com.utp.p74.r4.modelo.vo.Lider;

public class LiderDao {

    public ArrayList<Lider> query_requerimiento_4() throws SQLException {
        
        // Crea arreglo para almacenar objetos tipo Proyecto
        ArrayList<Lider> lideres = new ArrayList<Lider>();
        Connection conexion = JDBCUtilities.getConnection();
        try {
            String query = "SELECT l.Nombre, l.Primer_Apellido FROM Proyecto p " +
                           "INNER JOIN Lider l ON l.ID_Lider = p.ID_Lider " +
                           "WHERE p.Clasificacion = 'Casa' ";
            // Preparar el query
            PreparedStatement pStatement = conexion.prepareStatement(query);
            // Ejecutar la consulta
            ResultSet resultado = pStatement.executeQuery();

            while (resultado.next()) {
                Lider vista_requerimiento_4 = new Lider();
                vista_requerimiento_4.setNombre(resultado.getString("Nombre"));
                vista_requerimiento_4.setApellido(resultado.getString("Primer_Apellido"));

                lideres.add(vista_requerimiento_4);
            }
            conexion.close();
            resultado.close();
            pStatement.close();

        } catch (Exception e) {
            //TODO: handle exception
        }
        return lideres;
    }

}