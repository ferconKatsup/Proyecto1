/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto.mapa;

import Magias.Magia;
import com.mycompany.primerproyecto.mapa.Casilla;
import com.mycompany.primerproyecto.mapa.Mapas;
import com.mycompany.primerproyecto.mapa.ciudad.Tienda;

/**
 *
 * @author fer
 */
public class InteraccionConElementos {

    void interactuar(Casilla casilla, Jugador jugador) {
        char elemento = casilla.getElemento();

        switch (elemento) {
            case Mapas.CIUDAD:
                System.out.println("Haz encontrado una ciudad, esta es la ciudad de Alexandria" + "\n ¡Inicia la batealla!" + "\n Debes derrotar a los caballeros para reconquistar esta ciudad ¡Usa tus mejores habilidades!" + "\n ¡Qué la mejor de las suertes te acompañe !");

                break;
            case Mapas.TIENDA:
                System.out.println("Te topaste con una tienda!");
                Tienda Tienda = new Tienda(jugador, jugador);
                Tienda.mostrarMenu();
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
