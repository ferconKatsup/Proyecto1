/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto.mapa;

import com.mycompany.primerproyecto.mapa.Jugador;
import com.mycompany.primerproyecto.mapa.Casilla;
import com.mycompany.primerproyecto.mapa.Mapas;

/**
 *
 * @author fer
 */
public class InteraccionConElementos {
    
    void interactuar(Casilla casilla, Jugador jugador){
        char elemento = casilla.getElemento();
        
        switch (elemento) {
            case Mapas.CIUDAD:
                System.out.println("Te topaste con una ciudad!");
               
                break;
            case Mapas.TIENDA:
                System.out.println("Te topaste con una tienda!");
                
                break;
            case Mapas.POSADA:
                System.out.println("Te topaste con una posada!");
                
                break;
            case Mapas.ENEMIGO_ALTO:
                System.out.println("Te topaste con un enemigo mayor!");
                
                break;
            case Mapas.ENEMIGO_BAJO:
                System.out.println("Te topaste con un enemigo neutro!");
                
                break;
               
        }
        
        
        
    }//FININTERACTUAR

    
} //FINCLASE