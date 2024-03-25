package Estadisticas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fer
 */
public class Estadisticas {

    private int nivel;
    private int fuerza;
    private int defensa;
    private int concentracion;
    private int espiritu;
    private int velocidad;
    private int puntosDeVida;
    private int puntosDeExp;

    public Estadisticas(int nivel, int fuerza, int defensa, int concentracion, int espiritu, int velocidad, int puntosDeVida) {

        this.nivel = nivel;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.concentracion = concentracion;
        this.velocidad = velocidad;
        this.puntosDeVida = puntosDeVida;
        this.puntosDeExp = 0;

    }

//mostrar y establecer valores de stats 
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getConcentracion() {
        return concentracion;
    }

    public void setConcentracion(int concentracion) {
        this.concentracion = concentracion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void setPuntosDeVida(int puntosDeVida) {
        this.puntosDeVida = puntosDeVida;
    }

    public int getPuntosDeExp() {
        return puntosDeExp;
    }

    public void setPuntosDeExp(int puntosDeExp) {
        this.puntosDeExp = puntosDeExp;
    }

    // aumentar nivel 
    public void aumentarNivel() {
        nivel++;
        
        fuerza += 7;
        defensa += 3;
        concentracion += 3;
        espiritu += 5;
        velocidad += 2;
        puntosDeVida += 10;
         
    }

    // recibir daño 
    public void recibirDaño(int dañoRecibido) {
        
      
    }

    //recuperar puntos 
    public void recupererPuntosDeVida(int puntosDeVida) {

    }

    //aumentar exp   
    public void aumentarExp(int puntosDeExp) {
        nivel++;

    }
}// fin clase 
