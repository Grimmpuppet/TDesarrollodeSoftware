/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.e01;

import javax.swing.JOptionPane;

/**
 *
 * @author E303
 */
public class TallerE01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double distant, speed, tiempo_t;
        
        distant = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la distancia entre las dos ciudades (km): "));
        speed = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la velocidad constante (km/h): "));
        tiempo_t = distant/speed;
        
        JOptionPane.showMessageDialog(null, "El tiempo a tardar es: " +tiempo_t+ " hora(s)");
        }
    }
