/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.numeros1_100divisible2y3;

/**
 *
 * @author Miguel
 */
public class divisible2y3 {
    
    public static void main(String[] args) {
        
        for (int i = 1; i <= 100; i++) {
            
            if (i%2==0 && i%3==0) {
                
                System.out.println(i);
            }
            
        }
    }
    
}
