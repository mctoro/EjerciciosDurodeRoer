/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.numeroVocales;

import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Vocales {
    
    
    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null, "Inserte el texto: ", "Inserción", JOptionPane.INFORMATION_MESSAGE);

        texto = texto.toLowerCase();

        char vocales[] = {'a', 'e', 'i', 'o', 'u'};

        char caracterActual;
        int contadorVocales = 0;
        boolean esVocal = false;

        for (int i = 0; i < texto.length(); i++) {

            caracterActual = texto.charAt(i);
            esVocal = false;
            for (int j = 0; j < vocales.length && !esVocal; j++) {
                if (vocales[j] == caracterActual) {
                    contadorVocales++;
                    esVocal = true;
                }
            }

        }
JOptionPane.showMessageDialog(null, "La frase tiene: " + contadorVocales+" voales", "resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
