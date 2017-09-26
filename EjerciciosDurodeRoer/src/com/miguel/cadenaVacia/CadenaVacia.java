/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.cadenaVacia;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class CadenaVacia {

    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null, "Introducir texto, cadena vacía para terminar", "Introducir texto", JOptionPane.INFORMATION_MESSAGE);

        String cadenaResultante = "";

        while (!texto.isEmpty()) {

            cadenaResultante += texto;

            texto = JOptionPane.showInputDialog(null, "Introducir texto, cadena vacía para terminar", "Introducir texto", JOptionPane.INFORMATION_MESSAGE);

        }
        
        JOptionPane.showMessageDialog(null,cadenaResultante , "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }

}
