/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.arrayEnumerados;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class ArrayEnumerados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
    arrayEnum[] meses = arrayEnum.values();
    
        System.out.println("Escribe un numero de días");
int dias = sc.nextInt();

        for (int i = 0; i < meses.length; i++) {
            
            if (meses[i].getNumeroDias()==dias) {
                System.out.println(meses[i].toString());
                
            }
            
        }

    }

}   
