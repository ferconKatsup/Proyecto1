package com.mycompany.primerproyecto.mapa.ciudad;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author fer
 */
public class Ciudad {

    private boolean ciudadConquistada;
    

private final String alejandria;
    private final Caballero[] caballerosOscuros;

    public Ciudad(String alejandria) {

        this.alejandria = alejandria;
        this.ciudadConquistada = false;
        this.caballerosOscuros = new Caballero[4];

    }//final iniciaCiudad

    public boolean estaConquistada() {
        return ciudadConquistada;
    }

    public String getNombre() {

        return alejandria;

    }

    public void iniciarBatalla() {
        System.out.println(" inicia batalla");
    }

    public void conquistar() {
        ciudadConquistada = true;
        System.out.println("conquistaste la ciudad");
    }

    public Caballero[] getCaballeros() {

        return caballerosOscuros;

    }

    public void conquistarCiudad() {

        this.ciudadConquistada = true;
    }

} //FINAL CLASE
