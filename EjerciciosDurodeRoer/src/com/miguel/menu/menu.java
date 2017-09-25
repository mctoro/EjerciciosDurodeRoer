/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author cice
 */
public class menu {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
        
        
        while (!salir) {            
            
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Opcion 5");
            System.out.println("6. Opcion 6");
            System.out.println("7. Salir");
            
            try{
            
            
            System.out.println("Elige una opción");
            opcion=sc.nextInt();
            
            switch(opcion){
            
                case 1:
                    System.out.println("Esta es la opción 1");
                    break;
            
                case 2:
                    System.out.println("Esta es la opción 2");
                    break;
            
                case 3:
                    System.out.println("Esta es la opción 3");
                    break;
            
                case 4:
                    System.out.println("Esta es la opción 4");
                    break;
            
                case 5:
                    System.out.println("Esta es la opción 5");
                    break;
            
                case 6:
                    System.out.println("Esta es la opción 6");
                    break;
            
                case 7:
                    salir = true;
                    break;
                    
                default:
                    System.out.println("Las opciones son entre 1 y 7");

            }
                
            }catch(InputMismatchException e){
                System.out.println("Debes introducir un número");
                sc.next();
                       
                
                
            }
            
            
        }
        System.out.println("fin del menu");
    }
    
}
