package package1;

import javax.swing.*;

public class AltersAbfrage {

    public static void main (String[]args){

        String name = JOptionPane.showInputDialog("geben Sie ihren Namen ein");
        int alter = Integer.parseInt(JOptionPane.showInputDialog("und nun ihr Alter"));

        if (alter>=18){
            JOptionPane.showMessageDialog(null,"Gratulation Sie sind Volljährig");

        }
        else {
            JOptionPane.showMessageDialog(null,"Sie sind noch nicht Volljährig");
        }
    }
}
