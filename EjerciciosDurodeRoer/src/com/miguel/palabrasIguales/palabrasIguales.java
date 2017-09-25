/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.palabrasIguales;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class palabrasIguales {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la primera palabra");
        
        String palabra1 = sc.next();
        
        System.out.println("Introduce la segunda palabra");
        
        String palabra2 = sc.next();
        
        if (palabra1.equalsIgnoreCase(palabra2)) {
            
            System.out.println("Las palabras son iguales");
            
        }else {
            System.out.println("Las palabras no son iguales");
        }
        
    }
    
}
