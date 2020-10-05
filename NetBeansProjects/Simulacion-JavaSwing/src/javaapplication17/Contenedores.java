/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import javax.swing.*;

/**
 *
 * @author DELL
 */
public class Contenedores {
    
    /**
     * Esta clase tendra la funcion de almacenar los valores 
     * de todos las cantidades necesarios para la elaboracion
     * de un hotdog
     */
    
    private String name;
    private int cantidad = 0;

    public Contenedores (String name) {
        this.name = name;
    }
   
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public String getName(){
        return name;
    }
}
