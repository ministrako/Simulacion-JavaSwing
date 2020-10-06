package javaapplication17;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MiBoton extends JButton implements ActionListener {

    public MiMonito monito;
    private String name;
    JTextField[] txtIngredientes;
    
    MiBoton(String texto) {
        this.name = texto;
    }

    void innit() {
        this.setText(name);
        System.out.println("Init");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().toString() == "Detener") {

        }
        if (e.getSource().toString() == "Comenzar") {
            this.name = "Iniciar";

        } else {
            System.out.println("Hey soy el Ancton Event del thread");
            // Solo validamos que haya ingredientes disponibles
            if(verificarCantidades()) {     
                Thread t = new Thread(monito, name);
                t.start();
            } else {
                JOptionPane.showMessageDialog(null, "Verifique la cantidad de ingredientes porfavor");
            }
       
        }

    }
    
    private boolean verificarCantidades() {
        JTextField inputCebolla = txtIngredientes[0];
        JTextField inputTomate = txtIngredientes[1];
        JTextField inputLechuga = txtIngredientes[2];
        JTextField inputMayonesa = txtIngredientes[3];
        JTextField inputCondimentos = txtIngredientes[4];
        JTextField inputTocino = txtIngredientes[5];
        JTextField inputPan = txtIngredientes[6];
        JTextField inputSalchicha = txtIngredientes[7];
        JTextField inputHotDogs = txtIngredientes[8];
        
        // Cantidades
        int cebolla = Integer.parseInt(inputCebolla.getText());
        int tomate = Integer.parseInt(inputTomate.getText());
        int lechuga = Integer.parseInt(inputLechuga.getText());
        int mayonesa = Integer.parseInt(inputMayonesa.getText());
        int condimentos = Integer.parseInt(inputCondimentos.getText());
        int tocino = Integer.parseInt(inputTocino.getText());
        int pan = Integer.parseInt(inputPan.getText());
        int salchicha = Integer.parseInt(inputSalchicha.getText());
        int hotdogs = Integer.parseInt(inputHotDogs.getText());
        
        if (cebolla >= 1 && tomate >= 1 && lechuga >= 1 && mayonesa >= 1 && condimentos >= 1 && tocino >= 1 && pan >= 1 && salchicha >= 1 ) {
            return true;
        } else {
            return false;
        }
    }

}
