package com.parcial;

public class Jugador implements IJugador {
    private String nombre;
    private int numeroCamiseta;
    private String posicion;

    public Jugador(String nombre, int numeroCamiseta) {
        this.nombre = nombre;
        this.numeroCamiseta = numeroCamiseta;
    }
    
    public void setPosicion(String pPosicion){
        posicion=pPosicion;
    }
    public String getPosicion(){
        return posicion;
    }

    public String getName(){
        return nombre;
    }

    
    public int getNumero() {
        return numeroCamiseta;
    }
}
