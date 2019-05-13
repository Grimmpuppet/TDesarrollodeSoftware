/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package año.bisiesto;

import javax.swing.JOptionPane;

/**
 *
 * @author E303
 */
public class AñoBisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("digite año"));
        if(a%4==0 && a%100!=0 || a%400==0){
        JOptionPane.showMessageDialog(null,a+" es un año bisiesto");
    }else{
            JOptionPane.showMessageDialog(null,a+"  no es un año bisiesto");
            }
    }
    
}
