/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto;

/**
 *
 * @author fer
 */
public class Jugador {
    
    private int fila;
    private int columna; 
    
    //posicionInicial
    public Jugador(int filaI, int columnaI){
        this.fila = filaI;
        this.columna = columnaI;
    }
    
    public void mover(char[][] mapa, char ubicacion) {
        
        int filaNueva = fila;
        int columnaNueva = columna;
        
        switch (ubicacion) {
            case 'w': filaNueva--;    
                break;
            case 's': filaNueva++;    
                break;
            case 'a': columnaNueva--;    
                break;
            case 'd': columnaNueva++;    
                break;
            default:
                System.out.println("Use solo w: para moverse arriba " + "\n s: para moverse abajo"+ "\n a: para moverse a la izquierda" + "\n d: para moverse a la derecha");
        }    
    
}
    
      public  String obtenerPosicion(){
            return " fila "+fila + " columna "+columna;
        }
        
        public int getFila(){
            
        return fila;
            
        }
         
        public int getColumna(){
            
        return columna;
            
        }

    void mover(int[][] mapa, char direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
    
}//finclase
