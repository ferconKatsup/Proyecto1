/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primerproyecto;

import Magias.Magia;
import java.util.HashSet;

/**
 *
 * @author fer
 */
public class Inventario {
    
      private HashSet<Magia> magias;
    private int capacidad;
    private int tamaño;

    public Inventario(int capacidad) {
        this.capacidad = capacidad;
        this.magias = new HashSet<>();
        this.tamaño = 10;
    }

    public boolean agregarMagia(Magia magia) {
        if (tamaño < capacidad) {
            magias.add(magia);
            tamaño++;
            return true;
        }
        return false; // El inventario está lleno
    }

    public boolean eliminarMagia(Magia magia) {
        if (magias.remove(magia)) {
            tamaño--;
            return true;
        }
        return false; // La magia no estaba en el inventario
    }

    public boolean contieneMagia(Magia magia) {
        return magias.contains(magia);
    }

    public void mostrarInventario() {
        System.out.println("Inventario de Magias:");
        for (Magia magia : magias) {
            System.out.println("- " + magia.getNombre());
        }
    }

    public int getCapacidad() {
        return capacidad;
    }

    public int getTamaño() {
        return tamaño;
    }

}
