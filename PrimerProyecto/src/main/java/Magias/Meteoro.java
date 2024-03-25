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
public class Meteoro extends MagiaOscura {
    private static final int MIN_DAÑO = 30;
    private static final int MAX_DAÑO = 40;
    private static final double PROBABILIDAD_PIERDE_TURNO = 0.35;

    public Meteoro(String nombre, int nivelRequerido, int usosRestantes) {
        super(nombre, nivelRequerido, usosRestantes);
    }

    @Override
    public void usar() {
        if (usosRestantes > 0) {
            System.out.println("Usando magia Meteoro: " + nombre);
            // Simular el cálculo de daño aleatorio
            Random random = new Random();
            int daño = random.nextInt(MAX_DAÑO - MIN_DAÑO + 1) + MIN_DAÑO;
            // Restar un uso
            reducirUsos();
            System.out.println("Cantidad de daño causado por Meteoro: " + daño);
            // Probabilidad de hacer perder un turno al objetivo
            if (Math.random() <= PROBABILIDAD_PIERDE_TURNO) {
                System.out.println("El objetivo ha perdido un turno.");
            }
            // Implementación específica para la magia Meteoro
        } else {
            System.out.println("La magia " + nombre + " no tiene usos restantes.");
        }
    }
}