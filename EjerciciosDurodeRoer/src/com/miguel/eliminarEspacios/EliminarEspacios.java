/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.eliminarEspacios;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class EliminarEspacios {

    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog(null, "Inserte el texto: ", "Inserción", JOptionPane.INFORMATION_MESSAGE);
        
        char caracterActual;
        String textoSinEspacios="";
         for (int i = 0; i < texto.length(); i++) {

            caracterActual = texto.charAt(i);
         
             if (caracterActual!=' ') {
                 textoSinEspacios+=caracterActual;
             }
         
         }
         JOptionPane.showMessageDialog(null, textoSinEspacios, "resultado", JOptionPane.INFORMATION_MESSAGE);

    }
}
