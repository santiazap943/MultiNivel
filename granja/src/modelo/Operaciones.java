/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.*;
import javax.swing.JButton;
import vista.Registro;

public class Operaciones {


    public void disabledBtn(JButton btn) {
        btn.setBorder(null);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
    }

    public boolean fecha(String fecha){
        boolean x=false;
        if(fecha.matches("[12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])"))
            x=true;
        return x;
    }
    public boolean correo(String correo){
        boolean x=false;
        if(correo.matches(correo))
    }
}


