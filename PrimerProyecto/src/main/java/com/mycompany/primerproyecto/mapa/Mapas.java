/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto.mapa;

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
    public static final char ENEMIGO_BAJO = 'B';
    public static final char ENEMIGO_ALTO = 'A';
    public static final char VACIA = 'O';

    public void mapaHistoria() {

        //tamaño del mapa
        int filas = generarMapas();
        int columnas = filas;

        Casilla[][] mapa = new Casilla[filas][columnas];

        // Inicializar el mapa con elementos predeterminados y aleatorios
        inicializarMapa(mapa);

        //JUGADOR 
        Jugador jugador = new Jugador(0, 0);
        Scanner scanner = new Scanner(System.in);
        InteraccionConElementos interaccion = new InteraccionConElementos();

        while (true) {

            // mostrar el jugador en el mapa??
            mostrarMapa(mapa, jugador);

            //direccion 
            System.out.println("Para moverse dentro del mapa use el sistema wsad donde:" + "\n w: para moverse arriba " + "\n s: para moverse abajo" + "\n a: para moverse a la izquierda" + "\n d: para moverse a la derecha");
            char direccion = scanner.next().charAt(0);  
            jugador.mover(mapa, direccion);

            // interacción
            int fila = jugador.getFila();
            int columna = jugador.getColumna();

            if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
                Casilla casilla = mapa[fila][columna];
                interaccion.interactuar(casilla, jugador);
            } else {
                System.out.println("¡Te saliste del mapa!");
            }

        }

    }//fin void

    //generar mapa de diferentes tamaños
    private int generarMapas() {

        Random tamaño = new Random();

        int[] tamañosMapas = {7, 10, 12};

        return tamañosMapas[tamaño.nextInt(tamañosMapas.length)];

    } //fim gemerar mapas

    // iniciarmapa
    private void inicializarMapa(Casilla[][] mapa) {

        //para que aparezcan los elementos de manera aleatoria 
        Random elemento = new Random();

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {

                mapa[i][j] = new Casilla();

            }
        }

        //COLOCAR TIENDA POSADA Y CIUDAD
        mostrarElementosAleatorios(mapa, TIENDA);
        mostrarElementosAleatorios(mapa, POSADA);
        //ENEMIGOS 
        mostrarEnemigosAleatorios(mapa, ENEMIGO_ALTO);
        mostrarEnemigosAleatorios(mapa, ENEMIGO_BAJO);

        //RECONQUISTA DE CIUDADES
        int ciudades = elemento.nextInt(3) + 3;
        for (int i = 0; i < ciudades; i++) {
            mostrarElementosAleatorios(mapa, CIUDAD);
        }

    }// finalizaMapa

//COLOCAR ELEMENTOS
    private void mostrarElementosAleatorios(Casilla[][] mapa, char elementoAleatorio) {
        Random random = new Random();
        int fila, columna;
        do {
            fila = random.nextInt(mapa.length);
            columna = random.nextInt(mapa[0].length);
        } while (!mapa[fila][columna].estaCasillaEstaVacia());

        mapa[fila][columna].setElemento(elementoAleatorio);
    }

    //COLOCAR ENEMIGOS 
    private void mostrarEnemigosAleatorios(Casilla[][] mapa, char elementoEnemigo) {
        Random enemigos = new Random();
        int enemigosEnMapa = enemigos.nextInt(7) + 1;
        for (int i = 0; i < enemigosEnMapa; i++) {

            mostrarElementosAleatorios(mapa, elementoEnemigo);
        }
    }

    //mostrar mapa
    private void mostrarMapa(Casilla[][] mapa, Jugador jugador) {

        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {

                if (jugador.getFila() == i && jugador.getColumna() == j) {
                    System.out.print(JUGADOR + " ");
                } else {
                    System.out.print(mapa[i][j].getElemento() + " ");
                }

            }
            System.out.println();
        }

    }//fin mostrarMapa

}
