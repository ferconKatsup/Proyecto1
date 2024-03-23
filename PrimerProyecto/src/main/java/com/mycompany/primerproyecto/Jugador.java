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
    
 void mover(int[][] mapa, char ubicacion) {
        
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
                
                return;
      
        
        }    
        
         // ver si no se sale del mapa :P primero dios funciona 
                
                if (filaNueva >= 0 && filaNueva < mapa.length && columnaNueva >= 0 && columnaNueva < mapa[0].length ) {
                  
                    this.fila = filaNueva;
                    this.columna = columnaNueva;
                    
                } else {
                    
                    System.out.println("no puedes moverte fuera del mapa");
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

    private static void mostrarPosicionActual(char [][]mapa){
        
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.println(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }
  
    
}//finclase
