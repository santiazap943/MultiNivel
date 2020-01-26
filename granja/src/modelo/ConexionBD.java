/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author SANTY
 */
public class ConexionBD {
    Connection conexion;
    public Connection conect(){
    try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion= DriverManager.getConnection("jdbc:mysql://localhost/granja","root","123456");
            System.out.println("coneccion exitosa");
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }return conexion;
}
    Statement createstatement(){
        throw new UnsupportedOperationException("no soportado");
    }
}