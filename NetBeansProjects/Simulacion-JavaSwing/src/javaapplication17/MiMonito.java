package javaapplication17;

import java.awt.Image;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MiMonito extends JLabel implements Runnable {

    private String name, url;
    private ImageIcon imagenIcon;
    ArrayList<Contenedores> contenedoresCantidadesIngredientes;
    ArrayList<Tiempos> contenedoresTiemposTareas;
 
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
    }
    
    // Todo el rollo de la animacion
    private void chambaAnimacion() {
        // Cantidades de ingredientes
        int cantidadCebolla = contenedoresCantidadesIngredientes.get(0).getCantidad();
        int cantidadTomate = contenedoresCantidadesIngredientes.get(1).getCantidad();
        int cantidadLechuga = contenedoresCantidadesIngredientes.get(2).getCantidad();
        int cantidadMayonesa = contenedoresCantidadesIngredientes.get(3).getCantidad();
        int cantidadCondimentos = contenedoresCantidadesIngredientes.get(4).getCantidad();
        int cantidadTocino = contenedoresCantidadesIngredientes.get(5).getCantidad();
        int cantidadPan = contenedoresCantidadesIngredientes.get(6).getCantidad();
        int cantidadSalchicha = contenedoresCantidadesIngredientes.get(7).getCantidad();
        int ciclos = contenedoresCantidadesIngredientes.get(8).getCantidad(); // Cantidad de dogos
        
        // Cantidades de tiempos
        int tiempoPicarTomate = contenedoresTiemposTareas.get(0).getTiempo();
        int tiempoPicarCebolla = contenedoresTiemposTareas.get(1).getTiempo();
        int tiempoPicarLechuga = contenedoresTiemposTareas.get(2).getTiempo();
        int tiempoAplicarTomate = contenedoresTiemposTareas.get(3).getTiempo();
        int tiempoAplicarCebolla = contenedoresTiemposTareas.get(4).getTiempo();
        int tiempoAplicarLechuga = contenedoresTiemposTareas.get(5).getTiempo();
        int tiempoAplicarMayonesa = contenedoresTiemposTareas.get(6).getTiempo();
        int tiempoAplicarCondimentos = contenedoresTiemposTareas.get(7).getTiempo();
        int tiempoAplicarTocino = contenedoresTiemposTareas.get(8).getTiempo();
        int tiempoPrepararPan = contenedoresTiemposTareas.get(9).getTiempo();
        int tiempoAplicarPan = contenedoresTiemposTareas.get(10).getTiempo();
        int tiempoPrepararSalchicha = contenedoresTiemposTareas.get(11).getTiempo();
        int tiempoAplicarSalchicha = contenedoresTiemposTareas.get(12).getTiempo();
        
        
        for (int x = 1; x <= ciclos; x++) {
           
            /* Aqui hacemos la validacion en cada iteracion de que existan los valores
            *  valores necesarios para un solo hotdog
            */
            
            if(cantidadCebolla >= 1 && cantidadTomate >= 1 && cantidadLechuga >= 1 && cantidadMayonesa >= 1 && cantidadCondimentos >= 1 && cantidadTocino >= 1 && cantidadPan >= 1 && cantidadSalchicha >= 1
               && tiempoPicarTomate > 0 && tiempoPicarCebolla > 0 && tiempoPicarLechuga > 0 && tiempoAplicarTomate > 0 && tiempoAplicarCebolla > 0 && tiempoAplicarLechuga > 0 && tiempoAplicarMayonesa > 0
               && tiempoAplicarCondimentos > 0 && tiempoAplicarTocino > 0 && tiempoPrepararPan > 0 && tiempoAplicarPan > 0 && tiempoPrepararSalchicha > 0 && tiempoAplicarSalchicha > 0) {
                System.out.println("Estas dentro de la simulacion");
         
                
                /* AQUI SE HARA LA LOGICA DE SIMULACION PARA PERSONA */
                
                
                
            } else {
                System.out.println("Falta algun ingrediente o los tiempos son cero");
            }
        }
    }

       
}
