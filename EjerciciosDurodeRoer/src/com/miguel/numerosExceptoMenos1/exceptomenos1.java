/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.numerosExceptoMenos1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class exceptomenos1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        do {            
            num = sc.nextInt();
            
            if (num<=1) {
                System.out.println("Error. introduce un numero valido");
            }
        } while (num<=1);
        
        int suma=0;
        
        for (int contador = 1; contador <= num; contador++) {
            suma+=contador;
        }
        
        System.out.println("la suma es: " + suma);
    }
}