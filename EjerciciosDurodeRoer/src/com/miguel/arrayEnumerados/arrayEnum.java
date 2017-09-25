/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miguel.arrayEnumerados;

/**
 *
 * @author cice
 */
public enum arrayEnum {
    
    
    ENERO(1,31),
    FEBRERO(2,28),
    MARZO(3,31),
    ABRIL(4,30),
    MAYO(5,31),
    JUNIO(6,30),
    JULIO(7,31),
    AGOSTO(8,31),
    SEPTIEMBRE(9,30),
    OCTUBRE(10,31),
    NOVIEMBRE(11,30),
    DICIEMBRE(12,31);
    
    private int orden;
    private int numeroDias;
    
    
    private arrayEnum(int orden, int numeroDias){
    
        this.orden=orden;
        this.numeroDias=numeroDias;
        
    }

    public static arrayEnum getENERO() {
        return ENERO;
    }

    public static arrayEnum getFEBRERO() {
        return FEBRERO;
    }

    public static arrayEnum getMARZO() {
        return MARZO;
    }

    public static arrayEnum getABRIL() {
        return ABRIL;
    }

    public static arrayEnum getMAYO() {
        return MAYO;
    }

    public static arrayEnum getJUNIO() {
        return JUNIO;
    }

    public static arrayEnum getJULIO() {
        return JULIO;
    }

    public static arrayEnum getAGOSTO() {
        return AGOSTO;
    }

    public static arrayEnum getSEPTIEMBRE() {
        return SEPTIEMBRE;
    }

    public static arrayEnum getNOVIEMBRE() {
        return NOVIEMBRE;
    }

    public static arrayEnum getDICIEMBRE() {
        return DICIEMBRE;
    }

    public int getOrden() {
        return orden;
    }

    public int getNumeroDias() {
        return numeroDias;
    }

    @Override
    public String toString() {
        return "El mes "+this.name().toLowerCase()+" es el "+orden+" y tiene "+numeroDias+" dias";
    }
    
    
}
