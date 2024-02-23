/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hilosvf;

import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author "el profe Ariel"
 */
public class hilo2 implements Runnable{
     
    
    public void run(){
        while(true){
            try {
                Calendar c=Calendar.getInstance();
                int hora=c.get(Calendar.HOUR);
                int minutos=c.get(Calendar.MINUTE);
                int segundos=c.get(Calendar.SECOND);
                //hh:mm:ss
                String tiempo=hora +":" + minutos + ":" + segundos ;                
                System.out.println(tiempo);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Se ha generado un error");
            }
        }                
    }
}


