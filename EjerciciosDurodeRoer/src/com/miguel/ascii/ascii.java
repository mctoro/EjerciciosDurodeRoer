/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.ascii;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class ascii {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        
        int num = sc.nextInt();
        
        char caracter = (char)num;
        
        System.out.println(caracter);
        
    }
}
