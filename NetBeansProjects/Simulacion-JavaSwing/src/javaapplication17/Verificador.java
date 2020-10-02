package javaapplication17;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;

public class Verificador extends InputVerifier{

    @Override
    public boolean verify(JComponent arg0) {
        String text = ((JTextField) arg0).getText();
            if (text.matches("[0-9]*") && Integer.parseInt(text) > 0) {
                System.out.println("match");
                arg0.setBackground(Color.green);
            } else {
                arg0.setBackground(Color.red);
                System.out.println("not match");
                return false;
            }
        return true;
    }
}
