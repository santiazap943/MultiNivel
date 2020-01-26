/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package granja;
import java.sql.Connection;
import modelo.ConexionBD;
import vista.LogIn;



public class Control {
public static ConexionBD con=new ConexionBD();
public static Connection cn= con.conect();
    public static void main(String[] args) {
     LogIn winl=new LogIn();
     winl.setVisible(true);
    }
    
}
