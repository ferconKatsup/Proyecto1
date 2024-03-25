/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto.mapa.personaje;

/**
 *
 * @author fer
 */
public abstract class Trabajo {
    protected String nombre;
    protected String descripcion;

    public Trabajo(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public abstract void habilidadEspecial(Personaje personaje);
    public abstract void aplicarModificadores(Personaje personaje);
}