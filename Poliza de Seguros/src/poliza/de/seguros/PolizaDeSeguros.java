/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poliza.de.seguros;

import javax.swing.JOptionPane;

/**
 *
 * @author J0S3 R1V3R4
 */
public class PolizaDeSeguros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String plan = "";
        do {
            plan = JOptionPane.showInputDialog("Codigo" + "\n" + "    01          Plan A \n    02          Plan B" + "\n" + "Digite el codigo del plan.");
        } while (!plan.equals("01") && !plan.equals("02"));
        double vp, total = 0;
        boolean v = true;
        boolean s = true;
        double[] retraso = new double[5];

        switch (plan) {
            case "01":// Plan cobertura amplia 
                vp = 1200;
                do {
                    String x = (JOptionPane.showInputDialog("Codigo\n" + "    01          " + "Habito de beber alcohol\n" + "    02          " + "Utiliza lentes\n" + "    03          " + "Enfermedad\n" + "    04          " + "Mayor de 40 aÃ±os\n" + "    05          " + "Salir\n" + "Digite el codigo de los campos que cumple."));
                    switch (x) {
                        case "01":
                            retraso[0] = vp * 0.1;
                            JOptionPane.showMessageDialog(null, "01 Seleccionado");
                            break;
                        case "02":
                            retraso[1] = vp * 0.05;
                            JOptionPane.showMessageDialog(null, "02 Seleccionado");
                            break;
                        case "03":
                            retraso[2] = vp * 0.05;
                            JOptionPane.showMessageDialog(null, "03 Seleccionado");
                            break;
                        case "04":
                            retraso[3] = vp * 0.2;
                            JOptionPane.showMessageDialog(null, "04 Seleccionado");
                            v = false;
                            break;
                        case "05":
                            s = false;
                            JOptionPane.showMessageDialog(null, "05 Seleccionado");
                            break;
                    }
                    if (v == true) {
                        retraso[4] = vp * 0.1;
                    }
                } while (s == true);
                for (int i = 0; i < 4; i++) {
                    total += retraso[i];
                }
                total = total + vp;
                break;

            case "02":// Plan daños a terceros 
                vp = 950;
                do {
                    String j = (JOptionPane.showInputDialog("Codigo\n" + "    01          " + "Habito de beber alcohol\n" + "    02          " + "Utiliza lentes\n" + "    03          " + "Enfermedad\n" + "    04          " + "Mayor de 40 aÃ±os\n" + "    05          " + "Salir\n" + "Digite el codigo de los campos que cumple."));
                    switch (j) {
                        case "01":
                            retraso[0] = vp * 0.1;
                            JOptionPane.showMessageDialog(null, "01 Seleccionado");
                            break;
                        case "02":
                            retraso[1] = vp * 0.05;
                            JOptionPane.showMessageDialog(null, "02 Seleccionado");
                            break;
                        case "03":
                            retraso[2] = vp * 0.05;
                            JOptionPane.showMessageDialog(null, "03 Seleccionado");
                            break;
                        case "04":
                            retraso[3] = vp * 0.2;
                            JOptionPane.showMessageDialog(null, "04 Seleccionado");
                            v = false;
                            break;
                        case "05":
                            s = false;
                            JOptionPane.showMessageDialog(null, "05 Seleccionado");
                            break;
                    }
                    if (v == true) {
                        retraso[4] = vp * 0.1;
                    }
                } while (s == true);
                for (int i = 0; i < 4; i++) {
                    total = total + retraso[i];
                }
                total = total + vp;
                break;
        }

        JOptionPane.showMessageDialog(null, "Su total tiene valor de: " + total);

    }
}
    
