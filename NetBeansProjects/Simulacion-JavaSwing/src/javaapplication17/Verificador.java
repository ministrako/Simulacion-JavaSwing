package javaapplication17;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class Verificador extends InputVerifier {

    @Override
    public boolean verify(JComponent arg0) {
        String text = ((JTextField) arg0).getText();
        boolean isInt = false, isDouble = false;

        try {
            Double.parseDouble(text);
            isDouble = true;
            arg0.setBackground(Color.green);
        } catch (NumberFormatException a) {
            try {
                Integer.parseInt(text);
                isInt = true;
                arg0.setBackground(Color.green);
            } catch (NumberFormatException e) {
                System.out.println(text + " is neither an int or a double");
                arg0.setBackground(Color.red);
                return false;
            }
        }

        return true;

    }
}
