/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.sumar1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class sumar1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num=sc.nextInt();
        
        while (num!=-1) {
            
            System.out.println(num);
            
            
            num=sc.nextInt();
        }
        System.out.println("FIN");
    }
    
}
