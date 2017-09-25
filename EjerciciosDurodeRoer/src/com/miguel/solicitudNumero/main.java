/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.solicitudNumero;

import java.util.Scanner;

/**
 *
 * @author cice
 */
public class main {

    public static void main(String[] args) {

        int numeroUsuario = 0;
        int menor = 0;
        int mayor = 0;
        int suma = 0;
        double media;
        int contador = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        Scanner sc = new Scanner(System.in);

        do {

            if (menor > numeroUsuario) {
                menor = numeroUsuario;
            }

            if (mayor < numeroUsuario) {
                mayor = numeroUsuario;
            }

            suma += numeroUsuario;

            if (numeroUsuario >= 0) {
                sumaPositivos += numeroUsuario;
            } else {
                sumaNegativos += numeroUsuario;
            }

            contador++;
            
            System.out.println("Introduce un numero");

            numeroUsuario = sc.nextInt();

        } while (numeroUsuario == -1);
        
        media = (double) suma/contador;

        System.out.println("El menor es: "+menor+" el mayor es: "+mayor+" la suma es: "+suma+" la suma de los positivos es: "+sumaPositivos+" la suma de los negativos es: "+sumaNegativos+" y la media es: "+ media);
    }

}
