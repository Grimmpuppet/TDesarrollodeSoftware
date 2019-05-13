/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matricula.y.mensualidad;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class MatriculaYMensualidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name, jornada;
        int vmen, vmat, vt, yold;
        vmat = 250000;
        name = JOptionPane.showInputDialog("nombre del estudiante");
        yold = Integer.parseInt(JOptionPane.showInputDialog("digite la edad del estudiante: " + name));
        jornada = JOptionPane.showInputDialog("digite la jornada a matricularse(mañana,tarde o nocturna)");
        switch (jornada) {
            case "mañana ":
                vmen = 350000;
                vt = vmen + vmat;
                JOptionPane.showMessageDialog(null, "nombre del estudiante: " + name + "\n" + "edad: " + yold + "\n" + "valor de la matricula: " + vmat + "\n" + "valor de la mensualidad: " + "\n" + "valor total de la inscripcion: " + vt);
                break;
            case "tarde":
                vmen = 250000;
                vt = vmen + vmat;
                JOptionPane.showMessageDialog(null, "nombre del estudiante: " + name + "\n" + "edad: " + yold + "\n" + "valor de la matricula: " + vmat + "\n" + "valor de la mensualidad: " + "\n" + "valor total de la inscripcion: " + vt);
                break;
            case "nocturna":
                vmen = 150000;
                vt = vmen + vmat;
                JOptionPane.showMessageDialog(null, "nombre del estudiante: " + name + "\n" + "edad: " + yold + "\n" + "valor de la matricula: " + vmat + "\n" + "valor de la mensualidad: " + "\n" + "valor total de la inscripcion: " + vt);
                break;
            case "am":
                vmen = 350000;
                vt = vmen + vmat;
                JOptionPane.showMessageDialog(null, "nombre del estudiante: " + name + "\n" + "edad: " + yold + "\n" + "valor de la matricula: " + vmat + "\n" + "valor de la mensualidad: " + "\n" + "valor total de la inscripcion: " + vt);
                break;
            case "pm":
                vmen = 250000;
                vt = vmen + vmat;
                JOptionPane.showMessageDialog(null, "nombre del estudiante: " + name + "\n" + "edad: " + yold + "\n" + "valor de la matricula: " + vmat + "\n" + "valor de la mensualidad: " + "\n" + "valor total de la inscripcion: " + vt);
                break;
            case "pmplus":
                vmen = 150000;
                vt = vmen + vmat;
                JOptionPane.showMessageDialog(null, "nombre del estudiante: " + name + "\n" + "edad: " + yold + "\n" + "valor de la matricula: " + vmat + "\n" + "valor de la mensualidad: " + "\n" + "valor total de la inscripcion: " + vt);
                break;

        }
    }

}
