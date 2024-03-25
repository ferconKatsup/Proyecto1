/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto.mapa.personaje;

/**
 *
 * @author fer
 */
public class Personaje {

    private String nombre;
    private Trabajo trabajoActual;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    public void cambiarTrabajo(Trabajo nuevoTrabajo) {
        this.trabajoActual = nuevoTrabajo;
        aplicarModificadoresDeEstadisticas();
    }

    public void activarHabilidadEspecial() {
        if (trabajoActual != null) {
            trabajoActual.habilidadEspecial(this);
        }
    }

    public void aplicarModificadoresDeEstadisticas() {
        if (trabajoActual != null) {
            trabajoActual.aplicarModificadores(this);
        }
    }

}
