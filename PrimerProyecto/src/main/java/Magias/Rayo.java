/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Magias;

import java.util.Random;

/**
 *
 * @author fer
 */
public class Rayo extends MagiaOscura {
    private static final int MIN_DAÑO = 15;
    private static final int MAX_DAÑO = 25;

    public Rayo(String nombre, int nivelRequerido, int usosRestantes) {
        super(nombre, nivelRequerido, usosRestantes);
    }

    @Override
    public void usar() {
        if (usosRestantes > 0) {
            System.out.println("Usando magia Rayo: " + nombre);
            // Simular el cálculo de daño aleatorio
            Random random = new Random();
            int daño = random.nextInt(MAX_DAÑO - MIN_DAÑO + 1) + MIN_DAÑO;
            // Restar un uso
            reducirUsos();
            System.out.println("Cantidad de daño causado por Rayo: " + daño);
            // Implementación específica para la magia Rayo
        } else {
            System.out.println("La magia " + nombre + " no tiene usos restantes.");
        }
    }
}