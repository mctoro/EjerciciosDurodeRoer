/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.parImpar;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class parImpar {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero");
        
        int num = sc.nextInt();
        
        if (num%2==0) {
            System.out.println("El numero "+num+" es par");
            
        }else 
            System.out.println("El numero "+num+" es impar");
    }
}
