/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class Mapas {

    public static final char JUGADOR = 'J';
    public static final char CIUDAD = 'C';
    public static final char POSADA = 'P';
    public static final char TIENDA = 'T';
    public static final char ENEMIGO_BAJO = '-';
    public static final char ENEMIGO_ALTO = '+';
    public static final char VACIA = '*';

    public static void mapaHistoria() {

        //tamaño del mapa
        int filas = generarMapas();
        int columnas = filas;

        int[][] mapa = new int[filas][columnas];

        // Inicializar el mapa con elementos predeterminados y aleatorios
        inicializarMapa(mapa);

        //JUGADOR 
        Jugador jugador = new Jugador(0, 0);
        Scanner scanner = new Scanner(System.in);

        while (true) {

            mapa[jugador.getFila()][jugador.getColumna()] = JUGADOR;
            mostrarMapa(mapa);
            mapa[jugador.getFila()][jugador.getColumna()] = VACIA;

            
            
           
            System.out.println("Para moverse dentro del mapa use el sistema wsad donde:" + "\n w: para moverse arriba " + "\n s: para moverse abajo"+ "\n a: para moverse a la izquierda" + "\n d: para moverse a la derecha");
            char direccion = scanner.next().charAt(0);
             jugador.mover(mapa, direccion);
        }

       
    }//fin void
    //generar mapa de diferentes tamaños

    private static int generarMapas() {

        Random tamaño = new Random();

        int[] tamañosMapas = {7, 10, 12};

        return tamañosMapas[tamaño.nextInt(tamañosMapas.length)];

    } //fim gemerar mapas

    // iniciarmapa
    private static void inicializarMapa(int[][] mapa) {

        //para que aparezcan los elementos de manera aleatoria 
        Random elemento = new Random();

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {

                mapa[i][j] = VACIA;

            }
        }

        //COLOCAR TIENDA POSADA Y CIUDAD
        mostrarElementosAleatorios(mapa, TIENDA);

        mostrarElementosAleatorios(mapa, POSADA);

        //ENEMIGOS 
        mostrarEnemigosAleatorios(mapa, ENEMIGO_ALTO);
        mostrarEnemigosAleatorios(mapa, ENEMIGO_BAJO);

        //ColocarJugador
        //RECONQUISTA DE CIUDADES
        int ciudades = elemento.nextInt(3) + 3;
        for (int i = 0; i < ciudades; i++) {
            mostrarElementosAleatorios(mapa, CIUDAD);
        }

    }// finalizaMapa

//COLOCAR ELEMENTOS
    private static void mostrarElementosAleatorios(int[][] mapa, char elementoAleatorio) {
        Random random = new Random();
        int fila, columna;
        do {
            fila = random.nextInt(mapa.length);
            columna = random.nextInt(mapa[0].length);
        } while (mapa[fila][columna] != VACIA);

        mapa[fila][columna] = elementoAleatorio;
    }

    //COLOCAR ENEMIGOS 
    private static void mostrarEnemigosAleatorios(int[][] mapa, char elementoEnemigo) {
        Random enemigos = new Random();
        int enemigosEnMapa = enemigos.nextInt(7) + 1;
        for (int i = 0; i < enemigosEnMapa; i++) {

            mostrarElementosAleatorios(mapa, elementoEnemigo);
        }
    }

    //mostrar mapa
    private static void mostrarMapa(int[][] mapa) {

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                System.out.print((char) mapa[i][j] + " | ");
            }
            System.out.println();
        }

    }//fin mostrarMapa

}
