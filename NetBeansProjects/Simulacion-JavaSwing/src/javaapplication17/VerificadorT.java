// Verificador para los tiempos (pueden ser dobles, pero mayores a 0).
package javaapplication17;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class VerificadorT extends InputVerifier {

    @Override
    public boolean verify(JComponent arg0) {
        String text = ((JTextField) arg0).getText();
        boolean isInt = false, isDouble = false;

        try {
            if (Double.parseDouble(text) > 0) {
              isDouble = true;
              arg0.setBackground(Color.green);
            }
            else {
              arg0.setBackground(Color.red);
              JOptionPane.showMessageDialog(null, text + " no es valido." );
              return false;
            }
        } catch (NumberFormatException a) {
            try {
                if (Integer.parseInt(text) > 0) {
                  arg0.setBackground(Color.green);
                  isInt = true;
                }
            } catch (NumberFormatException e) {
                arg0.setBackground(Color.red);
                JOptionPane.showMessageDialog(null, text + " no es valido." );
                return false;
            }
        }
        return true;
    }
}
