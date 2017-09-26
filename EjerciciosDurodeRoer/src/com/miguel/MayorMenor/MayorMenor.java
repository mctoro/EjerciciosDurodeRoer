/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.MayorMenor;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class MayorMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduzca el primer numero");
        int num1=sc.nextInt();
        
        System.out.println("Introduzca el segundo numero");
        int num2=sc.nextInt();        
        
        if (num1<=num2) {
            if (num1==num2) {
                System.out.println("Son Iguales");
                
            } else {
                System.out.println("El numero "+num2+" es mayor que el "+num1);
            }
        } else {
        }       System.out.println("El numero "+num1+" es mayor que el "+2);
    }
}
