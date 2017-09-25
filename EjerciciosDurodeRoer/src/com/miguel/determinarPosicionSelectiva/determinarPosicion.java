/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.determinarPosicionSelectiva;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class determinarPosicion {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.println("Escribe una frase");
        String frase=sc.next();
        
        int pos = frase.indexOf('a');
        
        System.out.println(pos);
        
        pos = frase.indexOf('a', pos+1);
        
        System.out.println(pos);
        
    }
    
}
