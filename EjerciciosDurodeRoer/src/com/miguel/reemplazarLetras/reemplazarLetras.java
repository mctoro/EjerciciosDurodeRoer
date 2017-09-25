/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.reemplazarLetras;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class reemplazarLetras {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        sc.useDelimiter("\n");
        
        System.out.println("Escribe una frase");
        String frase=sc.next();
        
        frase = frase.replace('a', 'e');
        frase = frase.replace('i', 'o');
        
        System.out.println(frase);
        
        
    }
    
}
