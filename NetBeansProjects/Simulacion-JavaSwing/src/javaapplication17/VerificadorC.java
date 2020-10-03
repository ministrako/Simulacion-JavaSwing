// Verificador para cantidades (deben de ser enteras y mayores que 0)
package javaapplication17;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class VerificadorC extends InputVerifier {

    @Override
    public boolean verify(JComponent arg0) {
        String text = ((JTextField) arg0).getText();
        boolean isInt = false;

        try {
            if (Integer.parseInt(text) > 0) {
              isInt = true;
              arg0.setBackground(Color.green);
            } else {
              arg0.setBackground(Color.red);
              JOptionPane.showMessageDialog(null,text + " no es entero o mayor que 0." );
              return false;
            }
        } catch (NumberFormatException a) {
          arg0.setBackground(Color.red);
          JOptionPane.showMessageDialog(null, text + " no es entero o mayor que 0." );
          return false;
        }
        return true;
    }
}
