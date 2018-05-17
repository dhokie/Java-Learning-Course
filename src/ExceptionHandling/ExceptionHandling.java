package ExceptionHandling;

import javax.swing.*;

/**
 * Created by TSI on 5/17/2018.
 */
public class ExceptionHandling {

    public static void main(String args[]) {

        JFrame frame = new JFrame();
        int d = 0;
        int n = 20;
        try {
            int fraction = n / d;
//            int fraction = d / n;
            JOptionPane.showMessageDialog(  frame, "Successful",
                    "SUCCESS MESSAGE", JOptionPane.DEFAULT_OPTION);
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(  frame, "In the catch Block due to Exception = " + e,
                    "INFORMATION MESSAGE", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(  frame, "End Of Main" ,
                    "CANCEL", JOptionPane.OK_CANCEL_OPTION);
        }
    }
}
