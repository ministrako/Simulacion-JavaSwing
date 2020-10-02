package javaapplication17;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MiBoton extends JButton implements ActionListener {

    public MiMonito monito;
    private String name;

    MiBoton(String texto) {
        this.name = texto;
    }

    void innit() {
        this.setText(name);
        System.out.println("Init");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getActionCommand() == "Detener") {
            
        }
        if (e.getActionCommand() == "Verificar") {
            this.name = "Iniciar";

        } else {
            System.out.println("Hey soy el Ancton Event del thread");
            Thread t = new Thread(monito, name);
            t.start();
        }

    }
    
}
