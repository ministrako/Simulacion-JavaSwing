/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

/**
 *
 * @author DELL
 */
public class Tiempos {
    
   /**
     * Esta clase tendra la funcion de almacenar los valores 
     * de todos las tiempos necesarios para la elaboracion
     * de un hotdog
     */
    
    private String name;
    private int time = 0;

    public Tiempos (String name) {
        this.name = name;
    }
   
    public void setTiempo(int time) {
        this.time = time;
    }

    public int getTiempo() {
        return time;
    }
    
    public String getName(){
        return name;
    }
}
