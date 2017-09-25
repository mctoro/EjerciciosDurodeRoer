/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.enumerados;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class diaSemana {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un día de la semana");
        
        String dia = sc.next();
 /*       
        diasSemana diaS = diasSemana.valueOf(dia.toUpperCase());
        
        switch (diaS){
        
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El día "+diaS+" es laboral");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El día "+diaS+" no es laboral");
                break;
            default:
                System.out.println("Introduce un día correcto");
        }
        */
 
 diasSemana diaS = diasSemana.valueOf(dia.toUpperCase());
        System.out.println(diaS.toString());
    }
    
}
