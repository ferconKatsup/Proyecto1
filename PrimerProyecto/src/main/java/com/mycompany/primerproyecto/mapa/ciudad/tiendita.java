/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto.mapa.ciudad;

import Magias.Magia;
import com.mycompany.primerproyecto.mapa.Jugador;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class tiendita {

    private Jugador jugador;
    private Magia[] magiasDisponibles;

    public tiendita(Jugador jugador, Jugador magias) {
        this.jugador = jugador;
        this.magiasDisponibles = magiasDisponibles;

    }

    public void mostrarMenu() {
        Scanner opcion = new Scanner(System.in);
        int opcionMenu;

        while (true) {
            System.out.println("1. Comprar magia");
            System.out.println("2. Comprar arma");
            System.out.println("3. Comprar objeto");
            System.out.println("4. Comprar trabajo");
            System.out.println("5. Regresar a mapa");
            System.out.print("Seleccione una opción: ");
            opcionMenu = Integer.parseInt(opcion.nextLine());

            switch (opcionMenu) {
                case 1:
                    comprarMagia();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.out.println("Volviendo al mapa...");
                    return;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
                    break;
            }
        }
    }

    private void comprarMagia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Magias Disponibles ===");
        for (int i = 0; i < magiasDisponibles.length; i++) {
            System.out.println((i + 1) + ". " + magiasDisponibles[i].getNombre() + " - Precio: " + magiasDisponibles[i].getPrecio());
        }
        System.out.print("Seleccione la magia que desea comprar (0 para cancelar): ");
        int opcion = Integer.parseInt(scanner.nextLine());
        if (opcion > 0 && opcion <= magiasDisponibles.length) {
            Magia magiaSeleccionada = magiasDisponibles[opcion - 1];
            int precioMagia = magiaSeleccionada.getPrecio();
            if (jugador.gastarOro(precioMagia)) {
                jugador.agregarMagia(magiaSeleccionada);
                System.out.println("¡Ha comprado la magia '" + magiaSeleccionada.getNombre() + "'!");
            } else {
                System.out.println("No tiene suficiente oro para comprar esta magia.");
            }
        } else {
            System.out.println("Compra de magia cancelada.");
        }
    }
}
