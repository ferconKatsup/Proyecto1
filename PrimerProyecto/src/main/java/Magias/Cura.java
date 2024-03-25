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
public class Cura extends MagiaBlanca {
    private static final int MIN_CURACION = 20;
    private static final int MAX_CURACION = 30;

    public Cura(String nombre, int nivelRequerido, int usosRestantes) {
        super(nombre, nivelRequerido, usosRestantes);
    }

    public void usar() {
        if (usosRestantes > 0) {
            System.out.println("Usando magia Cura: " + nombre);
            // Simular el cálculo de curación aleatoria
            Random random = new Random();
            int curacion = random.nextInt(MAX_CURACION - MIN_CURACION + 1) + MIN_CURACION;
            // Restar un uso
            reducirUsos();
            System.out.println("Cantidad de curación: " + curacion);
            // Implementación específica para la magia Cura
        } else {
            System.out.println("La magia " + nombre + " no tiene usos restantes.");
        }
    }
}