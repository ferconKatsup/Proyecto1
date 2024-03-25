/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto.mapa;

import Estadisticas.Estadisticas;
import com.mycompany.primerproyecto.mapa.Casilla;
import com.mycompany.primerproyecto.mapa.Casilla;
import com.mycompany.primerproyecto.mapa.Casilla;
import com.mycompany.primerproyecto.mapa.InteraccionConElementos;
import com.mycompany.primerproyecto.mapa.InteraccionConElementos;
import java.util.Random;

/**
 *
 * @author fer
 */
public class Jugador {

    private int fila;
    private int columna;

    //posicionInicial
    public Jugador(int filaI, int columnaI) {
        this.fila = filaI;
        this.columna = columnaI;
    }

    void mover(Casilla[][] mapa, char ubicacion) {

        int filaNueva = fila;
        int columnaNueva = columna;

        switch (ubicacion) {
            case 'w':
                filaNueva--;
                break;
            case 's':
                filaNueva++;
                break;
            case 'a':
                columnaNueva--;
                break;
            case 'd':
                columnaNueva++;
                break;
            default:
                System.out.println("Use solo w: para moverse arriba " + "\n s: para moverse abajo" + "\n a: para moverse a la izquierda" + "\n d: para moverse a la derecha");
        }

        // ver si no se sale del mapa :P primero dios funciona 
        if (filaNueva >= 0 && filaNueva < mapa.length && columnaNueva >= 00 && columnaNueva < mapa[0].length) {

            if (mapa[filaNueva][columnaNueva].estaCasillaEstaVacia()) {
                fila = filaNueva;
                columna = columnaNueva;
            } else {
                InteraccionConElementos interaccion = new InteraccionConElementos();
                interaccion.interactuar(mapa[filaNueva][columnaNueva], this);
            }

        } else {
            System.out.println("no puedes moverte por aqui ");
        }

    }// finMover

    public int getFila() {

        return fila;

    }

    public int getColumna() {

        return columna;

    }

    private static void mostrarPosicionActual(char[][] mapa) {

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.println(mapa[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int nivel;
    private Estadisticas estadisticas;

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public int atacar() {

        
        // para calcular el daño segun la fuerza del jugador usuario
        int dañoInfligido = estadisticas.getFuerza();
        
        dañoInfligido += (int)(Math.random() * 10);
        
      
        return dañoInfligido;

    }

    public void recibirDaño(int dañoRecibido) {
       
        //reducir los puntos de vida
        estadisticas.setPuntosDeVida(estadisticas.getPuntosDeVida() - dañoRecibido);
        
        // si es derrotado 
        
        if (estadisticas.getPuntosDeVida() <= 0){
            System.out.println("fuiste derrotado");
        }
    }

}//finclase
