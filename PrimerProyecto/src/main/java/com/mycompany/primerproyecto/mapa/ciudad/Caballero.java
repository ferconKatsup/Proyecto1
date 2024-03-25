package com.mycompany.primerproyecto.mapa.ciudad;

import Estadisticas.Estadisticas;
import java.util.Random;

class Caballero {

    private String caballeroOscuro;
    private int nivel;
    private Estadisticas estadisticas;

    public Caballero(String caballeroOscuro, Estadisticas estadisticas) {
        this.caballeroOscuro = caballeroOscuro;
        this.estadisticas = estadisticas;

    }

    public String getcaballeroOscuro() {
        return caballeroOscuro;
    }

    public Estadisticas getEstadisticas() {
        return estadisticas;
    }

    public int atacar() {

        Random rand = new Random();
        return rand.nextInt(estadisticas.getFuerza());

    }

    public void recibirDaño(int dañoRecibido) {
        estadisticas.recibirDaño(dañoRecibido);
    }

} //FINCLASE
