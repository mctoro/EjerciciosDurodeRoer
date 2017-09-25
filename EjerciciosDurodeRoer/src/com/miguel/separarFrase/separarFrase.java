/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.separarFrase;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class separarFrase {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        
        System.out.println("Escribe una frase");
        String frase=sc.next();
        
        String palabras[]=frase.split(" ");
        
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
        
    }
    
}
