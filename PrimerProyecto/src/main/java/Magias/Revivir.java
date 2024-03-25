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
public class Revivir extends MagiaBlanca {
    private static final int MIN_CURACION = 10;
    private static final int MAX_CURACION = 20;

    public Revivir(String nombre, int nivelRequerido, int usosRestantes) {
        super(nombre, nivelRequerido, usosRestantes);
    }

    public void usar() {
        if (usosRestantes > 0) {
            System.out.println("Usando magia Revivir: " + nombre);
            // Simular el cálculo de curación aleatoria
            Random random = new Random();
            int curacion = random.nextInt(MAX_CURACION - MIN_CURACION + 1) + MIN_CURACION;
            // Restar un uso
            reducirUsos();
            System.out.println("Cantidad de curación al revivir: " + curacion);
            // Implementación específica para la magia Revivir
        } else {
            System.out.println("La magia " + nombre + " no tiene usos restantes.");
        }
    }
}