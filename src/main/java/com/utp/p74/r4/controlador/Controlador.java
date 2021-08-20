package com.utp.p74.r4.controlador;

//Estructuras de datos (colecciones)
import java.util.ArrayList;

import javax.swing.JButton;

import com.utp.p74.r4.modelo.dao.LiderDao;
import com.utp.p74.r4.modelo.dao.ProyectoDao;
import com.utp.p74.r4.modelo.vo.Lider;
import com.utp.p74.r4.modelo.vo.Proyecto;
import com.utp.p74.r4.vista.MenuGUI_reto5;
import com.utp.p74.r4.vista.Requerimiento1GUI;
import com.utp.p74.r4.vista.Requerimiento2GUI;
import com.utp.p74.r4.vista.Requerimiento3GUI;
import com.utp.p74.r4.vista.Requerimiento4GUI;
import com.utp.p74.r4.vista.Requerimiento5GUI;

import java.awt.*;
import java.awt.event.*;
import com.utp.p74.r4.vista.Vista;

//Librerías para bases de datos
import java.sql.SQLException;

public class Controlador implements ActionListener {

   private final ProyectoDao proyectoDao;
   private final LiderDao liderDao;
   private MenuGUI_reto5 menuGUI_reto5;
   private Requerimiento1GUI requerimiento1gui;
   private Requerimiento2GUI requerimiento2gui;
   private Requerimiento3GUI requerimiento3gui;
   private Requerimiento4GUI requerimiento4gui;
   private Requerimiento5GUI requerimiento5gui;
   //private Requerimiento4GUI requerimiento4gui;
   

   public Controlador() {
      this.proyectoDao = new ProyectoDao();
      this.liderDao = new LiderDao();
      this.menuGUI_reto5 = new MenuGUI_reto5();
   }

   public ArrayList<Proyecto> Solucionar_requerimiento_1() throws SQLException {
      return this.proyectoDao.query_requerimiento_1();
   }

   public ArrayList<Proyecto> Solucionar_requerimiento_2() throws SQLException {
      return this.proyectoDao.query_requerimiento_2();
   }

   public ArrayList<Proyecto> Solucionar_requerimiento_3() throws SQLException {
      return this.proyectoDao.query_requerimiento_3();
   }

   public ArrayList<Lider> Solucionar_requerimiento_4() throws SQLException {
      return this.liderDao.query_requerimiento_4();
   }

   public ArrayList<Proyecto> Solucionar_requerimiento_5() throws SQLException {
      return this.proyectoDao.query_requerimiento_5();
   }

   public void inicio() {
      this.menuGUI_reto5.iniciarGUI();

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      String actionCommand = ((JButton) e.getSource()).getActionCommand();
      switch (actionCommand) {
         case "requerimiento1":
            try {
               this.requerimiento1gui = new Requerimiento1GUI(this.Solucionar_requerimiento_1(), this);
            } catch (Exception exception) {
               //TODO: handle exception
               System.err.println("Problemas consultando req1:"+ exception);
            }

            break;

         case "requerimiento2":
            //System.out.println("Requerimiento 2 en construccion!!!");  
            try {
               //Vista.vista_requerimiento_2b(this.Solucionar_requerimiento_2());
               this.requerimiento2gui = new Requerimiento2GUI(this.Solucionar_requerimiento_2(), this);
            } catch (Exception exception) {
               //TODO: handle exception
               System.err.println("Problemas consultando req2:"+ exception);
            }
            break;

         case "requerimiento3":
            //System.out.println("Requerimiento 3 en construccion!!!");
            try {
               //Vista.vista_requerimiento_3b(this.Solucionar_requerimiento_3());
               this.requerimiento3gui = new Requerimiento3GUI(this.Solucionar_requerimiento_3(), this);
            } catch (Exception exception) {
               //TODO: handle exception
               System.err.println("Problemas consultando req3:"+ exception);
            }
            break;

         case "requerimiento4":
            //System.out.println("Requerimiento 4 en construccion!!!");
            try {
               //Vista.vista_requerimiento_4b(this.Solucionar_requerimiento_4());
               this.requerimiento4gui = new Requerimiento4GUI(this.Solucionar_requerimiento_4(), this);
            } catch (Exception exception) {
               //TODO: handle exception
               System.err.println("Problemas consultando req4:"+ exception);
            }
           
            break;

         case "requerimiento5":
            //System.out.println("Requerimiento 5 en construccion!!!");
            try {
               //Vista.vista_requerimiento_5b(this.Solucionar_requerimiento_5());
               this.requerimiento5gui = new Requerimiento5GUI(this.Solucionar_requerimiento_5(), this);
            } catch (Exception exception) {
               //TODO: handle exception
               System.err.println("Problemas consultando req5:"+ exception);
            }
           
            break;
      }

   }

}