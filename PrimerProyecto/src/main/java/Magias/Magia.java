/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Magias;

/**
 *
 * @author fer
 */
public class Magia {
    
    private String nombre;
    private int puntosDeUso;
    private int precio;
    protected int nivelRequerido;
    protected int usosRestantes;

    
    public Magia(String nombre, int puntosDeUso, int nivel, int precio, int nivelRequerido, int usosRestantes){
        this.nombre = nombre;
        this.puntosDeUso = puntosDeUso;
        this.nivelRequerido = nivelRequerido;
        this.usosRestantes = usosRestantes;
        this.precio = precio;
       
        
        
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public String getPuntosDeUso(){
        return getPuntosDeUso();
    }
    
    public String getNivel(){
        return getNivel();
    }
    
    public String getPrecio(){
        return getPrecio();
    }
    public  String getNivelRequerido(){
        return getNivelRequerido();
    }
    
    public String getUsosRestantes(){
        return getUsosRestantes();
    }

    
    //usar magia 
    
    public void usar(){
    }
    
    
    
    
    
    
    
    
}// fin clase
