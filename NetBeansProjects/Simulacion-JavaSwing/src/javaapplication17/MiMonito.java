package javaapplication17;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiMonito extends JLabel implements Runnable {

    private String name, url;
    private ImageIcon imagenIcon;
    JTextField[] txtIngredientes, txtTiempos;

    public MiMonito(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public void innit() {
        URL resource = this.getClass().getResource(url);
        if (resource != null) {
            imagenIcon = new ImageIcon(new ImageIcon(resource).getImage().getScaledInstance(40, 40, Image.SCALE_FAST));
            this.setIcon(imagenIcon);
        } else {
            System.out.println("URL vacia");
        }

    }

    @Override
    public void run() {
         
        chambaAnimacion();
        /* Metodo para mostrar totales de tiempos y 
        *cantidades de ingredientes sobrantes y hotdogs totales */
    }

    // Todo el rollo de la animacion
    private void chambaAnimacion() {
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

        // Contenedores de cantidades
        Contenedores cCebolla = new Contenedores("Contenedor Cebolla");
        cCebolla.setCantidad(cebolla);
        Contenedores cTomate = new Contenedores("Contenedor Tomate");
        cTomate.setCantidad(tomate);
        Contenedores cLechuga = new Contenedores("Contenedor Lechuga");
        cLechuga.setCantidad(lechuga);
        Contenedores cMayonesa = new Contenedores("Contenedor Mayonesa");
        cMayonesa.setCantidad(mayonesa);
        Contenedores cCondimentos = new Contenedores("Contenedor Condimentos");
        cCondimentos.setCantidad(condimentos);
        Contenedores cTocino = new Contenedores("Contenedor Tocino");
        cTocino.setCantidad(tocino);
        Contenedores cPan = new Contenedores("Contenedor Pan");
        cPan.setCantidad(pan);
        Contenedores cSalchicha = new Contenedores("Contenedor Salchicha");
        cSalchicha.setCantidad(salchicha);
        Contenedores cHotDogs = new Contenedores("Contenedor HotDogs");
        cHotDogs.setCantidad(hotdogs);

        int ciclos = hotdogs;
        int x = 85;
        // Tiempos de tareas
        int tPicarTomate = (int) Double.parseDouble(txtTiempos[0].getText()) * 1000;
        int tPicarCabolla = (int) Double.parseDouble(txtTiempos[1].getText()) * 1000;
        int tPicarLechuga = (int) Double.parseDouble(txtTiempos[2].getText()) * 1000;
        int tAplicarTomate = (int) Double.parseDouble(txtTiempos[3].getText()) * 1000;
        int tAplicarCebolla = (int) Double.parseDouble(txtTiempos[4].getText()) * 1000;
        int tAplicarLechuga = (int) Double.parseDouble(txtTiempos[5].getText()) * 1000;
        int tAplicarMayonesa = (int) Double.parseDouble(txtTiempos[6].getText()) * 1000;
        int tAplicarCondimentos = (int) Double.parseDouble(txtTiempos[7].getText()) * 1000;
        int tAplicarTocino = (int) Double.parseDouble(txtTiempos[8].getText()) * 1000;
        int tPrepararPan = (int) Double.parseDouble(txtTiempos[9].getText()) * 1000;
        int tAplicarPan = (int) Double.parseDouble(txtTiempos[10].getText()) * 1000;
        int tPrepararSalchicha = (int) Double.parseDouble(txtTiempos[11].getText()) * 1000;     
        int tAplicarSalchicha = (int) Double.parseDouble(txtTiempos[12].getText()) * 1000;

        for (int i = 1; i <= ciclos; i++) {
            if (cebolla >= 1 && tomate >= 1 && lechuga >= 1 && mayonesa >= 1 && condimentos >= 1 && tocino >= 1 && pan >= 1 && salchicha >= 1 &&
                tPicarTomate > 0 && tPicarCabolla > 0 && tPicarLechuga > 0 && tAplicarTomate > 0 && tAplicarCebolla > 0 && tAplicarLechuga > 0 && tAplicarMayonesa > 0 &&
                tAplicarCondimentos > 0 && tAplicarTocino > 0 && tPrepararPan > 0 && tAplicarPan > 0 && tPrepararSalchicha > 0 && tAplicarSalchicha > 0) {
                System.out.println("Estas dentro de la simulacion");
                
                cPan.setCantidad(cPan.getCantidad() - 1);
                // Tiempos del pan
                try { Thread.sleep(tPrepararPan); } catch (Exception e) { }
                try { Thread.sleep(tAplicarPan); } catch (Exception e) { }
                inputPan.setText("" + cPan.getCantidad());
                x += 60;
                this.setBounds(x, 40, 80, 40);
                
                cMayonesa.setCantidad(cMayonesa.getCantidad() - 1);
                try { Thread.sleep(tAplicarMayonesa); } catch (Exception e) {}
                inputMayonesa.setText("" + cMayonesa.getCantidad());
                x += 60;
                this.setBounds(x, 40, 80, 40);
               
                cTocino.setCantidad(cTocino.getCantidad() - 1);
                try { Thread.sleep(tAplicarTocino); } catch (Exception e) { }
                inputTocino.setText("" + cTocino.getCantidad());
                x += 60;
                this.setBounds(x, 40, 80, 40);
                
                cSalchicha.setCantidad(cSalchicha.getCantidad() - 1);
                // Tiempos de la salchicha
                try { Thread.sleep(tPrepararSalchicha); } catch (Exception e) { }
                try { Thread.sleep(tAplicarSalchicha); } catch (Exception e) { }
                inputSalchicha.setText("" + cSalchicha.getCantidad());
                x += 60;
                this.setBounds(x, 40, 80, 40);
                
                cCebolla.setCantidad(cCebolla.getCantidad() - 1);
                // Tiempos de cebolla
                try { Thread.sleep(tPicarCabolla); } catch (Exception e) { }
                try { Thread.sleep(tAplicarCebolla); } catch (Exception e) { }
                inputCebolla.setText("" + cCebolla.getCantidad());
                x += 60;
                this.setBounds(x, 40, 80, 40);
                
                cTomate.setCantidad(cTomate.getCantidad() - 1);
                try { Thread.sleep(tPicarTomate); } catch (Exception e) { }
                try { Thread.sleep(tAplicarTomate); } catch (Exception e) { }
                inputTomate.setText("" + cTomate.getCantidad());
                x += 60;
                this.setBounds(x, 40, 80, 40);
                
                cLechuga.setCantidad(cLechuga.getCantidad() - 1);
                // Tiempos de la lechuga
                try { Thread.sleep(tPicarLechuga); } catch (Exception e) { }
                try { Thread.sleep(tAplicarLechuga); } catch (Exception e) { }
                inputLechuga.setText("" + cLechuga.getCantidad());
                x += 60;
                this.setBounds(x, 40, 80, 40); 
                
                cCondimentos.setCantidad(cCondimentos.getCantidad() - 1);
                try { Thread.sleep(tAplicarCondimentos); } catch (Exception e) { }
                inputCondimentos.setText("" + cCondimentos.getCantidad());
                this.setBounds(85, 40, 80, 40);
                             
                cHotDogs.setCantidad(cHotDogs.getCantidad() - 1);
                inputHotDogs.setText("" + cHotDogs.getCantidad());

            } else {
                System.out.println("Los tiempos o los ingredientes son cero");
            }
        }
    }
    
    
    

}
