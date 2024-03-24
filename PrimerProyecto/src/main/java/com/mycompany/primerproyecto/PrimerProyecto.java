/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.primerproyecto;

import com.mycompany.primerproyecto.mapa.Mapas;
import java.util.Scanner;

/**
 *
 * @author fer
 */
public class PrimerProyecto {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---Menu Inicial---");
        int opncionMenuInicial;
        
           int salir = 0;
                
        while (salir != 4) {

            System.out.println("1.iniciar partida \n 2.tienda \n 3. \n 4.cerrr programa");
            opncionMenuInicial = Integer.parseInt(scanner.nextLine());

            switch (opncionMenuInicial) {
                case 1:
                    // llamar mapa modo historia
                    System.out.println("---*Iniciar Partida*---");
                 Mapas mapaHistoria = new Mapas();
                mapaHistoria.mapaHistoria();
                    break;
                case 2: // llamar menu tienda
                    System.out.println("---*tienda*---");
                    break;
                case 3: // llamar 2048
                    System.out.println("---*Ver Repostes*---");
                    break;
                case 4: // cerrar programa
                    scanner.close();
                    salir = 4;
                    break;
            }
            
        }

    }//cierra main
}//cierra clase
