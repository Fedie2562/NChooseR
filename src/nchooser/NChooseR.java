/*
 * Ferris D.
 * 24/10/2018
 *
 */

package nchooser;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        int chosen = Integer.parseInt(JOptionPane.showInputDialog("How many objects to choose ?"));
        int objects = Integer.parseInt(JOptionPane.showInputDialog("How many objects are there to choose from ?"));
        long answer = factorial(objects)/(factorial(chosen)*factorial(objects - chosen));
        JOptionPane.showMessageDialog(null,"There are "+answer+" ways to choose "+chosen+" from a set of "+objects+" objects.");
    }
    public static long factorial(int n){
        //Factorial calculation
        if((n == 0) || (n == 1)){
            return 1;
        }else{
            return n* factorial(n - 1);
        }
    }
}