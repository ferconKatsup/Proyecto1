package com.mycompany.primerproyecto.mapa.ciudad;

import Estadisticas.Estadisticas;
import com.mycompany.primerproyecto.mapa.Jugador;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fer
 */
public class Ciudad {

    private boolean ciudadConquistada;

    private final String alejandria;
    private final Caballero[] caballerosOscuros;
    private final Jugador[] jugadores;

    public Ciudad(String alejandria, Jugador[] jugadores) {

        this.alejandria = alejandria;
        this.ciudadConquistada = false;
        this.caballerosOscuros = new Caballero[4];
        this.jugadores = jugadores;
        generarCaballerosOscuros();

    }//final iniciaCiudad

    public boolean estaConquistada() {
        return ciudadConquistada;
    }

    public String getNombre() {

        return alejandria;

    }

    public void iniciarBatalla() {
        System.out.println(" inicia batalla");
        
        // opciones de ataques
        
        // inicia batalla por turnos 
        for (Caballero caballero : caballerosOscuros) {
            for (Jugador jugador : jugadores) {

                while (caballero.getEstadisticas().getPuntosDeVida() > 0 && jugador.getEstadisticas().getPuntosDeVida() > 0) {

                    int dañoJugador = jugador.atacar();
                    if (dañoJugador > 0) {
                        caballero.recibirDaño(dañoJugador);
                        if (caballero.getEstadisticas().getPuntosDeVida() <= 0) {
                            System.out.println("derrotaste a " + caballerosOscuros);
                            break;
                        }

                    }

                    int dañoCaballero = caballero.atacar();
                    if (dañoCaballero > 0) {
                        jugador.recibirDaño(dañoCaballero);
                        if (jugador.getEstadisticas().getPuntosDeVida() <= 0){
                            System.out.println("te venció" + caballerosOscuros);
                            break;
                        }
                    }
                }
            }

        }

    }

    private void generarCaballerosOscuros() {
        Random caballero = new Random();

        for (int i = 0; i < caballerosOscuros.length; i++) {
            caballerosOscuros[i] = new Caballero("Caballero Oscuro " + (i + 1), generareEstadisticas(caballero));
        }
    }

    private Estadisticas generareEstadisticas(Random random) {

        return new Estadisticas(1, random.nextInt(15) + 5, random.nextInt(15) + 5, random.nextInt(15) + 5, random.nextInt(15) + 5, random.nextInt(15) + 5, random.nextInt(15) + 5);

    }

} //FINAL CLASE
