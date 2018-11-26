package package2;

import javax.swing.*;
import java.util.Random;

public class ZahlenRaten {
    public static void main (String []args){

        Random random = new Random();
        int min = 1,max = 10;
        int zufallsZahl = random.nextInt(max-min)+min;//Generierung Zufallszahl zwischen 1-10




        for (int i=1; i<4; i++) {

            int benutzerZahl = Integer.parseInt(JOptionPane.showInputDialog("geben Sie eine Zahl von eins bis zehn ein"));


            if (zufallsZahl == benutzerZahl) {
                JOptionPane.showMessageDialog(null,"Gratulation");
                i=4;


            } else {
                if (zufallsZahl == benutzerZahl + 2 ) {
                    JOptionPane.showMessageDialog(null,"sehr knapp dran +2");
                }
                else if(zufallsZahl==benutzerZahl -2) {
                    JOptionPane.showMessageDialog(null,"sehr knapp -2");
                }


                if (zufallsZahl % 2 == 0) {
                    JOptionPane.showMessageDialog(null,"Zahl ist gerade");
                } else {
                    JOptionPane.showMessageDialog(null,"Zahl ist nicht gerade");
                }

                JOptionPane.showMessageDialog(null,"versuch es nochmal");


            }



        }
    }
}
