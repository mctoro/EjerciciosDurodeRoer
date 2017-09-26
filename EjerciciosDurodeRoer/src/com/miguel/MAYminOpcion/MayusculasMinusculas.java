/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.MAYminOpcion;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class MayusculasMinusculas {
    
    public static void main(String[] args) {
        
        String texto=JOptionPane.showInputDialog(null, "Por favor, introduce una frase", "Introducción", JOptionPane.INFORMATION_MESSAGE);
        
        String cadenaResultante="";
        
       // true =isUpper flase =isLower
        boolean isUpper = false;
        
        int eleccion=JOptionPane.showConfirmDialog(null, "¿Quieres que se pase a mayusculas?", "Elección", JOptionPane.YES_NO_OPTION);

        isUpper=eleccion==JOptionPane.YES_OPTION;
        
        
        if (isUpper) {
            cadenaResultante=texto.toUpperCase();
        } else {
            
            cadenaResultante=texto.toLowerCase();
        }
        
        JOptionPane.showMessageDialog(null, cadenaResultante, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    } 
}
