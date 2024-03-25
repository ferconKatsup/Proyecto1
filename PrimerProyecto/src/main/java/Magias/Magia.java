/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Magias;

/**
 *
 * @author fer
 */

    public abstract class Magia {
        
    protected String nombre;
    protected int nivelRequerido;
    protected int usosRestantes;

    public Magia(String nombre, int nivelRequerido, int usosRestantes) {
        this.nombre = nombre;
        this.nivelRequerido = nivelRequerido;
        this.usosRestantes = usosRestantes;
    }

    public abstract void usar();

    protected void reducirUsos() {
        usosRestantes--;
    }

    public int getUsosRestantes() {
        return usosRestantes;
    }

    public String getNombre() {
             return getNombre();

    }

    public int getPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    
    
    
    
    
    
