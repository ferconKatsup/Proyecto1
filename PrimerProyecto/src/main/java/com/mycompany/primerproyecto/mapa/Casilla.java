/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto.mapa;

import com.mycompany.primerproyecto.mapa.Mapas;

/**
 *
 * @author fer
 */
public class Casilla {
    private char elemento; 
    
    public Casilla(){
        
        // CASILLA VACÍA
        this.elemento = Mapas.VACIA;
    }
  
     //devolver el elemento
  
      public char getElemento(){
        return elemento;
        
    }
    
    public void setElemento(char elemento){
        
        //COLOCAR ELEMENTOS EN CASILLA 
        this.elemento = elemento;
    }
    
    
   
    
    //VER SI HAY CASILLA VACÍA 
   
  

    boolean estaCasillaEstaVacia() {
      
         return elemento == Mapas.VACIA;
    }

   
    
   
    
}//FIN CLASE
