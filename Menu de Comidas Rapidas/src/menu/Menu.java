/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.JOptionPane;

/**
 *
 * @author J0S3 R1V3R4
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name_c, op;
        int cc, cod_p, menu, precio, cant, vcom, vuelt, vueltp;
        name_c = JOptionPane.showInputDialog("nombre del cliente");
        cc = Integer.parseInt(JOptionPane.showInputDialog("cedula del cliente"));
        op = JOptionPane.showInputDialog("seleccionar una opcion" + "\n"
                + "1.-hamburguesa\n"
                + "2.-perro caliente\n"
                + "3.-papas fritas\n"
                + "4.-gaseosa\n"
                + "5.-cerveza\n"
                + "6.-salir\n");
        cod_p = Integer.parseInt(op);
        switch (cod_p) {
            case 1: {
                cant = Integer.parseInt(JOptionPane.showInputDialog("cantidad a llevar"));
                precio = 6000;
                vcom = precio * cant;
                vuelt = Integer.parseInt(JOptionPane.showInputDialog("pago con :"));
                vueltp = vuelt - vcom;
                if (vuelt < vcom) {
                    JOptionPane.showMessageDialog(null, "dinero insuficiente");
                } else {
                    JOptionPane.showMessageDialog(null, name_c + "\n" + "cedula:" + cc + "\n" + "codigo del producto: " + cod_p + "\n" + "producto comprado: hamburguesa" + "\n" + "el precio total por su compra es de : $" + vcom + "\n" + "pago con: $" + vuelt + "\n" + "su vuelto es: $" + vueltp);
                }
                break;
            }
            case 2: {
                cant = Integer.parseInt(JOptionPane.showInputDialog("cantidad a llevar"));
                precio = 5000;
                vcom = precio * cant;
                vuelt = Integer.parseInt(JOptionPane.showInputDialog("pago con :"));
                vueltp = vuelt - vcom;
                if (vuelt < vcom) {
                    JOptionPane.showMessageDialog(null, "dinero insuficiente");
                } else {
                    JOptionPane.showMessageDialog(null, name_c + "\n" + "cedula:" + cc + "\n" + "codigo del producto: " + cod_p + "\n" + "producto comprado: perro caliente" + "\n" + "el precio total por su compra es de : $" + vcom + "\n" + "pago con: $" + vuelt + "\n" + "su vuelto es: $" + vueltp);
                }
                break;
            }
            case 3: {
                cant = Integer.parseInt(JOptionPane.showInputDialog("cantidad a llevar"));
                precio = 4000;
                vcom = precio * cant;
                vuelt = Integer.parseInt(JOptionPane.showInputDialog("pago con :"));
                vueltp = vuelt - vcom;
                if (vuelt < vcom) {
                    JOptionPane.showMessageDialog(null, "dinero insuficiente");
                } else {
                    JOptionPane.showMessageDialog(null, name_c + "\n" + "cedula:" + cc + "\n" + "codigo del producto: " + cod_p + "\n" + "producto comprado: papas fritas" + "\n" + "el precio total por su compra es de : $" + vcom + "\n" + "pago con: $" + vuelt + "\n" + "su vuelto es: $" + vueltp);
                }
                break;
            }
            case 4: {
                cant = Integer.parseInt(JOptionPane.showInputDialog("cantidad a llevar"));
                precio = 2000;
                vcom = precio * cant;
                vuelt = Integer.parseInt(JOptionPane.showInputDialog("pago con :"));
                vueltp = vuelt - vcom;
                if (vuelt < vcom) {
                    JOptionPane.showMessageDialog(null, "dinero insuficiente");
                } else {
                    JOptionPane.showMessageDialog(null, name_c + "\n" + "cedula:" + cc + "\n" + "codigo del producto:  " + cod_p + "\n" + "producto comprado: gaseosa" + "\n" + "el precio total por su compra es de : $" + vcom + "\n" + "pago con: $" + vuelt + "\n" + "su vuelto es: $" + vueltp);
                }
                break;
            }
            case 5: {
                cant = Integer.parseInt(JOptionPane.showInputDialog("cantidad a llevar"));
                precio = 4000;
                vcom = precio * cant;
                vuelt = Integer.parseInt(JOptionPane.showInputDialog("pago con :"));
                vueltp = vuelt - vcom;
                if (vuelt < vcom) {
                    JOptionPane.showMessageDialog(null, "dinero insuficiente");
                } else {
                    JOptionPane.showMessageDialog(null, name_c + "\n" + "cedula:" + cc + "\n" + "codigo del producto: " + cod_p + "\n" + "producto comprado: cerveza" + "\n" + "el precio total por su compra es de : $" + vcom + "\n" + "pago con: $" + vuelt + "\n" + "su vuelto es: $" + vueltp);
                    break;
                }
            
        
    

            
            }
               case 6:{
                 JOptionPane.showMessageDialog(null,"gracias por tu compra");
                break;    
            
            }
        }
    }
}
   
    

