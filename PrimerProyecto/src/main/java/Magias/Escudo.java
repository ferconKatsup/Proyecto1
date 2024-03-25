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
public class Escudo extends MagiaBlanca {
    private static final int MIN_TURNOS = 2;
    private static final int MAX_TURNOS = 4;

    public Escudo(String nombre, int nivelRequerido, int usosRestantes) {
        super(nombre, nivelRequerido, usosRestantes);
    }

    
    public void usar() {
        if (usosRestantes > 0) {
            System.out.println("Usando magia Escudo: " + nombre);
            // Simular el cálculo de turnos aleatorios
            Random random = new Random();
            int turnos = random.nextInt(MAX_TURNOS - MIN_TURNOS + 1) + MIN_TURNOS;
            // Restar un uso
            reducirUsos();
            System.out.println("Duración del Escudo: " + turnos + " turnos");
            // Implementación específica para la magia Escudo
        } else {
            System.out.println("La magia " + nombre + " no tiene usos restantes.");
        }
    }
}
