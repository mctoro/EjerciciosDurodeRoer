/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.enumerados;

/**
 *
 * @author cice
 */
public enum diasSemana {

    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private boolean laborable;

    private diasSemana(boolean laborable) {
        this.laborable = laborable;
    }

    @Override
    public String toString() {

        if (laborable) {
            return "El dia "+this.name().toLowerCase()+ " es laborable";
        } else {
            return "El dia "+this.name().toLowerCase()+ " no es laborable";
        }

    }

}
